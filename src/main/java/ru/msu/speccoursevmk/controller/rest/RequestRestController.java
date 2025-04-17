package ru.msu.speccoursevmk.controller.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.msu.speccoursevmk.api.RequestAPI;
import ru.msu.speccoursevmk.e.Request;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("api/requests")
@RequiredArgsConstructor
public class RequestRestController {
    private final RequestAPI requestAPI;
    private final DataSource dataSource;

    @GetMapping("/list")
    public ResponseEntity<List<Request>> getList() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PutMapping("/add")
    public ResponseEntity<List<Request>> add(@RequestBody Request request) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
