package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6QG7FJg:APA91bFIOCIZPwouKwkFEnL2s0loWv7kljzFuAtvm1rDdJWhiChM3EOt-6E_Ha82ekSBLkZgITWRmqh8tfYLIeBZuktN81dSm7irfkrhN691tZY_bX88eD0qh8IltdGajQjET6slN1ow"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
