package com.discord.client_info;

import android.content.Context;
import com.swmansion.reanimated.BuildConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/client_info/ClientInfo;", "", "()V", "buildType", "", "flavor", "isDebugBuild", "", "()Z", "isDeveloperBuild", "otaManifestETag", "getOtaManifestETag", "()Ljava/lang/String;", "setOtaManifestETag", "(Ljava/lang/String;)V", "otaVersion", "getOtaVersion", "setOtaVersion", "packageName", "getPackageName", "setPackageName", "proguardUUID", "releaseChannel", "getReleaseChannel", "sentryDsn", "sentryRelease", "versionCode", "getVersionCode", "setVersionCode", "versionName", "getVersionName", "setVersionName", "init", "", "context", "Landroid/content/Context;", "", "otaManifest", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientInfo {
    public static final ClientInfo INSTANCE = new ClientInfo();
    private static String buildType = null;
    private static String flavor = null;
    public static String otaManifestETag = null;
    public static String otaVersion = null;
    public static String packageName = null;
    public static final String proguardUUID = "82c096b4-a8d1-47af-934b-eaff17df6d9d";
    public static final String sentryDsn = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
    public static final String sentryRelease = "discord_android@179.7.0-2+179207";
    public static String versionCode;
    public static String versionName;

    private ClientInfo() {
    }

    public final String getOtaManifestETag() {
        String str = otaManifestETag;
        if (str != null) {
            return str;
        }
        q.y("otaManifestETag");
        return null;
    }

    public final String getOtaVersion() {
        String str = otaVersion;
        if (str != null) {
            return str;
        }
        q.y("otaVersion");
        return null;
    }

    public final String getPackageName() {
        String str = packageName;
        if (str != null) {
            return str;
        }
        q.y("packageName");
        return null;
    }

    public final String getReleaseChannel() {
        String str = flavor;
        String str2 = null;
        if (str == null) {
            q.y("flavor");
            str = null;
        }
        String str3 = buildType;
        if (str3 == null) {
            q.y("buildType");
        } else {
            str2 = str3;
        }
        if (str2.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String valueOf = String.valueOf(str2.charAt(0));
            q.e(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            q.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb2.append((Object) upperCase);
            String substring = str2.substring(1);
            q.f(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            str2 = sb2.toString();
        }
        return str + str2;
    }

    public final String getVersionCode() {
        String str = versionCode;
        if (str != null) {
            return str;
        }
        q.y("versionCode");
        return null;
    }

    public final String getVersionName() {
        String str = versionName;
        if (str != null) {
            return str;
        }
        q.y("versionName");
        return null;
    }

    public final void init(Context context, String versionName2, int i10, String flavor2, String buildType2, String otaManifest, String otaVersion2) {
        q.g(context, "context");
        q.g(versionName2, "versionName");
        q.g(flavor2, "flavor");
        q.g(buildType2, "buildType");
        q.g(otaManifest, "otaManifest");
        q.g(otaVersion2, "otaVersion");
        setVersionName(versionName2);
        setVersionCode(String.valueOf(i10));
        setOtaManifestETag(otaManifest);
        setOtaVersion(otaVersion2);
        flavor = flavor2;
        buildType = buildType2;
        String packageName2 = context.getPackageName();
        q.f(packageName2, "context.packageName");
        setPackageName(packageName2);
        ClientUserAgent clientUserAgent = ClientUserAgent.INSTANCE;
        clientUserAgent.init(context, "Discord-Android/" + i10 + ";RNA");
    }

    public final boolean isDebugBuild() {
        String str = buildType;
        if (str == null) {
            q.y("buildType");
            str = null;
        }
        return q.b(str, BuildConfig.BUILD_TYPE);
    }

    public final boolean isDeveloperBuild() {
        String str = flavor;
        if (str == null) {
            q.y("flavor");
            str = null;
        }
        return q.b(str, "developer");
    }

    public final void setOtaManifestETag(String str) {
        q.g(str, "<set-?>");
        otaManifestETag = str;
    }

    public final void setOtaVersion(String str) {
        q.g(str, "<set-?>");
        otaVersion = str;
    }

    public final void setPackageName(String str) {
        q.g(str, "<set-?>");
        packageName = str;
    }

    public final void setVersionCode(String str) {
        q.g(str, "<set-?>");
        versionCode = str;
    }

    public final void setVersionName(String str) {
        q.g(str, "<set-?>");
        versionName = str;
    }
}
