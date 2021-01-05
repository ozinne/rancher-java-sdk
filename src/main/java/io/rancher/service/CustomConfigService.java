package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CustomConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CustomConfigService {

  @GET("customConfig")
  Call<TypeCollection<CustomConfig>> list();

  @GET("customConfig")
  Call<TypeCollection<CustomConfig>> list(@QueryMap Filters filters);

  @GET("customConfig/{id}")
  Call<CustomConfig> get(@Path("id") String id);

  @POST("customConfig")
  Call<CustomConfig> create(@Body CustomConfig customConfig);

  @PUT("customConfig/{id}")
  Call<CustomConfig> update(@Path("id") String id, @Body CustomConfig customConfig);

  @DELETE("customConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
