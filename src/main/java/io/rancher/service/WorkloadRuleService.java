package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WorkloadRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WorkloadRuleService {

  @GET("workloadRule")
  Call<TypeCollection<WorkloadRule>> list();

  @GET("workloadRule")
  Call<TypeCollection<WorkloadRule>> list(@QueryMap Filters filters);

  @GET("workloadRule/{id}")
  Call<WorkloadRule> get(@Path("id") String id);

  @POST("workloadRule")
  Call<WorkloadRule> create(@Body WorkloadRule workloadRule);

  @PUT("workloadRule/{id}")
  Call<WorkloadRule> update(@Path("id") String id, @Body WorkloadRule workloadRule);

  @DELETE("workloadRule/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
