package facade;

import model.Article;

import java.util.List;

/**
 * Created by DELIA on 11.09.2015.
 */
public interface IArticleFacade {

    public List<Article> getAllArticles();
    public boolean deleteMyArticle(int id);
    public boolean saveMyArticle(Article myArticle);
    public boolean getMyArticle(int id);
}
