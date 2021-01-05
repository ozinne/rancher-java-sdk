package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DaemonSetUpdateStrategy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DaemonSetUpdateStrategyService {

  @GET("daemonSetUpdateStrategy")
  Call<TypeCollection<DaemonSetUpdateStrategy>> list();

  @GET("daemonSetUpdateStrategy")
  Call<TypeCollection<DaemonSetUpdateStrategy>> list(@QueryMap Filters filters);

  @GET("daemonSetUpdateStrategy/{id}")
  Call<DaemonSetUpdateStrategy> get(@Path("id") String id);

  @POST("daemonSetUpdateStrategy")
  Call<DaemonSetUpdateStrategy> create(@Body DaemonSetUpdateStrategy daemonSetUpdateStrategy);

  @PUT("daemonSetUpdateStrategy/{id}")
  Call<DaemonSetUpdateStrategy> update(@Path("id") String id, @Body DaemonSetUpdateStrategy daemonSetUpdateStrategy);

  @DELETE("daemonSetUpdateStrategy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
