package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BastionHost;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BastionHostService {

  @GET("bastionHost")
  Call<TypeCollection<BastionHost>> list();

  @GET("bastionHost")
  Call<TypeCollection<BastionHost>> list(@QueryMap Filters filters);

  @GET("bastionHost/{id}")
  Call<BastionHost> get(@Path("id") String id);

  @POST("bastionHost")
  Call<BastionHost> create(@Body BastionHost bastionHost);

  @PUT("bastionHost/{id}")
  Call<BastionHost> update(@Path("id") String id, @Body BastionHost bastionHost);

  @DELETE("bastionHost/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
