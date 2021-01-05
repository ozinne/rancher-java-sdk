package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterTestInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterTestInputService {

  @GET("clusterTestInput")
  Call<TypeCollection<ClusterTestInput>> list();

  @GET("clusterTestInput")
  Call<TypeCollection<ClusterTestInput>> list(@QueryMap Filters filters);

  @GET("clusterTestInput/{id}")
  Call<ClusterTestInput> get(@Path("id") String id);

  @POST("clusterTestInput")
  Call<ClusterTestInput> create(@Body ClusterTestInput clusterTestInput);

  @PUT("clusterTestInput/{id}")
  Call<ClusterTestInput> update(@Path("id") String id, @Body ClusterTestInput clusterTestInput);

  @DELETE("clusterTestInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
