package com.erostrum;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void setUp(){
        TestBase.setBaseUrl("https://reqres.in");
    }

    public static void setBaseUrl(String baserUrl){
        RestAssured.baseURI=baserUrl;
;    }
}
