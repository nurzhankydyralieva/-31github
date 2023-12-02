package org.rest.controller;

import com.epam.xstack.dao.authenticationDAO.AuthenticationDAO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationDAO authenticationDAO;

    @GetMapping("/{id}")
    public ResponseEntity<AuthenticationRequestDTO> login(@PathVariable("id") Long id, @RequestBody AuthenticationRequestDTO requestDTO){
        return new ResponseEntity<>(authenticationDAO.authenticate(id,requestDTO), HttpStatus.OK);
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<User> getTrainer(@PathVariable("id") Long id){
//        return new ResponseEntity<>(authenticationDAO.getById(id), HttpStatus.OK);
//    }

}
