package com.example.twitter2.Model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @JoinTable(name = "followers",
    joinColumns = @JoinColumn(name = "follower_id"),
    inverseJoinColumns = @JoinColumn(name = "influencer_id"))
    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> following;
    @JoinTable(name = "followers",
            joinColumns = @JoinColumn(name = "influencer_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id"))
    @ManyToMany
    private List<User> followers;

    public User(){

    }
}
