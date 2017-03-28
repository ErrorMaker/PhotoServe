package com.hypermine.habbo.cameraserve.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Scott Stamp <scott@hypermine.com> on 3/21/2017.
 */
public class Sprite {
    @SerializedName("x")
    public int x;
    @SerializedName("name")
    public String name;
    @SerializedName("z")
    public float z;
    @SerializedName("color")
    public int color;
    @SerializedName("y")
    public int y;
    @SerializedName("flipH")
    public boolean flipH = false;
    @SerializedName("alpha")
    public int alpha = 255;

    public float getZ()
    {
        return z;
    }

    public float getAlpha() {
        return (float) alpha / 255;
    }
}
