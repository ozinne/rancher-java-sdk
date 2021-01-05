package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AllowedCSIDriver;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AllowedCSIDriverService {

  @GET("allowedCSIDriver")
  Call<TypeCollection<AllowedCSIDriver>> list();

  @GET("allowedCSIDriver")
  Call<TypeCollection<AllowedCSIDriver>> list(@QueryMap Filters filters);

  @GET("allowedCSIDriver/{id}")
  Call<AllowedCSIDriver> get(@Path("id") String id);

  @POST("allowedCSIDriver")
  Call<AllowedCSIDriver> create(@Body AllowedCSIDriver allowedCSIDriver);

  @PUT("allowedCSIDriver/{id}")
  Call<AllowedCSIDriver> update(@Path("id") String id, @Body AllowedCSIDriver allowedCSIDriver);

  @DELETE("allowedCSIDriver/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
