package camt.cbsd.dao;

import camt.cbsd.entity.Course;
import camt.cbsd.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Dto on 07-Apr-17.
 */
@Repository
public class CourseDaoImpl implements CourseDao {
    CourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course add(Course course) {
        return courseRepository.save(course);
    }
}
