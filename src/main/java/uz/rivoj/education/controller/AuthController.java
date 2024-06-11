package uz.rivoj.education.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.rivoj.education.dto.request.LoginRequest;
import uz.rivoj.education.dto.request.UserCreateRequest;
import uz.rivoj.education.dto.response.UserResponse;
import uz.rivoj.education.entity.UserRole;
import uz.rivoj.education.service.UserService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/sign-in")
    public UserResponse signIn(
            @RequestBody LoginRequest login) {
        return userService.login(login);
    }

}