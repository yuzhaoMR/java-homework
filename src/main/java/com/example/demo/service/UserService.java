package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

/** Create by jony on 2020/6/15 */
@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void addUser(User user) {
    User userEntity = new User();
    userEntity.setAge(user.getAge());
    userEntity.setName(user.getName());
    userEntity.setCreatedAt(new Date());
    userRepository.save(userEntity);
  }

  public void editUser(User user) {
    var userEntity = userRepository.findById(user.getId())
            .orElseThrow(NullPointerException::new);
    userEntity = user;
    userRepository.save(userEntity);
  }

  public void deleteUser(Long id) {
    var user = userRepository.getOne(id);
    userRepository.delete(user);
  }

  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public Page<User> getUsers(int page, int size, String sort) {
    Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, sort));
    return userRepository.findAll(pageable);
  }
}
