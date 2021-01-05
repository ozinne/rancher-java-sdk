package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Amazonec2credentialconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface Amazonec2credentialconfigService {

  @GET("amazonec2credentialconfig")
  Call<TypeCollection<Amazonec2credentialconfig>> list();

  @GET("amazonec2credentialconfig")
  Call<TypeCollection<Amazonec2credentialconfig>> list(@QueryMap Filters filters);

  @GET("amazonec2credentialconfig/{id}")
  Call<Amazonec2credentialconfig> get(@Path("id") String id);

  @POST("amazonec2credentialconfig")
  Call<Amazonec2credentialconfig> create(@Body Amazonec2credentialconfig amazonec2credentialconfig);

  @PUT("amazonec2credentialconfig/{id}")
  Call<Amazonec2credentialconfig> update(@Path("id") String id, @Body Amazonec2credentialconfig amazonec2credentialconfig);

  @DELETE("amazonec2credentialconfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
