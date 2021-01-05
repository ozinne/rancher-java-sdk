package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SaveAsTemplateOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SaveAsTemplateOutputService {

  @GET("saveAsTemplateOutput")
  Call<TypeCollection<SaveAsTemplateOutput>> list();

  @GET("saveAsTemplateOutput")
  Call<TypeCollection<SaveAsTemplateOutput>> list(@QueryMap Filters filters);

  @GET("saveAsTemplateOutput/{id}")
  Call<SaveAsTemplateOutput> get(@Path("id") String id);

  @POST("saveAsTemplateOutput")
  Call<SaveAsTemplateOutput> create(@Body SaveAsTemplateOutput saveAsTemplateOutput);

  @PUT("saveAsTemplateOutput/{id}")
  Call<SaveAsTemplateOutput> update(@Path("id") String id, @Body SaveAsTemplateOutput saveAsTemplateOutput);

  @DELETE("saveAsTemplateOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
