package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceOverride;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceOverrideService {

  @GET("serviceOverride")
  Call<TypeCollection<ServiceOverride>> list();

  @GET("serviceOverride")
  Call<TypeCollection<ServiceOverride>> list(@QueryMap Filters filters);

  @GET("serviceOverride/{id}")
  Call<ServiceOverride> get(@Path("id") String id);

  @POST("serviceOverride")
  Call<ServiceOverride> create(@Body ServiceOverride serviceOverride);

  @PUT("serviceOverride/{id}")
  Call<ServiceOverride> update(@Path("id") String id, @Body ServiceOverride serviceOverride);

  @DELETE("serviceOverride/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
