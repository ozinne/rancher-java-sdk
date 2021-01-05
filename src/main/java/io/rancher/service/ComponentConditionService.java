package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComponentCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComponentConditionService {

  @GET("componentCondition")
  Call<TypeCollection<ComponentCondition>> list();

  @GET("componentCondition")
  Call<TypeCollection<ComponentCondition>> list(@QueryMap Filters filters);

  @GET("componentCondition/{id}")
  Call<ComponentCondition> get(@Path("id") String id);

  @POST("componentCondition")
  Call<ComponentCondition> create(@Body ComponentCondition componentCondition);

  @PUT("componentCondition/{id}")
  Call<ComponentCondition> update(@Path("id") String id, @Body ComponentCondition componentCondition);

  @DELETE("componentCondition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
