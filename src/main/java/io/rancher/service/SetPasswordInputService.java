package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetPasswordInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SetPasswordInputService {

  @GET("setPasswordInput")
  Call<TypeCollection<SetPasswordInput>> list();

  @GET("setPasswordInput")
  Call<TypeCollection<SetPasswordInput>> list(@QueryMap Filters filters);

  @GET("setPasswordInput/{id}")
  Call<SetPasswordInput> get(@Path("id") String id);

  @POST("setPasswordInput")
  Call<SetPasswordInput> create(@Body SetPasswordInput setPasswordInput);

  @PUT("setPasswordInput/{id}")
  Call<SetPasswordInput> update(@Path("id") String id, @Body SetPasswordInput setPasswordInput);

  @DELETE("setPasswordInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
