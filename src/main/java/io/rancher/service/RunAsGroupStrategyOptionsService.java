package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RunAsGroupStrategyOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RunAsGroupStrategyOptionsService {

  @GET("runAsGroupStrategyOptions")
  Call<TypeCollection<RunAsGroupStrategyOptions>> list();

  @GET("runAsGroupStrategyOptions")
  Call<TypeCollection<RunAsGroupStrategyOptions>> list(@QueryMap Filters filters);

  @GET("runAsGroupStrategyOptions/{id}")
  Call<RunAsGroupStrategyOptions> get(@Path("id") String id);

  @POST("runAsGroupStrategyOptions")
  Call<RunAsGroupStrategyOptions> create(@Body RunAsGroupStrategyOptions runAsGroupStrategyOptions);

  @PUT("runAsGroupStrategyOptions/{id}")
  Call<RunAsGroupStrategyOptions> update(@Path("id") String id, @Body RunAsGroupStrategyOptions runAsGroupStrategyOptions);

  @DELETE("runAsGroupStrategyOptions/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
