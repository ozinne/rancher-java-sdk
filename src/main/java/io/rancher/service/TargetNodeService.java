package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetNode;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TargetNodeService {

  @GET("targetNode")
  Call<TypeCollection<TargetNode>> list();

  @GET("targetNode")
  Call<TypeCollection<TargetNode>> list(@QueryMap Filters filters);

  @GET("targetNode/{id}")
  Call<TargetNode> get(@Path("id") String id);

  @POST("targetNode")
  Call<TargetNode> create(@Body TargetNode targetNode);

  @PUT("targetNode/{id}")
  Call<TargetNode> update(@Path("id") String id, @Body TargetNode targetNode);

  @DELETE("targetNode/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
