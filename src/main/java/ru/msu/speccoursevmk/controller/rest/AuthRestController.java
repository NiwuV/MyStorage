package ru.msu.speccoursevmk.controller.rest;


import io.swagger.annotations.ApiParam;
import jakarta.servlet.http.HttpSession;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import ru.msu.speccoursevmk.api.UserAPI;
import ru.msu.speccoursevmk.e.User;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthRestController {
    private final static String USER_DATA_SESSION_KEY = "UserData";

    private final UserAPI userAPI;

    @PostMapping("/login")
    public ResponseEntity<User> doLogin(@RequestBody LoginRequest request, HttpSession session) {
        if (!request.hasCredentials()) {
            return ResponseEntity.badRequest().build();
        }

        var user = userAPI.getUser(request.getLogin(), request.getPassword());
        if (user != null) {
            session.setAttribute(USER_DATA_SESSION_KEY, user);
            return ResponseEntity.ok(user);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/get-user-data")
    public ResponseEntity<User> getUserData(HttpSession session) {
        var user = (User) session.getAttribute(USER_DATA_SESSION_KEY);

        if (user != null) {
            return ResponseEntity.ok(user);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @Data
    public static class LoginRequest {
        /**
         * Логин пользователя
         */
        @ApiParam("Логин пользователя")
        private String login;

        /**
         * Пароль пользователя
         */
        @ApiParam("Пароль пользователя")
        private String password;

        /**
         * @return Указан ли логин и пароль
         */
        public boolean hasCredentials() {
            return !ObjectUtils.isEmpty(login) && !ObjectUtils.isEmpty(password);
        }
    }
}
