package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.IngressCapabilities;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IngressCapabilitiesService {

  @GET("ingressCapabilities")
  Call<TypeCollection<IngressCapabilities>> list();

  @GET("ingressCapabilities")
  Call<TypeCollection<IngressCapabilities>> list(@QueryMap Filters filters);

  @GET("ingressCapabilities/{id}")
  Call<IngressCapabilities> get(@Path("id") String id);

  @POST("ingressCapabilities")
  Call<IngressCapabilities> create(@Body IngressCapabilities ingressCapabilities);

  @PUT("ingressCapabilities/{id}")
  Call<IngressCapabilities> update(@Path("id") String id, @Body IngressCapabilities ingressCapabilities);

  @DELETE("ingressCapabilities/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
