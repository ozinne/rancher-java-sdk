package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Process;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessService {

  @GET("process")
  Call<TypeCollection<Process>> list();

  @GET("process")
  Call<TypeCollection<Process>> list(@QueryMap Filters filters);

  @GET("process/{id}")
  Call<Process> get(@Path("id") String id);

  @POST("process")
  Call<Process> create(@Body Process process);

  @PUT("process/{id}")
  Call<Process> update(@Path("id") String id, @Body Process process);

  @DELETE("process/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
