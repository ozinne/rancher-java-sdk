package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CpuInfo;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CpuInfoService {

  @GET("cpuInfo")
  Call<TypeCollection<CpuInfo>> list();

  @GET("cpuInfo")
  Call<TypeCollection<CpuInfo>> list(@QueryMap Filters filters);

  @GET("cpuInfo/{id}")
  Call<CpuInfo> get(@Path("id") String id);

  @POST("cpuInfo")
  Call<CpuInfo> create(@Body CpuInfo cpuInfo);

  @PUT("cpuInfo/{id}")
  Call<CpuInfo> update(@Path("id") String id, @Body CpuInfo cpuInfo);

  @DELETE("cpuInfo/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
