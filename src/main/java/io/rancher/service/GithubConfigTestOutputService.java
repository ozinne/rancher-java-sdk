package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GithubConfigTestOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GithubConfigTestOutputService {

  @GET("githubConfigTestOutput")
  Call<TypeCollection<GithubConfigTestOutput>> list();

  @GET("githubConfigTestOutput")
  Call<TypeCollection<GithubConfigTestOutput>> list(@QueryMap Filters filters);

  @GET("githubConfigTestOutput/{id}")
  Call<GithubConfigTestOutput> get(@Path("id") String id);

  @POST("githubConfigTestOutput")
  Call<GithubConfigTestOutput> create(@Body GithubConfigTestOutput githubConfigTestOutput);

  @PUT("githubConfigTestOutput/{id}")
  Call<GithubConfigTestOutput> update(@Path("id") String id, @Body GithubConfigTestOutput githubConfigTestOutput);

  @DELETE("githubConfigTestOutput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
