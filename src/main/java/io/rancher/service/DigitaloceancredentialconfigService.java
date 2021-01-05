package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Digitaloceancredentialconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DigitaloceancredentialconfigService {

  @GET("digitaloceancredentialconfig")
  Call<TypeCollection<Digitaloceancredentialconfig>> list();

  @GET("digitaloceancredentialconfig")
  Call<TypeCollection<Digitaloceancredentialconfig>> list(@QueryMap Filters filters);

  @GET("digitaloceancredentialconfig/{id}")
  Call<Digitaloceancredentialconfig> get(@Path("id") String id);

  @POST("digitaloceancredentialconfig")
  Call<Digitaloceancredentialconfig> create(@Body Digitaloceancredentialconfig digitaloceancredentialconfig);

  @PUT("digitaloceancredentialconfig/{id}")
  Call<Digitaloceancredentialconfig> update(@Path("id") String id, @Body Digitaloceancredentialconfig digitaloceancredentialconfig);

  @DELETE("digitaloceancredentialconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
