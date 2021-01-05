package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeConfigServices;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RkeConfigServicesService {

  @GET("rkeConfigServices")
  Call<TypeCollection<RkeConfigServices>> list();

  @GET("rkeConfigServices")
  Call<TypeCollection<RkeConfigServices>> list(@QueryMap Filters filters);

  @GET("rkeConfigServices/{id}")
  Call<RkeConfigServices> get(@Path("id") String id);

  @POST("rkeConfigServices")
  Call<RkeConfigServices> create(@Body RkeConfigServices rkeConfigServices);

  @PUT("rkeConfigServices/{id}")
  Call<RkeConfigServices> update(@Path("id") String id, @Body RkeConfigServices rkeConfigServices);

  @DELETE("rkeConfigServices/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
