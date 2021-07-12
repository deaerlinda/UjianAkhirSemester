package com.deaerlinda.uas_182101914_dea.rest;

import com.deaerlinda.uas_182101914_dea.model.GetUser;
import com.deaerlinda.uas_182101914_dea.model.User;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/users")
    Call<GetUser> getUsersList();
}
