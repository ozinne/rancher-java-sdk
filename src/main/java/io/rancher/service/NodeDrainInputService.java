package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeDrainInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeDrainInputService {

  @GET("nodeDrainInput")
  Call<TypeCollection<NodeDrainInput>> list();

  @GET("nodeDrainInput")
  Call<TypeCollection<NodeDrainInput>> list(@QueryMap Filters filters);

  @GET("nodeDrainInput/{id}")
  Call<NodeDrainInput> get(@Path("id") String id);

  @POST("nodeDrainInput")
  Call<NodeDrainInput> create(@Body NodeDrainInput nodeDrainInput);

  @PUT("nodeDrainInput/{id}")
  Call<NodeDrainInput> update(@Path("id") String id, @Body NodeDrainInput nodeDrainInput);

  @DELETE("nodeDrainInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
