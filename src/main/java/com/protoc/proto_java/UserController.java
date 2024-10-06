package com.protoc.proto_java;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class UserController {

    @PostMapping("/users/create")
    public ResponseEntity<String> createUser(@RequestBody CreateUserPojo createUserPojo) {
        UserProto.User user = UserProto.User.newBuilder()
                .setName(createUserPojo.getName())
                .setEmail(createUserPojo.getEmail())
                .build();
        UserProto.CreateUserResponse createUserResponse = UserProto.CreateUserResponse
                .newBuilder()
                .setUser(user)
                .build();
        return  ResponseEntity.ok().body(createUserResponse.getUser().getEmail());
    }
}
