package com.example.appbanhang.retrofit;

import com.example.appbanhang.Interface.model.NotiResponse;
import com.example.appbanhang.Interface.model.NotiSendData;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiPushNofication {
    @Headers(
            {
                    "Content-Type: application/json",
                        "Authorization:key=AAAA3ixghbM:APA91bEPB_mbo0GhgJ89H24BeHJ8A59vNPB0Au8htWmW2jOX4PubxxbPyCO5jpX8xuqeyJzGyubxUC9kxLW8M07Z_ja996PqTNAor1WuU4ckQqtKKloc8jrvXGQTo5yoxSFnMs66441d"
            }
    )
    @POST("fcm/send")
    Observable<NotiResponse> sendNofitication(@Body NotiSendData data);
}
