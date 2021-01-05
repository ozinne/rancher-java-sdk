package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectTestInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectTestInputService {

  @GET("projectTestInput")
  Call<TypeCollection<ProjectTestInput>> list();

  @GET("projectTestInput")
  Call<TypeCollection<ProjectTestInput>> list(@QueryMap Filters filters);

  @GET("projectTestInput/{id}")
  Call<ProjectTestInput> get(@Path("id") String id);

  @POST("projectTestInput")
  Call<ProjectTestInput> create(@Body ProjectTestInput projectTestInput);

  @PUT("projectTestInput/{id}")
  Call<ProjectTestInput> update(@Path("id") String id, @Body ProjectTestInput projectTestInput);

  @DELETE("projectTestInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
