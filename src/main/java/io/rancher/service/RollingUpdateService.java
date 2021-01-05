package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RollingUpdate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RollingUpdateService {

  @GET("rollingUpdate")
  Call<TypeCollection<RollingUpdate>> list();

  @GET("rollingUpdate")
  Call<TypeCollection<RollingUpdate>> list(@QueryMap Filters filters);

  @GET("rollingUpdate/{id}")
  Call<RollingUpdate> get(@Path("id") String id);

  @POST("rollingUpdate")
  Call<RollingUpdate> create(@Body RollingUpdate rollingUpdate);

  @PUT("rollingUpdate/{id}")
  Call<RollingUpdate> update(@Path("id") String id, @Body RollingUpdate rollingUpdate);

  @DELETE("rollingUpdate/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
