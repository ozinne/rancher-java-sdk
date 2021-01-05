package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitorMetric;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MonitorMetricService {

  @GET("monitorMetric")
  Call<TypeCollection<MonitorMetric>> list();

  @GET("monitorMetric")
  Call<TypeCollection<MonitorMetric>> list(@QueryMap Filters filters);

  @GET("monitorMetric/{id}")
  Call<MonitorMetric> get(@Path("id") String id);

  @POST("monitorMetric")
  Call<MonitorMetric> create(@Body MonitorMetric monitorMetric);

  @PUT("monitorMetric/{id}")
  Call<MonitorMetric> update(@Path("id") String id, @Body MonitorMetric monitorMetric);

  @DELETE("monitorMetric/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
