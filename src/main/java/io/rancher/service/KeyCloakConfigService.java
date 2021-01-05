package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KeyCloakConfig;
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

public interface KeyCloakConfigService {

  @GET("keyCloakConfig")
  Call<TypeCollection<KeyCloakConfig>> list();

  @GET("keyCloakConfig")
  Call<TypeCollection<KeyCloakConfig>> list(@QueryMap Filters filters);

  @GET("keyCloakConfig/{id}")
  Call<KeyCloakConfig> get(@Path("id") String id);

  @POST("keyCloakConfig")
  Call<KeyCloakConfig> create(@Body KeyCloakConfig keyCloakConfig);

  @PUT("keyCloakConfig/{id}")
  Call<KeyCloakConfig> update(@Path("id") String id, @Body KeyCloakConfig keyCloakConfig);

  @DELETE("keyCloakConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("keyCloakConfig/{id}?action=testAndEnable")
  Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
  
}
