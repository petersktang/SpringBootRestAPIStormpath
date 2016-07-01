package com.jordanec.sbrestapistormpath.client;

import java.util.LinkedHashMap;

import com.jordanec.sbrestapistormpath.model.Token;
import com.jordanec.sbrestapistormpath.util.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Headers;

public interface AuthAPI {
	public static final String MAIN_PATH = "/"+Constants.API_VERSION+"/";
	
	@POST("/"+Constants.LOGIN_PATH)
	Call<LinkedHashMap<String, String>> login(@Body LinkedHashMap<String, String> user);
	
	@FormUrlEncoded
	@Headers("origin: http://localhost:8080")
	@POST(Constants.GET_TOKEN_PATH)
	Call<Token> token(@Field("grant_type") String grant_type, @Field("username") String username, @Field("password") String password);
}