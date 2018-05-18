package com.harismawan.androidrtcexample.util;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;

/**
 * Webrtc_Step3
 * Created by vivek-3102 on 11/03/17.
 */


public interface TurnServer {

    @PUT("_turn/tracking")
    Call<TurnServerPojo> getIceCandidates(@Header("Authorization") String auth);
}
