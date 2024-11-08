package com.example.twitter2.Reposetories;

import com.example.twitter2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepositories extends JpaRepository<User, String> {
    @Query(nativeQuery = true, name = "SELECT * FROM users u JOIN followers f on u.id = f.follower_id WHERE f.influencer_id = :id")
    List<User> getAllFollowers(@Param("id") String userId);
    Optional<User> findByLogin(String login);
}
