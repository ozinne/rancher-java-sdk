package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetWorkload;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TargetWorkloadService {

  @GET("targetWorkload")
  Call<TypeCollection<TargetWorkload>> list();

  @GET("targetWorkload")
  Call<TypeCollection<TargetWorkload>> list(@QueryMap Filters filters);

  @GET("targetWorkload/{id}")
  Call<TargetWorkload> get(@Path("id") String id);

  @POST("targetWorkload")
  Call<TargetWorkload> create(@Body TargetWorkload targetWorkload);

  @PUT("targetWorkload/{id}")
  Call<TargetWorkload> update(@Path("id") String id, @Body TargetWorkload targetWorkload);

  @DELETE("targetWorkload/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
