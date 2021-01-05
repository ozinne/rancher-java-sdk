package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HealthCheck;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HealthCheckService {

  @GET("healthCheck")
  Call<TypeCollection<HealthCheck>> list();

  @GET("healthCheck")
  Call<TypeCollection<HealthCheck>> list(@QueryMap Filters filters);

  @GET("healthCheck/{id}")
  Call<HealthCheck> get(@Path("id") String id);

  @POST("healthCheck")
  Call<HealthCheck> create(@Body HealthCheck healthCheck);

  @PUT("healthCheck/{id}")
  Call<HealthCheck> update(@Path("id") String id, @Body HealthCheck healthCheck);

  @DELETE("healthCheck/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
