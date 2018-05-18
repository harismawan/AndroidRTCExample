
package com.harismawan.androidrtcexample.util;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TurnServerPojo {

    @SerializedName("v")
    @Expose
    public IceServerList iceServerList;

    public class IceServerList {

        @SerializedName("iceServers")
        @Expose
        public List<IceServer> iceServers = null;

    }

}
