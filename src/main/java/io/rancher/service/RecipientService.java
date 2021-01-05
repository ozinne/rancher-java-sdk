package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Recipient;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RecipientService {

  @GET("recipient")
  Call<TypeCollection<Recipient>> list();

  @GET("recipient")
  Call<TypeCollection<Recipient>> list(@QueryMap Filters filters);

  @GET("recipient/{id}")
  Call<Recipient> get(@Path("id") String id);

  @POST("recipient")
  Call<Recipient> create(@Body Recipient recipient);

  @PUT("recipient/{id}")
  Call<Recipient> update(@Path("id") String id, @Body Recipient recipient);

  @DELETE("recipient/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
