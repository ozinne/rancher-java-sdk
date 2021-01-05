package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VsphereCloudProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VsphereCloudProviderService {

  @GET("vsphereCloudProvider")
  Call<TypeCollection<VsphereCloudProvider>> list();

  @GET("vsphereCloudProvider")
  Call<TypeCollection<VsphereCloudProvider>> list(@QueryMap Filters filters);

  @GET("vsphereCloudProvider/{id}")
  Call<VsphereCloudProvider> get(@Path("id") String id);

  @POST("vsphereCloudProvider")
  Call<VsphereCloudProvider> create(@Body VsphereCloudProvider vsphereCloudProvider);

  @PUT("vsphereCloudProvider/{id}")
  Call<VsphereCloudProvider> update(@Path("id") String id, @Body VsphereCloudProvider vsphereCloudProvider);

  @DELETE("vsphereCloudProvider/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
