package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RunAsUserStrategyOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RunAsUserStrategyOptionsService {

  @GET("runAsUserStrategyOptions")
  Call<TypeCollection<RunAsUserStrategyOptions>> list();

  @GET("runAsUserStrategyOptions")
  Call<TypeCollection<RunAsUserStrategyOptions>> list(@QueryMap Filters filters);

  @GET("runAsUserStrategyOptions/{id}")
  Call<RunAsUserStrategyOptions> get(@Path("id") String id);

  @POST("runAsUserStrategyOptions")
  Call<RunAsUserStrategyOptions> create(@Body RunAsUserStrategyOptions runAsUserStrategyOptions);

  @PUT("runAsUserStrategyOptions/{id}")
  Call<RunAsUserStrategyOptions> update(@Path("id") String id, @Body RunAsUserStrategyOptions runAsUserStrategyOptions);

  @DELETE("runAsUserStrategyOptions/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
