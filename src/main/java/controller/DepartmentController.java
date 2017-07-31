package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import po.Development;
import po.EUDataGridResult;
import service.impl.DepartmentService;

/**
 * @Author: Xblue
 * @Description: 部门管理
 * @Date: 23:54 2017/7/31
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/adddepartment", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public String adddepartment(@Validated Development development, BindingResult bindingResult) {
        /**
         * @Author: xiaojianyu
         * @Method: adddepartment
         * @Description: 增加一个新的部门
         * @Date: 23:54 2017/7/31
         * @Return: java.lang.String
         * @Param: [development, bindingResult]
         */
        String str = "";
        if (development != null) {
            if (development.getdNo() == null || development.getdName() == null) {
                str = "部门名和部门编号不能为空 ";
                return str;
            }
            if (bindingResult.getAllErrors() != null && bindingResult.getAllErrors().size() > 0) {
                for (ObjectError objectError : bindingResult.getAllErrors()) {
                    if (objectError.getDefaultMessage().equals("items.name.length.error")) {
                        str = "部门名称长度需小于10" + str;
                    }
                }
                return str;
            }
            departmentService.addDepartment(development);
            return "ok";
        }
        return null;
    }

    @RequestMapping(value = "/listdepartment", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public EUDataGridResult listDepatement(int page, int rows) {
        /**
         * @Author: xiaojianyu
         * @Method: listDepatement
         * @Description: 列出所有部门给查看
         * @Date: 23:55 2017/7/31
         * @Return: po.EUDataGridResult
         * @Param: [page, rows]
         */
        return departmentService.findDevelopmentList(page, rows);
    }

    @RequestMapping(value = "/editdepartment", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public String editDepartment(Development development) {
        /**
         * @Author: xiaojianyu
         * @Method: editDepartment
         * @Description: 修改一个部门信息
         * @Date: 23:55 2017/7/31
         * @Return: java.lang.String
         * @Param: [development]
         */
        boolean reuslt = departmentService.update(development);
        return "ok";
    }
}
