package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubeAPIService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubeAPIServiceService {

  @GET("kubeAPIService")
  Call<TypeCollection<KubeAPIService>> list();

  @GET("kubeAPIService")
  Call<TypeCollection<KubeAPIService>> list(@QueryMap Filters filters);

  @GET("kubeAPIService/{id}")
  Call<KubeAPIService> get(@Path("id") String id);

  @POST("kubeAPIService")
  Call<KubeAPIService> create(@Body KubeAPIService kubeAPIService);

  @PUT("kubeAPIService/{id}")
  Call<KubeAPIService> update(@Path("id") String id, @Body KubeAPIService kubeAPIService);

  @DELETE("kubeAPIService/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
