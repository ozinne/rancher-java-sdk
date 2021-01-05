package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Action;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ActionService {

  @GET("action")
  Call<TypeCollection<Action>> list();

  @GET("action")
  Call<TypeCollection<Action>> list(@QueryMap Filters filters);

  @GET("action/{id}")
  Call<Action> get(@Path("id") String id);

  @POST("action")
  Call<Action> create(@Body Action action);

  @PUT("action/{id}")
  Call<Action> update(@Path("id") String id, @Body Action action);

  @DELETE("action/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
