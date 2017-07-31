package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Xblue
 * @Description: 页面跳转
 * @Date: 0:00 2017/8/1
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex() {
        /**
         * @Author: xiaojianyu
         * @Method: showIndex
         * @Description:展示主页
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: []
         */
        return "index";
    }

    //页面时通过ajax静态加载其他页面的 不是通过修改url的 所以要定义一下页面跳转
    //其他的controller都是页面利用ajax异步请求的，而这里的页面跳转是点击到某个页面
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return page;
    }
}