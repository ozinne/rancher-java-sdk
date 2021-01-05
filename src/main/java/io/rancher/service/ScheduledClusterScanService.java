package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScheduledClusterScan;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ScheduledClusterScanService {

  @GET("scheduledClusterScan")
  Call<TypeCollection<ScheduledClusterScan>> list();

  @GET("scheduledClusterScan")
  Call<TypeCollection<ScheduledClusterScan>> list(@QueryMap Filters filters);

  @GET("scheduledClusterScan/{id}")
  Call<ScheduledClusterScan> get(@Path("id") String id);

  @POST("scheduledClusterScan")
  Call<ScheduledClusterScan> create(@Body ScheduledClusterScan scheduledClusterScan);

  @PUT("scheduledClusterScan/{id}")
  Call<ScheduledClusterScan> update(@Path("id") String id, @Body ScheduledClusterScan scheduledClusterScan);

  @DELETE("scheduledClusterScan/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
