package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PhoneApplication {

  @RequestMapping(value = "/call")
  public String call() {
    return "Return Call";
  }

  @RequestMapping(value = "/missed-called")
  public String missedCalled() {
    return "Return Missed Called";
  }

  public static void main(String[] args) {
    SpringApplication.run(PhoneApplication.class, args);
  }
}
