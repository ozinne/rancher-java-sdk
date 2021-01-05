package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FluentForwarderConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FluentForwarderConfigService {

  @GET("fluentForwarderConfig")
  Call<TypeCollection<FluentForwarderConfig>> list();

  @GET("fluentForwarderConfig")
  Call<TypeCollection<FluentForwarderConfig>> list(@QueryMap Filters filters);

  @GET("fluentForwarderConfig/{id}")
  Call<FluentForwarderConfig> get(@Path("id") String id);

  @POST("fluentForwarderConfig")
  Call<FluentForwarderConfig> create(@Body FluentForwarderConfig fluentForwarderConfig);

  @PUT("fluentForwarderConfig/{id}")
  Call<FluentForwarderConfig> update(@Path("id") String id, @Body FluentForwarderConfig fluentForwarderConfig);

  @DELETE("fluentForwarderConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
