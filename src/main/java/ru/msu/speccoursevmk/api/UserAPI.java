package ru.msu.speccoursevmk.api;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;
import ru.msu.speccoursevmk.e.User;

import javax.sql.DataSource;

/**
 * АПИ для работы с ИО пользователь
 */
@Component
@RequiredArgsConstructor
public class UserAPI {
    private final DataSource dataSource;

    /**
     * Получение пользователя по учетным данным
     *
     * @param login    Логин
     * @param password Пароль
     * @return Данные пользователя или null, если пользователь не найден
     */
    public User getUser(String login, String password) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject(
                "select * from user where login=:login and password=:password", User.class,
                new MapSqlParameterSource()
                        .addValue("login", login)
                        .addValue("password", password)
        );
    }
}
