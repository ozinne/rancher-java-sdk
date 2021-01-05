package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScheduledClusterScanConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ScheduledClusterScanConfigService {

  @GET("scheduledClusterScanConfig")
  Call<TypeCollection<ScheduledClusterScanConfig>> list();

  @GET("scheduledClusterScanConfig")
  Call<TypeCollection<ScheduledClusterScanConfig>> list(@QueryMap Filters filters);

  @GET("scheduledClusterScanConfig/{id}")
  Call<ScheduledClusterScanConfig> get(@Path("id") String id);

  @POST("scheduledClusterScanConfig")
  Call<ScheduledClusterScanConfig> create(@Body ScheduledClusterScanConfig scheduledClusterScanConfig);

  @PUT("scheduledClusterScanConfig/{id}")
  Call<ScheduledClusterScanConfig> update(@Path("id") String id, @Body ScheduledClusterScanConfig scheduledClusterScanConfig);

  @DELETE("scheduledClusterScanConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
