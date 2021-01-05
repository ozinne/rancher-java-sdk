package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OktaConfig;
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

public interface OktaConfigService {

  @GET("oktaConfig")
  Call<TypeCollection<OktaConfig>> list();

  @GET("oktaConfig")
  Call<TypeCollection<OktaConfig>> list(@QueryMap Filters filters);

  @GET("oktaConfig/{id}")
  Call<OktaConfig> get(@Path("id") String id);

  @POST("oktaConfig")
  Call<OktaConfig> create(@Body OktaConfig oktaConfig);

  @PUT("oktaConfig/{id}")
  Call<OktaConfig> update(@Path("id") String id, @Body OktaConfig oktaConfig);

  @DELETE("oktaConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("oktaConfig/{id}?action=testAndEnable")
  Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
  
}
