package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MultiClusterAppRevision;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MultiClusterAppRevisionService {

  @GET("multiClusterAppRevision")
  Call<TypeCollection<MultiClusterAppRevision>> list();

  @GET("multiClusterAppRevision")
  Call<TypeCollection<MultiClusterAppRevision>> list(@QueryMap Filters filters);

  @GET("multiClusterAppRevision/{id}")
  Call<MultiClusterAppRevision> get(@Path("id") String id);

  @POST("multiClusterAppRevision")
  Call<MultiClusterAppRevision> create(@Body MultiClusterAppRevision multiClusterAppRevision);

  @PUT("multiClusterAppRevision/{id}")
  Call<MultiClusterAppRevision> update(@Path("id") String id, @Body MultiClusterAppRevision multiClusterAppRevision);

  @DELETE("multiClusterAppRevision/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
