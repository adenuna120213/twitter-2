package com.example.twitter2.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "comments")
public class Comment {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
}
