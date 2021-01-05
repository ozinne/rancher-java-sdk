package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RollingUpdateDeployment;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RollingUpdateDeploymentService {

  @GET("rollingUpdateDeployment")
  Call<TypeCollection<RollingUpdateDeployment>> list();

  @GET("rollingUpdateDeployment")
  Call<TypeCollection<RollingUpdateDeployment>> list(@QueryMap Filters filters);

  @GET("rollingUpdateDeployment/{id}")
  Call<RollingUpdateDeployment> get(@Path("id") String id);

  @POST("rollingUpdateDeployment")
  Call<RollingUpdateDeployment> create(@Body RollingUpdateDeployment rollingUpdateDeployment);

  @PUT("rollingUpdateDeployment/{id}")
  Call<RollingUpdateDeployment> update(@Path("id") String id, @Body RollingUpdateDeployment rollingUpdateDeployment);

  @DELETE("rollingUpdateDeployment/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
