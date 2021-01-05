package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MultiClusterApp;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MultiClusterAppService {

  @GET("multiClusterApp")
  Call<TypeCollection<MultiClusterApp>> list();

  @GET("multiClusterApp")
  Call<TypeCollection<MultiClusterApp>> list(@QueryMap Filters filters);

  @GET("multiClusterApp/{id}")
  Call<MultiClusterApp> get(@Path("id") String id);

  @POST("multiClusterApp")
  Call<MultiClusterApp> create(@Body MultiClusterApp multiClusterApp);

  @PUT("multiClusterApp/{id}")
  Call<MultiClusterApp> update(@Path("id") String id, @Body MultiClusterApp multiClusterApp);

  @DELETE("multiClusterApp/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
