package dao;


import model.Article;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by DELIA on 11.09.2015.
 */
public class ArticleDao implements IArticleDao{

    private EntityManager entityManager;


    public List<Article> getAll(){
        return this.entityManager.createQuery("from Article").getResultList();
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean deleteArticle(int id){

        return false;
    }

    public boolean saveArticle(Article myArticle){

        return true;
    }

    public Article getArticle(int id){

        return null;
    }
}
