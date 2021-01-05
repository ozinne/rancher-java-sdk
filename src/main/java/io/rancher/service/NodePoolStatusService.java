package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodePoolStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodePoolStatusService {

  @GET("nodePoolStatus")
  Call<TypeCollection<NodePoolStatus>> list();

  @GET("nodePoolStatus")
  Call<TypeCollection<NodePoolStatus>> list(@QueryMap Filters filters);

  @GET("nodePoolStatus/{id}")
  Call<NodePoolStatus> get(@Path("id") String id);

  @POST("nodePoolStatus")
  Call<NodePoolStatus> create(@Body NodePoolStatus nodePoolStatus);

  @PUT("nodePoolStatus/{id}")
  Call<NodePoolStatus> update(@Path("id") String id, @Body NodePoolStatus nodePoolStatus);

  @DELETE("nodePoolStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
