package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import po.EUDataGridResult;
import service.impl.WorkRecordService;

/**
 * @Author: Xblue
 * @Description: 员工处理的类
 * @Date: 23:58 2017/7/31
 */
@Controller
public class EmployeeController {
    @Autowired
    private WorkRecordService workRecordService;

    @RequestMapping("/registkk")
    public String regist(HttpSession httpSession, String name, String email) throws Exception {
        /**
         * @Author: xiaojianyu
         * @Method: regist
         * @Description: 注册用户
         * @Date: 23:58 2017/7/31
         * @Return: java.lang.String
         * @Param: [httpSession, name, email]
         */
        System.out.println(name + email);
        //这里重定向一下
        return "forward:/index2";
    }

    @RequestMapping("/loginmanger")//这里用redirect页面栏目为index 用forward页面栏为loginmanger
    public String login(HttpSession httpSession, String username, String password) throws Exception {
        /**
         * @Author: xiaojianyu
         * @Method: login2
         * @Description: 管理员登录
         * @Date: 23:59 2017/7/31
         * @Return: java.lang.String
         * @Param: [httpSession, username, password]
         */
        httpSession.setAttribute("username", username);
        httpSession.setAttribute("password", password);
        //这里重定向一下
        return "forward:/index";
    }

    @RequestMapping("/loginemployee")//这里用redirect页面栏目为index 用forward页面栏为loginmanger
    public String login2(HttpSession httpSession, String username, String password) throws Exception {
        /**
         * @Author: xiaojianyu
         * @Method: login2
         * @Description: 员工登录
         * @Date: 23:59 2017/7/31
         * @Return: java.lang.String
         * @Param: [httpSession, username, password]
         */
        httpSession.setAttribute("username", username);
        httpSession.setAttribute("password", password);
        //这里重定向一下
        return "forward:/index2";
    }

    @RequestMapping(value = "/listemployeeworkrecord", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public EUDataGridResult listWorkRecord(int page, int rows, HttpSession httpSession) {
        /**
         * @Author: xiaojianyu
         * @Method: listWorkRecord
         * @Description: 显示用户的个人记录
         * @Date: 23:59 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows, httpSession]
         */
        String username = (String) httpSession.getAttribute("username");
        return workRecordService.findWorkRecordList(page, rows, username);
    }
}
