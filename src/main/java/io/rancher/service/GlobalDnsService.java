package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalDns;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GlobalDnsService {

  @GET("globalDns")
  Call<TypeCollection<GlobalDns>> list();

  @GET("globalDns")
  Call<TypeCollection<GlobalDns>> list(@QueryMap Filters filters);

  @GET("globalDns/{id}")
  Call<GlobalDns> get(@Path("id") String id);

  @POST("globalDns")
  Call<GlobalDns> create(@Body GlobalDns globalDns);

  @PUT("globalDns/{id}")
  Call<GlobalDns> update(@Path("id") String id, @Body GlobalDns globalDns);

  @DELETE("globalDns/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
