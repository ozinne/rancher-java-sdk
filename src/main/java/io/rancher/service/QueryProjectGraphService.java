package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryProjectGraph;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface QueryProjectGraphService {

  @GET("queryProjectGraph")
  Call<TypeCollection<QueryProjectGraph>> list();

  @GET("queryProjectGraph")
  Call<TypeCollection<QueryProjectGraph>> list(@QueryMap Filters filters);

  @GET("queryProjectGraph/{id}")
  Call<QueryProjectGraph> get(@Path("id") String id);

  @POST("queryProjectGraph")
  Call<QueryProjectGraph> create(@Body QueryProjectGraph queryProjectGraph);

  @PUT("queryProjectGraph/{id}")
  Call<QueryProjectGraph> update(@Path("id") String id, @Body QueryProjectGraph queryProjectGraph);

  @DELETE("queryProjectGraph/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
