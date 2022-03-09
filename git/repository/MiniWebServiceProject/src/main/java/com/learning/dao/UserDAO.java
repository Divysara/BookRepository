package com.learning.dao;

import org.springframework.data.repository.CrudRepository;

import com.learning.Model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
