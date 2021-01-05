package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeDriverStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeDriverStatusService {

  @GET("nodeDriverStatus")
  Call<TypeCollection<NodeDriverStatus>> list();

  @GET("nodeDriverStatus")
  Call<TypeCollection<NodeDriverStatus>> list(@QueryMap Filters filters);

  @GET("nodeDriverStatus/{id}")
  Call<NodeDriverStatus> get(@Path("id") String id);

  @POST("nodeDriverStatus")
  Call<NodeDriverStatus> create(@Body NodeDriverStatus nodeDriverStatus);

  @PUT("nodeDriverStatus/{id}")
  Call<NodeDriverStatus> update(@Path("id") String id, @Body NodeDriverStatus nodeDriverStatus);

  @DELETE("nodeDriverStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
