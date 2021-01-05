package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubeproxyService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubeproxyServiceService {

  @GET("kubeproxyService")
  Call<TypeCollection<KubeproxyService>> list();

  @GET("kubeproxyService")
  Call<TypeCollection<KubeproxyService>> list(@QueryMap Filters filters);

  @GET("kubeproxyService/{id}")
  Call<KubeproxyService> get(@Path("id") String id);

  @POST("kubeproxyService")
  Call<KubeproxyService> create(@Body KubeproxyService kubeproxyService);

  @PUT("kubeproxyService/{id}")
  Call<KubeproxyService> update(@Path("id") String id, @Body KubeproxyService kubeproxyService);

  @DELETE("kubeproxyService/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
