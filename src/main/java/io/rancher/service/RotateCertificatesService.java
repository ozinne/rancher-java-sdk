package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RotateCertificates;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RotateCertificatesService {

  @GET("rotateCertificates")
  Call<TypeCollection<RotateCertificates>> list();

  @GET("rotateCertificates")
  Call<TypeCollection<RotateCertificates>> list(@QueryMap Filters filters);

  @GET("rotateCertificates/{id}")
  Call<RotateCertificates> get(@Path("id") String id);

  @POST("rotateCertificates")
  Call<RotateCertificates> create(@Body RotateCertificates rotateCertificates);

  @PUT("rotateCertificates/{id}")
  Call<RotateCertificates> update(@Path("id") String id, @Body RotateCertificates rotateCertificates);

  @DELETE("rotateCertificates/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
