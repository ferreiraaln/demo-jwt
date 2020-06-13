package com.example.demojwt.controller;

import com.example.demojwt.controller.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUsers() {
        return ResponseEntity.ok(Arrays.asList(new UserResponse("Lucas", "Brazil"),
                new UserResponse("Jackie", "China")));
    }
}