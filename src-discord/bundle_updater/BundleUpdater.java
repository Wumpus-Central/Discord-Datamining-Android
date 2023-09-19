package com.discord.bundle_updater;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.webkit.CookieManager;
import com.discord.client_info.ClientInfo;
import com.discord.crash_reporting.CrashReporting;
import com.discord.logging.Log;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kf.n;
import kf.s;
import kf.t;
import kf.x;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.o;
import kotlin.text.p;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import lf.v;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import pi.f;
import uf.b;
import uf.c;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0093\u00012\u00020\u0001:\u0014\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001B-\b\u0002\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020\u0005\u0012\u0006\u0010B\u001a\u00020A\u0012\b\b\u0002\u0010E\u001a\u00020D¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\"\u0010\u0012\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002Jn\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00022\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\f\u0010\"\u001a\u00020\u0005*\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\nH\u0002J'\u0010&\u001a\u00020\n2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020$\"\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u001c\u0010+\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002H\u0002JK\u00102\u001a\u00020\n2\u0006\u0010)\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\n2\u0006\u0010)\u001a\u00020\fH\u0002J\u0006\u00106\u001a\u000205J&\u0010;\u001a\u0006\u0012\u0002\b\u00030:2\b\b\u0002\u00107\u001a\u00020\u001b2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000108R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR#\u0010M\u001a\n H*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010[\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001e\u0010d\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bd\u0010e\u0012\u0004\bf\u0010gR0\u0010i\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\n\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR6\u0010o\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR\u0014\u0010t\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010sR$\u0010{\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010s\"\u0004\by\u0010zR(\u0010~\u001a\u0004\u0018\u00010\u00022\b\u0010w\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b|\u0010s\"\u0004\b}\u0010zR&\u0010\u0081\u0001\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010s\"\u0005\b\u0080\u0001\u0010zR\u0016\u0010\u0083\u0001\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010]R\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010sR(\u0010\u0088\u0001\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010s\"\u0005\b\u0087\u0001\u0010zR\u0017\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008d\u0001\u0010U\"\u0006\b\u008e\u0001\u0010\u008f\u0001\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u009d\u0001"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater;", "", "", "commit", JSStackTrace.FILE_KEY, "Ljava/io/File;", "otaFile", "otaTempFile", "src", "dst", "", "moveFile", "Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttempt;", "attemptOtaUpdate", "existingOtaCommit", "Lcom/discord/bundle_updater/AppManifest;", "newManifest", "newOtaCommit", "downloadOtaFiles", "url", "", "Lkotlin/Pair;", "extraHeaders", "hash", "Lcom/discord/bundle_updater/BundleUpdater$Patch;", "patch", "destinationFile", "", "attempt", "Lkf/s;", "Lokhttp3/Headers;", "downloadSingleFile-hUnOzRk", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;", "downloadSingleFile", "ensureEmptyFile", "validateBuildOverrideCookie", "", "knownOtaCommits", "deleteUnknownOtas", "([Ljava/lang/String;)V", "Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;", "result", "error", "createOtaCheckAttempt", "Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;", "Lkotlin/time/TimeMark;", "startMark", "", "bytesReceived", "statusCode", "trackAssetDownload", "(Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;Ljava/lang/String;Lkotlin/time/TimeMark;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "trackCheckAttempt", "Lcom/discord/bundle_updater/BundleUpdater$ManifestInfo;", "manifestInfo", "delaySeconds", "Lkotlin/Function0;", "onComplete", "Ljava/util/concurrent/Future;", "checkForUpdate", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "filesDirectory", "Ljava/io/File;", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/content/res/AssetManager;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Landroid/webkit/CookieManager;", "kotlin.jvm.PlatformType", "cookieManager$delegate", "Lkotlin/Lazy;", "getCookieManager", "()Landroid/webkit/CookieManager;", "cookieManager", "Lokhttp3/OkHttpClient;", "client$delegate", "getClient", "()Lokhttp3/OkHttpClient;", "client", "otasRootDirectory$delegate", "getOtasRootDirectory", "()Ljava/io/File;", "otasRootDirectory", "totalBytesReceived", "J", "", "<set-?>", "isVersionRequired", "Z", "()Z", "", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "otaMetrics", "Ljava/util/List;", "getOtaMetrics", "()Ljava/util/List;", "otaCheckTimeMark", "Lkotlin/time/TimeMark;", "getOtaCheckTimeMark$annotations", "()V", "Lkotlin/Function1;", "onBundleDownloadedListener", "Lkotlin/jvm/functions/Function1;", "getOnBundleDownloadedListener", "()Lkotlin/jvm/functions/Function1;", "setOnBundleDownloadedListener", "(Lkotlin/jvm/functions/Function1;)V", "onOtaUpdateCheckedListener", "getOnOtaUpdateCheckedListener", "setOnOtaUpdateCheckedListener", "getVersion", "()Ljava/lang/String;", "version", "getManifestURL", "manifestURL", "value", "getManifestETag", "setManifestETag", "(Ljava/lang/String;)V", "manifestETag", "getInProgressOtaCommit", "setInProgressOtaCommit", "inProgressOtaCommit", "getOtaVersion", "setOtaVersion", "otaVersion", "getValidOTAVersion", "validOTAVersion", "getExistingOtaCommit", "cookieHeader", "getBuildOverrideCookieHeader", "setBuildOverrideCookieHeader", "buildOverrideCookieHeader", "Lokhttp3/Cookie;", "getBuildOverrideCookie", "()Lokhttp3/Cookie;", "buildOverrideCookie", "getBundleLocation", "setBundleLocation", "(Ljava/io/File;)V", "bundleLocation", "<init>", "(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V", "Companion", "HttpException", "ManifestInfo", "MaxDownloadAttemptsException", "OtaAssetDownloadAttempt", "OtaAssetDownloadAttemptResult", "OtaCheckAttempt", "OtaCheckAttemptResult", "OtaMetric", "Patch", "bundle_updater_release"}, k = 1, mv = {1, 8, 0})

