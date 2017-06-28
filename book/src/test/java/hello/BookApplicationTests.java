package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookApplicationTests {

    @Autowired
    private TestRestTemplate rest;

    @Test
    public void availableTest() {
        String resp = rest.getForObject("/available", String.class);
        assertThat(resp).isEqualTo("Available Spring Boot in Action");
    }

    @Test
    public void checkedOutTest() {
        String resp = rest.getForObject("/checked-out", String.class);
        assertThat(resp).isEqualTo("Checked out Spring Boot in Action");
    }
}
