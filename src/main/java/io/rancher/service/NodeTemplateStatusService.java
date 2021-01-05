package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeTemplateStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeTemplateStatusService {

  @GET("nodeTemplateStatus")
  Call<TypeCollection<NodeTemplateStatus>> list();

  @GET("nodeTemplateStatus")
  Call<TypeCollection<NodeTemplateStatus>> list(@QueryMap Filters filters);

  @GET("nodeTemplateStatus/{id}")
  Call<NodeTemplateStatus> get(@Path("id") String id);

  @POST("nodeTemplateStatus")
  Call<NodeTemplateStatus> create(@Body NodeTemplateStatus nodeTemplateStatus);

  @PUT("nodeTemplateStatus/{id}")
  Call<NodeTemplateStatus> update(@Path("id") String id, @Body NodeTemplateStatus nodeTemplateStatus);

  @DELETE("nodeTemplateStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
