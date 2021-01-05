package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerCapabilities;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerCapabilitiesService {

  @GET("loadBalancerCapabilities")
  Call<TypeCollection<LoadBalancerCapabilities>> list();

  @GET("loadBalancerCapabilities")
  Call<TypeCollection<LoadBalancerCapabilities>> list(@QueryMap Filters filters);

  @GET("loadBalancerCapabilities/{id}")
  Call<LoadBalancerCapabilities> get(@Path("id") String id);

  @POST("loadBalancerCapabilities")
  Call<LoadBalancerCapabilities> create(@Body LoadBalancerCapabilities loadBalancerCapabilities);

  @PUT("loadBalancerCapabilities/{id}")
  Call<LoadBalancerCapabilities> update(@Path("id") String id, @Body LoadBalancerCapabilities loadBalancerCapabilities);

  @DELETE("loadBalancerCapabilities/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
