package com.bkty.springwebflux.repository;

import com.bkty.springwebflux.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
}
