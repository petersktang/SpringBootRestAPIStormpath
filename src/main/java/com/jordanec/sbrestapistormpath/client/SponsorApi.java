package com.jordanec.sbrestapistormpath.client;

import java.util.Collection;

import com.jordanec.sbrestapistormpath.model.*;
import com.jordanec.sbrestapistormpath.util.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.DELETE;

public interface SponsorApi {
	public static final String MAIN_PATH = "/"+Constants.API_VERSION+"/"+Constants.SPONSORS_PATH;
	
	@POST(MAIN_PATH)
	Call<CustomRequRespObject<Sponsor>> createSponsor(@Body CustomRequRespObject<Sponsor> customRequRespSponsor);
	
	@GET(MAIN_PATH+"/{idSponsor}")
	Call<CustomRequRespObject<Sponsor>> readSponsor(@Path("idSponsor") int idSponsor);
	
	@GET(MAIN_PATH+"/"+Constants.NAME_VARIABLE+"={"+Constants.NAME_VARIABLE+"}")
	Call<CustomRequRespObject<Sponsor>> findByName(@Path(Constants.NAME_VARIABLE) String name);
	
	@PUT(MAIN_PATH+"/{idSponsor}")
	Call<CustomRequRespObject<Sponsor>> updateSponsor(@Body CustomRequRespObject<Sponsor> customRequRespSponsor, @Path("idSponsor") int idSponsor);
	
	@DELETE(MAIN_PATH+"/{idSponsor}")
	Call<CustomRequRespObject<Sponsor>> deleteSponsor(@Path("idSponsor") int idSponsor);
	
	@GET(MAIN_PATH)
	Call<CustomRequRespObject<Sponsor>> listSponsors();
	
	@GET(MAIN_PATH+"/{idSponsor}/"+Constants.TEAMS_PATH)
	Call<CustomRequRespObject<Team>> readSponsorTeams(@Path("idSponsor") int idSponsor);
	
	@GET(MAIN_PATH+"/{idSponsor}/"+Constants.PLAYERS_PATH)
	Call<CustomRequRespObject<Sponsor>> readSponsorPlayers(@Path("idSponsor") int idSponsor);
}
