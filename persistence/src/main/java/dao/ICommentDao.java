package dao;

import model.Comment;

import java.util.List;

/**
 * Created by DELIA on 14.09.2015.
 */
public interface ICommentDao {

    public List<Comment> getAll(Long articleId);
    public Comment getComment(Long articleId, Long commentId);
    public  void deleteComment(Long articleId, Long commentId);
    public  void saveComment(Comment myComment);
    public void updateComment(Comment myComment);
}
