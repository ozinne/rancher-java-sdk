package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OwnerReference;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface OwnerReferenceService {

  @GET("ownerReference")
  Call<TypeCollection<OwnerReference>> list();

  @GET("ownerReference")
  Call<TypeCollection<OwnerReference>> list(@QueryMap Filters filters);

  @GET("ownerReference/{id}")
  Call<OwnerReference> get(@Path("id") String id);

  @POST("ownerReference")
  Call<OwnerReference> create(@Body OwnerReference ownerReference);

  @PUT("ownerReference/{id}")
  Call<OwnerReference> update(@Path("id") String id, @Body OwnerReference ownerReference);

  @DELETE("ownerReference/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
