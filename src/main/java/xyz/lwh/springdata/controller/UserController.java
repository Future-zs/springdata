package xyz.lwh.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.lwh.springdata.domain.User;
import xyz.lwh.springdata.service.UserService;

/**
 * @author lwh
 * @date 2020/7/18
 **/
@RequestMapping("portal")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String getIndex() {
        return "portal/index.html";
    }

    @RequestMapping("/category")
    public String getCategory() {
        return "portal/category.html";
    }

    @RequestMapping("/article")
    public String getArticle() {
        return "portal/article.html";
    }

    @RequestMapping("/register")
    public String getRegister() {
        return "portal/register.html";
    }

    /**
     * 标签云
     * tags
     */
    @RequestMapping("/tags")
    public String getTags() {
        return "portal/tags.html";
    }

    /**
     * readers
     * 读者墙
     */
    @RequestMapping("/readers")
    public String getReaders() {
        return "portal/readers.html";
    }

    /**
     * links
     * 友情链接
     */
    @RequestMapping("/links")
    public String getLinks() {
        return "portal/links.html";
    }


    @RequestMapping("/login.action")
    public ModelAndView login(User user) {
        System.out.println(user.getUsername() + "//" + user.getPassword());
        boolean success = userService.login(user);
        if (success) {
            return new ModelAndView("portal/welcome.html");

        } else {
            return new ModelAndView("portal/404.html");
        }
    }

    /**
     * 注册
     * @param user
     * @return 返回视图
     */
    @RequestMapping("/register.action")
    public ModelAndView register(User user) {
        userService.save(user);
        return new ModelAndView("redirect:/");
    }
}
