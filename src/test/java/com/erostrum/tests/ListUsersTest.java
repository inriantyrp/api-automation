package com.erostrum.tests;

import com.erostrum.TestBase;
import com.erostrum.constant.Endpoints;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ListUsersTest extends TestBase {//TestBase is a parent class

    @Test
    public void testUsersStatusCode(){ //test method
        //given, when, then
        //https://reqres.in/api/users?page=2
            //- https://reqres.in = baseUrl
            //- /api/users?page=2 = endpoint
            //- ?page=2 --> query parameter --> Whatever after question mark(?) is query parameter
        // in code, you should avoid duplicate code, redudance code
        given().contentType(ContentType.JSON).
                when().get(Endpoints.USERS_ENDPOINT).
                then().statusCode(200); //means when i hit the URL, it should return 200
    }

    @Test
    public void testUsersResponse(){
        given().contentType(ContentType.JSON).
                when().get(Endpoints.USERS_ENDPOINT).
                then().extract().response().prettyPrint();
    }
}
