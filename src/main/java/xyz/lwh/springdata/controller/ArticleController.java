package xyz.lwh.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.lwh.springdata.domain.Article;
import xyz.lwh.springdata.service.AdminUserService;
import xyz.lwh.springdata.service.ArticleService;

import java.util.List;

/**
 * @author lwh
 * @date 2020/7/19
 **/
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @RequestMapping("/show.action")
//    public ModelAndView show(Model model) {
//        List<Article> list = articleService.select();
//        model.addAttribute("Article", list);
//        return new ModelAndView("/admin/article", "UserModel", model);
//    }

    @RequestMapping("/save.action")
    public ModelAndView save(Article article) {
        System.out.println(article.toString());
        articleService.save(article);
        return new ModelAndView("redirect:/admin/article");
    }

    @RequestMapping("/toEdit/{id}")
    public ModelAndView toEdit(@PathVariable("id") Integer id, Model model) {
        Article article = articleService.findById(id);
        model.addAttribute("article", article);
        return new ModelAndView("/edit-user.html", "ArticleModel", model);
    }

    @RequestMapping("/edit.action")
    public ModelAndView edit(Article article) {
        articleService.save(article);
        return new ModelAndView("redirect:show.action");
    }
}
