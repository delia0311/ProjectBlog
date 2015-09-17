package facade;

import dao.ICommentDao;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by DELIA on 14.09.2015.
 */
public class CommentFacade implements ICommentFacade{

    @Autowired
    private ICommentDao commentDao;

    public ICommentDao getCommentDao() {
        return commentDao;
    }

    public void setCommentDao(ICommentDao commentDao) {
        this.commentDao = commentDao;
    }

    public List<Comment> getAllComments(Long articleId) {

        return this.commentDao.getAll(articleId);
    }

    public Comment getComment(Long articleId, Long commentId){

        return this.commentDao.getComment(articleId, commentId);
    }

    public void deleteMyComment(Long articleId, Long commentId){

        this.commentDao.deleteComment(articleId, commentId);
    }

    public void saveMyComment(Comment myComment){

        this.commentDao.saveComment(myComment);
    }

    public void updateMyComment(Comment myComment ){

        this.commentDao.updateComment(myComment);
    }
}
