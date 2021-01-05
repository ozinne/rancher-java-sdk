package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeAddon;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RkeAddonService {

  @GET("rkeAddon")
  Call<TypeCollection<RkeAddon>> list();

  @GET("rkeAddon")
  Call<TypeCollection<RkeAddon>> list(@QueryMap Filters filters);

  @GET("rkeAddon/{id}")
  Call<RkeAddon> get(@Path("id") String id);

  @POST("rkeAddon")
  Call<RkeAddon> create(@Body RkeAddon rkeAddon);

  @PUT("rkeAddon/{id}")
  Call<RkeAddon> update(@Path("id") String id, @Body RkeAddon rkeAddon);

  @DELETE("rkeAddon/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
