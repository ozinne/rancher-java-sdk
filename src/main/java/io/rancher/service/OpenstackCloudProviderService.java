package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OpenstackCloudProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface OpenstackCloudProviderService {

  @GET("openstackCloudProvider")
  Call<TypeCollection<OpenstackCloudProvider>> list();

  @GET("openstackCloudProvider")
  Call<TypeCollection<OpenstackCloudProvider>> list(@QueryMap Filters filters);

  @GET("openstackCloudProvider/{id}")
  Call<OpenstackCloudProvider> get(@Path("id") String id);

  @POST("openstackCloudProvider")
  Call<OpenstackCloudProvider> create(@Body OpenstackCloudProvider openstackCloudProvider);

  @PUT("openstackCloudProvider/{id}")
  Call<OpenstackCloudProvider> update(@Path("id") String id, @Body OpenstackCloudProvider openstackCloudProvider);

  @DELETE("openstackCloudProvider/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
