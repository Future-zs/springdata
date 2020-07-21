package xyz.lwh.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.lwh.springdata.domain.AdminUser;
import xyz.lwh.springdata.domain.Article;
import xyz.lwh.springdata.service.AdminUserService;
import xyz.lwh.springdata.service.ArticleService;

import java.util.List;

/**
 * @author lwh
 * @date 2020/7/19
 **/
@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String getIndex() {
        return "/admin/index.html";
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "/admin/login.html";
    }

    @RequestMapping("/article")
    public ModelAndView getArticle(Model model) {
        List<Article> list = articleService.select();
        model.addAttribute("article", list);
        return new ModelAndView("/admin/article.html", "UserModel", model);
    }

    @RequestMapping("/notice")
    public String getNotice() {
        return "/admin/notice.html";
    }

    @RequestMapping("/comment")
    public String getComment() {
        return "/admin/comment.html";
    }

    @RequestMapping("/category")
    public String getCategory() {
        return "/admin/category.html";
    }

    @RequestMapping("/flink")
    public String getFlink() {
        return "/admin/flink.html";
    }

    @RequestMapping("/manage-user")
    public String getManage() {
        return "/admin/manage-user.html";
    }

    @RequestMapping("/loginlog")
    public String getLoginlog() {
        return "/admin/loginlog.html";
    }

    @RequestMapping("/setting")
    public String getSetting() {
        return "/admin/setting.html";
    }

    @RequestMapping("/readset")
    public String getReadset() {
        return "/admin/readset.html";
    }

    @RequestMapping("/add-article")
    public String getAdd_article() {
        return "/admin/add-Article.html";
    }

    @RequestMapping("/update-article")
    public String getUpdate_article() {
        return "/admin/update-Article.html";
    }


    @RequestMapping("/login.action")
    public ModelAndView login(AdminUser adminUser) {
        System.out.println(adminUser.getAdminUsername() + "//" + adminUser.getAdminPassword());
        boolean success = adminUserService.login(adminUser);
        if (success) {
            return new ModelAndView("/admin/index.html");

        } else {
            return new ModelAndView("redirect:/admin/login");
        }
    }
}


