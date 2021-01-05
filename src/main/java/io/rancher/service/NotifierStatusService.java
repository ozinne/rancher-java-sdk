package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NotifierStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NotifierStatusService {

  @GET("notifierStatus")
  Call<TypeCollection<NotifierStatus>> list();

  @GET("notifierStatus")
  Call<TypeCollection<NotifierStatus>> list(@QueryMap Filters filters);

  @GET("notifierStatus/{id}")
  Call<NotifierStatus> get(@Path("id") String id);

  @POST("notifierStatus")
  Call<NotifierStatus> create(@Body NotifierStatus notifierStatus);

  @PUT("notifierStatus/{id}")
  Call<NotifierStatus> update(@Path("id") String id, @Body NotifierStatus notifierStatus);

  @DELETE("notifierStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
