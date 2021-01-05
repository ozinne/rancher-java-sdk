package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesServicesOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface KubernetesServicesOptionsService {

  @GET("kubernetesServicesOptions")
  Call<TypeCollection<KubernetesServicesOptions>> list();

  @GET("kubernetesServicesOptions")
  Call<TypeCollection<KubernetesServicesOptions>> list(@QueryMap Filters filters);

  @GET("kubernetesServicesOptions/{id}")
  Call<KubernetesServicesOptions> get(@Path("id") String id);

  @POST("kubernetesServicesOptions")
  Call<KubernetesServicesOptions> create(@Body KubernetesServicesOptions kubernetesServicesOptions);

  @PUT("kubernetesServicesOptions/{id}")
  Call<KubernetesServicesOptions> update(@Path("id") String id, @Body KubernetesServicesOptions kubernetesServicesOptions);

  @DELETE("kubernetesServicesOptions/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
