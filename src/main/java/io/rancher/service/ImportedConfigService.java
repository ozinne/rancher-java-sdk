package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ImportedConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ImportedConfigService {

  @GET("importedConfig")
  Call<TypeCollection<ImportedConfig>> list();

  @GET("importedConfig")
  Call<TypeCollection<ImportedConfig>> list(@QueryMap Filters filters);

  @GET("importedConfig/{id}")
  Call<ImportedConfig> get(@Path("id") String id);

  @POST("importedConfig")
  Call<ImportedConfig> create(@Body ImportedConfig importedConfig);

  @PUT("importedConfig/{id}")
  Call<ImportedConfig> update(@Path("id") String id, @Body ImportedConfig importedConfig);

  @DELETE("importedConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
