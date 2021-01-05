package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetPod;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TargetPodService {

  @GET("targetPod")
  Call<TypeCollection<TargetPod>> list();

  @GET("targetPod")
  Call<TypeCollection<TargetPod>> list(@QueryMap Filters filters);

  @GET("targetPod/{id}")
  Call<TargetPod> get(@Path("id") String id);

  @POST("targetPod")
  Call<TargetPod> create(@Body TargetPod targetPod);

  @PUT("targetPod/{id}")
  Call<TargetPod> update(@Path("id") String id, @Body TargetPod targetPod);

  @DELETE("targetPod/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
