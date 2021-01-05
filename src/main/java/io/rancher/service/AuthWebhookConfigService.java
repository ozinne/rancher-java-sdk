package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuthWebhookConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AuthWebhookConfigService {

  @GET("authWebhookConfig")
  Call<TypeCollection<AuthWebhookConfig>> list();

  @GET("authWebhookConfig")
  Call<TypeCollection<AuthWebhookConfig>> list(@QueryMap Filters filters);

  @GET("authWebhookConfig/{id}")
  Call<AuthWebhookConfig> get(@Path("id") String id);

  @POST("authWebhookConfig")
  Call<AuthWebhookConfig> create(@Body AuthWebhookConfig authWebhookConfig);

  @PUT("authWebhookConfig/{id}")
  Call<AuthWebhookConfig> update(@Path("id") String id, @Body AuthWebhookConfig authWebhookConfig);

  @DELETE("authWebhookConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
