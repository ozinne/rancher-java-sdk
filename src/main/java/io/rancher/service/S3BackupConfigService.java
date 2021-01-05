package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.S3BackupConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface S3BackupConfigService {

  @GET("s3BackupConfig")
  Call<TypeCollection<S3BackupConfig>> list();

  @GET("s3BackupConfig")
  Call<TypeCollection<S3BackupConfig>> list(@QueryMap Filters filters);

  @GET("s3BackupConfig/{id}")
  Call<S3BackupConfig> get(@Path("id") String id);

  @POST("s3BackupConfig")
  Call<S3BackupConfig> create(@Body S3BackupConfig s3BackupConfig);

  @PUT("s3BackupConfig/{id}")
  Call<S3BackupConfig> update(@Path("id") String id, @Body S3BackupConfig s3BackupConfig);

  @DELETE("s3BackupConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
