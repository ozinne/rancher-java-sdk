package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Member;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MemberService {

  @GET("member")
  Call<TypeCollection<Member>> list();

  @GET("member")
  Call<TypeCollection<Member>> list(@QueryMap Filters filters);

  @GET("member/{id}")
  Call<Member> get(@Path("id") String id);

  @POST("member")
  Call<Member> create(@Body Member member);

  @PUT("member/{id}")
  Call<Member> update(@Path("id") String id, @Body Member member);

  @DELETE("member/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
