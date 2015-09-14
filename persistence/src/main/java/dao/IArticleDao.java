package dao;

import java.util.List;
import model.Article;
/**
 * Created by DELIA on 11.09.2015.
 */
public interface IArticleDao {

    public List<Article> getAll();
    public Article getArticle(Long id);
    public  void deleteArticle(Long id);
    public  void saveArticle(Article myArticle);
    public  void updateArticle(Article myArticle);

}
