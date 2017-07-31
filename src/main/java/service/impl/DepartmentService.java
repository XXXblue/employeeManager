package service.impl;

import java.util.List;

import po.Development;
import po.EUDataGridResult;

/**
 * @Author: Xblue
 * @Description: 部门管理service接口层
 * @Date: 0:09 2017/8/1
 */
public interface DepartmentService {
    /**
     * @Author: xiaojianyu
     * @Method: addDepartment
     * @Description: 新增部门
     * @Date: 0:10 2017/8/1
     * @Return: void
     * @Param: Development development
     */
    public void addDepartment(Development development);

    /**
     * @Author: xiaojianyu
     * @Method: findDevelopmentList
     * @Description: 部门查询
     * @Date: 0:11 2017/8/1
     * @Return: EUDataGridResult
     * @Param: int page int rows
     */
    public EUDataGridResult findDevelopmentList(int page, int rows);

    /**
     * @Author: xiaojianyu
     * @Method: update
     * @Description: 部门修改
     * @Date: 0:12 2017/8/1
     * @Return: boolean
     * @Param: Development development
     */
    public boolean update(Development development);
}
