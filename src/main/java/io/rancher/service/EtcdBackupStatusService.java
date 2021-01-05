package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EtcdBackupStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EtcdBackupStatusService {

  @GET("etcdBackupStatus")
  Call<TypeCollection<EtcdBackupStatus>> list();

  @GET("etcdBackupStatus")
  Call<TypeCollection<EtcdBackupStatus>> list(@QueryMap Filters filters);

  @GET("etcdBackupStatus/{id}")
  Call<EtcdBackupStatus> get(@Path("id") String id);

  @POST("etcdBackupStatus")
  Call<EtcdBackupStatus> create(@Body EtcdBackupStatus etcdBackupStatus);

  @PUT("etcdBackupStatus/{id}")
  Call<EtcdBackupStatus> update(@Path("id") String id, @Body EtcdBackupStatus etcdBackupStatus);

  @DELETE("etcdBackupStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
