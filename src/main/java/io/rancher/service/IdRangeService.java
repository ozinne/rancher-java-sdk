package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.IdRange;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IdRangeService {

  @GET("idRange")
  Call<TypeCollection<IdRange>> list();

  @GET("idRange")
  Call<TypeCollection<IdRange>> list(@QueryMap Filters filters);

  @GET("idRange/{id}")
  Call<IdRange> get(@Path("id") String id);

  @POST("idRange")
  Call<IdRange> create(@Body IdRange idRange);

  @PUT("idRange/{id}")
  Call<IdRange> update(@Path("id") String id, @Body IdRange idRange);

  @DELETE("idRange/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
