package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalDnsProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GlobalDnsProviderService {

  @GET("globalDnsProvider")
  Call<TypeCollection<GlobalDnsProvider>> list();

  @GET("globalDnsProvider")
  Call<TypeCollection<GlobalDnsProvider>> list(@QueryMap Filters filters);

  @GET("globalDnsProvider/{id}")
  Call<GlobalDnsProvider> get(@Path("id") String id);

  @POST("globalDnsProvider")
  Call<GlobalDnsProvider> create(@Body GlobalDnsProvider globalDnsProvider);

  @PUT("globalDnsProvider/{id}")
  Call<GlobalDnsProvider> update(@Path("id") String id, @Body GlobalDnsProvider globalDnsProvider);

  @DELETE("globalDnsProvider/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
