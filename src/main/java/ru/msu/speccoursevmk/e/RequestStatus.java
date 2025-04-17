package ru.msu.speccoursevmk.e;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RequestStatus {
    private int id;
    private String name;
}
