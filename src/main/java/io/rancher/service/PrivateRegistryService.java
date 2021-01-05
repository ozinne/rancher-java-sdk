package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PrivateRegistry;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PrivateRegistryService {

  @GET("privateRegistry")
  Call<TypeCollection<PrivateRegistry>> list();

  @GET("privateRegistry")
  Call<TypeCollection<PrivateRegistry>> list(@QueryMap Filters filters);

  @GET("privateRegistry/{id}")
  Call<PrivateRegistry> get(@Path("id") String id);

  @POST("privateRegistry")
  Call<PrivateRegistry> create(@Body PrivateRegistry privateRegistry);

  @PUT("privateRegistry/{id}")
  Call<PrivateRegistry> update(@Path("id") String id, @Body PrivateRegistry privateRegistry);

  @DELETE("privateRegistry/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