public final class BundleUpdater {
    public static final String ANDROID_JS_BUNDLE_ASSET_NAME = "index.android.bundle";
    private static final String BUILD_OVERRIDE_COOKIE = "buildOverride";
    private static final String KEY_ANDROID_JS_BUNDLE = "key_android_js_bundle";
    private static final String KEY_BUILD_OVERRIDE_COOKIE_HEADER = "build_override_cookie_header";
    private static final String KEY_ETAG = "e_tag";
    private static final String KEY_IN_PROGRESS_OTA_COMMIT = "in_progress_ota_commit";
    private static final String KEY_OTA_VERSION = "ota_version";
    private static final String OTAS_DIRECTORY = "otas";
    private static BundleUpdater updater;
    private final AssetManager assetManager;
    private final Lazy client$delegate;
    private final Lazy cookieManager$delegate;
    private final ExecutorService executor;
    private final File filesDirectory;
    private boolean isVersionRequired;
    private Function1<? super Boolean, Unit> onBundleDownloadedListener;
    private Function1<? super List<? extends OtaMetric>, Unit> onOtaUpdateCheckedListener;
    private TimeMark otaCheckTimeMark;
    private final List<OtaMetric> otaMetrics;
    private final Lazy otasRootDirectory$delegate;
    private final SharedPreferences sharedPreferences;
    private long totalBytesReceived;
    public static final Companion Companion = new Companion(null);
    private static final Uri BASE_OTA_URI = new Uri.Builder().scheme("https").authority("discord.com").build();
    private static final HttpUrl BASE_OTA_URL = new HttpUrl.a().o("https").e("discord.com").a();
    private static final String TAG = BundleUpdater.class.getSimpleName();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$Companion;", "", "()V", "ANDROID_JS_BUNDLE_ASSET_NAME", "", "BASE_OTA_URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "BASE_OTA_URL", "Lokhttp3/HttpUrl;", "BUILD_OVERRIDE_COOKIE", "KEY_ANDROID_JS_BUNDLE", "KEY_BUILD_OVERRIDE_COOKIE_HEADER", "KEY_ETAG", "KEY_IN_PROGRESS_OTA_COMMIT", "KEY_OTA_VERSION", "OTAS_DIRECTORY", "TAG", "updater", "Lcom/discord/bundle_updater/BundleUpdater;", "init", "", "context", "Landroid/content/Context;", "instance", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(Context context) {
            q.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("BundleUpdater", 0);
            q.g(sharedPreferences, "context.getSharedPrefere…r\", Context.MODE_PRIVATE)");
            File filesDir = context.getFilesDir();
            q.g(filesDir, "context.filesDir");
            AssetManager assets = context.getAssets();
            q.g(assets, "context.assets");
            BundleUpdater.updater = new BundleUpdater(sharedPreferences, filesDir, assets, null, 8, null);
        }

