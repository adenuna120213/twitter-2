package com.example.twitter2.Service;

import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Model.User;

import java.util.List;

public interface TweetService {
    Tweet findById(String id);
    Tweet save(Tweet tweet);
    void deleteById(String id);
    List<Tweet> getAllByAuthorId();
    List<Tweet> findAllByLogin(String login);

}
