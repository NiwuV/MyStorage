package ru.msu.speccoursevmk.e;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    private int id;
    private String login;
    private String name;
    private int role;
}
