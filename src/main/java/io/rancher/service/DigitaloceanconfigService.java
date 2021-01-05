package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Digitaloceanconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DigitaloceanconfigService {

  @GET("digitaloceanconfig")
  Call<TypeCollection<Digitaloceanconfig>> list();

  @GET("digitaloceanconfig")
  Call<TypeCollection<Digitaloceanconfig>> list(@QueryMap Filters filters);

  @GET("digitaloceanconfig/{id}")
  Call<Digitaloceanconfig> get(@Path("id") String id);

  @POST("digitaloceanconfig")
  Call<Digitaloceanconfig> create(@Body Digitaloceanconfig digitaloceanconfig);

  @PUT("digitaloceanconfig/{id}")
  Call<Digitaloceanconfig> update(@Path("id") String id, @Body Digitaloceanconfig digitaloceanconfig);

  @DELETE("digitaloceanconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
