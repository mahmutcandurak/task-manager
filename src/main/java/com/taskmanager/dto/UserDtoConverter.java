package com.taskmanager.dto;

import com.taskmanager.model.User;
import org.springframework.stereotype.Component;

/**
 * @author mahmutcandurak
 */

@Component
public class UserDtoConverter {

    public UserDto convert(User from) {
        return new UserDto(from.getId(),
                from.getName(),
                from.getSurname(),
                from.getEmail(),
                from.getPassword(),
                from.getRole());
    }
}
