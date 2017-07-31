package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import po.EUDataGridResult;
import po.Result;
import po.WorkRecord;
import service.impl.WorkRecordService;
import util.JsonUtils;

/**
 * @Author: Xblue
 * @Description: 记录管理
 * @Date: 0:04 2017/8/1
 */
@Controller
public class WorkRecordController {
    @Autowired
    private WorkRecordService workRecordService;

    @RequestMapping(value = "/addworkrecord", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody//这里说一下 easyui如果是表单提交主要用name属性来提交值，而是普通模块 可靠id提交值 比如点击相应
    public String addworkrecord(HttpSession session, String wDuration, String type, String dd, String wReason) {
        /**
         * @Author: xiaojianyu
         * @Method: adddepartment
         * @Description: 员工申请记录
         * @Date: 0:04 2017/8/1
         * @Return: java.lang.String
         * @Param: [session, wDuration, type, dd, wReason]
         */
        String wno = (String) session.getAttribute("username");
        workRecordService.addwordrecord(Long.parseLong(wno), wDuration, type, dd, wReason);
        return "ok";
    }

    @RequestMapping(value = "/listworkrecord", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public EUDataGridResult listWorkRecord(int page, int rows, String itemid, String bd, String ed, String type, String approve) {
        /**
         * @Author: xiaojianyu
         * @Method: listWorkRecord
         * @Description: 管理员查看所有记录
         * @Date: 0:06 2017/8/1
         * @Return: po.EUDataGridResult
         * @Param: [page, rows, itemid, bd, ed, type, approve]
         */
        return workRecordService.findWorkRecordList(page, rows, itemid, bd, ed, type, approve);
    }

    @RequestMapping(value = "/listParamWorkRecord/{id}", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    //上面的produces是解决responsebody乱码的问题
    @ResponseBody
    public String listParamWorkRecord(@PathVariable String id) {
        /**
         * @Author: xiaojianyu
         * @Method: listParamWorkRecord
         * @Description: 测试用
         * @Date: 0:31 2017/8/1
         * @Return: java.lang.String
         * @Param: [id]
         */
        return "ok" + id;
    }

    @RequestMapping(value = "/isapprove")
    @ResponseBody
    public String ApproveWorkRecord(String sels, String isApprove) {
        /**
         * @Author: xiaojianyu
         * @Method: ApproveWorkRecord
         * @Description: 员工批准
         * @Date: 0:31 2017/8/1
         * @Return: java.lang.String
         * @Param: [sels, isApprove]
         */
        workRecordService.WorkRecordModify(sels, isApprove);
        return "ok";
    }

    @RequestMapping(value = "/calculate")
    @ResponseBody
    public String calculateWorkRecord(String employid, String bdd, String edd) {
        /**
         * @Author: xiaojianyu
         * @Method: calculateWorkRecord
         * @Description: 员工出勤统计
         * @Date: 0:32 2017/8/1
         * @Return: java.lang.String
         * @Param: [employid, bdd, edd]
         */
        if (employid == null || employid == "") {
            Result result = new Result();
            result.setData("employid");
            return JsonUtils.objectToJson(result);
        }
        if (bdd == null || bdd == "") {
            Result result = new Result();
            result.setData("bdd");
            return JsonUtils.objectToJson(result);
        }
        if (edd == null || edd == "") {
            Result result = new Result();
            result.setData("edd");
            return JsonUtils.objectToJson(result);
        }
        Result result = workRecordService.WorkRecordCalculate(employid, bdd, edd);
        return JsonUtils.objectToJson(result);
    }
}
