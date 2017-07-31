package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.DevelopmentMapper;
import po.Development;
import po.DevelopmentExample;
import po.DevelopmentExample.Criteria;
import po.EUDataGridResult;

/**
 * @Author: Xblue
 * @Description: 部门管理service层
 * @Date: 0:08 2017/8/1
 */
@Service
public class DepartmentImpl implements DepartmentService {

    @Autowired
    private DevelopmentMapper developmentMapper;

    public void addDepartment(Development development) {
        /**
         * @Author: xiaojianyu
         * @Method: addDepartment
         * @Description: 新增部门
         * @Date: 0:08 2017/8/1
         * @Return: void
         * @Param: [development]
         */
        developmentMapper.insert(development);
    }

    public EUDataGridResult findDevelopmentList(int page, int rows) {
        /**
         * @Author: xiaojianyu
         * @Method: findDevelopmentList
         * @Description: 查询部门
         * @Date: 0:08 2017/8/1
         * @Return: po.EUDataGridResult
         * @Param: [page, rows]
         */
        DevelopmentExample developmentExample = new DevelopmentExample();
        Criteria criteria = developmentExample.createCriteria();
        PageHelper.startPage(page, rows);
        List<Development> list = developmentMapper.selectByExample(developmentExample);//切面拦截器去分页
        PageInfo<Development> pageInfo = new PageInfo<Development>(list);
        EUDataGridResult euDataGridResult = new EUDataGridResult();
        euDataGridResult.setRows(list);
        euDataGridResult.setTotal(pageInfo.getTotal());
        return euDataGridResult;
    }

    public boolean update(Development development) {
        /**
         * @Author: xiaojianyu
         * @Method: update
         * @Description: 更新部门
         * @Date: 0:08 2017/8/1
         * @Return: boolean
         * @Param: [development]
         */
        developmentMapper.updateByPrimaryKey(development);
        return true;
    }


}
