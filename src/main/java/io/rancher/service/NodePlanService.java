package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodePlan;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodePlanService {

  @GET("nodePlan")
  Call<TypeCollection<NodePlan>> list();

  @GET("nodePlan")
  Call<TypeCollection<NodePlan>> list(@QueryMap Filters filters);

  @GET("nodePlan/{id}")
  Call<NodePlan> get(@Path("id") String id);

  @POST("nodePlan")
  Call<NodePlan> create(@Body NodePlan nodePlan);

  @PUT("nodePlan/{id}")
  Call<NodePlan> update(@Path("id") String id, @Body NodePlan nodePlan);

  @DELETE("nodePlan/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
