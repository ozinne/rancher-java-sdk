package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureADConfigTestOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AzureADConfigTestOutputService {

  @GET("azureADConfigTestOutput")
  Call<TypeCollection<AzureADConfigTestOutput>> list();

  @GET("azureADConfigTestOutput")
  Call<TypeCollection<AzureADConfigTestOutput>> list(@QueryMap Filters filters);

  @GET("azureADConfigTestOutput/{id}")
  Call<AzureADConfigTestOutput> get(@Path("id") String id);

  @POST("azureADConfigTestOutput")
  Call<AzureADConfigTestOutput> create(@Body AzureADConfigTestOutput azureADConfigTestOutput);

  @PUT("azureADConfigTestOutput/{id}")
  Call<AzureADConfigTestOutput> update(@Path("id") String id, @Body AzureADConfigTestOutput azureADConfigTestOutput);

  @DELETE("azureADConfigTestOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
