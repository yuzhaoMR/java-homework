package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IEmailService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/** Create by jony on 2020/6/15 */
@RestController
@ResponseBody
public class UserController {

  private UserService userService;
  private IEmailService emailService;

  @Autowired
  public UserController(UserService userService,
                        IEmailService emailService) {
    this.userService = userService;
    this.emailService = emailService;
  }

  @PostMapping("/users")
  public String addUser(@RequestBody User user) {
    Long id = userService.addUser(user);
    return emailService.getEmail(id.toString());
  }

  @PutMapping("/users/{id}")
  public void editUser(@RequestBody User user, @PathVariable("id") Long id) {
    user.setId(id);
    userService.editUser(user);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable("id") Long id) {
    userService.deleteUser(id);
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable("id") Long id) {
    return userService.getUserById(id);
  }

  @GetMapping("/users")
  public Page<User> getUsers(
      @PathParam("page") int page, @PathParam("size") int size, @PathParam("sort") String sort) {
    return userService.getUsers(page, size, sort);
  }
}
