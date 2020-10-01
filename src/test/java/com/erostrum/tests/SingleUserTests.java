package com.erostrum.tests;

import com.erostrum.TestBase;
import com.erostrum.constant.Endpoints;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SingleUserTests extends TestBase{

    @Test
    public void singleUserTests(){//one scenario
        //if a thing is always same, its called constant
        given().contentType(ContentType.JSON).
                when().get(Endpoints.SINGLE_USER_ENDPOINT).
                then().body("data.first_name",equalTo("Janet"));
    }

}
