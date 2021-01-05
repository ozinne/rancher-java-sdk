package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalDnsStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GlobalDnsStatusService {

  @GET("globalDnsStatus")
  Call<TypeCollection<GlobalDnsStatus>> list();

  @GET("globalDnsStatus")
  Call<TypeCollection<GlobalDnsStatus>> list(@QueryMap Filters filters);

  @GET("globalDnsStatus/{id}")
  Call<GlobalDnsStatus> get(@Path("id") String id);

  @POST("globalDnsStatus")
  Call<GlobalDnsStatus> create(@Body GlobalDnsStatus globalDnsStatus);

  @PUT("globalDnsStatus/{id}")
  Call<GlobalDnsStatus> update(@Path("id") String id, @Body GlobalDnsStatus globalDnsStatus);

  @DELETE("globalDnsStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
