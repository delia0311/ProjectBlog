package facade;

import model.Comment;

import java.util.List;

/**
 * Created by DELIA on 14.09.2015.
 */
public interface ICommentFacade {

    public List<Comment> getAllComments(Long articleId);
    public Comment getComment(Long articleId, Long commentId);
    public void deleteMyComment(Long articleId, Long commentId);
}
