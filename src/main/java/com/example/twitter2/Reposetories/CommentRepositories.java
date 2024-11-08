package com.example.twitter2.Reposetories;

import com.example.twitter2.Model.Comment;
import com.example.twitter2.Model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepositories  extends JpaRepository<Comment, String> {
    @Query("select Comment from Comment WHERE author.id = :id")
    List<Comment> findAllByAuthorId(@Param("id") String id);

}
