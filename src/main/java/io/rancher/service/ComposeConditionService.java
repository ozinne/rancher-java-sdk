package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComposeConditionService {

  @GET("composeCondition")
  Call<TypeCollection<ComposeCondition>> list();

  @GET("composeCondition")
  Call<TypeCollection<ComposeCondition>> list(@QueryMap Filters filters);

  @GET("composeCondition/{id}")
  Call<ComposeCondition> get(@Path("id") String id);

  @POST("composeCondition")
  Call<ComposeCondition> create(@Body ComposeCondition composeCondition);

  @PUT("composeCondition/{id}")
  Call<ComposeCondition> update(@Path("id") String id, @Body ComposeCondition composeCondition);

  @DELETE("composeCondition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
