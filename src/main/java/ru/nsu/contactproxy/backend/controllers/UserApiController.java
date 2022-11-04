package ru.nsu.contactproxy.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import ru.nsu.contactproxy.backend.dto.PermissionRequestDTO;

import java.util.List;
import java.util.Optional;

@Controller
public class UserApiController implements UserApi {

    private final NativeWebRequest request;

    @Autowired
    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> answerOnNotification(Integer requestId, PermissionRequestDTO permissionRequestDTO) {
        return UserApi.super.answerOnNotification(requestId, permissionRequestDTO);
    }

    @Override
    public ResponseEntity<List<PermissionRequestDTO>> getUsersNotifications(Integer userId) {
        return UserApi.super.getUsersNotifications(userId);
    }
}
