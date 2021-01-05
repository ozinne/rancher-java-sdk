package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EtcdService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EtcdServiceService {

  @GET("etcdService")
  Call<TypeCollection<EtcdService>> list();

  @GET("etcdService")
  Call<TypeCollection<EtcdService>> list(@QueryMap Filters filters);

  @GET("etcdService/{id}")
  Call<EtcdService> get(@Path("id") String id);

  @POST("etcdService")
  Call<EtcdService> create(@Body EtcdService etcdService);

  @PUT("etcdService/{id}")
  Call<EtcdService> update(@Path("id") String id, @Body EtcdService etcdService);

  @DELETE("etcdService/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
