package com.discord.bundle_updater;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.webkit.CookieManager;
import com.discord.client_info.ClientInfo;
import com.discord.crash_reporting.CrashReporting;
import com.discord.logging.Log;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.i;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import nf.n;
import nf.s;
import nf.t;
import nf.x;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import qj.k;
import ri.u;
import ri.v;
import xf.b;
import xf.c;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\u0018\u0000 l2\u00020\u0001:\u0005lmnopB+\b\u0002\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u000202\u0012\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\bj\u0010kJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\"\u0010\u0012\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002Jn\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00022\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\f\u0010\"\u001a\u00020\u0005*\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\nH\u0002J'\u0010&\u001a\u00020\n2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020$\"\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b&\u0010'J&\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\b\b\u0002\u0010(\u001a\u00020\u001b2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010)R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R#\u0010>\u001a\n 9*\u0004\u0018\u000108088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR\u001b\u0010G\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010FR$\u0010J\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR0\u0010N\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\n\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR$\u0010]\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010\\R(\u0010`\u001a\u0004\u0018\u00010\u00022\b\u0010Y\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b^\u0010U\"\u0004\b_\u0010\\R$\u0010c\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010U\"\u0004\bb\u0010\\R\u0014\u0010e\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010LR(\u0010i\u001a\u0004\u0018\u00010\u00052\b\u0010Y\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010F\"\u0004\bg\u0010h\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006q"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater;", "", "", "commit", JSStackTrace.FILE_KEY, "Ljava/io/File;", "otaFile", "otaTempFile", "src", "dst", "", "moveFile", "Lcom/discord/bundle_updater/BundleUpdater$OtaResult;", "downloadManifest", "existingOtaCommit", "Lorg/json/JSONObject;", "newManifestJson", "newOtaCommit", "downloadOtaFiles", "url", "", "Lkotlin/Pair;", "extraHeaders", "hash", "Lcom/discord/bundle_updater/BundleUpdater$Patch;", "patch", "destinationFile", "", "attempt", "Lnf/s;", "Lokhttp3/Headers;", "downloadSingleFile-hUnOzRk", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;", "downloadSingleFile", "ensureEmptyFile", "validateBuildOverrideCookie", "", "knownOtaCommits", "deleteUnknownOtas", "([Ljava/lang/String;)V", "delaySeconds", "Lkotlin/Function0;", "onComplete", "Ljava/util/concurrent/Future;", "checkForUpdate", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "filesDirectory", "Ljava/io/File;", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/content/res/AssetManager;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Landroid/webkit/CookieManager;", "kotlin.jvm.PlatformType", "cookieManager$delegate", "Lkotlin/Lazy;", "getCookieManager", "()Landroid/webkit/CookieManager;", "cookieManager", "Lokhttp3/OkHttpClient;", "client$delegate", "getClient", "()Lokhttp3/OkHttpClient;", "client", "otasRootDirectory$delegate", "getOtasRootDirectory", "()Ljava/io/File;", "otasRootDirectory", "", "<set-?>", "isVersionRequired", "Z", "()Z", "Lkotlin/Function1;", "onBundleDownloadedListener", "Lkotlin/jvm/functions/Function1;", "getOnBundleDownloadedListener", "()Lkotlin/jvm/functions/Function1;", "setOnBundleDownloadedListener", "(Lkotlin/jvm/functions/Function1;)V", "getVersion", "()Ljava/lang/String;", "version", "getManifestURL", "manifestURL", "value", "getManifestETag", "setManifestETag", "(Ljava/lang/String;)V", "manifestETag", "getInProgressOtaCommit", "setInProgressOtaCommit", "inProgressOtaCommit", "getOtaVersion", "setOtaVersion", "otaVersion", "getValidOTAVersion", "validOTAVersion", "getBundleLocation", "setBundleLocation", "(Ljava/io/File;)V", "bundleLocation", "<init>", "(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V", "Companion", "HttpException", "MaxDownloadAttemptsException", "OtaResult", "Patch", "bundle_updater_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BundleUpdater {
    public static final String ANDROID_JS_BUNDLE_ASSET_NAME = "index.android.bundle";
    private static final String BUILD_OVERRIDE_COOKIE = "buildOverride";
    private static final String KEY_ANDROID_JS_BUNDLE = "key_android_js_bundle";
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
    private final Lazy otasRootDirectory$delegate;
    private final SharedPreferences sharedPreferences;
    public static final Companion Companion = new Companion(null);
    private static final Uri BASE_OTA_URL = new Uri.Builder().scheme("https").authority("discord.com").build();
    private static final String TAG = BundleUpdater.class.getSimpleName();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$Companion;", "", "()V", "ANDROID_JS_BUNDLE_ASSET_NAME", "", "BASE_OTA_URL", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "BUILD_OVERRIDE_COOKIE", "KEY_ANDROID_JS_BUNDLE", "KEY_ETAG", "KEY_IN_PROGRESS_OTA_COMMIT", "KEY_OTA_VERSION", "OTAS_DIRECTORY", "TAG", "updater", "Lcom/discord/bundle_updater/BundleUpdater;", "init", "", "context", "Landroid/content/Context;", "instance", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(Context context) {
            q.g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("BundleUpdater", 0);
            q.f(sharedPreferences, "context.getSharedPrefere…r\", Context.MODE_PRIVATE)");
            File filesDir = context.getFilesDir();
            q.f(filesDir, "context.filesDir");
            AssetManager assets = context.getAssets();
            q.f(assets, "context.assets");
            BundleUpdater.updater = new BundleUpdater(sharedPreferences, filesDir, assets, null, 8, null);
        }

        public final BundleUpdater instance() {
            BundleUpdater bundleUpdater = BundleUpdater.updater;
            if (bundleUpdater != null) {
                return bundleUpdater;
            }
            q.y("updater");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$HttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "(I)V", "getStatusCode", "()I", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$MaxDownloadAttemptsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "url", "", "attempts", "", "(Ljava/lang/String;I)V", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MaxDownloadAttemptsException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxDownloadAttemptsException(String url, int i10) {
            super("Failed " + i10 + " times to download " + url + ", aborting...");
            q.g(url, "url");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$OtaResult;", "", "(Ljava/lang/String;I)V", "NOOP", "CLEARED", "SUCCESS", "SUCCESS_WITH_VERSION_REQUIRED", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum OtaResult {
        NOOP,
        CLEARED,
        SUCCESS,
        SUCCESS_WITH_VERSION_REQUIRED
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdater$Patch;", "", "url", "", "baseFilePath", "Ljava/io/File;", "patchPath", "(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "getBaseFilePath", "()Ljava/io/File;", "getPatchPath", "getUrl", "()Ljava/lang/String;", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Patch {
        private final File baseFilePath;
        private final File patchPath;
        private final String url;

        public Patch(String url, File baseFilePath, File patchPath) {
            q.g(url, "url");
            q.g(baseFilePath, "baseFilePath");
            q.g(patchPath, "patchPath");
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
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OtaResult.values().length];
            try {
                iArr[OtaResult.NOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtaResult.CLEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtaResult.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtaResult.SUCCESS_WITH_VERSION_REQUIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AssetStatus.values().length];
            try {
                iArr2[AssetStatus.CopyFromPrevious.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AssetStatus.Download.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private BundleUpdater(SharedPreferences sharedPreferences, File file, AssetManager assetManager, ExecutorService executorService) {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        this.sharedPreferences = sharedPreferences;
        this.filesDirectory = file;
        this.assetManager = assetManager;
        this.executor = executorService;
        a10 = n.a(BundleUpdater$cookieManager$2.INSTANCE);
        this.cookieManager$delegate = a10;
        a11 = n.a(new BundleUpdater$client$2(this));
        this.client$delegate = a11;
        a12 = n.a(new BundleUpdater$otasRootDirectory$2(this));
        this.otasRootDirectory$delegate = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Future checkForUpdate$default(BundleUpdater bundleUpdater, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return bundleUpdater.checkForUpdate(i10, function0);
    }

    public static final void checkForUpdate$lambda$6(int i10, BundleUpdater this$0, Function0 function0) {
        boolean z10;
        q.g(this$0, "this$0");
        Thread.sleep(i10 * 1000);
        try {
            OtaResult downloadManifest = this$0.downloadManifest();
            if (function0 != null) {
                function0.invoke();
            } else {
                int i11 = WhenMappings.$EnumSwitchMapping$0[downloadManifest.ordinal()];
                if (i11 == 3 || i11 == 4) {
                    if (downloadManifest == OtaResult.SUCCESS_WITH_VERSION_REQUIRED) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this$0.isVersionRequired = z10;
                    Function1<? super Boolean, Unit> function1 = this$0.onBundleDownloadedListener;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(z10));
                    }
                }
            }
        } catch (Exception e10) {
            CrashReporting.INSTANCE.captureException(e10);
        }
    }

    private final void deleteUnknownOtas(String... strArr) {
        boolean y10;
        File[] listFiles = getOtasRootDirectory().listFiles();
        if (listFiles != null) {
            for (File child : listFiles) {
                y10 = f.y(strArr, child.getName());
                if (!y10) {
                    CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, TAG + " - Deleting outdated/unknown OTA at " + child.getName() + "...", null, null, 6, null);
                    q.f(child, "child");
                    xf.n.i(child);
                }
            }
        }
    }

    private final OtaResult downloadManifest() {
        String str;
        boolean w10;
        List list;
        List d10;
        String n10;
        List y02;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        String TAG2 = TAG;
        CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Downloading Manifest...", null, null, 6, null);
        validateBuildOverrideCookie();
        File bundleLocation = getBundleLocation();
        if (bundleLocation != null) {
            n10 = xf.n.n(bundleLocation, getOtasRootDirectory());
            y02 = v.y0(n10, new char[]{File.separatorChar}, false, 0, 6, null);
            str = (String) y02.get(0);
        } else {
            str = null;
        }
        if (q.b(str, getInProgressOtaCommit())) {
            setInProgressOtaCommit(null);
        }
        CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Existing OTA commit is " + str + ", in progress OTA commit is " + getInProgressOtaCommit(), null, null, 6, null);
        deleteUnknownOtas(str, getInProgressOtaCommit());
        setOtaVersion(getVersion());
        File otaTempFile = otaTempFile("manifest.json");
        String manifestURL = getManifestURL();
        String manifestETag = getManifestETag();
        w10 = u.w(manifestETag);
        if (!(!w10)) {
            manifestETag = null;
        }
        if (manifestETag != null) {
            d10 = i.d(x.a("If-None-Match", manifestETag));
            list = d10;
        } else {
            list = null;
        }
        Object obj = m1downloadSingleFilehUnOzRk$default(this, manifestURL, list, null, null, otaTempFile, 0, 44, null);
        Throwable e10 = s.e(obj);
        String str2 = "";
        if (e10 == null) {
            Headers headers = (Headers) obj;
            JSONObject jSONFromFile = BundleUpdaterUtils.INSTANCE.getJSONFromFile(otaTempFile);
            String newOtaCommit = jSONFromFile.getJSONObject("metadata").getString("commit");
            if (q.b(newOtaCommit, str)) {
                return OtaResult.NOOP;
            }
            q.f(newOtaCommit, "newOtaCommit");
            moveFile(otaTempFile, otaFile(newOtaCommit, "manifest.json"));
            setInProgressOtaCommit(newOtaCommit);
            String a10 = headers.a("Etag");
            if (a10 != null) {
                str2 = a10;
            }
            setManifestETag(str2);
            Log log = Log.INSTANCE;
            q.f(TAG2, "TAG");
            Log.i$default(log, TAG2, "Setting manifest ETag to " + getManifestETag(), (Throwable) null, 4, (Object) null);
            return downloadOtaFiles(str, jSONFromFile, newOtaCommit);
        }
        q.e(e10, "null cannot be cast to non-null type com.discord.bundle_updater.BundleUpdater.HttpException");
        HttpException httpException = (HttpException) e10;
        int statusCode = httpException.getStatusCode();
        if (statusCode == 304) {
            String inProgressOtaCommit = getInProgressOtaCommit();
            if (inProgressOtaCommit == null) {
                CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Manifest not changed, already up to date at commit " + str, null, null, 6, null);
                return OtaResult.NOOP;
            }
            CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Manifest not changed, resuming download of commit " + inProgressOtaCommit + ".", null, null, 6, null);
            return downloadOtaFiles(str, BundleUpdaterUtils.INSTANCE.getJSONFromFile(otaFile(inProgressOtaCommit, "manifest.json")), inProgressOtaCommit);
        } else if (statusCode == 404) {
            CrashReporting.addBreadcrumb$default(crashReporting, TAG2 + " - Got 404, clearing bundle location...", null, null, 6, null);
            setBundleLocation(null);
            setManifestETag(str2);
            return OtaResult.CLEARED;
        } else {
            throw httpException;
        }
    }

    /* JADX WARN: Finally extract failed */
    private final OtaResult downloadOtaFiles(final String str, JSONObject jSONObject, String str2) {
        JSONObject jSONObject2;
        boolean z10;
        final String D;
        boolean M;
        ArrayList arrayList;
        final String str3;
        boolean z11;
        Patch patch;
        final Patch patch2;
        File file;
        ArrayList arrayList2;
        Patch patch3;
        JSONObject jSONObject3;
        Patch patch4;
        BundleUpdater bundleUpdater = this;
        String str4 = str2;
        JSONObject jSONFromAsset = BundleUpdaterUtilsKt.getJSONFromAsset(bundleUpdater.assetManager, "manifest.json");
        if (str == null || (jSONObject2 = BundleUpdaterUtils.INSTANCE.getJSONFromFile(bundleUpdater.otaFile(str, "manifest.json"))) == null) {
            jSONObject2 = new JSONObject();
        }
        BundleUpdaterUtils bundleUpdaterUtils = BundleUpdaterUtils.INSTANCE;
        JSONObject objectOrNull = BundleUpdaterUtilsKt.getObjectOrNull(jSONFromAsset, "hashes");
        if (objectOrNull == null) {
            objectOrNull = new JSONObject();
        }
        JSONObject objectOrNull2 = BundleUpdaterUtilsKt.getObjectOrNull(jSONObject2, "hashes");
        if (objectOrNull2 == null) {
            objectOrNull2 = new JSONObject();
        }
        JSONObject objectOrNull3 = BundleUpdaterUtilsKt.getObjectOrNull(jSONObject, "hashes");
        if (objectOrNull3 == null) {
            objectOrNull3 = new JSONObject();
        }
        List<Pair<String, AssetStatus>> compareJSONData = bundleUpdaterUtils.compareJSONData(objectOrNull, objectOrNull2, objectOrNull3);
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        CrashReporting.addBreadcrumb$default(crashReporting, TAG + " - Found " + compareJSONData.size() + " files to copy or download...", null, null, 6, null);
        if (compareJSONData.isEmpty()) {
            CrashReporting.addBreadcrumb$default(crashReporting, "No files downloaded, returning...", null, null, 6, null);
            return OtaResult.NOOP;
        }
        JSONObject objectOrNull4 = BundleUpdaterUtilsKt.getObjectOrNull(jSONObject, "metadata");
        boolean z12 = false;
        if (objectOrNull4 != null) {
            z10 = objectOrNull4.getBoolean("confirm_update");
        } else {
            z10 = false;
        }
        JSONObject objectOrNull5 = BundleUpdaterUtilsKt.getObjectOrNull(jSONObject, "patches");
        if (objectOrNull5 == null) {
            objectOrNull5 = new JSONObject();
        }
        JSONObject jSONObject4 = objectOrNull5;
        final JSONObject jSONObject5 = jSONObject.getJSONObject("hashes");
        Uri build = BASE_OTA_URL.buildUpon().appendPath("assets").appendPath("android").appendPath(str4).build();
        ArrayList<Future> arrayList3 = new ArrayList();
        Iterator<T> it = compareJSONData.iterator();
        Patch patch5 = null;
        File file2 = null;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str5 = (String) pair.a();
            final AssetStatus assetStatus = (AssetStatus) pair.b();
            D = u.D(str5, "/res/", "/assets/", false, 4, null);
            final Uri build2 = build.buildUpon().appendEncodedPath(str5).build();
            M = v.M(str5, ANDROID_JS_BUNDLE_ASSET_NAME, z12, 2, patch5);
            String stringOrNull = BundleUpdaterUtilsKt.getStringOrNull(jSONObject4, str5);
            if (stringOrNull != null) {
                if (M) {
                    File otaTempFile = bundleUpdater.otaTempFile(D + ".base");
                    File otaTempFile2 = bundleUpdater.otaTempFile(D + ".patch");
                    InputStream bundleStream = bundleUpdater.assetManager.open(ANDROID_JS_BUNDLE_ASSET_NAME);
                    try {
                        str3 = str5;
                        FileOutputStream fileOutputStream = new FileOutputStream(bundleUpdater.ensureEmptyFile(otaTempFile));
                        q.f(bundleStream, "bundleStream");
                        arrayList = arrayList3;
                        z11 = z10;
                        patch = null;
                        b.b(bundleStream, fileOutputStream, 0, 2, null);
                        c.a(fileOutputStream, null);
                        c.a(bundleStream, null);
                        String uri = build.buildUpon().appendEncodedPath(stringOrNull).build().toString();
                        q.f(uri, "baseFileURL.buildUpon().…th(it).build().toString()");
                        patch4 = new Patch(uri, otaTempFile, otaTempFile2);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            c.a(bundleStream, th2);
                            throw th3;
                        }
                    }
                } else {
                    str3 = str5;
                    arrayList = arrayList3;
                    z11 = z10;
                    patch = patch5;
                    patch4 = patch;
                }
                patch2 = patch4;
            } else {
                str3 = str5;
                arrayList = arrayList3;
                z11 = z10;
                patch = patch5;
                patch2 = patch;
            }
            final File otaTempFile3 = bundleUpdater.otaTempFile(D);
            final File otaFile = bundleUpdater.otaFile(str4, D);
            if (M) {
                file = otaFile;
            } else {
                file = file2;
            }
            if (otaFile.exists()) {
                arrayList2 = arrayList;
                patch3 = patch;
                jSONObject3 = jSONObject4;
            } else {
                arrayList2 = arrayList;
                jSONObject3 = jSONObject4;
                patch3 = bundleUpdater.executor.submit(new Runnable() { // from class: com.discord.bundle_updater.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BundleUpdater.downloadOtaFiles$lambda$17$lambda$16(AssetStatus.this, this, str, D, otaTempFile3, build2, jSONObject5, str3, patch2, otaFile);
                    }
                });
            }
            if (patch3 != null) {
                arrayList2.add(patch3);
            }
            bundleUpdater = this;
            jSONObject4 = jSONObject3;
            arrayList3 = arrayList2;
            z10 = z11;
            file2 = file;
            patch5 = null;
            z12 = false;
            str4 = str2;
        }
        for (Future future : arrayList3) {
            future.get();
        }
        setBundleLocation(file2);
        setInProgressOtaCommit(null);
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, TAG + " - Done downloading OTA...", null, null, 6, null);
        if (z10) {
            return OtaResult.SUCCESS_WITH_VERSION_REQUIRED;
        }
        return OtaResult.SUCCESS;
    }

    public static final void downloadOtaFiles$lambda$17$lambda$16(AssetStatus assetStatus, BundleUpdater this$0, String str, String localFileString, File tempAsset, Uri uri, JSONObject jSONObject, String fileString, Patch patch, File dstAsset) {
        q.g(assetStatus, "$assetStatus");
        q.g(this$0, "this$0");
        q.g(localFileString, "$localFileString");
        q.g(tempAsset, "$tempAsset");
        q.g(fileString, "$fileString");
        q.g(dstAsset, "$dstAsset");
        int i10 = WhenMappings.$EnumSwitchMapping$1[assetStatus.ordinal()];
        if (i10 == 1) {
            q.d(str);
            xf.n.h(this$0.otaFile(str, localFileString), tempAsset, true, 0, 4, null);
        } else if (i10 == 2) {
            String uri2 = uri.toString();
            q.f(uri2, "url.toString()");
            t.b(m1downloadSingleFilehUnOzRk$default(this$0, uri2, null, jSONObject.getString(fileString), patch, tempAsset, 0, 34, null));
        }
        this$0.moveFile(tempAsset, dstAsset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
        if (r0 == null) goto L_0x0126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bb, code lost:
        if (kotlin.jvm.internal.q.b(r26, com.discord.bundle_updater.BundleUpdaterUtils.INSTANCE.md5(r28)) != false) goto L_0x01bd;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: downloadSingleFile-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m0downloadSingleFilehUnOzRk(java.lang.String r24, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r25, java.lang.String r26, com.discord.bundle_updater.BundleUpdater.Patch r27, java.io.File r28, int r29) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.BundleUpdater.m0downloadSingleFilehUnOzRk(java.lang.String, java.util.List, java.lang.String, com.discord.bundle_updater.BundleUpdater$Patch, java.io.File, int):java.lang.Object");
    }

    /* renamed from: downloadSingleFile-hUnOzRk$default */
    static /* synthetic */ Object m1downloadSingleFilehUnOzRk$default(BundleUpdater bundleUpdater, String str, List list, String str2, Patch patch, File file, int i10, int i11, Object obj) {
        return bundleUpdater.m0downloadSingleFilehUnOzRk(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : patch, file, (i11 & 32) != 0 ? 0 : i10);
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
            k10 = of.v.k(pairArr);
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

    private final String getInProgressOtaCommit() {
        return this.sharedPreferences.getString(KEY_IN_PROGRESS_OTA_COMMIT, null);
    }

    private final String getManifestURL() {
        String uri = BASE_OTA_URL.buildUpon().appendPath("android").appendPath(getVersion()).appendPath("manifest.json").build().toString();
        q.f(uri, "BASE_OTA_URL\n           …)\n            .toString()");
        return uri;
    }

    private final File getOtasRootDirectory() {
        return (File) this.otasRootDirectory$delegate.getValue();
    }

    private final boolean getValidOTAVersion() {
        return q.b(getOtaVersion(), getVersion());
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
        q.f(editor, "editor");
        editor.putString(KEY_IN_PROGRESS_OTA_COMMIT, str);
        editor.apply();
    }

    private final void setManifestETag(String str) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.f(editor, "editor");
        editor.putString(KEY_ETAG, str);
        editor.apply();
    }

    private final void setOtaVersion(String str) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.f(editor, "editor");
        editor.putString(KEY_OTA_VERSION, str);
        editor.apply();
    }

    private final void validateBuildOverrideCookie() {
        String e02;
        if (getCookieManager().hasCookies()) {
            CookieManager cookieManager = getCookieManager();
            q.f(cookieManager, "cookieManager");
            String uri = BASE_OTA_URL.toString();
            q.f(uri, "BASE_OTA_URL.toString()");
            List<k> cookiesForUrl = CookieValidatorKt.getCookiesForUrl(cookieManager, uri);
            ArrayList arrayList = new ArrayList();
            for (k kVar : cookiesForUrl) {
                if (q.b(kVar.e(), BUILD_OVERRIDE_COOKIE) && !CookieValidatorKt.validateBuildOverrideCookie(kVar.g(), getVersion())) {
                    kVar = null;
                }
                if (kVar != null) {
                    arrayList.add(kVar);
                }
            }
            e02 = r.e0(arrayList, "; ", null, null, 0, null, null, 62, null);
            getCookieManager().setCookie(BASE_OTA_URL.toString(), e02);
        }
    }

    public final Future<?> checkForUpdate(final int i10, final Function0<Unit> function0) {
        Future<?> submit = this.executor.submit(new Runnable() { // from class: com.discord.bundle_updater.b
            @Override // java.lang.Runnable
            public final void run() {
                BundleUpdater.checkForUpdate$lambda$6(i10, this, function0);
            }
        });
        q.f(submit, "executor.submit {\n      …)\n            }\n        }");
        return submit;
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

    public final String getOtaVersion() {
        String string = this.sharedPreferences.getString(KEY_OTA_VERSION, "");
        return string == null ? "" : string;
    }

    public final boolean isVersionRequired() {
        return this.isVersionRequired;
    }

    public final void setBundleLocation(File file) {
        String str;
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        q.f(editor, "editor");
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ BundleUpdater(android.content.SharedPreferences r1, java.io.File r2, android.content.res.AssetManager r3, java.util.concurrent.ExecutorService r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L_0x000e
            r4 = 5
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newFixedThreadPool(r4)
            java.lang.String r5 = "newFixedThreadPool(5)"
            kotlin.jvm.internal.q.f(r4, r5)
        L_0x000e:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.bundle_updater.BundleUpdater.<init>(android.content.SharedPreferences, java.io.File, android.content.res.AssetManager, java.util.concurrent.ExecutorService, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}