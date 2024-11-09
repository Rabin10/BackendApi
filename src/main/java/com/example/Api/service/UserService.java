package com.example.Api.service;

import com.example.Api.entity.User;
import com.example.Api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService.java
 * Centralizes data access to the User database.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository; // Dependency injection for UserRepository

    /**
     * Fetch all Users.
     *
     * @return the list of all Users.
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Fetch a unique User.
     *
     * @param id the unique User id.
     * @return a unique User object.
     */
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null); // Return null if not found
    }

    /**
     * Add a new User to the database.
     *
     * @param user the new User to add.
     */
    public User saveUser(User user) {
        return userRepository.save(user); // Save and return the created User
    }

    /**
     * Update an existing User.
     *
     * @param id the unique User Id.
     * @param user the new User details.
     */
    public User updateUser(Long id, User user) {
        User existingUser = getUserById(id);
        if (existingUser != null) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setAccountStatus(user.getAccountStatus());
            return userRepository.save(existingUser); // Update and return the modified User
        }
        return null; // Return null if the User wasn't found
    }

    /**
     * Delete a unique User.
     *
     * @param id the unique User Id.
     */
    public void deleteUser(Long id) {
        userRepository.deleteById(id); // Delete User by Id
    }
}
