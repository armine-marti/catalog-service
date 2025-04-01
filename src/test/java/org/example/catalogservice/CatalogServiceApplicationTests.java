package org.example.catalogservice;

import org.example.catalogservice.domain.Book;
import org.example.catalogservice.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = CatalogServiceApplication.class)
@ComponentScan("org.example.catalogservice")
class CatalogServiceApplicationTests {

    @Test
    void contextLoads() {
    }
}
