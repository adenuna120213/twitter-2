package com.example.twitter2.Service;

import com.example.twitter2.Model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllByAuthorId(String id);
    Comment findById(String id);
    Comment save(Comment comment);
    void deleteById(String id);
    Comment update(Comment comment);
}
