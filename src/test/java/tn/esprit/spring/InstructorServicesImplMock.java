package tn.esprit.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Instructor;
import tn.esprit.spring.repositories.IInstructorRepository;
import tn.esprit.spring.services.InstructorServicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class InstructorServicesImplMock {
    @Mock
    IInstructorRepository ir;
    @InjectMocks
    InstructorServicesImpl is;
    Instructor instructor = new Instructor(1L, "John", "Doe", LocalDate.of(2023, 11, 4),null);
    List<Instructor> listUsers = new ArrayList<Instructor>() {
        {
            add(new Instructor(2L, "f2", "l2", LocalDate.of(2023, 11, 4), null));
            add(new Instructor(3L, "f3", "l3", LocalDate.of(2023, 11, 4), null));
        }
    };
    @Test
    public void testRetrieveInstructor() {
        Mockito.when(ir.findById(Mockito.anyLong())).thenReturn(Optional.of(instructor));
        Instructor instructor1 = is.retrieveInstructor(2L);
        Assertions.assertNotNull(instructor1);
    }
}
