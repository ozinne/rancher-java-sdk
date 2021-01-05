package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoggingCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoggingConditionService {

  @GET("loggingCondition")
  Call<TypeCollection<LoggingCondition>> list();

  @GET("loggingCondition")
  Call<TypeCollection<LoggingCondition>> list(@QueryMap Filters filters);

  @GET("loggingCondition/{id}")
  Call<LoggingCondition> get(@Path("id") String id);

  @POST("loggingCondition")
  Call<LoggingCondition> create(@Body LoggingCondition loggingCondition);

  @PUT("loggingCondition/{id}")
  Call<LoggingCondition> update(@Path("id") String id, @Body LoggingCondition loggingCondition);

  @DELETE("loggingCondition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
