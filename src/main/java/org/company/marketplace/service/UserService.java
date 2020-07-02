package org.company.marketplace.service;

import org.company.marketplace.model.dto.User;

public interface UserService {
    User getUsers();

    User getUserById(String id);

    User saveUser(User user);

    User updateUser(String id, User user);

    User deleteUser(String id);
}
