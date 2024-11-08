package com.example.twitter2.Controller;

import com.example.twitter2.Model.Comment;
import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Model.User;
import com.example.twitter2.Service.TweetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tweet")
public class TweetController {
    private final TweetService service;

    public TweetController(TweetService service) {
        this.service = service;
    }

    @GetMapping("tweet_page/{id}")
    public String getById(@PathVariable String id, Model model) {
        model.addAttribute("tweet", service.findById(id));
        return "tweet-page";
    }

    @PostMapping("/comment_form")
    public String save(Model model, @ModelAttribute Tweet tweet) {
        model.addAttribute("message", "Твит опубликован");
        service.save(tweet);
        return "comment-form";
    }
    @GetMapping("/comment_form")
    public String renderCommentForm(Model model){
        model.addAttribute("new_comment", new Comment());
        return "comment-form";
    }

}