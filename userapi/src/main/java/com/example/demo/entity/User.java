package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Create by jony on 2020/6/15
 *
 * @author zhao.yu
 */
@Data
@Entity
@Table(name = "t_user")
public class User extends AuditModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Integer age;
}
