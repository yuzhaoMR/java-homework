package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** Create by jony on 2020/6/15 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
