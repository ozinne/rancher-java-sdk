package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.YAxis;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface YAxisService {

  @GET("yAxis")
  Call<TypeCollection<YAxis>> list();

  @GET("yAxis")
  Call<TypeCollection<YAxis>> list(@QueryMap Filters filters);

  @GET("yAxis/{id}")
  Call<YAxis> get(@Path("id") String id);

  @POST("yAxis")
  Call<YAxis> create(@Body YAxis yAxis);

  @PUT("yAxis/{id}")
  Call<YAxis> update(@Path("id") String id, @Body YAxis yAxis);

  @DELETE("yAxis/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
