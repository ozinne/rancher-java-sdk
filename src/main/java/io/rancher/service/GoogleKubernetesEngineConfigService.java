package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GoogleKubernetesEngineConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GoogleKubernetesEngineConfigService {

  @GET("googleKubernetesEngineConfig")
  Call<TypeCollection<GoogleKubernetesEngineConfig>> list();

  @GET("googleKubernetesEngineConfig")
  Call<TypeCollection<GoogleKubernetesEngineConfig>> list(@QueryMap Filters filters);

  @GET("googleKubernetesEngineConfig/{id}")
  Call<GoogleKubernetesEngineConfig> get(@Path("id") String id);

  @POST("googleKubernetesEngineConfig")
  Call<GoogleKubernetesEngineConfig> create(@Body GoogleKubernetesEngineConfig googleKubernetesEngineConfig);

  @PUT("googleKubernetesEngineConfig/{id}")
  Call<GoogleKubernetesEngineConfig> update(@Path("id") String id, @Body GoogleKubernetesEngineConfig googleKubernetesEngineConfig);

  @DELETE("googleKubernetesEngineConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
