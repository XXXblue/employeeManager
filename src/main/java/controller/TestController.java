package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.impl.EmployeeService;
/**
 *@Author: Xblue
 *@Description: 测试可以不看
 *@Date: 0:12 2017/8/1
 */
@Controller
public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/jianyu")
    @ResponseBody
    public String findAllEmployee(String name, String city) {
        /**
         * 查找全部员工测试通过
         * 测试用
         List<Employee>list=employeeService.findAllEmployee();
         for(Employee employee:list){
         System.out.println(employee.geteName()+employee.geteBdate().toString());
         }
         return JsonUtils.objectToJson(list);
         */
        System.out.println("k" + name + city);
        return "ok";
    }
}
