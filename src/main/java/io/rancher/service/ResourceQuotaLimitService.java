package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ResourceQuotaLimit;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ResourceQuotaLimitService {

  @GET("resourceQuotaLimit")
  Call<TypeCollection<ResourceQuotaLimit>> list();

  @GET("resourceQuotaLimit")
  Call<TypeCollection<ResourceQuotaLimit>> list(@QueryMap Filters filters);

  @GET("resourceQuotaLimit/{id}")
  Call<ResourceQuotaLimit> get(@Path("id") String id);

  @POST("resourceQuotaLimit")
  Call<ResourceQuotaLimit> create(@Body ResourceQuotaLimit resourceQuotaLimit);

  @PUT("resourceQuotaLimit/{id}")
  Call<ResourceQuotaLimit> update(@Path("id") String id, @Body ResourceQuotaLimit resourceQuotaLimit);

  @DELETE("resourceQuotaLimit/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
