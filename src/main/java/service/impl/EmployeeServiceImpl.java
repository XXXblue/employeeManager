package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.EmployeeMapper;
import po.Employee;
import po.EmployeeExample;
import po.EmployeeExample.Criteria;
/**
 *@Author: Xblue
 *@Description: 员工管理service层
 *@Date: 0:30 2017/8/1
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> findAllEmployee() {
        /**
         * @Author: xiaojianyu
         * @Method: findAllEmployee
         * @Description: 查询所有员工 没写完没有controller
         * @Date: 0:26 2017/8/1
         * @Return: java.util.List<po.Employee>
         * @Param: []
         */
        EmployeeExample employeeExample = new EmployeeExample();
        Criteria criteria = employeeExample.createCriteria();
        return employeeMapper.selectByExample(employeeExample);
    }

    public Employee findEmployeeById(long id) {
        /**
         * @Author: xiaojianyu
         * @Method: findEmployeeById
         * @Description: 测试用
         * @Date: 0:28 2017/8/1
         * @Return: po.Employee
         * @Param: [id]
         */
        return employeeMapper.selectByPrimaryKey(id);
    }

    public boolean check(String username, String password) {
        /**
         * @Author: xiaojianyu
         * @Method: check
         * @Description: 查看是否用户登录验证准确
         * @Date: 0:28 2017/8/1
         * @Return: boolean
         * @Param: [username, password]
         */
        Employee employee = employeeMapper.selectByPrimaryKey(Long.parseLong(username));
        if (employee == null) {
            return false;
        }
        String psw = employee.getePsw();
        if (psw.equals(password)) {
            return true;
        }
        return false;
    }
}
