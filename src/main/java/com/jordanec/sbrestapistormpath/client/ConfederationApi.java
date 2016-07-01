package com.jordanec.sbrestapistormpath.client;

import java.util.Collection;

import com.jordanec.sbrestapistormpath.model.*;
import com.jordanec.sbrestapistormpath.util.Constants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.DELETE;

public interface ConfederationApi {
	public static final String MAIN_PATH = "/"+Constants.API_VERSION+"/"+Constants.CONFEDERATIONS_PATH;
	@Headers("Content-Type: application/json")
	@POST(MAIN_PATH)
	Call<CustomRequRespObject<Confederation>> createConfederation(@Body CustomRequRespObject<Confederation> customRequRespConfederation);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idConfederation}")
	Call<CustomRequRespObject<Confederation>> readConfederation(@Path("idConfederation") int idConfederation);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/"+Constants.NAME_VARIABLE+"={"+Constants.NAME_VARIABLE+"}")
	Call<CustomRequRespObject<Confederation>> findByName(@Path(Constants.NAME_VARIABLE) String name);
	
	@Headers("Content-Type: application/json")
	@PUT(MAIN_PATH+"/{idConfederation}")
	Call<CustomRequRespObject<Confederation>> updateConfederation(@Body CustomRequRespObject<Confederation> customRequRespConfederation, @Path("idConfederation") int idConfederation);
	
	@Headers("Content-Type: application/json")
	@DELETE(MAIN_PATH+"/{idConfederation}")
	Call<CustomRequRespObject<Confederation>> deleteConfederation(@Path("idConfederation") int idConfederation);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH)
	Call<CustomRequRespObject<Confederation>> listConfederations();
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idConfederation}/"+Constants.COUNTRIES_PATH)
	Call<CustomRequRespObject<Country>> readConfederationCountries(@Path("idConfederation") int idConfederation);
}
