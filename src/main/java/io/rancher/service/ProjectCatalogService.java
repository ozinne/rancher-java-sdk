package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectCatalog;
import io.rancher.type.CatalogRefresh;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectCatalogService {

  @GET("projectCatalog")
  Call<TypeCollection<ProjectCatalog>> list();

  @GET("projectCatalog")
  Call<TypeCollection<ProjectCatalog>> list(@QueryMap Filters filters);

  @GET("projectCatalog/{id}")
  Call<ProjectCatalog> get(@Path("id") String id);

  @POST("projectCatalog")
  Call<ProjectCatalog> create(@Body ProjectCatalog projectCatalog);

  @PUT("projectCatalog/{id}")
  Call<ProjectCatalog> update(@Path("id") String id, @Body ProjectCatalog projectCatalog);

  @DELETE("projectCatalog/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("projectCatalog/{id}?action=refresh")
  Call<CatalogRefresh> refresh(@Path("id") String id);
  
}
