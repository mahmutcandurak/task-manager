package com.taskmanager.service;

import com.taskmanager.dto.UserDto;
import com.taskmanager.dto.UserDtoConverter;
import com.taskmanager.exception.UserNotFoundException;
import com.taskmanager.model.User;
import com.taskmanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mahmutcandurak
 */

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;


    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }


    //Optional
    protected User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException("User could not find by id " + id));
    }

    public UserDto getUserById(Long id)  {
        return userDtoConverter
                .convert(userRepository.findById(id)
                        .orElseThrow(() -> new UserNotFoundException("User could not find by id " + id.toString())));
    }

    public List<User> gelAllUsers(){
        return userRepository.findAll();
    }



    public User save(User user) {
        return userRepository.save(user);
    }


    protected User updateUserById(Long id) {
        User user = findUserById(id);
        return userRepository.save(user);
    }

    public UserDto deleteUserById (Long id) {
        UserDto userDto = getUserById(id);
        userRepository.deleteById(id);
        return userDto;
    }

}



