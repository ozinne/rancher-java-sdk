package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AlertStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AlertStatusService {

  @GET("alertStatus")
  Call<TypeCollection<AlertStatus>> list();

  @GET("alertStatus")
  Call<TypeCollection<AlertStatus>> list(@QueryMap Filters filters);

  @GET("alertStatus/{id}")
  Call<AlertStatus> get(@Path("id") String id);

  @POST("alertStatus")
  Call<AlertStatus> create(@Body AlertStatus alertStatus);

  @PUT("alertStatus/{id}")
  Call<AlertStatus> update(@Path("id") String id, @Body AlertStatus alertStatus);

  @DELETE("alertStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
