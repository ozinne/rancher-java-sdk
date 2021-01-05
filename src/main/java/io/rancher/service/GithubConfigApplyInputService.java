package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GithubConfigApplyInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GithubConfigApplyInputService {

  @GET("githubConfigApplyInput")
  Call<TypeCollection<GithubConfigApplyInput>> list();

  @GET("githubConfigApplyInput")
  Call<TypeCollection<GithubConfigApplyInput>> list(@QueryMap Filters filters);

  @GET("githubConfigApplyInput/{id}")
  Call<GithubConfigApplyInput> get(@Path("id") String id);

  @POST("githubConfigApplyInput")
  Call<GithubConfigApplyInput> create(@Body GithubConfigApplyInput githubConfigApplyInput);

  @PUT("githubConfigApplyInput/{id}")
  Call<GithubConfigApplyInput> update(@Path("id") String id, @Body GithubConfigApplyInput githubConfigApplyInput);

  @DELETE("githubConfigApplyInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