        public final BundleUpdater instance() {
            BundleUpdater bundleUpdater = BundleUpdater.updater;
            if (bundleUpdater != null) {
                return bundleUpdater;
            }
            q.z("updater");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$HttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "(I)V", "getStatusCode", "()I", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class HttpException extends Exception {
        private final int statusCode;

        public HttpException(int i10) {
            super("Failure to fetch manifest, status code: " + i10 + "...");
            this.statusCode = i10;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$ManifestInfo;", "", "source", "", "metadata", "Lcom/discord/bundle_updater/AppManifestMetadata;", "(Ljava/lang/String;Lcom/discord/bundle_updater/AppManifestMetadata;)V", "getMetadata", "()Lcom/discord/bundle_updater/AppManifestMetadata;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class ManifestInfo {
        private final AppManifestMetadata metadata;
        private final String source;

        public ManifestInfo(String source, AppManifestMetadata appManifestMetadata) {
            q.h(source, "source");
            this.source = source;
            this.metadata = appManifestMetadata;
        }

        public static  ManifestInfo copy$default(ManifestInfo manifestInfo, String str, AppManifestMetadata appManifestMetadata, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = manifestInfo.source;
            }
            if ((i10 & 2) != 0) {
                appManifestMetadata = manifestInfo.metadata;
            }
            return manifestInfo.copy(str, appManifestMetadata);
        }

        public final String component1() {
            return this.source;
        }

        public final AppManifestMetadata component2() {
            return this.metadata;
        }

        public final ManifestInfo copy(String source, AppManifestMetadata appManifestMetadata) {
            q.h(source, "source");
            return new ManifestInfo(source, appManifestMetadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManifestInfo)) {
                return false;
            }
            ManifestInfo manifestInfo = (ManifestInfo) obj;
            return q.c(this.source, manifestInfo.source) && q.c(this.metadata, manifestInfo.metadata);
        }

        public final AppManifestMetadata getMetadata() {
            return this.metadata;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            AppManifestMetadata appManifestMetadata = this.metadata;
            return hashCode + (appManifestMetadata == null ? 0 : appManifestMetadata.hashCode());
        }

        public final WritableNativeMap toNativeMap() {
            WritableNativeMap writableNativeMap;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = x.a("source", this.source);
            AppManifestMetadata appManifestMetadata = this.metadata;
            if (appManifestMetadata != null) {
                writableNativeMap = appManifestMetadata.toNativeMap();
            } else {
                writableNativeMap = null;
            }
            pairArr[1] = x.a("metadata", writableNativeMap);
            return NativeMapExtensionsKt.nativeMapOf(pairArr);
        }

        public String toString() {
            String str = this.source;
            AppManifestMetadata appManifestMetadata = this.metadata;
            return "ManifestInfo(source=" + str + ", metadata=" + appManifestMetadata + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$MaxDownloadAttemptsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "attempts", "", "(Ljava/lang/String;I)V", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class MaxDownloadAttemptsException extends Exception {
        
        public MaxDownloadAttemptsException(String url, int i10) {
            super("Failed " + i10 + " times to download " + url + ", aborting...");
            q.h(url, "url");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum OtaAssetDownloadAttemptResult {
        SUCCESS("success"),
        FAILURE("failure");
        
        private final String value;

        OtaAssetDownloadAttemptResult(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NOOP", "CLEARED", "SUCCESS", "SUCCESS_WITH_VERSION_REQUIRED", "FAILURE", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum OtaCheckAttemptResult {
        NOOP("noop"),
        CLEARED("clear"),
        SUCCESS("success"),
        SUCCESS_WITH_VERSION_REQUIRED("success"),
        FAILURE("failure");
        
        private final String value;

        OtaCheckAttemptResult(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "", "toNativeMap", "Lcom/facebook/react/bridge/ReadableMap;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface OtaMetric {
        ReadableMap toNativeMap();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$Patch;", "", "url", "", "baseFilePath", "Ljava/io/File;", "patchPath", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "getBaseFilePath", "()Ljava/io/File;", "getPatchPath", "getUrl", "()Ljava/lang/String;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Patch {
        private final File baseFilePath;
        private final File patchPath;
        private final String url;

        public Patch(String url, File baseFilePath, File patchPath) {
            q.h(url, "url");
            q.h(baseFilePath, "baseFilePath");
            q.h(patchPath, "patchPath");
            this.url = url;
            this.baseFilePath = baseFilePath;
            this.patchPath = patchPath;
        }

        public final File getBaseFilePath() {
            return this.baseFilePath;
        }

        public final File getPatchPath() {
            return this.patchPath;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;
        public static final  int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OtaCheckAttemptResult.values().length];
            try {
                iArr[OtaCheckAttemptResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtaCheckAttemptResult.SUCCESS_WITH_VERSION_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AssetStatus.values().length];
            try {
                iArr2[AssetStatus.CopyFromPrevious.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AssetStatus.Download.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private BundleUpdater(SharedPreferences sharedPreferences, File file, AssetManager assetManager, ExecutorService executorService) {
        Lazy b10;
        Lazy b11;
        Lazy b12;
        this.sharedPreferences = sharedPreferences;
        this.filesDirectory = file;
        this.assetManager = assetManager;
        this.executor = executorService;
        b10 = n.b(BundleUpdater$cookieManager$2.INSTANCE);
        this.cookieManager$delegate = b10;
        b11 = n.b(new BundleUpdater$client$2(this));
        this.client$delegate = b11;
        b12 = n.b(new BundleUpdater$otasRootDirectory$2(this));
        this.otasRootDirectory$delegate = b12;
        this.otaMetrics = new ArrayList();
        this.otaCheckTimeMark = f.a.b(f.f26328a.a());
    }

    private final OtaCheckAttempt attemptOtaUpdate() {
        boolean w10;
        List list;
        List d10;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        String TAG2 = TAG;
        CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Downloading Manifest...", null, null, 6, null);
        validateBuildOverrideCookie();
        if (q.c(getExistingOtaCommit(), getInProgressOtaCommit())) {
            setInProgressOtaCommit(null);
        }
        CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Existing OTA commit is " + getExistingOtaCommit() + ", in progress OTA commit is " + getInProgressOtaCommit(), null, null, 6, null);
        deleteUnknownOtas(getExistingOtaCommit(), getInProgressOtaCommit());
        setOtaVersion(getVersion());
        File otaTempFile = otaTempFile("manifest.json");
        String manifestURL = getManifestURL();
        String manifestETag = getManifestETag();
        w10 = o.w(manifestETag);
        if (!(true ^ w10)) {
            manifestETag = null;
        }
        if (manifestETag != null) {
            d10 = i.d(x.a("If-None-Match", manifestETag));
            list = d10;
        } else {
            list = null;
        }
        Object obj = m2downloadSingleFilehUnOzRk$default(this, manifestURL, list, null, null, otaTempFile, 0, 44, null);
        Throwable e10 = s.e(obj);
        String str = "";
        if (e10 == null) {
            Headers headers = (Headers) obj;
            AppManifest manifestFromFile = BundleUpdaterUtils.INSTANCE.getManifestFromFile(otaTempFile);
            String commit = manifestFromFile.getMetadata().getCommit();
            if (q.c(commit, getExistingOtaCommit())) {
                return createOtaCheckAttempt$default(this, OtaCheckAttemptResult.NOOP, null, 2, null);
            }
            moveFile(otaTempFile, otaFile(commit, "manifest.json"));
            setInProgressOtaCommit(commit);
            String a10 = headers.a("Etag");
            if (a10 != null) {
                str = a10;
            }
            setManifestETag(str);
            Log log = Log.INSTANCE;
            q.g(TAG2, "TAG");
            Log.i$default(log, TAG2, "Setting manifest ETag to " + getManifestETag(), (Throwable) null, 4, (Object) null);
            return downloadOtaFiles(getExistingOtaCommit(), manifestFromFile, commit);
        }
        q.f(e10, "null cannot be cast to non-null type com.discord.bundle_updater.BundleUpdater.HttpException");
        HttpException httpException = (HttpException) e10;
        int statusCode = httpException.getStatusCode();
        if (statusCode == 304) {
            String inProgressOtaCommit = getInProgressOtaCommit();
            if (inProgressOtaCommit == null) {
                CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Manifest not changed, already up to date at commit " + getExistingOtaCommit(), null, null, 6, null);
                return createOtaCheckAttempt$default(this, OtaCheckAttemptResult.NOOP, null, 2, null);
            }
            CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Manifest not changed, resuming download of commit " + inProgressOtaCommit + ".", null, null, 6, null);
            return downloadOtaFiles(getExistingOtaCommit(), BundleUpdaterUtils.INSTANCE.getManifestFromFile(otaFile(inProgressOtaCommit, "manifest.json")), inProgressOtaCommit);
        } else if (statusCode == 404) {
            CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Got 404, clearing bundle location...", null, null, 6, null);
            setBundleLocation(null);
            setManifestETag(str);
            return createOtaCheckAttempt$default(this, OtaCheckAttemptResult.CLEARED, null, 2, null);
        } else {
            throw httpException;
        }
    }

    
    public static  Future checkForUpdate$default(BundleUpdater bundleUpdater, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return bundleUpdater.checkForUpdate(i10, function0);
    }

    public static final void checkForUpdate$lambda$8(int i10, BundleUpdater this$0, Function0 function0) {
        Function1<? super Boolean, Unit> function1;
        q.h(this$0, "this$0");
        Thread.sleep(i10 * 1000);
        try {
            this$0.otaMetrics.clear();
            this$0.otaCheckTimeMark = f.a.b(f.f26328a.a());
            this$0.totalBytesReceived = 0L;
            OtaCheckAttempt attemptOtaUpdate = this$0.attemptOtaUpdate();
            if (function0 != null) {
                function0.invoke();
            } else {
                int i11 = WhenMappings.$EnumSwitchMapping$0[attemptOtaUpdate.getResult().ordinal()];
                if (i11 == 1) {
                    Function1<? super Boolean, Unit> function12 = this$0.onBundleDownloadedListener;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                } else if (i11 == 2 && (function1 = this$0.onBundleDownloadedListener) != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
            this$0.trackCheckAttempt(attemptOtaUpdate);
        } catch (Exception e10) {
            if (!(e10 instanceof UnknownHostException) && !(e10 instanceof SocketTimeoutException)) {
                CrashReporting.INSTANCE.captureException(e10);
            }
            Log.INSTANCE.e("BundleUpdater", "Exception checking for OTA", e10);
            this$0.trackCheckAttempt(this$0.createOtaCheckAttempt(OtaCheckAttemptResult.FAILURE, e10.toString()));
        }
    }

    private final OtaCheckAttempt createOtaCheckAttempt(OtaCheckAttemptResult otaCheckAttemptResult, String str) {
        TimeMark timeMark = this.otaCheckTimeMark;
        q.e(timeMark);
        return new OtaCheckAttempt(otaCheckAttemptResult, timeMark.a(), this.totalBytesReceived, str, null);
    }

    static  OtaCheckAttempt createOtaCheckAttempt$default(BundleUpdater bundleUpdater, OtaCheckAttemptResult otaCheckAttemptResult, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return bundleUpdater.createOtaCheckAttempt(otaCheckAttemptResult, str);
    }

    private final void deleteUnknownOtas(String... strArr) {
        boolean y10;
        File[] listFiles = getOtasRootDirectory().listFiles();
        if (listFiles != null) {
            for (File child : listFiles) {
                y10 = kotlin.collections.f.y(strArr, child.getName());
                if (!y10) {
                    CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, TAG + " - Deleting outdated/unknown OTA at " + child.getName() + "...", null, null, 6, null);
                    q.g(child, "child");
                    uf.n.i(child);
                }
            }
        }
    }

    private final OtaCheckAttempt downloadOtaFiles(final String str, final AppManifest appManifest, String str2) {
        final String D;
        boolean M;
        final String str3;
        final Patch patch;
        ArrayList arrayList;
        Future<?> future;
        String str4 = str2;
        Object obj = null;
        List<Pair<String, AssetStatus>> compareJSONData = BundleUpdaterUtils.INSTANCE.compareJSONData(BundleUpdaterUtilsKt.getManifestFromAsset(this.assetManager, "manifest.json"), str != null ? BundleUpdaterUtils.INSTANCE.getManifestFromFile(otaFile(str, "manifest.json")) : null, appManifest);
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        CrashReporting.addBreadcrumb$default(crashReporting, TAG + " - Found " + compareJSONData.size() + " files to copy or download...", null, null, 6, null);
        int i10 = 2;
        if (compareJSONData.isEmpty()) {
            CrashReporting.addBreadcrumb$default(crashReporting, "No files downloaded, returning...", null, null, 6, null);
            return createOtaCheckAttempt$default(this, OtaCheckAttemptResult.NOOP, null, 2, null);
        }
        boolean confirmUpdate = appManifest.getMetadata().getConfirmUpdate();
        Uri build = BASE_OTA_URI.buildUpon().appendPath("assets").appendPath("android").appendPath(str4).build();
        ArrayList<Future> arrayList2 = new ArrayList();
        Iterator<T> it = compareJSONData.iterator();
        File file = null;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str5 = (String) pair.a();
            final AssetStatus assetStatus = (AssetStatus) pair.b();
            D = o.D(str5, "/res/", "/assets/", false, 4, null);
            final Uri build2 = build.buildUpon().appendEncodedPath(str5).build();
            M = p.M(str5, ANDROID_JS_BUNDLE_ASSET_NAME, false, i10, obj);
            String str6 = appManifest.getPatches().get(str5);
            if (str6 == null || !M) {
                str3 = str5;
                i10 = i10;
                patch = null;
            } else {
                File otaTempFile = otaTempFile(D + ".base");
                File otaTempFile2 = otaTempFile(D + ".patch");
                FileOutputStream bundleStream = this.assetManager.open(ANDROID_JS_BUNDLE_ASSET_NAME);
                try {
                    bundleStream = new FileOutputStream(ensureEmptyFile(otaTempFile));
                    q.g(bundleStream, "bundleStream");
                    str3 = str5;
                    th = null;
                    i10 = 2;
                    b.b(bundleStream, bundleStream, 0, 2, th);
                    c.a(bundleStream, th);
                    String uri = build.buildUpon().appendEncodedPath(str6).build().toString();
                    q.g(uri, "baseFileURL.buildUpon().…th(it).build().toString()");
                    patch = new Patch(uri, otaTempFile, otaTempFile2);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            final File otaTempFile3 = otaTempFile(D);
            final File otaFile = otaFile(str4, D);
            File file2 = M ? otaFile : file;
            if (otaFile.exists()) {
                file = file2;
                future = null;
                arrayList = arrayList2;
            } else {
                file = file2;
                arrayList = arrayList2;
                i10 = 2;
                future = this.executor.submit(new Runnable() { 
                    @Override 
                    public final void run() {
                        BundleUpdater.downloadOtaFiles$lambda$18$lambda$17(AssetStatus.this, this, str, D, otaTempFile3, build2, appManifest, str3, patch, otaFile);
                    }
                });
            }
            if (future != null) {
                arrayList.add(future);
            }
            str4 = str2;
            arrayList2 = arrayList;
            obj = null;
        }
        for (Future future2 : arrayList2) {
            future2.get();
        }
        setBundleLocation(file);
        setInProgressOtaCommit(null);
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, TAG + " - Done downloading OTA...", null, null, 6, null);
        return createOtaCheckAttempt$default(this, confirmUpdate ? OtaCheckAttemptResult.SUCCESS_WITH_VERSION_REQUIRED : OtaCheckAttemptResult.SUCCESS, null, i10, null);
    }

    public static final void downloadOtaFiles$lambda$18$lambda$17(AssetStatus assetStatus, BundleUpdater this$0, String str, String localFileString, File tempAsset, Uri uri, AppManifest newManifest, String fileString, Patch patch, File dstAsset) {
        q.h(assetStatus, "$assetStatus");
        q.h(this$0, "this$0");
        q.h(localFileString, "$localFileString");
        q.h(tempAsset, "$tempAsset");
        q.h(newManifest, "$newManifest");
        q.h(fileString, "$fileString");
        q.h(dstAsset, "$dstAsset");
        int i10 = WhenMappings.$EnumSwitchMapping$1[assetStatus.ordinal()];
        if (i10 == 1) {
            q.e(str);
            uf.n.h(this$0.otaFile(str, localFileString), tempAsset, true, 0, 4, null);
        } else if (i10 == 2) {
            String uri2 = uri.toString();
            q.g(uri2, "url.toString()");
            t.b(m2downloadSingleFilehUnOzRk$default(this$0, uri2, null, newManifest.getHashes().get(fileString), patch, tempAsset, 0, 34, null));
        }
        this$0.moveFile(tempAsset, dstAsset);
    }

    
    
    
    
    
    
    
    
    
    
    
    private final java.lang.Object m1downloadSingleFilehUnOzRk(java.lang.String r33, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r34, java.lang.String r35, com.discord.bundle_updater.BundleUpdater.Patch r36, java.io.File r37, int r38) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.BundleUpdater.m1downloadSingleFilehUnOzRk(java.lang.String, java.util.List, java.lang.String, com.discord.bundle_updater.BundleUpdater$Patch, java.io.File, int):java.lang.Object");
    }

    
    static  Object m2downloadSingleFilehUnOzRk$default(BundleUpdater bundleUpdater, String str, List list, String str2, Patch patch, File file, int i10, int i11, Object obj) {
        return bundleUpdater.m1downloadSingleFilehUnOzRk(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : patch, file, (i11 & 32) != 0 ? 0 : i10);
    }

    private final File ensureEmptyFile(File file) {
        boolean z10;
        String str;
        String str2;
        String str3;
        Map k10;
        File absoluteFile;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            z10 = parentFile.mkdirs();
        } else {
            z10 = false;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return file;
        } catch (Exception e10) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            String str4 = "Failed to create file: " + file.getAbsolutePath() + ". ";
            Pair[] pairArr = new Pair[5];
            File parentFile2 = file.getParentFile();
            Boolean bool = null;
            if (parentFile2 != null) {
                str = parentFile2.getPath();
            } else {
                str = null;
            }
            pairArr[0] = x.a("Parent path", String.valueOf(str));
            File parentFile3 = file.getParentFile();
            if (parentFile3 != null) {
                str2 = parentFile3.getAbsolutePath();
            } else {
                str2 = null;
            }
            pairArr[1] = x.a("Parent absolute path", String.valueOf(str2));
            File parentFile4 = file.getParentFile();
            if (parentFile4 == null || (absoluteFile = parentFile4.getAbsoluteFile()) == null) {
                str3 = null;
            } else {
                str3 = absoluteFile.getPath();
            }
            pairArr[2] = x.a("Parent absolute file path", String.valueOf(str3));
            pairArr[3] = x.a("Directories created", String.valueOf(z10));
            File parentFile5 = file.getParentFile();
            if (parentFile5 != null) {
                bool = Boolean.valueOf(parentFile5.exists());
            }
            pairArr[4] = x.a("Parent directory exists", String.valueOf(bool));
            k10 = v.k(pairArr);
            CrashReporting.addBreadcrumb$default(crashReporting, str4, k10, null, 4, null);
            throw e10;
        }
    }

    private final OkHttpClient getClient() {
        return (OkHttpClient) this.client$delegate.getValue();
    }

    public final CookieManager getCookieManager() {
        return (CookieManager) this.cookieManager$delegate.getValue();
    }

    
    
    
    private final java.lang.String getExistingOtaCommit() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.BundleUpdater.getExistingOtaCommit():java.lang.String");
    }

    private final String getInProgressOtaCommit() {
        return this.sharedPreferences.getString(KEY_IN_PROGRESS_OTA_COMMIT, null);
    }

    private final String getManifestURL() {
        String uri = BASE_OTA_URI.buildUpon().appendPath("android").appendPath(getVersion()).appendPath("manifest.json").build().toString();
        q.g(uri, "BASE_OTA_URI\n           …)\n            .toString()");
        return uri;
    }

    private static  void getOtaCheckTimeMark$annotations() {
    }

    private final boolean getValidOTAVersion() {
        return q.c(getOtaVersion(), getVersion());
    }

    private final String getVersion() {
        return ClientInfo.INSTANCE.getVersionName();
    }

    private final void moveFile(File file, File file2) {
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.renameTo(file2);
    }

    private final File otaFile(String str, String str2) {
        return new File(new File(getOtasRootDirectory(), str), str2);
    }

    private final File otaTempFile(String str) {
        return otaFile("temp", str);
    }

    private final void setInProgressOtaCommit(String str) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.g(editor, "editor");
        editor.putString(KEY_IN_PROGRESS_OTA_COMMIT, str);
        editor.apply();
    }

    private final void setManifestETag(String str) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.g(editor, "editor");
        editor.putString(KEY_ETAG, str);
        editor.apply();
    }

    private final void setOtaVersion(String str) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.g(editor, "editor");
        editor.putString(KEY_OTA_VERSION, str);
        editor.apply();
    }

    private final void trackAssetDownload(OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, TimeMark timeMark, Long l10, Integer num, String str2) {
        this.otaMetrics.add(new OtaAssetDownloadAttempt(otaAssetDownloadAttemptResult, str, Duration.e(timeMark.a()), l10, num, str2, null));
    }

    static  void trackAssetDownload$default(BundleUpdater bundleUpdater, OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, TimeMark timeMark, Long l10, Integer num, String str2, int i10, Object obj) {
        bundleUpdater.trackAssetDownload(otaAssetDownloadAttemptResult, str, timeMark, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str2);
    }

    private final void trackCheckAttempt(OtaCheckAttempt otaCheckAttempt) {
        this.otaMetrics.add(otaCheckAttempt);
        Function1<? super List<? extends OtaMetric>, Unit> function1 = this.onOtaUpdateCheckedListener;
        if (function1 != null) {
            function1.invoke(this.otaMetrics);
        }
    }

    private final void validateBuildOverrideCookie() {
        if (!CookieValidator.INSTANCE.validateBuildOverrideCookie(getBuildOverrideCookie(), getVersion())) {
            setBuildOverrideCookieHeader("");
        }
    }

    public final Future<?> checkForUpdate(final int i10, final Function0<Unit> function0) {
        Future<?> submit = this.executor.submit(new Runnable() { 
            @Override 
            public final void run() {
                BundleUpdater.checkForUpdate$lambda$8(i10, this, function0);
            }
        });
        q.g(submit, "executor.submit {\n      …)\n            }\n        }");
        return submit;
    }

    public final Cookie getBuildOverrideCookie() {
        return Cookie.f25742n.c(BASE_OTA_URL, getBuildOverrideCookieHeader());
    }

    public final String getBuildOverrideCookieHeader() {
        String string = this.sharedPreferences.getString(KEY_BUILD_OVERRIDE_COOKIE_HEADER, "");
        return string == null ? "" : string;
    }

    public final File getBundleLocation() {
        boolean z10;
        String string = this.sharedPreferences.getString(KEY_ANDROID_JS_BUNDLE, null);
        if (string == null) {
            return null;
        }
        File file = new File(string);
        if (!file.exists() || !getValidOTAVersion()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return file;
        }
        return null;
    }

    public final String getManifestETag() {
        String string = this.sharedPreferences.getString(KEY_ETAG, "");
        return string == null ? "" : string;
    }

    public final Function1<Boolean, Unit> getOnBundleDownloadedListener() {
        return this.onBundleDownloadedListener;
    }

    public final Function1<List<? extends OtaMetric>, Unit> getOnOtaUpdateCheckedListener() {
        return this.onOtaUpdateCheckedListener;
    }

    public final List<OtaMetric> getOtaMetrics() {
        return this.otaMetrics;
    }

    public final String getOtaVersion() {
        String string = this.sharedPreferences.getString(KEY_OTA_VERSION, "");
        return string == null ? "" : string;
    }

    public final File getOtasRootDirectory() {
        return (File) this.otasRootDirectory$delegate.getValue();
    }

    public final boolean isVersionRequired() {
        return this.isVersionRequired;
    }

    public final ManifestInfo manifestInfo() {
        AppManifest appManifest;
        String existingOtaCommit = getExistingOtaCommit();
        if (existingOtaCommit != null) {
            appManifest = BundleUpdaterUtils.INSTANCE.getManifestFromFile(otaFile(existingOtaCommit, "manifest.json"));
        } else {
            appManifest = null;
        }
        if (appManifest != null) {
            return new ManifestInfo("OTA", appManifest.getMetadata());
        }
        return new ManifestInfo("Bundle", BundleUpdaterUtilsKt.getManifestFromAsset(this.assetManager, "manifest.json").getMetadata());
    }

    public final void setBuildOverrideCookieHeader(String cookieHeader) {
        q.h(cookieHeader, "cookieHeader");
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.g(editor, "editor");
        editor.putString(KEY_BUILD_OVERRIDE_COOKIE_HEADER, cookieHeader);
        editor.apply();
    }

    public final void setBundleLocation(File file) {
        String str;
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.g(editor, "editor");
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = null;
        }
        editor.putString(KEY_ANDROID_JS_BUNDLE, str);
        editor.apply();
    }

    public final void setOnBundleDownloadedListener(Function1<? super Boolean, Unit> function1) {
        this.onBundleDownloadedListener = function1;
    }

    public final void setOnOtaUpdateCheckedListener(Function1<? super List<? extends OtaMetric>, Unit> function1) {
        this.onOtaUpdateCheckedListener = function1;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttempt;", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "result", "Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;", "duration", "Lkotlin/time/Duration;", "totalBytesReceived", "", "error", "", "(Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;JJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getError", "()Ljava/lang/String;", "getResult", "()Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;", "getTotalBytesReceived", "component1", "component2", "component2-UwyO8pc", "component3", "component4", "copy", "copy-dWUq8MI", "(Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttemptResult;JJLjava/lang/String;)Lcom/discord/bundle_updater/BundleUpdater$OtaCheckAttempt;", "equals", "", "other", "", "hashCode", "", "toNativeMap", "Lcom/facebook/react/bridge/ReadableMap;", "toString", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class OtaCheckAttempt implements OtaMetric {
        private final long duration;
        private final String error;
        private final OtaCheckAttemptResult result;
        private final long totalBytesReceived;

        private OtaCheckAttempt(OtaCheckAttemptResult otaCheckAttemptResult, long j10, long j11, String str) {
            this.result = otaCheckAttemptResult;
            this.duration = j10;
            this.totalBytesReceived = j11;
            this.error = str;
        }

        public  OtaCheckAttempt(OtaCheckAttemptResult otaCheckAttemptResult, long j10, long j11, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(otaCheckAttemptResult, j10, j11, str);
        }

        
        public static  OtaCheckAttempt m7copydWUq8MI$default(OtaCheckAttempt otaCheckAttempt, OtaCheckAttemptResult otaCheckAttemptResult, long j10, long j11, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                otaCheckAttemptResult = otaCheckAttempt.result;
            }
            if ((i10 & 2) != 0) {
                j10 = otaCheckAttempt.duration;
            }
            if ((i10 & 4) != 0) {
                j11 = otaCheckAttempt.totalBytesReceived;
            }
            if ((i10 & 8) != 0) {
                str = otaCheckAttempt.error;
            }
            return otaCheckAttempt.m9copydWUq8MI(otaCheckAttemptResult, j10, j11, str);
        }

        public final OtaCheckAttemptResult component1() {
            return this.result;
        }

        
        public final long m8component2UwyO8pc() {
            return this.duration;
        }

        public final long component3() {
            return this.totalBytesReceived;
        }

        public final String component4() {
            return this.error;
        }

        
        public final OtaCheckAttempt m9copydWUq8MI(OtaCheckAttemptResult result, long j10, long j11, String str) {
            q.h(result, "result");
            return new OtaCheckAttempt(result, j10, j11, str, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtaCheckAttempt)) {
                return false;
            }
            OtaCheckAttempt otaCheckAttempt = (OtaCheckAttempt) obj;
            return this.result == otaCheckAttempt.result && Duration.k(this.duration, otaCheckAttempt.duration) && this.totalBytesReceived == otaCheckAttempt.totalBytesReceived && q.c(this.error, otaCheckAttempt.error);
        }

        
        public final long m10getDurationUwyO8pc() {
            return this.duration;
        }

        public final String getError() {
            return this.error;
        }

        public final OtaCheckAttemptResult getResult() {
            return this.result;
        }

        public final long getTotalBytesReceived() {
            return this.totalBytesReceived;
        }

        public int hashCode() {
            int hashCode = ((((this.result.hashCode() * 31) + Duration.z(this.duration)) * 31) + co.discord.media_engine.b.a(this.totalBytesReceived)) * 31;
            String str = this.error;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override 
        public ReadableMap toNativeMap() {
            return NativeMapExtensionsKt.nativeMapOf(x.a("type", "OtaCheckAttempt"), x.a("result", this.result.getValue()), x.a("durationSeconds", Double.valueOf(Duration.H(this.duration, pi.c.SECONDS))), x.a("bytesReceived", Long.valueOf(this.totalBytesReceived)), x.a("error", this.error));
        }

        public String toString() {
            OtaCheckAttemptResult otaCheckAttemptResult = this.result;
            String K = Duration.K(this.duration);
            long j10 = this.totalBytesReceived;
            String str = this.error;
            return "OtaCheckAttempt(result=" + otaCheckAttemptResult + ", duration=" + K + ", totalBytesReceived=" + j10 + ", error=" + str + ")";
        }

        public  OtaCheckAttempt(OtaCheckAttemptResult otaCheckAttemptResult, long j10, long j11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(otaCheckAttemptResult, j10, j11, (i10 & 8) != 0 ? null : str, null);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttempt;", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "result", "Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;", "url", "", "duration", "Lkotlin/time/Duration;", "bytesReceived", "", "statusCode", "", "error", "(Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBytesReceived", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDuration-FghU774", "()Lkotlin/time/Duration;", "getError", "()Ljava/lang/String;", "getResult", "()Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "component1", "component2", "component3", "component3-FghU774", "component4", "component5", "component6", "copy", "copy-fUqyM7Y", "(Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttemptResult;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/bundle_updater/BundleUpdater$OtaAssetDownloadAttempt;", "equals", "", "other", "", "hashCode", "toNativeMap", "Lcom/facebook/react/bridge/ReadableMap;", "toString", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class OtaAssetDownloadAttempt implements OtaMetric {
        private final Long bytesReceived;
        private final Duration duration;
        private final String error;
        private final OtaAssetDownloadAttemptResult result;
        private final Integer statusCode;
        private final String url;

        private OtaAssetDownloadAttempt(OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, Duration duration, Long l10, Integer num, String str2) {
            this.result = otaAssetDownloadAttemptResult;
            this.url = str;
            this.duration = duration;
            this.bytesReceived = l10;
            this.statusCode = num;
            this.error = str2;
        }

        public  OtaAssetDownloadAttempt(OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, Duration duration, Long l10, Integer num, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(otaAssetDownloadAttemptResult, str, duration, l10, num, str2);
        }

        
        public static  OtaAssetDownloadAttempt m3copyfUqyM7Y$default(OtaAssetDownloadAttempt otaAssetDownloadAttempt, OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, Duration duration, Long l10, Integer num, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                otaAssetDownloadAttemptResult = otaAssetDownloadAttempt.result;
            }
            if ((i10 & 2) != 0) {
                str = otaAssetDownloadAttempt.url;
            }
            if ((i10 & 4) != 0) {
                duration = otaAssetDownloadAttempt.duration;
            }
            if ((i10 & 8) != 0) {
                l10 = otaAssetDownloadAttempt.bytesReceived;
            }
            if ((i10 & 16) != 0) {
                num = otaAssetDownloadAttempt.statusCode;
            }
            if ((i10 & 32) != 0) {
                str2 = otaAssetDownloadAttempt.error;
            }
            return otaAssetDownloadAttempt.m5copyfUqyM7Y(otaAssetDownloadAttemptResult, str, duration, l10, num, str2);
        }

        public final OtaAssetDownloadAttemptResult component1() {
            return this.result;
        }

        public final String component2() {
            return this.url;
        }

        
        public final Duration m4component3FghU774() {
            return this.duration;
        }

        public final Long component4() {
            return this.bytesReceived;
        }

        public final Integer component5() {
            return this.statusCode;
        }

        public final String component6() {
            return this.error;
        }

        
        public final OtaAssetDownloadAttempt m5copyfUqyM7Y(OtaAssetDownloadAttemptResult result, String url, Duration duration, Long l10, Integer num, String str) {
            q.h(result, "result");
            q.h(url, "url");
            return new OtaAssetDownloadAttempt(result, url, duration, l10, num, str, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtaAssetDownloadAttempt)) {
                return false;
            }
            OtaAssetDownloadAttempt otaAssetDownloadAttempt = (OtaAssetDownloadAttempt) obj;
            return this.result == otaAssetDownloadAttempt.result && q.c(this.url, otaAssetDownloadAttempt.url) && q.c(this.duration, otaAssetDownloadAttempt.duration) && q.c(this.bytesReceived, otaAssetDownloadAttempt.bytesReceived) && q.c(this.statusCode, otaAssetDownloadAttempt.statusCode) && q.c(this.error, otaAssetDownloadAttempt.error);
        }

        public final Long getBytesReceived() {
            return this.bytesReceived;
        }

        
        public final Duration m6getDurationFghU774() {
            return this.duration;
        }

        public final String getError() {
            return this.error;
        }

        public final OtaAssetDownloadAttemptResult getResult() {
            return this.result;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((this.result.hashCode() * 31) + this.url.hashCode()) * 31;
            Duration duration = this.duration;
            int i10 = 0;
            int z10 = (hashCode + (duration == null ? 0 : Duration.z(duration.M()))) * 31;
            Long l10 = this.bytesReceived;
            int hashCode2 = (z10 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.statusCode;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.error;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode3 + i10;
        }

        @Override 
        public ReadableMap toNativeMap() {
            Double d10;
            Pair[] pairArr = new Pair[7];
            pairArr[0] = x.a("type", "OtaAssetDownloadAttempt");
            pairArr[1] = x.a("result", this.result.getValue());
            pairArr[2] = x.a("url", this.url);
            pairArr[3] = x.a("bytesReceived", this.bytesReceived);
            Duration duration = this.duration;
            if (duration != null) {
                d10 = Double.valueOf(Duration.H(duration.M(), pi.c.SECONDS));
            } else {
                d10 = null;
            }
            pairArr[4] = x.a("durationSeconds", d10);
            pairArr[5] = x.a("statusCode", this.statusCode);
            pairArr[6] = x.a("error", this.error);
            return NativeMapExtensionsKt.nativeMapOf(pairArr);
        }

        public String toString() {
            OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult = this.result;
            String str = this.url;
            Duration duration = this.duration;
            Long l10 = this.bytesReceived;
            Integer num = this.statusCode;
            String str2 = this.error;
            return "OtaAssetDownloadAttempt(result=" + otaAssetDownloadAttemptResult + ", url=" + str + ", duration=" + duration + ", bytesReceived=" + l10 + ", statusCode=" + num + ", error=" + str2 + ")";
        }

        public  OtaAssetDownloadAttempt(OtaAssetDownloadAttemptResult otaAssetDownloadAttemptResult, String str, Duration duration, Long l10, Integer num, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(otaAssetDownloadAttemptResult, str, (i10 & 4) != 0 ? null : duration, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str2, null);
        }
    }

    
    
     BundleUpdater(android.content.SharedPreferences r1, java.io.File r2, android.content.res.AssetManager r3, java.util.concurrent.ExecutorService r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.BundleUpdater.<init>(android.content.SharedPreferences, java.io.File, android.content.res.AssetManager, java.util.concurrent.ExecutorService, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
