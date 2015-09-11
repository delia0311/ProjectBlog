package facade;

import dao.IArticleDao;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by DELIA on 11.09.2015.
 */
public class ArticleFacade implements IArticleFacade {

    @Autowired
    private IArticleDao articleDao;

    public List<Article> getAllArticles() {

        return this.articleDao.getAll();
    }

    public boolean deleteMyArticle(int id){

        return this.articleDao.deleteArticle(id);
    }

    public boolean saveMyArticle(Article myArticle){

        return this.articleDao.saveArticle(myArticle);
    }

    public Article getMyArticle(int id){

        return this.articleDao.getArticle(id);
    }

    public IArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(IArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
