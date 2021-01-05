package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RuntimeClassStrategyOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RuntimeClassStrategyOptionsService {

  @GET("runtimeClassStrategyOptions")
  Call<TypeCollection<RuntimeClassStrategyOptions>> list();

  @GET("runtimeClassStrategyOptions")
  Call<TypeCollection<RuntimeClassStrategyOptions>> list(@QueryMap Filters filters);

  @GET("runtimeClassStrategyOptions/{id}")
  Call<RuntimeClassStrategyOptions> get(@Path("id") String id);

  @POST("runtimeClassStrategyOptions")
  Call<RuntimeClassStrategyOptions> create(@Body RuntimeClassStrategyOptions runtimeClassStrategyOptions);

  @PUT("runtimeClassStrategyOptions/{id}")
  Call<RuntimeClassStrategyOptions> update(@Path("id") String id, @Body RuntimeClassStrategyOptions runtimeClassStrategyOptions);

  @DELETE("runtimeClassStrategyOptions/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
