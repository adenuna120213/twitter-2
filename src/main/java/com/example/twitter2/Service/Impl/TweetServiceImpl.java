package com.example.twitter2.Service.Impl;

import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Reposetories.TweetRepositories;
import com.example.twitter2.Service.TweetService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TweetServiceImpl implements TweetService {
    private final TweetRepositories tweetRepositories;

    public TweetServiceImpl(TweetRepositories tweetRepositories) {
        this.tweetRepositories = tweetRepositories;
    }



    @Override
    public Tweet findById(String id) {
        return tweetRepositories.findById(id).orElse(null);
    }

    @Override
    public Tweet save(Tweet tweet) {
        return tweetRepositories.save(tweet);
    }

    @Override
    public void deleteById(String id) {
        tweetRepositories.deleteById(id);
    }

    @Override
    public List<Tweet> getAllByAuthorId() {
        return  tweetRepositories.findAll();
    }

    @Override
    public List<Tweet> findAllByLogin(String login) {
        return tweetRepositories.findByLogin(login);
    }
}
