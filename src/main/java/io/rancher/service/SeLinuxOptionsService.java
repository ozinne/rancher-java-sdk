package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SeLinuxOptions;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SeLinuxOptionsService {

  @GET("seLinuxOptions")
  Call<TypeCollection<SeLinuxOptions>> list();

  @GET("seLinuxOptions")
  Call<TypeCollection<SeLinuxOptions>> list(@QueryMap Filters filters);

  @GET("seLinuxOptions/{id}")
  Call<SeLinuxOptions> get(@Path("id") String id);

  @POST("seLinuxOptions")
  Call<SeLinuxOptions> create(@Body SeLinuxOptions seLinuxOptions);

  @PUT("seLinuxOptions/{id}")
  Call<SeLinuxOptions> update(@Path("id") String id, @Body SeLinuxOptions seLinuxOptions);

  @DELETE("seLinuxOptions/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
