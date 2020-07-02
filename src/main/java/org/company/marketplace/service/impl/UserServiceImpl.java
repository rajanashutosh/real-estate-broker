package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.User;
import org.company.marketplace.repository.UserRepository;
import org.company.marketplace.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(String id, User user) {
        return null;
    }

    @Override
    public User deleteUser(String id) {
        return null;
    }
}
