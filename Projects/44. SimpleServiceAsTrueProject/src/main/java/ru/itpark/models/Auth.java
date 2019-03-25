package ru.itpark.models;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Auth {
    private Long id;
    private User user;
    private String value;
}
