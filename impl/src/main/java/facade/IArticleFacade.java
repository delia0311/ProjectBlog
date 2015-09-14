package facade;

import model.Article;

import java.util.List;

/**
 * Created by DELIA on 11.09.2015.
 */
public interface IArticleFacade {

    public List<Article> getAllArticles();
    public void deleteMyArticle(Long id);
    public void saveMyArticle(Article myArticle);
    public Article getMyArticle(Long id);
    public void updateMyArticle(Article myArticle);
}
