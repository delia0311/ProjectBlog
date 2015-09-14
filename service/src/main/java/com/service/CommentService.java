package com.service;

import facade.ICommentFacade;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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



    public ICommentFacade getCommentFacade() {
        return commentFacade;
    }

    public void setCommentFacade(ICommentFacade commentFacade) {
        this.commentFacade = commentFacade;
    }


}
