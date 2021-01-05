package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WebhookConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WebhookConfigService {

  @GET("webhookConfig")
  Call<TypeCollection<WebhookConfig>> list();

  @GET("webhookConfig")
  Call<TypeCollection<WebhookConfig>> list(@QueryMap Filters filters);

  @GET("webhookConfig/{id}")
  Call<WebhookConfig> get(@Path("id") String id);

  @POST("webhookConfig")
  Call<WebhookConfig> create(@Body WebhookConfig webhookConfig);

  @PUT("webhookConfig/{id}")
  Call<WebhookConfig> update(@Path("id") String id, @Body WebhookConfig webhookConfig);

  @DELETE("webhookConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
