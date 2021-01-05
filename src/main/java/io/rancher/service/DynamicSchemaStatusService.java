package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DynamicSchemaStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DynamicSchemaStatusService {

  @GET("dynamicSchemaStatus")
  Call<TypeCollection<DynamicSchemaStatus>> list();

  @GET("dynamicSchemaStatus")
  Call<TypeCollection<DynamicSchemaStatus>> list(@QueryMap Filters filters);

  @GET("dynamicSchemaStatus/{id}")
  Call<DynamicSchemaStatus> get(@Path("id") String id);

  @POST("dynamicSchemaStatus")
  Call<DynamicSchemaStatus> create(@Body DynamicSchemaStatus dynamicSchemaStatus);

  @PUT("dynamicSchemaStatus/{id}")
  Call<DynamicSchemaStatus> update(@Path("id") String id, @Body DynamicSchemaStatus dynamicSchemaStatus);

  @DELETE("dynamicSchemaStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
