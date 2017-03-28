package com.hypermine.habbo.cameraserve.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Scott Stamp <scott@hypermine.com> on 3/21/2017.
 */
public class Photo {
    @SerializedName("planes")
    public List<Plane> planes;
    @SerializedName("sprites")
    public List<Sprite> sprites;
    @SerializedName("roomId")
    public int roomId;
    @SerializedName("status")
    public int status;
    @SerializedName("timestamp")
    public long timestamp;
    @SerializedName("checksum")
    public int checksum;
}
