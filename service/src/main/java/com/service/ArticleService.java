package com.service;


import facade.IArticleFacade;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DELIA on 10.09.2015.
 */
@Controller
@RequestMapping("/article")
public class ArticleService {

    @Autowired
    private IArticleFacade articleFacade;

    public IArticleFacade getArticleFacade() {
        return articleFacade;
    }

    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    @ResponseBody
    public List<Article> getAllArticles()
    {
        return this.articleFacade.getAllArticles();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article getArticle(@PathVariable("id") Long articleId) {

        return this.articleFacade.getMyArticle(articleId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteArticle(@PathVariable("id") Long id) {

        this.articleFacade.deleteMyArticle(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void saveArticle(@RequestBody Article myArticle) {

        this.articleFacade.saveMyArticle(myArticle);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@RequestBody Article myArticle, @PathVariable("id") Long id) {

        myArticle.setId(id);

        this.articleFacade.updateMyArticle(myArticle);
    }
}
