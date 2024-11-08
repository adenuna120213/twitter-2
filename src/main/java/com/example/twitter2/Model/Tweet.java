package com.example.twitter2.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "tweets")
@RequiredArgsConstructor
public class Tweet {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    @ManyToMany
    private List<Comment> replies;
   /* private String content;
    private User author;
    private List<Tweet> replies;
    private List<User> likes;*/

}
