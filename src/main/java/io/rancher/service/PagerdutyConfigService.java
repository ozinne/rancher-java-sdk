package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PagerdutyConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PagerdutyConfigService {

  @GET("pagerdutyConfig")
  Call<TypeCollection<PagerdutyConfig>> list();

  @GET("pagerdutyConfig")
  Call<TypeCollection<PagerdutyConfig>> list(@QueryMap Filters filters);

  @GET("pagerdutyConfig/{id}")
  Call<PagerdutyConfig> get(@Path("id") String id);

  @POST("pagerdutyConfig")
  Call<PagerdutyConfig> create(@Body PagerdutyConfig pagerdutyConfig);

  @PUT("pagerdutyConfig/{id}")
  Call<PagerdutyConfig> update(@Path("id") String id, @Body PagerdutyConfig pagerdutyConfig);

  @DELETE("pagerdutyConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
