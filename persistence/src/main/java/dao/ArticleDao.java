package dao;


import model.Article;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by DELIA on 11.09.2015.
 */
public class ArticleDao implements IArticleDao {

    private EntityManager entityManager;


    public List<Article> getAll() {
        return this.entityManager.createQuery("from Article").getResultList();
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Article getArticle(Long id) {

        if (id == null) {
            return null;
        } else {
            return entityManager.find(Article.class, id);
        }
    }

    @Transactional
    public void deleteArticle(Long id) {

        Article itemFromDbs = this.getArticle(id);
        //Article itemFromDbs = entityManager.find(Article.class, id);
        if (itemFromDbs != null) {
            entityManager.remove(itemFromDbs);
        }

    }

    @Transactional
    public void saveArticle(Article myArticle) {

        myArticle.setDate(new Date());
        entityManager.persist(myArticle);
    }

    @Transactional
    public void updateArticle(Article myArticle) {

        Article itemFromDbs = this.getArticle(myArticle.getId());
        if (itemFromDbs != null) {
            itemFromDbs.setTitle(myArticle.getTitle());
            itemFromDbs.setDescription(myArticle.getDescription());
            itemFromDbs.setContent(myArticle.getContent());
            itemFromDbs.setDate(new Date());
            entityManager.persist(itemFromDbs);
        }

    }
}
