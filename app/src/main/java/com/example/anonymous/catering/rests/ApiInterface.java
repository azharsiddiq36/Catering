package com.example.anonymous.catering.rests;

import com.example.anonymous.catering.response.ResponGuruDetail;
import com.example.anonymous.catering.response.ResponseGuru;
import com.example.anonymous.catering.response.ResponseLogin;
import com.example.anonymous.catering.response.ResponseLoginMember;
import com.example.anonymous.catering.response.ResponseMatpel;
import com.example.anonymous.catering.response.ResponseCreateMurid;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("matpel/find-all")
    Call<ResponseMatpel> matpelFindAll();

    @GET("guru/find-all")
    Call<ResponseGuru> guruFindAll();

    @GET("guru/find-by-id")
    Call<ResponGuruDetail> guruFindById(@Query("id") int id);

    @FormUrlEncoded
    @POST("murid/create")
    Call<ResponseCreateMurid> simpanMurid(@Field("nama") String nama,
                                          @Field("email") String email,
                                          @Field("no_hp") String no_hp,
                                          @Field("password") String password);

    @FormUrlEncoded
    @POST("murid/update")
    Call<ResponseCreateMurid> updateMurid(@Field("id") Integer id,
                                          @Field("nama") String nama,
                                          @Field("no_hp") String no_hp,
                                          @Field("email") String email,
                                          @Field("alamat") String alamat,
                                          @Field("jk") String jk,
                                          @Field("nisn") String nisn,
                                          @Field("kelas") String kelas,
                                          @Field("nama_sekolah") String nama_sekolah,
                                          @Field("photo") String photo);

    //login member
    @FormUrlEncoded
    @POST("login/member")
    Call<ResponseLoginMember> memberLogin(
            @Field("username") String username,
            @Field("password") String password
    );
    //login driver
    @FormUrlEncoded
    @POST("login/driver")
    Call<ResponseLogin> driverLogin(
            @Field("email") String email,
            @Field("password") String password
    );
}
