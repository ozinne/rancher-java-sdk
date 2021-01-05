package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectAlertRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectAlertRuleService {

  @GET("projectAlertRule")
  Call<TypeCollection<ProjectAlertRule>> list();

  @GET("projectAlertRule")
  Call<TypeCollection<ProjectAlertRule>> list(@QueryMap Filters filters);

  @GET("projectAlertRule/{id}")
  Call<ProjectAlertRule> get(@Path("id") String id);

  @POST("projectAlertRule")
  Call<ProjectAlertRule> create(@Body ProjectAlertRule projectAlertRule);

  @PUT("projectAlertRule/{id}")
  Call<ProjectAlertRule> update(@Path("id") String id, @Body ProjectAlertRule projectAlertRule);

  @DELETE("projectAlertRule/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
