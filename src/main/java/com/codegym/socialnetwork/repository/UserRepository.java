package com.codegym.socialnetwork.repository;

import com.codegym.socialnetwork.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}