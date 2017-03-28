package com.hypermine.habbo.cameraserve.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Scott Stamp <scott@hypermine.com> on 3/21/2017.
 */
public class Plane {
    @SerializedName("color")
    public int color;
    @SerializedName("bottomAligned")
    public boolean bottomAligned;
    @SerializedName("z")
    public double z;
    @SerializedName("texCols")
    public List<TextureCol> texCols;
    @SerializedName("cornerPoints")
    public List<CornerPoint> cornerPoints;

    public class TextureCol {
        @SerializedName("assetNames")
        public List<String> assetNames;
    }

    public class CornerPoint {
        @SerializedName("x")
        public int x;
        @SerializedName("y")
        public int y;
    }
}
