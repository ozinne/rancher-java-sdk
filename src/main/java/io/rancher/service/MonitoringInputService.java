package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitoringInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MonitoringInputService {

  @GET("monitoringInput")
  Call<TypeCollection<MonitoringInput>> list();

  @GET("monitoringInput")
  Call<TypeCollection<MonitoringInput>> list(@QueryMap Filters filters);

  @GET("monitoringInput/{id}")
  Call<MonitoringInput> get(@Path("id") String id);

  @POST("monitoringInput")
  Call<MonitoringInput> create(@Body MonitoringInput monitoringInput);

  @PUT("monitoringInput/{id}")
  Call<MonitoringInput> update(@Path("id") String id, @Body MonitoringInput monitoringInput);

  @DELETE("monitoringInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
