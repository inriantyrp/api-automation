package com.erostrum.tests;

import com.erostrum.TestBase;
import com.erostrum.constant.Endpoints;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleUserNotFoundTests extends TestBase{

    @Test
    public void SingleUserNotFoundTests(){//one scenario
        //if a thing is always same, its called constant
        given().contentType(ContentType.JSON).
                when().get(Endpoints.SINGLE_USER_NOT_FOUND_ENDPOINT).
                then().statusCode(404);
    }

}
