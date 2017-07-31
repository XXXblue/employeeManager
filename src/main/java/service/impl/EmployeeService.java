package service.impl;

import java.util.List;

import po.Employee;
/**
 *@Author: Xblue
 *@Description: 员工管理接口层
 *@Date: 0:30 2017/8/1
 */
public interface EmployeeService {
    /**
     * @Author: xiaojianyu
     * @Method: 测试用
     * @Description:
     * @Date: 0:26 2017/8/1
     * @Return:
     * @Param:
     */
    List<Employee> findAllEmployee();

    /**
     * @Author: xiaojianyu
     * @Method:
     * @Description: 测试用
     * @Date: 0:26 2017/8/1
     * @Return:
     * @Param:
     */
    Employee findEmployeeById(long id);

    /**
     * @Author: xiaojianyu
     * @Method: check
     * @Description: 验证登录
     * @Date: 0:25 2017/8/1
     * @Return: boolean
     * @Param:
     */
    boolean check(String username, String password);
}
