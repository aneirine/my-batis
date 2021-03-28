package com.aneirine.demo.api;

import com.aneirine.demo.mapper.UserMapper;
import com.aneirine.demo.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserMapper userMapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllUsers(){
        return new ResponseEntity(userMapper.findAll(), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createUser(@RequestBody User data){
        int id = userMapper.insert(data);
        System.out.println(id);

        return new ResponseEntity(userMapper.findAll(), HttpStatus.OK);
    }

}
