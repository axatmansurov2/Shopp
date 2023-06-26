package com.example.shopp.service.user;

import com.example.shopp.dto.UserCreateDto;
import com.example.shopp.entity.user.User;
import com.example.shopp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User create(User user) {
        return user;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User SignIn(String username, String password) {
        User userByEmail = userRepository.getUserByEmail(username);
        if (userByEmail.getPassword().equals(password)){
            return userByEmail;
        }
        return null;
    }

    @Override
    public User SignUp(UserCreateDto userCreateDto) {
        return null;
    }

}
