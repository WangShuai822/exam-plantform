package exam.paperContext.domain.model.paper;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

public class BlankQuizTest extends BaseTest{
    @Test
    public void should_return_blankQuiz_when_create() throws JSONException {
        JSONObject body = new JSONObject();
        body.put("content", "someContent");
        body.put("score", 5);
        given().contentType("application/json")
                .body(body.toString())
                .when().log().all()
                .post("/blankQuiz/add")
                .then().log().all()
                .body("blankQuizId.id", notNullValue())
                .statusCode(201);
    }
}
