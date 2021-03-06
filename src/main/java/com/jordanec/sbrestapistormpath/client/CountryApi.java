package com.jordanec.sbrestapistormpath.client;

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

public interface CountryApi {
	public static final String MAIN_PATH = "/"+Constants.API_VERSION+"/"+Constants.COUNTRIES_PATH;
	
	@Headers("Content-Type: application/json")
	@POST(MAIN_PATH)
	Call<CustomRequRespObject<Country>> createCountry(@Body CustomRequRespObject<Country> customRequRespCountry);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idCountry}")
	Call<CustomRequRespObject<Country>> readCountry(@Path("idCountry") int idCountry);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/"+Constants.NAME_VARIABLE+"={"+Constants.NAME_VARIABLE+"}")
	Call<CustomRequRespObject<Country>> findByName(@Path(Constants.NAME_VARIABLE) String name);
	
	@Headers("Content-Type: application/json")
	@PUT(MAIN_PATH+"/{idCountry}")
	Call<CustomRequRespObject<Country>> updateCountry(@Body CustomRequRespObject<Country> customRequRespCountry, @Path("idCountry") int idCountry);
	
	@Headers("Content-Type: application/json")
	@DELETE(MAIN_PATH+"/{idCountry}")
	Call<CustomRequRespObject<Country>> deleteCountry(@Path("idCountry") int idCountry);

	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH)
	Call<CustomRequRespObject<Country>> listCountries();
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idCountry}/"+Constants.TEAMS_PATH)
	Call<CustomRequRespObject<Team>> readCountryTeams(@Path("idCountry") int idCountry);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idCountry}/"+Constants.PLAYERS_PATH)
	Call<CustomRequRespObject<Player>> readCountryPlayers(@Path("idCountry") int idCountry);
	
	@Headers("Content-Type: application/json")
	@GET(MAIN_PATH+"/{idCountry}/"+Constants.CONFEDERATION_PATH)
	Call<CustomRequRespObject<Confederation>> readCountryConfederation(@Path("idCountry") int idCountry);
}
