package ru.msu.speccoursevmk.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.msu.speccoursevmk.e.Request;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 * АПИ для работы с ИО заявка
 */
@Component
@RequiredArgsConstructor
public class RequestAPI {
    private final DataSource dataSource;

    public int upsert(Request request, Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Request> getList(int userId, Connection connection) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
