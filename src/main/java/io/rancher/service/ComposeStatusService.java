package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComposeStatusService {

  @GET("composeStatus")
  Call<TypeCollection<ComposeStatus>> list();

  @GET("composeStatus")
  Call<TypeCollection<ComposeStatus>> list(@QueryMap Filters filters);

  @GET("composeStatus/{id}")
  Call<ComposeStatus> get(@Path("id") String id);

  @POST("composeStatus")
  Call<ComposeStatus> create(@Body ComposeStatus composeStatus);

  @PUT("composeStatus/{id}")
  Call<ComposeStatus> update(@Path("id") String id, @Body ComposeStatus composeStatus);

  @DELETE("composeStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
