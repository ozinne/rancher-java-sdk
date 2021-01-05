package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AttachedVolume;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AttachedVolumeService {

  @GET("attachedVolume")
  Call<TypeCollection<AttachedVolume>> list();

  @GET("attachedVolume")
  Call<TypeCollection<AttachedVolume>> list(@QueryMap Filters filters);

  @GET("attachedVolume/{id}")
  Call<AttachedVolume> get(@Path("id") String id);

  @POST("attachedVolume")
  Call<AttachedVolume> create(@Body AttachedVolume attachedVolume);

  @PUT("attachedVolume/{id}")
  Call<AttachedVolume> update(@Path("id") String id, @Body AttachedVolume attachedVolume);

  @DELETE("attachedVolume/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
