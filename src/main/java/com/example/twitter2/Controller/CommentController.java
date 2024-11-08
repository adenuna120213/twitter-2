package com.example.twitter2.Controller;

import com.example.twitter2.Model.Comment;
import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public Comment getById(@PathVariable String id){
       return service.findById(id);
    }

    @GetMapping("Comments_page/{id}")
    public String getById(@PathVariable String id, Model model) {
        model.addAttribute("comments", service.findById(id));
        return "comments-page";
    }
    @PostMapping("/Commens_form")
    public String save(Model model, @ModelAttribute Comment comment) {
        model.addAttribute("message", "Твит опубликован");
        service.save(comment);
        return "comment-form";
    }
    @GetMapping("/comment_form")
    public String renderTweetForm(Model model){
        model.addAttribute("new_tweet", new Tweet());
        return "tweet-form";
    }


}
