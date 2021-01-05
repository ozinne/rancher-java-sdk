package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EventRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EventRuleService {

  @GET("eventRule")
  Call<TypeCollection<EventRule>> list();

  @GET("eventRule")
  Call<TypeCollection<EventRule>> list(@QueryMap Filters filters);

  @GET("eventRule/{id}")
  Call<EventRule> get(@Path("id") String id);

  @POST("eventRule")
  Call<EventRule> create(@Body EventRule eventRule);

  @PUT("eventRule/{id}")
  Call<EventRule> update(@Path("id") String id, @Body EventRule eventRule);

  @DELETE("eventRule/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
