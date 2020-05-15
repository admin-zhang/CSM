package xyz.codedog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.codedog.po.User;
import xyz.codedog.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author panda
 * @Date 2020/5/14
 * @Version 1.0
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param usercode
     * @param password
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session) {
        User user = userService.findUser(usercode, password);
        if (user != null) {
            session.setAttribute("USER_SESSION",user);
        return "customer";
        }
        model.addAttribute("msg", "账号或密码错误,请重新输入");
        return "login";
    }

    /**
     * ,模拟其他类中跳转到客户管理页面的方法
     */
    @RequestMapping(value = "/toCustomer.action")
    public String toCustomer() {
        return "customer";
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login.action";
    }

    /**
     * 向用户登录页面跳转
     */
    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }
}
