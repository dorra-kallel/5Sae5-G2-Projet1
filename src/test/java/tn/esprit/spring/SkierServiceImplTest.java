package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.services.ISkierServices;

import java.util.List;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SkierServiceImplTest {


        @Autowired
        ISkierServices sub;

        @Test
        @Order(1)
        public void testRetrieveSubscriptions() {
            List<Skier> listSkiers = sub.retrieveAllSkiers();
            Assertions.assertEquals(0, listSkiers.size());
        }
    }





