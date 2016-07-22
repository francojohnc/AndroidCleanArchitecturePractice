package apkmarvel.cleanarchitecturesample.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AppVersion {

    private static final String TAG = AppVersion.class.getSimpleName();


    @SerializedName("app_version_id")
    @Expose
    private String appVersionId;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("copy")
    @Expose
    public String copy;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    public String getAppVersionId() {
        return appVersionId;
    }

    public String getPlatform() {
        return platform;
    }

    public String getVersion() {
        return version;
    }

    public String getCopy() {
        return copy;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
