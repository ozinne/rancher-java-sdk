package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LdapFields;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LdapFieldsService {

  @GET("ldapFields")
  Call<TypeCollection<LdapFields>> list();

  @GET("ldapFields")
  Call<TypeCollection<LdapFields>> list(@QueryMap Filters filters);

  @GET("ldapFields/{id}")
  Call<LdapFields> get(@Path("id") String id);

  @POST("ldapFields")
  Call<LdapFields> create(@Body LdapFields ldapFields);

  @PUT("ldapFields/{id}")
  Call<LdapFields> update(@Path("id") String id, @Body LdapFields ldapFields);

  @DELETE("ldapFields/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
