package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkVshpereOpts;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkVshpereOptsService {

  @GET("networkVshpereOpts")
  Call<TypeCollection<NetworkVshpereOpts>> list();

  @GET("networkVshpereOpts")
  Call<TypeCollection<NetworkVshpereOpts>> list(@QueryMap Filters filters);

  @GET("networkVshpereOpts/{id}")
  Call<NetworkVshpereOpts> get(@Path("id") String id);

  @POST("networkVshpereOpts")
  Call<NetworkVshpereOpts> create(@Body NetworkVshpereOpts networkVshpereOpts);

  @PUT("networkVshpereOpts/{id}")
  Call<NetworkVshpereOpts> update(@Path("id") String id, @Body NetworkVshpereOpts networkVshpereOpts);

  @DELETE("networkVshpereOpts/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
