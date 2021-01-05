package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BackupConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BackupConfigService {

  @GET("backupConfig")
  Call<TypeCollection<BackupConfig>> list();

  @GET("backupConfig")
  Call<TypeCollection<BackupConfig>> list(@QueryMap Filters filters);

  @GET("backupConfig/{id}")
  Call<BackupConfig> get(@Path("id") String id);

  @POST("backupConfig")
  Call<BackupConfig> create(@Body BackupConfig backupConfig);

  @PUT("backupConfig/{id}")
  Call<BackupConfig> update(@Path("id") String id, @Body BackupConfig backupConfig);

  @DELETE("backupConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
