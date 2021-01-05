package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SchedulerService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SchedulerServiceService {

  @GET("schedulerService")
  Call<TypeCollection<SchedulerService>> list();

  @GET("schedulerService")
  Call<TypeCollection<SchedulerService>> list(@QueryMap Filters filters);

  @GET("schedulerService/{id}")
  Call<SchedulerService> get(@Path("id") String id);

  @POST("schedulerService")
  Call<SchedulerService> create(@Body SchedulerService schedulerService);

  @PUT("schedulerService/{id}")
  Call<SchedulerService> update(@Path("id") String id, @Body SchedulerService schedulerService);

  @DELETE("schedulerService/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
