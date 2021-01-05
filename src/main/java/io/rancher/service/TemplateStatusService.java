package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TemplateStatusService {

  @GET("templateStatus")
  Call<TypeCollection<TemplateStatus>> list();

  @GET("templateStatus")
  Call<TypeCollection<TemplateStatus>> list(@QueryMap Filters filters);

  @GET("templateStatus/{id}")
  Call<TemplateStatus> get(@Path("id") String id);

  @POST("templateStatus")
  Call<TemplateStatus> create(@Body TemplateStatus templateStatus);

  @PUT("templateStatus/{id}")
  Call<TemplateStatus> update(@Path("id") String id, @Body TemplateStatus templateStatus);

  @DELETE("templateStatus/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
