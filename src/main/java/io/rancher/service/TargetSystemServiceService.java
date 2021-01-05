package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetSystemService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TargetSystemServiceService {

  @GET("targetSystemService")
  Call<TypeCollection<TargetSystemService>> list();

  @GET("targetSystemService")
  Call<TypeCollection<TargetSystemService>> list(@QueryMap Filters filters);

  @GET("targetSystemService/{id}")
  Call<TargetSystemService> get(@Path("id") String id);

  @POST("targetSystemService")
  Call<TargetSystemService> create(@Body TargetSystemService targetSystemService);

  @PUT("targetSystemService/{id}")
  Call<TargetSystemService> update(@Path("id") String id, @Body TargetSystemService targetSystemService);

  @DELETE("targetSystemService/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
