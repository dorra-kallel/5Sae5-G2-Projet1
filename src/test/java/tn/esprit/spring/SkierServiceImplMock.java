package tn.esprit.spring;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.repositories.ISkierRepository;
import tn.esprit.spring.services.SkierServicesImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SkierServiceImplMock {


        @Mock
        ISkierRepository iSkierRepository;
        @InjectMocks
        SkierServicesImpl skierServices;


        List<Skier> listSkiers = new ArrayList<Skier>() {
            {

                add(new Skier(1L,"soulaymen","frikha",LocalDate.of(2023, 1, 1),"Sfax",null,null,null));
                add(new Skier(1L,"Amine","Ben salah",LocalDate.of(2023, 1, 1),"Sousse",null,null,null));
                add(new Skier(1L,"Zaineb","Triki",LocalDate.of(2023, 1, 1),"Sfax",null,null,null));
                add(new Skier(1L,"Dorra","Kallel",LocalDate.of(2023, 1, 1),"Sfax",null,null,null));

            }
        };

    };



