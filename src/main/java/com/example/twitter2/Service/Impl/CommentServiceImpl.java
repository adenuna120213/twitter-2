package com.example.twitter2.Service.Impl;

import com.example.twitter2.Model.Comment;
import com.example.twitter2.Reposetories.CommentRepositories;
import com.example.twitter2.Service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepositories repositories;

    public CommentServiceImpl(CommentRepositories repositories) {
        this.repositories = repositories;
    }

    @Override
    public List<Comment> findAllByAuthorId(String id) {
        return repositories.findAllByAuthorId(id);
    }

    @Override
    public Comment findById(String id) {
        return repositories.findById(id).orElse(null);
    }

    @Override
    public Comment save(Comment comment) {
        return repositories.save(comment);
    }

    @Override
    public void deleteById(String id) {
        repositories.deleteById(id);
    }

    @Override
    public Comment update(Comment comment) {
        return repositories.save(comment);
    }
}
