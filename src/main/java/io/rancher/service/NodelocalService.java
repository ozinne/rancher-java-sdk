package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Nodelocal;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodelocalService {

  @GET("nodelocal")
  Call<TypeCollection<Nodelocal>> list();

  @GET("nodelocal")
  Call<TypeCollection<Nodelocal>> list(@QueryMap Filters filters);

  @GET("nodelocal/{id}")
  Call<Nodelocal> get(@Path("id") String id);

  @POST("nodelocal")
  Call<Nodelocal> create(@Body Nodelocal nodelocal);

  @PUT("nodelocal/{id}")
  Call<Nodelocal> update(@Path("id") String id, @Body Nodelocal nodelocal);

  @DELETE("nodelocal/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
