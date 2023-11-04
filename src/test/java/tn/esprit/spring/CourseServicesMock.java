package tn.esprit.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Support;
import tn.esprit.spring.entities.TypeCourse;
import tn.esprit.spring.repositories.ICourseRepository;
import tn.esprit.spring.services.CourseServicesImpl;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CourseServicesMock {
    @Mock
    ICourseRepository courseRepository;
    @InjectMocks
    CourseServicesImpl courseService;
    Course course = new Course(3L,1,TypeCourse.COLLECTIVE_ADULT,Support.SKI,2.0f,1,null);
    List<Course> listcourses = new ArrayList<Course>() {
        {
            add(new Course(12L,2,TypeCourse.INDIVIDUAL,Support.SKI,2.0f,1,null));
            add(new Course(82L,3,TypeCourse.COLLECTIVE_CHILDREN,Support.SNOWBOARD,2.0f,1,null));
        }
    };
    @Test
    public void testRetrieveCourse() {
        Mockito.when(courseRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(course));
        Course course1 = courseService.retrieveCourse(3L);
        Assertions.assertNotNull(course1);
    }

}
