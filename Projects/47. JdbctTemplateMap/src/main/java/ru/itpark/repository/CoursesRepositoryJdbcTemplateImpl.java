package ru.itpark.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itpark.models.Course;
import ru.itpark.models.Lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CoursesRepositoryJdbcTemplateImpl implements CoursesRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL_COURSES = "select * from course " +
            "left join lesson l on course.id = l.course_id";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Map<Long, Course> coursesMap = new HashMap<>();

    private RowMapper<Course> courseRowMapper = (row, rowNumber) -> {
        Long courseId = row.getLong(1);

        if (!coursesMap.containsKey(courseId)) {
            Course course = Course.builder()
                    .id(courseId)
                    .title(row.getString("title"))
                    .lessons(new ArrayList<>())
                    .build();
            coursesMap.put(courseId, course);
        }

        Lesson lesson = Lesson.builder()
                .id(row.getLong(3))
                .theme(row.getString("theme"))
                .build();

        coursesMap.get(courseId).getLessons().add(lesson);
        return null;
    };

    public void save(Course model) {

    }

    public Course find(Long id) {
        return null;
    }

    public List<Course> findAll() {
        coursesMap.clear();
        jdbcTemplate.query(SQL_SELECT_ALL_COURSES, courseRowMapper);
        List<Course> result = new ArrayList<>(coursesMap.values());
        coursesMap.clear();
        return result;
    }

    public void delete(Long id) {

    }
}
