package dao;

import java.util.List;
import model.Article;
/**
 * Created by DELIA on 11.09.2015.
 */
public interface IArticleDao {

    public List<Article> getAll();
    public Article getArticle(int id);
    public  boolean deleteArticle(int id);
    public  boolean saveArticle(Article myArticle);

}
