package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectAlertGroup;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectAlertGroupService {

  @GET("projectAlertGroup")
  Call<TypeCollection<ProjectAlertGroup>> list();

  @GET("projectAlertGroup")
  Call<TypeCollection<ProjectAlertGroup>> list(@QueryMap Filters filters);

  @GET("projectAlertGroup/{id}")
  Call<ProjectAlertGroup> get(@Path("id") String id);

  @POST("projectAlertGroup")
  Call<ProjectAlertGroup> create(@Body ProjectAlertGroup projectAlertGroup);

  @PUT("projectAlertGroup/{id}")
  Call<ProjectAlertGroup> update(@Path("id") String id, @Body ProjectAlertGroup projectAlertGroup);

  @DELETE("projectAlertGroup/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
