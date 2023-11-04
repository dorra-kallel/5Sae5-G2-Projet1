package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Instructor;
import tn.esprit.spring.services.IInstructorServices;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InstructorServicesImplTest {
  @Autowired
    IInstructorServices is;
    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<Instructor> listUsers = is.retrieveAllInstructors();
        Assertions.assertEquals(0, listUsers.size());
    }
}
