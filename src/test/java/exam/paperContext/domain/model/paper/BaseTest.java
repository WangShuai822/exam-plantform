package exam.paperContext.domain.model.paper;

import exam.SpringWebApplication;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT, classes = SpringWebApplication.class)
@ExtendWith(SpringExtension.class)
public abstract class BaseTest {

    @LocalServerPort
    protected int port;


    @BeforeEach
    public void Before() throws SQLException {
        RestAssured.port = port;
//        RestAssured.basePath = "/";

    }

}


