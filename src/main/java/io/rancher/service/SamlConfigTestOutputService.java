package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SamlConfigTestOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SamlConfigTestOutputService {

  @GET("samlConfigTestOutput")
  Call<TypeCollection<SamlConfigTestOutput>> list();

  @GET("samlConfigTestOutput")
  Call<TypeCollection<SamlConfigTestOutput>> list(@QueryMap Filters filters);

  @GET("samlConfigTestOutput/{id}")
  Call<SamlConfigTestOutput> get(@Path("id") String id);

  @POST("samlConfigTestOutput")
  Call<SamlConfigTestOutput> create(@Body SamlConfigTestOutput samlConfigTestOutput);

  @PUT("samlConfigTestOutput/{id}")
  Call<SamlConfigTestOutput> update(@Path("id") String id, @Body SamlConfigTestOutput samlConfigTestOutput);

  @DELETE("samlConfigTestOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
