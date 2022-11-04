package ru.nsu.contactproxy.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import ru.nsu.contactproxy.backend.dto.*;

import java.util.Optional;

@Controller
public class AuthorizeApiController implements AuthorizeApi {

    private final NativeWebRequest request;

    @Autowired
    public AuthorizeApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<JWTResponseDTO> changePassword(Integer userId, UserChangePasswordRequestDTO userChangePasswordRequestDTO) {
        return AuthorizeApi.super.changePassword(userId, userChangePasswordRequestDTO);
    }

    @Override
    public ResponseEntity<Void> forgotPassword(UserRestorePasswordRequestDTO userRestorePasswordRequestDTO) {
        return AuthorizeApi.super.forgotPassword(userRestorePasswordRequestDTO);
    }

    @Override
    public ResponseEntity<?> login(UserLoginRequestDTO userLoginRequestDTO) {
        if (!userLoginRequestDTO.getEmail().equals("test@mail.ru") || !userLoginRequestDTO.getPassword().equals("test"))
            return new ResponseEntity<>(new ErrorDTO("bad input", "bad input"), HttpStatus.BAD_REQUEST);
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(2);
        roleDTO.setName("user");
        UserDTO userDTO = new UserDTO();
        userDTO.setId(12);
        userDTO.setName("Ivan");
        userDTO.setName("Ivanov");
        userDTO.setUrl("testUrl");
        JWTResponseDTO jwtResponseDTO = new JWTResponseDTO();
        jwtResponseDTO.setRole(roleDTO);
        jwtResponseDTO.setUser(userDTO);
        jwtResponseDTO.setJwt("ab1cd2e.f3gh4ij5k.l6mn7op8");
        return new ResponseEntity<>(jwtResponseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> register(UserRegisterRequestDTO userRegisterRequestDTO) {
        if (userRegisterRequestDTO.getEmail().equals("test@mail.ru"))
            return new ResponseEntity<>(new ErrorDTO("bad email", "this email is already taken"), HttpStatus.BAD_REQUEST);
        if (userRegisterRequestDTO.getEmail().equals("test2@mail.ru"))
            return new ResponseEntity<>(new ErrorDTO("bad name", "name is too long"), HttpStatus.BAD_REQUEST);
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(2);
        roleDTO.setName("user");
        UserDTO userDTO = new UserDTO();
        userDTO.setId(12);
        userDTO.setName("Ivan");
        userDTO.setName("Ivanov");
        userDTO.setUrl("testUrl");
        JWTResponseDTO jwtResponseDTO = new JWTResponseDTO();
        jwtResponseDTO.setRole(roleDTO);
        jwtResponseDTO.setUser(userDTO);
        jwtResponseDTO.setJwt("ab1cd2e.f3gh4ij5k.l6mn7op8");
        return new ResponseEntity<>(jwtResponseDTO, HttpStatus.OK);
    }
}
