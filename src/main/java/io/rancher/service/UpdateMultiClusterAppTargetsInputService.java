package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UpdateMultiClusterAppTargetsInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface UpdateMultiClusterAppTargetsInputService {

  @GET("updateMultiClusterAppTargetsInput")
  Call<TypeCollection<UpdateMultiClusterAppTargetsInput>> list();

  @GET("updateMultiClusterAppTargetsInput")
  Call<TypeCollection<UpdateMultiClusterAppTargetsInput>> list(@QueryMap Filters filters);

  @GET("updateMultiClusterAppTargetsInput/{id}")
  Call<UpdateMultiClusterAppTargetsInput> get(@Path("id") String id);

  @POST("updateMultiClusterAppTargetsInput")
  Call<UpdateMultiClusterAppTargetsInput> create(@Body UpdateMultiClusterAppTargetsInput updateMultiClusterAppTargetsInput);

  @PUT("updateMultiClusterAppTargetsInput/{id}")
  Call<UpdateMultiClusterAppTargetsInput> update(@Path("id") String id, @Body UpdateMultiClusterAppTargetsInput updateMultiClusterAppTargetsInput);

  @DELETE("updateMultiClusterAppTargetsInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
