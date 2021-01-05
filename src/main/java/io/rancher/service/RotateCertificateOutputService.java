package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RotateCertificateOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RotateCertificateOutputService {

  @GET("rotateCertificateOutput")
  Call<TypeCollection<RotateCertificateOutput>> list();

  @GET("rotateCertificateOutput")
  Call<TypeCollection<RotateCertificateOutput>> list(@QueryMap Filters filters);

  @GET("rotateCertificateOutput/{id}")
  Call<RotateCertificateOutput> get(@Path("id") String id);

  @POST("rotateCertificateOutput")
  Call<RotateCertificateOutput> create(@Body RotateCertificateOutput rotateCertificateOutput);

  @PUT("rotateCertificateOutput/{id}")
  Call<RotateCertificateOutput> update(@Path("id") String id, @Body RotateCertificateOutput rotateCertificateOutput);

  @DELETE("rotateCertificateOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
