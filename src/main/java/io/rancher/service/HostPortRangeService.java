package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HostPortRange;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HostPortRangeService {

  @GET("hostPortRange")
  Call<TypeCollection<HostPortRange>> list();

  @GET("hostPortRange")
  Call<TypeCollection<HostPortRange>> list(@QueryMap Filters filters);

  @GET("hostPortRange/{id}")
  Call<HostPortRange> get(@Path("id") String id);

  @POST("hostPortRange")
  Call<HostPortRange> create(@Body HostPortRange hostPortRange);

  @PUT("hostPortRange/{id}")
  Call<HostPortRange> update(@Path("id") String id, @Body HostPortRange hostPortRange);

  @DELETE("hostPortRange/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
