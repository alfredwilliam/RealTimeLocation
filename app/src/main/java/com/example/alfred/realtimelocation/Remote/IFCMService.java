package com.example.alfred.realtimelocation.Remote;

import com.example.alfred.realtimelocation.Model.MyResponse;
import com.example.alfred.realtimelocation.Model.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
            "Authorization:key=AAAAvm5Uvnw:APA91bEVSsw3pI9Nascrs6zjsipBylUJqGqsSFU0EzR7_z4HJAgNeq0hmG1_9l9XpNOfc2qkHZRAp078u6iBhd3ytkLOSpYx6iXz0QQItpg-QDX22zRpdW38DA3rb3fF3kNW2KHeJ3sB"
    })
    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);
}
