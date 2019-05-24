package com.spring.springmvc.service.impl;

import com.spring.springmvc.model.User;
import com.spring.springmvc.repository.UserRepository;
import com.spring.springmvc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public void createUser(User user) {
        repository.save(user);
    }
}
