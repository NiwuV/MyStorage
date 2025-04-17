package ru.msu.speccoursevmk.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.msu.speccoursevmk.api.EquipmentAPI;
import ru.msu.speccoursevmk.e.Equipment;
import ru.msu.speccoursevmk.e.Nomenclature;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("api/equipment")
@RequiredArgsConstructor
public class EquipmentRestController {
    private final EquipmentAPI equipmentAPI;
    private final DataSource dataSource;

    @GetMapping("/list")
    public ResponseEntity<List<Equipment>> getList() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping("/nomenclatures")
    public ResponseEntity<List<Nomenclature>> getNomenclatures() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PutMapping("/add-nomenclatures")
    public ResponseEntity<Void> addNomenclature(@RequestBody Nomenclature nomenclature) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping("/edit")
    public ResponseEntity<Void> edit(@RequestBody Equipment equipment) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
