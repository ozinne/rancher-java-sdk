package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkConfigService {

  @GET("networkConfig")
  Call<TypeCollection<NetworkConfig>> list();

  @GET("networkConfig")
  Call<TypeCollection<NetworkConfig>> list(@QueryMap Filters filters);

  @GET("networkConfig/{id}")
  Call<NetworkConfig> get(@Path("id") String id);

  @POST("networkConfig")
  Call<NetworkConfig> create(@Body NetworkConfig networkConfig);

  @PUT("networkConfig/{id}")
  Call<NetworkConfig> update(@Path("id") String id, @Body NetworkConfig networkConfig);

  @DELETE("networkConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
