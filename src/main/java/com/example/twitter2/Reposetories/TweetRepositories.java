package com.example.twitter2.Reposetories;

import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TweetRepositories  extends JpaRepository<Tweet, String> {
    @Query("SELECT Tweet FROM Tweet WHERE Tweet.author.login = :login")
    List<Tweet> findByLogin(@Param("login") String login);
}
