package com.discord.client_info;

import android.content.Context;
import java.util.Locale;
import jf.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001b\u0010\n\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006*"}, d2 = {"Lcom/discord/client_info/ClientInfo;", "", "()V", "buildType", "", "flavor", "isDebugBuild", "", "()Z", "isDeveloperBuild", "isProdBuild", "isProdBuild$delegate", "Lkotlin/Lazy;", "otaManifestETag", "getOtaManifestETag", "()Ljava/lang/String;", "setOtaManifestETag", "(Ljava/lang/String;)V", "otaVersion", "getOtaVersion", "setOtaVersion", "packageName", "getPackageName", "setPackageName", "proguardUUID", "releaseChannel", "getReleaseChannel", "sentryDsn", "sentryRelease", "sentryStaffDsn", "versionCode", "getVersionCode", "setVersionCode", "versionName", "getVersionName", "setVersionName", "init", "", "context", "Landroid/content/Context;", "", "otaManifest", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ClientInfo {
    public static final ClientInfo INSTANCE = new ClientInfo();
    private static String buildType = null;
    private static String flavor = null;
    private static final Lazy isProdBuild$delegate;
    public static String otaManifestETag = null;
    public static String otaVersion = null;
    public static String packageName = null;
    public static final String proguardUUID = "44a730b6-6be6-48d6-8409-6409a48eaa2e";
    public static final String sentryDsn = "https:
    public static final String sentryRelease = "discord_android@195.7.0-2+195207";
    public static final String sentryStaffDsn = "https:
    public static String versionCode;
    public static String versionName;

    static {
        Lazy b10;
        b10 = n.b(ClientInfo$isProdBuild$2.INSTANCE);
        isProdBuild$delegate = b10;
    }

    private ClientInfo() {
    }

    public final String getOtaManifestETag() {
        String str = otaManifestETag;
        if (str != null) {
            return str;
        }
        q.z("otaManifestETag");
        return null;
    }

    public final String getOtaVersion() {
        String str = otaVersion;
        if (str != null) {
            return str;
        }
        q.z("otaVersion");
        return null;
    }

    public final String getPackageName() {
        String str = packageName;
        if (str != null) {
            return str;
        }
        q.z("packageName");
        return null;
    }

    public final String getReleaseChannel() {
        String str = flavor;
        String str2 = null;
        if (str == null) {
            q.z("flavor");
            str = null;
        }
        String str3 = buildType;
        if (str3 == null) {
            q.z("buildType");
        } else {
            str2 = str3;
        }
        if (str2.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String valueOf = String.valueOf(str2.charAt(0));
            q.f(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            q.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb2.append((Object) upperCase);
            String substring = str2.substring(1);
            q.g(substring, "this as java.lang.String).substring(startIndex)");
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
        q.z("versionCode");
        return null;
    }

    public final String getVersionName() {
        String str = versionName;
        if (str != null) {
            return str;
        }
        q.z("versionName");
        return null;
    }

    public final void init(Context context, String versionName2, int i10, String flavor2, String buildType2, String otaManifest, String otaVersion2) {
        q.h(context, "context");
        q.h(versionName2, "versionName");
        q.h(flavor2, "flavor");
        q.h(buildType2, "buildType");
        q.h(otaManifest, "otaManifest");
        q.h(otaVersion2, "otaVersion");
        setVersionName(versionName2);
        setVersionCode(String.valueOf(i10));
        setOtaManifestETag(otaManifest);
        setOtaVersion(otaVersion2);
        flavor = flavor2;
        buildType = buildType2;
        String packageName2 = context.getPackageName();
        q.g(packageName2, "context.packageName");
        setPackageName(packageName2);
        ClientUserAgent clientUserAgent = ClientUserAgent.INSTANCE;
        clientUserAgent.init(context, "Discord-Android/" + i10 + ";RNA");
    }

    public final boolean isDebugBuild() {
        String str = buildType;
        if (str == null) {
            q.z("buildType");
            str = null;
        }
        return q.c(str, "debug");
    }

    public final boolean isDeveloperBuild() {
        String str = flavor;
        if (str == null) {
            q.z("flavor");
            str = null;
        }
        return q.c(str, "developer");
    }

    public final boolean isProdBuild() {
        return ((Boolean) isProdBuild$delegate.getValue()).booleanValue();
    }

    public final void setOtaManifestETag(String str) {
        q.h(str, "<set-?>");
        otaManifestETag = str;
    }

    public final void setOtaVersion(String str) {
        q.h(str, "<set-?>");
        otaVersion = str;
    }

    public final void setPackageName(String str) {
        q.h(str, "<set-?>");
        packageName = str;
    }

    public final void setVersionCode(String str) {
        q.h(str, "<set-?>");
        versionCode = str;
    }

    public final void setVersionName(String str) {
        q.h(str, "<set-?>");
        versionName = str;
    }
}
