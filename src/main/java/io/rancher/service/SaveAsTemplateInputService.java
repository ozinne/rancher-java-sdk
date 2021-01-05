package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SaveAsTemplateInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SaveAsTemplateInputService {

  @GET("saveAsTemplateInput")
  Call<TypeCollection<SaveAsTemplateInput>> list();

  @GET("saveAsTemplateInput")
  Call<TypeCollection<SaveAsTemplateInput>> list(@QueryMap Filters filters);

  @GET("saveAsTemplateInput/{id}")
  Call<SaveAsTemplateInput> get(@Path("id") String id);

  @POST("saveAsTemplateInput")
  Call<SaveAsTemplateInput> create(@Body SaveAsTemplateInput saveAsTemplateInput);

  @PUT("saveAsTemplateInput/{id}")
  Call<SaveAsTemplateInput> update(@Path("id") String id, @Body SaveAsTemplateInput saveAsTemplateInput);

  @DELETE("saveAsTemplateInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
