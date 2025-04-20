package com.bkty.springwebflux.service;

import com.bkty.springwebflux.entity.User;
import com.bkty.springwebflux.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public Mono<User> save(User user) {
    return userRepository.save(user);
  }

  public Mono<User> deleteUser(int id) {
    return userRepository.findById(id)
        .flatMap(user -> userRepository.delete(user).then(Mono.just(user)))
        .switchIfEmpty(Mono.empty());
  }

  public Mono<User> updateUser(User user) {

    return userRepository.findById(user.getId())
        .flatMap(user1 -> userRepository.save(user))
        .switchIfEmpty(Mono.empty());

  }

  public Flux<User> AllUser() {
    return userRepository.findAll();
  }

}
