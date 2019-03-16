package ru.itpark.models;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private Integer age;
    private String password;

}
