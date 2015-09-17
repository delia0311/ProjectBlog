package com.service;

import facade.ICommentFacade;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by DELIA on 14.09.2015.
 */

@Controller
public class CommentService {

    @Autowired
    ICommentFacade commentFacade;

    @RequestMapping(value="/article/{articleId}/comment",method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getAllComments(@PathVariable("articleId")  Long articleId)
    {
        return this.commentFacade.getAllComments(articleId);
    }

    @RequestMapping(value = "/article/{articleId}/comment/{commentId}", method = RequestMethod.GET)
    @ResponseBody
    public Comment getComment( @PathVariable("articleId")Long articleId, @PathVariable("commentId") Long commentId) {

        return this.commentFacade.getComment(articleId, commentId);
    }

    @RequestMapping(value = "/article/{articleId}/comment/{commentId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteComment(@PathVariable("articleId") Long articleId, @PathVariable("commentId") Long commentId) {

        this.commentFacade.deleteMyComment(articleId, commentId);
    }

    @RequestMapping(value = "/article/{articleId}/comment/", method = RequestMethod.POST)
    @ResponseBody
    public void saveComment(@RequestBody Comment myComment, @PathVariable("articleId") Long articleId) {

        myComment.setArticleId(articleId);
        this.commentFacade.saveMyComment(myComment);
    }

    @RequestMapping(value = "/article/{articleId}/comment/{commentId}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateComment(@PathVariable("articleId") Long articleId,@PathVariable("commentId") Long id, @RequestBody Comment myComment) {

        myComment.setId(id);
        myComment.setArticleId(articleId);
        this.commentFacade.updateMyComment(myComment);
    }


    public ICommentFacade getCommentFacade() {
        return commentFacade;
    }

    public void setCommentFacade(ICommentFacade commentFacade) {
        this.commentFacade = commentFacade;
    }


}
