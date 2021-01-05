package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GoogleOauthConfig;
import io.rancher.type.GoogleOauthConfigTestOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GoogleOauthConfigService {

  @GET("googleOauthConfig")
  Call<TypeCollection<GoogleOauthConfig>> list();

  @GET("googleOauthConfig")
  Call<TypeCollection<GoogleOauthConfig>> list(@QueryMap Filters filters);

  @GET("googleOauthConfig/{id}")
  Call<GoogleOauthConfig> get(@Path("id") String id);

  @POST("googleOauthConfig")
  Call<GoogleOauthConfig> create(@Body GoogleOauthConfig googleOauthConfig);

  @PUT("googleOauthConfig/{id}")
  Call<GoogleOauthConfig> update(@Path("id") String id, @Body GoogleOauthConfig googleOauthConfig);

  @DELETE("googleOauthConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("googleOauthConfig/{id}?action=configureTest")
  Call<GoogleOauthConfigTestOutput> configureTest(@Path("id") String id, @Body GoogleOauthConfig googleOauthConfig);
  
}
