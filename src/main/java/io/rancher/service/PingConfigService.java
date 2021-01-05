package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PingConfig;
import io.rancher.type.SamlConfigTestInput;
import io.rancher.type.SamlConfigTestOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PingConfigService {

  @GET("pingConfig")
  Call<TypeCollection<PingConfig>> list();

  @GET("pingConfig")
  Call<TypeCollection<PingConfig>> list(@QueryMap Filters filters);

  @GET("pingConfig/{id}")
  Call<PingConfig> get(@Path("id") String id);

  @POST("pingConfig")
  Call<PingConfig> create(@Body PingConfig pingConfig);

  @PUT("pingConfig/{id}")
  Call<PingConfig> update(@Path("id") String id, @Body PingConfig pingConfig);

  @DELETE("pingConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("pingConfig/{id}?action=testAndEnable")
  Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
  
}
