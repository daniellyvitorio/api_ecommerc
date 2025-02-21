package com.ecommerce.api.services;

import com.ecommerce.api.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserService userService;


    public UserDTO findById(Long id) {
        return null;
    }

    public List<UserDTO> findAll() {
        return null;
    }

    public UserDTO create(UserDTO dto) {
        return null;
    }

    public UserDTO update(Long id, UserDTO dto) {
        return null;
    }

    public void delete(Long id) {

    }
}
