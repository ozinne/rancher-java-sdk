package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WorkspaceVsphereOpts;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WorkspaceVsphereOptsService {

  @GET("workspaceVsphereOpts")
  Call<TypeCollection<WorkspaceVsphereOpts>> list();

  @GET("workspaceVsphereOpts")
  Call<TypeCollection<WorkspaceVsphereOpts>> list(@QueryMap Filters filters);

  @GET("workspaceVsphereOpts/{id}")
  Call<WorkspaceVsphereOpts> get(@Path("id") String id);

  @POST("workspaceVsphereOpts")
  Call<WorkspaceVsphereOpts> create(@Body WorkspaceVsphereOpts workspaceVsphereOpts);

  @PUT("workspaceVsphereOpts/{id}")
  Call<WorkspaceVsphereOpts> update(@Path("id") String id, @Body WorkspaceVsphereOpts workspaceVsphereOpts);

  @DELETE("workspaceVsphereOpts/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
