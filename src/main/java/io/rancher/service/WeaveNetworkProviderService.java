package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WeaveNetworkProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WeaveNetworkProviderService {

  @GET("weaveNetworkProvider")
  Call<TypeCollection<WeaveNetworkProvider>> list();

  @GET("weaveNetworkProvider")
  Call<TypeCollection<WeaveNetworkProvider>> list(@QueryMap Filters filters);

  @GET("weaveNetworkProvider/{id}")
  Call<WeaveNetworkProvider> get(@Path("id") String id);

  @POST("weaveNetworkProvider")
  Call<WeaveNetworkProvider> create(@Body WeaveNetworkProvider weaveNetworkProvider);

  @PUT("weaveNetworkProvider/{id}")
  Call<WeaveNetworkProvider> update(@Path("id") String id, @Body WeaveNetworkProvider weaveNetworkProvider);

  @DELETE("weaveNetworkProvider/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
