package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeConditionService {

  @GET("nodeCondition")
  Call<TypeCollection<NodeCondition>> list();

  @GET("nodeCondition")
  Call<TypeCollection<NodeCondition>> list(@QueryMap Filters filters);

  @GET("nodeCondition/{id}")
  Call<NodeCondition> get(@Path("id") String id);

  @POST("nodeCondition")
  Call<NodeCondition> create(@Body NodeCondition nodeCondition);

  @PUT("nodeCondition/{id}")
  Call<NodeCondition> update(@Path("id") String id, @Body NodeCondition nodeCondition);

  @DELETE("nodeCondition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
