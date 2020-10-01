package com.erostrum.constant;

import io.restassured.RestAssured;

public class Endpoints {
    //public static final is always for constant values
    //before that Endpoints are in the test class. But now we moved it to separate class

    public static final String USERS_ENDPOINT = "/api/users?page=2";
    public static final String SINGLE_USER_ENDPOINT = "/api/users/2";
    public static final String SINGLE_USER_NOT_FOUND_ENDPOINT = "/api/users/23";
}
