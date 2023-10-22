package finalproject.javaapichallenge.domain.service;

import finalproject.javaapichallenge.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
