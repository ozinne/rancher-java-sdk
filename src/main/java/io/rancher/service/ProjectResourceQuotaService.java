package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectResourceQuota;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectResourceQuotaService {

  @GET("projectResourceQuota")
  Call<TypeCollection<ProjectResourceQuota>> list();

  @GET("projectResourceQuota")
  Call<TypeCollection<ProjectResourceQuota>> list(@QueryMap Filters filters);

  @GET("projectResourceQuota/{id}")
  Call<ProjectResourceQuota> get(@Path("id") String id);

  @POST("projectResourceQuota")
  Call<ProjectResourceQuota> create(@Body ProjectResourceQuota projectResourceQuota);

  @PUT("projectResourceQuota/{id}")
  Call<ProjectResourceQuota> update(@Path("id") String id, @Body ProjectResourceQuota projectResourceQuota);

  @DELETE("projectResourceQuota/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
