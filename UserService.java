package com.urspayce.Service;

import java.util.Optional;

import com.urspayce.entities.user;
import com.urspayce.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public user registerUser(user user) {
        Optional<user> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User with this email already exists");
        }
        return userRepository.save(user);
    }
}

