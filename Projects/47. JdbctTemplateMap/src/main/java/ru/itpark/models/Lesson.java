package ru.itpark.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson {
    private Long id;
    private String theme;
    private String beginTime;
    private String endTime;
}
