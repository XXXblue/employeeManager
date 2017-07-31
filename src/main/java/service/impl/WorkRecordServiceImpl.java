package service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.WorkRecordMapper;
import po.EUDataGridResult;
import po.Result;
import po.WorkRecord;
import po.WorkRecordExample;
import po.WorkRecordExample.Criteria;
/**
 *@Author: Xblue
 *@Description: 记录管理service层
 *@Date: 0:31 2017/8/1
 */
@Service
public class WorkRecordServiceImpl implements WorkRecordService {
    @Autowired
    private WorkRecordMapper workRecordMapper;

    public EUDataGridResult findWorkRecordList(int page, int rows) {
        //<editor-fold desc="查询列表">
        /**
         * @Author: xiaojianyu
         * @Method: findWorkRecordList
         * @Description: 查询列表
         * @Date: 15:11 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows]
         */
        WorkRecordExample workRecordExample = new WorkRecordExample();
        Criteria criteria = workRecordExample.createCriteria();
        PageHelper.startPage(page, rows);
        List<WorkRecord> list = workRecordMapper.selectByExample(workRecordExample);//切面拦截器去分页
        PageInfo<WorkRecord> pageInfo = new PageInfo<WorkRecord>(list);
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(list);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
        //</editor-fold>
    }

    public EUDataGridResult findWorkRecordList(int page, int rows, String itemid, String bd, String ed, String type, String approve) {
        /**
         * @Author: xiaojianyu
         * @Method: findWorkRecordList
         * @Description: 查询员工记录
         * @Date: 15:12 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows, itemid, bd, ed, type, approve]
         */
        WorkRecordExample workRecordExample = new WorkRecordExample();
        Criteria criteria = workRecordExample.createCriteria();
        if (itemid != null && itemid != "") {
            criteria.andWNoEqualTo(Long.parseLong(itemid));
        }
        if ((bd != null && bd != "") && (ed != null && ed != "")) {
            try {
                Date bbd = new SimpleDateFormat("yyyy-MM-dd").parse(bd);
                Date eed = new SimpleDateFormat("yyyy-MM-dd").parse(ed);
                if (bbd.before(eed)) {
                    criteria.andWDateBetween(bbd, eed);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (type != null && type != "") {
            criteria.andWTypeEqualTo(Integer.parseInt(type));
        }
        if (approve != null && approve != "") {
            criteria.andWApproveEqualTo(Integer.parseInt(approve));
        }
        PageHelper.startPage(page, rows);
        List<WorkRecord> list = workRecordMapper.selectByExample(workRecordExample);//切面拦截器去分页
        PageInfo<WorkRecord> pageInfo = new PageInfo<WorkRecord>(list);
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(list);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
    }

    public EUDataGridResult findWorkRecordList(int page, int rows, String bd, String ed) {
        /**
         * @Author: xiaojianyu
         * @Method: findWorkRecordList
         * @Description: 带日期的查询
         * @Date: 23:50 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows, bd, ed]
         */
        WorkRecordExample workRecordExample = new WorkRecordExample();
        Criteria criteria = workRecordExample.createCriteria();
        try {
            criteria.andWDateBetween(new SimpleDateFormat("yyyy-MM-dd").parse(bd), new SimpleDateFormat("yyyy-MM-dd").parse(ed));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        PageHelper.startPage(page, rows);
        List<WorkRecord> list = workRecordMapper.selectByExample(workRecordExample);//切面拦截器去分页
        PageInfo<WorkRecord> pageInfo = new PageInfo<WorkRecord>(list);
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(list);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
    }

    public void WorkRecordModify(String sels, String isApprove) {
        /**
         * @Author: xiaojianyu
         * @Method: WorkRecordModify
         * @Description: 员工记录审批
         * @Date: 23:51 2017/7/31
         * @Return: void
         * @Param: [sels, isApprove]
         */
        if (sels != null && sels != "") {
            String selss[] = sels.split(",");
            for (String sel : selss) {
                WorkRecord record = workRecordMapper.selectByPrimaryKey(Long.parseLong(sel));
                if (isApprove.equals("approve")) {
                    record.setwApprove(1);
                } else {
                    record.setwApprove(2);
                }
                workRecordMapper.updateByPrimaryKey(record);
            }
        }
    }

    public Result WorkRecordCalculate(String employid, String bdd, String edd) {
        /**
         * @Author: xiaojianyu
         * @Method: WorkRecordCalculate
         * @Description: 记录员工出勤情况
         * @Date: 23:51 2017/7/31
         * @Return: po.Result
         * @Param: [employid, bdd, edd]
         */
        Result result = new Result();
        result.setBdate(bdd);
        result.setEdate(edd);
        WorkRecordExample workRecordExample = new WorkRecordExample();
        Criteria criteria = workRecordExample.createCriteria();
        criteria.andWNoEqualTo(Long.parseLong(employid));
        try {
            criteria.andWDateBetween(new SimpleDateFormat("yyyy-MM-dd").parse(bdd), new SimpleDateFormat("yyyy-MM-dd").parse(edd));
        } catch (ParseException e) {
            // 记录日志
            e.printStackTrace();
        }
        int date1 = 0, date2 = 0, date3 = 0;
        List<WorkRecord> workRecords = workRecordMapper.selectByExample(workRecordExample);
        if (workRecords.size() == 0) {
            return result;
        }
        for (WorkRecord workRecord : workRecords) {
            if (workRecord.getwApprove() == 1) {
                if (workRecord.getwType() == 0) {
                    date1 += workRecord.getwDuration();
                }
                if (workRecord.getwType() == 1) {
                    date2 += workRecord.getwDuration();
                }
                if (workRecord.getwType() == 2) {
                    date3 += workRecord.getwDuration();
                }
            }
        }
        result.setDate1(date1 + "");
        result.setDate2(date2 + "");
        result.setDate3(date3 + "");
        result.setWno(workRecords.get(0).getwNo() + "");
        return result;
    }

    public EUDataGridResult findWorkRecordList(int page, int rows, String username) {
        /**
         * @Author: xiaojianyu
         * @Method: findWorkRecordList
         * @Description: 用户查看自己的记录
         * @Date: 23:52 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows, username]
         */
        WorkRecordExample workRecordExample = new WorkRecordExample();
        Criteria criteria = workRecordExample.createCriteria();
        criteria.andWNoEqualTo(Long.parseLong(username));
        PageHelper.startPage(page, rows);
        List<WorkRecord> list = workRecordMapper.selectByExample(workRecordExample);//切面拦截器去分页
        PageInfo<WorkRecord> pageInfo = new PageInfo<WorkRecord>(list);
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(list);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
    }

    public void addwordrecord(Long wno, String wDuration, String type, String dd, String wReason) {
        /**
         * @Author: xiaojianyu
         * @Method: adddepartment
         * @Description: 用户新加申请
         * @Date: 23:52 2017/7/31
         * @Return: void
         * @Param: [wno, wDuration, type, dd, wReason]
         */
        WorkRecord workRecord = new WorkRecord();
        workRecord.setwApprove(0);
        workRecord.setwNo(wno);
        try {
            workRecord.setwDate(new SimpleDateFormat("yyyy-MM-dd").parse(dd));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        workRecord.setwReason(wReason);
        workRecord.setwDuration(Integer.parseInt(wDuration));
        workRecord.setwType(Integer.parseInt(type));
        workRecord.setwId(new Date().getTime()
                + 1000 + (int) (Math.random() * ((50000 - 1000) + 1)));
        workRecordMapper.insert(workRecord);
    }

}
