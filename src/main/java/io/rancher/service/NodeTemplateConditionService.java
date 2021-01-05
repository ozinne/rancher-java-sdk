package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeTemplateCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeTemplateConditionService {

  @GET("nodeTemplateCondition")
  Call<TypeCollection<NodeTemplateCondition>> list();

  @GET("nodeTemplateCondition")
  Call<TypeCollection<NodeTemplateCondition>> list(@QueryMap Filters filters);

  @GET("nodeTemplateCondition/{id}")
  Call<NodeTemplateCondition> get(@Path("id") String id);

  @POST("nodeTemplateCondition")
  Call<NodeTemplateCondition> create(@Body NodeTemplateCondition nodeTemplateCondition);

  @PUT("nodeTemplateCondition/{id}")
  Call<NodeTemplateCondition> update(@Path("id") String id, @Body NodeTemplateCondition nodeTemplateCondition);

  @DELETE("nodeTemplateCondition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
