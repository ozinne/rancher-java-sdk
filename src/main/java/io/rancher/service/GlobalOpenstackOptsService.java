package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalOpenstackOpts;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GlobalOpenstackOptsService {

  @GET("globalOpenstackOpts")
  Call<TypeCollection<GlobalOpenstackOpts>> list();

  @GET("globalOpenstackOpts")
  Call<TypeCollection<GlobalOpenstackOpts>> list(@QueryMap Filters filters);

  @GET("globalOpenstackOpts/{id}")
  Call<GlobalOpenstackOpts> get(@Path("id") String id);

  @POST("globalOpenstackOpts")
  Call<GlobalOpenstackOpts> create(@Body GlobalOpenstackOpts globalOpenstackOpts);

  @PUT("globalOpenstackOpts/{id}")
  Call<GlobalOpenstackOpts> update(@Path("id") String id, @Body GlobalOpenstackOpts globalOpenstackOpts);

  @DELETE("globalOpenstackOpts/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
