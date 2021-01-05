package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OpenLdapConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface OpenLdapConfigService {

  @GET("openLdapConfig")
  Call<TypeCollection<OpenLdapConfig>> list();

  @GET("openLdapConfig")
  Call<TypeCollection<OpenLdapConfig>> list(@QueryMap Filters filters);

  @GET("openLdapConfig/{id}")
  Call<OpenLdapConfig> get(@Path("id") String id);

  @POST("openLdapConfig")
  Call<OpenLdapConfig> create(@Body OpenLdapConfig openLdapConfig);

  @PUT("openLdapConfig/{id}")
  Call<OpenLdapConfig> update(@Path("id") String id, @Body OpenLdapConfig openLdapConfig);

  @DELETE("openLdapConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
