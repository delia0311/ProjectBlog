package com.service;

import facade.ArticleFacade;
import facade.IArticleFacade;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELIA on 10.09.2015.
 */
@Controller
@RequestMapping("/article")
public class ArticleService {

    @Autowired
    private IArticleFacade articleFacade;

    @RequestMapping(value="", method= RequestMethod.GET)
    @ResponseBody
    public List<Article> getAllArticles()
    {
        return this.articleFacade.getAllArticles();
    }

    public IArticleFacade getArticleFacade() {
        return articleFacade;
    }

    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }
}
