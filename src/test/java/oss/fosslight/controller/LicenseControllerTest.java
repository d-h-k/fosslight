package oss.fosslight.controller;

import code.AcceptanceTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

@SuppressWarnings("NonAsciiCharacters")
public class LicenseControllerTest extends AcceptanceTest {


    @DisplayName("")
    @Test
    public void index() {
        RestAssured
            .given()
            .when()
            .post("USER.LIST")
            .then()
            .log().all()
            .statusCode(HttpStatus.OK.value())
            .extract();
    }


}
