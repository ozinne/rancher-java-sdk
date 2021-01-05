package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeRuleService {

  @GET("nodeRule")
  Call<TypeCollection<NodeRule>> list();

  @GET("nodeRule")
  Call<TypeCollection<NodeRule>> list(@QueryMap Filters filters);

  @GET("nodeRule/{id}")
  Call<NodeRule> get(@Path("id") String id);

  @POST("nodeRule")
  Call<NodeRule> create(@Body NodeRule nodeRule);

  @PUT("nodeRule/{id}")
  Call<NodeRule> update(@Path("id") String id, @Body NodeRule nodeRule);

  @DELETE("nodeRule/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
