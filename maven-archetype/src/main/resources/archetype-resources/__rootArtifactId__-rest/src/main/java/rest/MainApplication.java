#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.rest;

import ${groupId}.authorization.Authorized;
import ${groupId}.docs.Documented;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

  //TODO: rename this
  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);
  }

}
