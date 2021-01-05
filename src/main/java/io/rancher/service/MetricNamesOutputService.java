package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MetricNamesOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MetricNamesOutputService {

  @GET("metricNamesOutput")
  Call<TypeCollection<MetricNamesOutput>> list();

  @GET("metricNamesOutput")
  Call<TypeCollection<MetricNamesOutput>> list(@QueryMap Filters filters);

  @GET("metricNamesOutput/{id}")
  Call<MetricNamesOutput> get(@Path("id") String id);

  @POST("metricNamesOutput")
  Call<MetricNamesOutput> create(@Body MetricNamesOutput metricNamesOutput);

  @PUT("metricNamesOutput/{id}")
  Call<MetricNamesOutput> update(@Path("id") String id, @Body MetricNamesOutput metricNamesOutput);

  @DELETE("metricNamesOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
