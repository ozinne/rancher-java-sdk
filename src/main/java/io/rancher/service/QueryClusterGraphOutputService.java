package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryClusterGraphOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface QueryClusterGraphOutputService {

  @GET("queryClusterGraphOutput")
  Call<TypeCollection<QueryClusterGraphOutput>> list();

  @GET("queryClusterGraphOutput")
  Call<TypeCollection<QueryClusterGraphOutput>> list(@QueryMap Filters filters);

  @GET("queryClusterGraphOutput/{id}")
  Call<QueryClusterGraphOutput> get(@Path("id") String id);

  @POST("queryClusterGraphOutput")
  Call<QueryClusterGraphOutput> create(@Body QueryClusterGraphOutput queryClusterGraphOutput);

  @PUT("queryClusterGraphOutput/{id}")
  Call<QueryClusterGraphOutput> update(@Path("id") String id, @Body QueryClusterGraphOutput queryClusterGraphOutput);

  @DELETE("queryClusterGraphOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
