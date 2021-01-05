package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SplunkConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SplunkConfigService {

  @GET("splunkConfig")
  Call<TypeCollection<SplunkConfig>> list();

  @GET("splunkConfig")
  Call<TypeCollection<SplunkConfig>> list(@QueryMap Filters filters);

  @GET("splunkConfig/{id}")
  Call<SplunkConfig> get(@Path("id") String id);

  @POST("splunkConfig")
  Call<SplunkConfig> create(@Body SplunkConfig splunkConfig);

  @PUT("splunkConfig/{id}")
  Call<SplunkConfig> update(@Path("id") String id, @Body SplunkConfig splunkConfig);

  @DELETE("splunkConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
