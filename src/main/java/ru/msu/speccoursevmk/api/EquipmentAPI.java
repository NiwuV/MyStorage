package ru.msu.speccoursevmk.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.msu.speccoursevmk.e.Equipment;
import ru.msu.speccoursevmk.e.Nomenclature;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 * АПИ для работы с ИО заявка
 */
@Component
@RequiredArgsConstructor
public class EquipmentAPI {
    private final DataSource dataSource;

    public int insert(Nomenclature nomenclature, Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int edit(Equipment equipment, Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Equipment> getList(Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Nomenclature> getNomenclatures(Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
