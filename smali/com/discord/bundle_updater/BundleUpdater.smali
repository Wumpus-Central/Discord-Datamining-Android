.class public final Lcom/discord/bundle_updater/BundleUpdater;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/bundle_updater/BundleUpdater$Companion;,
        Lcom/discord/bundle_updater/BundleUpdater$HttpException;,
        Lcom/discord/bundle_updater/BundleUpdater$MaxDownloadAttemptsException;,
        Lcom/discord/bundle_updater/BundleUpdater$OtaResult;,
        Lcom/discord/bundle_updater/BundleUpdater$Patch;,
        Lcom/discord/bundle_updater/BundleUpdater$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008$\u0018\u0000 l2\u00020\u0001:\u0005lmnopB+\u0008\u0002\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u000202\u0012\u0008\u0008\u0002\u00106\u001a\u000205\u00a2\u0006\u0004\u0008j\u0010kJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0002J\"\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002Jn\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0013\u001a\u00020\u00022\u001c\u0008\u0002\u0010\u0016\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0018\u00010\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001bH\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000c\u0010\"\u001a\u00020\u0005*\u00020\u0005H\u0002J\u0008\u0010#\u001a\u00020\nH\u0002J\'\u0010&\u001a\u00020\n2\u0016\u0010%\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00020$\"\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J&\u0010,\u001a\u0006\u0012\u0002\u0008\u00030+2\u0008\u0008\u0002\u0010(\u001a\u00020\u001b2\u0010\u0008\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010)R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R#\u0010>\u001a\n 9*\u0004\u0018\u000108088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010;\u001a\u0004\u0008A\u0010BR\u001b\u0010G\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u0010;\u001a\u0004\u0008E\u0010FR$\u0010J\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008J\u0010K\u001a\u0004\u0008J\u0010LR0\u0010N\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\n\u0018\u00010M8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR\u0014\u0010V\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0014\u0010X\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010UR$\u0010]\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00028F@BX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Z\u0010U\"\u0004\u0008[\u0010\\R(\u0010`\u001a\u0004\u0018\u00010\u00022\u0008\u0010Y\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008^\u0010U\"\u0004\u0008_\u0010\\R$\u0010c\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00028F@BX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008a\u0010U\"\u0004\u0008b\u0010\\R\u0014\u0010e\u001a\u00020H8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010LR(\u0010i\u001a\u0004\u0018\u00010\u00052\u0008\u0010Y\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008f\u0010F\"\u0004\u0008g\u0010h\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006q"
    }
    d2 = {
        "Lcom/discord/bundle_updater/BundleUpdater;",
        "",
        "",
        "commit",
        "file",
        "Ljava/io/File;",
        "otaFile",
        "otaTempFile",
        "src",
        "dst",
        "",
        "moveFile",
        "Lcom/discord/bundle_updater/BundleUpdater$OtaResult;",
        "downloadManifest",
        "existingOtaCommit",
        "Lorg/json/JSONObject;",
        "newManifestJson",
        "newOtaCommit",
        "downloadOtaFiles",
        "url",
        "",
        "Lkotlin/Pair;",
        "extraHeaders",
        "hash",
        "Lcom/discord/bundle_updater/BundleUpdater$Patch;",
        "patch",
        "destinationFile",
        "",
        "attempt",
        "Llf/s;",
        "Lokhttp3/Headers;",
        "downloadSingleFile-hUnOzRk",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;",
        "downloadSingleFile",
        "ensureEmptyFile",
        "validateBuildOverrideCookie",
        "",
        "knownOtaCommits",
        "deleteUnknownOtas",
        "([Ljava/lang/String;)V",
        "delaySeconds",
        "Lkotlin/Function0;",
        "onComplete",
        "Ljava/util/concurrent/Future;",
        "checkForUpdate",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Landroid/content/SharedPreferences;",
        "filesDirectory",
        "Ljava/io/File;",
        "Landroid/content/res/AssetManager;",
        "assetManager",
        "Landroid/content/res/AssetManager;",
        "Ljava/util/concurrent/ExecutorService;",
        "executor",
        "Ljava/util/concurrent/ExecutorService;",
        "Landroid/webkit/CookieManager;",
        "kotlin.jvm.PlatformType",
        "cookieManager$delegate",
        "Lkotlin/Lazy;",
        "getCookieManager",
        "()Landroid/webkit/CookieManager;",
        "cookieManager",
        "Lokhttp3/OkHttpClient;",
        "client$delegate",
        "getClient",
        "()Lokhttp3/OkHttpClient;",
        "client",
        "otasRootDirectory$delegate",
        "getOtasRootDirectory",
        "()Ljava/io/File;",
        "otasRootDirectory",
        "",
        "<set-?>",
        "isVersionRequired",
        "Z",
        "()Z",
        "Lkotlin/Function1;",
        "onBundleDownloadedListener",
        "Lkotlin/jvm/functions/Function1;",
        "getOnBundleDownloadedListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnBundleDownloadedListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "getVersion",
        "()Ljava/lang/String;",
        "version",
        "getManifestURL",
        "manifestURL",
        "value",
        "getManifestETag",
        "setManifestETag",
        "(Ljava/lang/String;)V",
        "manifestETag",
        "getInProgressOtaCommit",
        "setInProgressOtaCommit",
        "inProgressOtaCommit",
        "getOtaVersion",
        "setOtaVersion",
        "otaVersion",
        "getValidOTAVersion",
        "validOTAVersion",
        "getBundleLocation",
        "setBundleLocation",
        "(Ljava/io/File;)V",
        "bundleLocation",
        "<init>",
        "(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V",
        "Companion",
        "HttpException",
        "MaxDownloadAttemptsException",
        "OtaResult",
        "Patch",
        "bundle_updater_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final ANDROID_JS_BUNDLE_ASSET_NAME:Ljava/lang/String; = "index.android.bundle"

.field private static final BASE_OTA_URL:Landroid/net/Uri;

.field private static final BUILD_OVERRIDE_COOKIE:Ljava/lang/String; = "buildOverride"

.field public static final Companion:Lcom/discord/bundle_updater/BundleUpdater$Companion;

.field private static final KEY_ANDROID_JS_BUNDLE:Ljava/lang/String; = "key_android_js_bundle"

.field private static final KEY_ETAG:Ljava/lang/String; = "e_tag"

.field private static final KEY_IN_PROGRESS_OTA_COMMIT:Ljava/lang/String; = "in_progress_ota_commit"

.field private static final KEY_OTA_VERSION:Ljava/lang/String; = "ota_version"

.field private static final OTAS_DIRECTORY:Ljava/lang/String; = "otas"

.field private static final TAG:Ljava/lang/String;

.field private static updater:Lcom/discord/bundle_updater/BundleUpdater;


# instance fields
.field private final assetManager:Landroid/content/res/AssetManager;

.field private final client$delegate:Lkotlin/Lazy;

.field private final cookieManager$delegate:Lkotlin/Lazy;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private final filesDirectory:Ljava/io/File;

.field private isVersionRequired:Z

.field private onBundleDownloadedListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final otasRootDirectory$delegate:Lkotlin/Lazy;

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/bundle_updater/BundleUpdater$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/bundle_updater/BundleUpdater$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/bundle_updater/BundleUpdater;->Companion:Lcom/discord/bundle_updater/BundleUpdater$Companion;

    .line 8
    .line 9
    new-instance v0, Landroid/net/Uri$Builder;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "https"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "discord.com"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/discord/bundle_updater/BundleUpdater;->BASE_OTA_URL:Landroid/net/Uri;

    .line 31
    .line 32
    const-class v0, Lcom/discord/bundle_updater/BundleUpdater;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method private constructor <init>(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 3
    iput-object p2, p0, Lcom/discord/bundle_updater/BundleUpdater;->filesDirectory:Ljava/io/File;

    .line 4
    iput-object p3, p0, Lcom/discord/bundle_updater/BundleUpdater;->assetManager:Landroid/content/res/AssetManager;

    .line 5
    iput-object p4, p0, Lcom/discord/bundle_updater/BundleUpdater;->executor:Ljava/util/concurrent/ExecutorService;

    .line 6
    sget-object p1, Lcom/discord/bundle_updater/BundleUpdater$cookieManager$2;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdater$cookieManager$2;

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater;->cookieManager$delegate:Lkotlin/Lazy;

    .line 7
    new-instance p1, Lcom/discord/bundle_updater/BundleUpdater$client$2;

    invoke-direct {p1, p0}, Lcom/discord/bundle_updater/BundleUpdater$client$2;-><init>(Lcom/discord/bundle_updater/BundleUpdater;)V

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater;->client$delegate:Lkotlin/Lazy;

    .line 8
    new-instance p1, Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;

    invoke-direct {p1, p0}, Lcom/discord/bundle_updater/BundleUpdater$otasRootDirectory$2;-><init>(Lcom/discord/bundle_updater/BundleUpdater;)V

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater;->otasRootDirectory$delegate:Lkotlin/Lazy;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x5

    .line 9
    invoke-static {p4}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    const-string p5, "newFixedThreadPool(5)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/bundle_updater/BundleUpdater;-><init>(Landroid/content/SharedPreferences;Ljava/io/File;Landroid/content/res/AssetManager;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static synthetic a(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/bundle_updater/BundleUpdater;->checkForUpdate$lambda$6(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$getCookieManager(Lcom/discord/bundle_updater/BundleUpdater;)Landroid/webkit/CookieManager;
    .locals 0

    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFilesDirectory$p(Lcom/discord/bundle_updater/BundleUpdater;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/discord/bundle_updater/BundleUpdater;->filesDirectory:Ljava/io/File;

    return-object p0
.end method

.method public static final synthetic access$getUpdater$cp()Lcom/discord/bundle_updater/BundleUpdater;
    .locals 1

    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater;->updater:Lcom/discord/bundle_updater/BundleUpdater;

    return-object v0
.end method

.method public static final synthetic access$setUpdater$cp(Lcom/discord/bundle_updater/BundleUpdater;)V
    .locals 0

    sput-object p0, Lcom/discord/bundle_updater/BundleUpdater;->updater:Lcom/discord/bundle_updater/BundleUpdater;

    return-void
.end method

.method public static synthetic b(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/discord/bundle_updater/BundleUpdater;->downloadOtaFiles$lambda$17$lambda$16(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V

    return-void
.end method

.method public static synthetic checkForUpdate$default(Lcom/discord/bundle_updater/BundleUpdater;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/bundle_updater/BundleUpdater;->checkForUpdate(ILkotlin/jvm/functions/Function0;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private static final checkForUpdate$lambda$6(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    int-to-long v0, p0

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    mul-long/2addr v0, v2

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-direct {p1}, Lcom/discord/bundle_updater/BundleUpdater;->downloadManifest()Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    sget-object p2, Lcom/discord/bundle_updater/BundleUpdater$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    aget p2, p2, v0

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-eq p2, v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    if-eq p2, v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sget-object p2, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->SUCCESS_WITH_VERSION_REQUIRED:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 39
    .line 40
    if-ne p0, p2, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    :goto_0
    iput-boolean p0, p1, Lcom/discord/bundle_updater/BundleUpdater;->isVersionRequired:Z

    .line 46
    .line 47
    iget-object p1, p1, Lcom/discord/bundle_updater/BundleUpdater;->onBundleDownloadedListener:Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception p0

    .line 60
    sget-object p1, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method private final varargs deleteUnknownOtas([Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getOtasRootDirectory()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {p1, v4}, Lkotlin/collections/b;->y([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    sget-object v5, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 28
    .line 29
    sget-object v4, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    new-instance v7, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, " - Deleting outdated/unknown OTA at "

    .line 44
    .line 45
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, "..."

    .line 52
    .line 53
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x6

    .line 63
    const/4 v10, 0x0

    .line 64
    invoke-static/range {v5 .. v10}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string v4, "child"

    .line 68
    .line 69
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, Lvf/j;->i(Ljava/io/File;)Z

    .line 73
    .line 74
    .line 75
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private final downloadManifest()Lcom/discord/bundle_updater/BundleUpdater$OtaResult;
    .locals 19

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    sget-object v10, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 4
    .line 5
    sget-object v11, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " - Downloading Manifest..."

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x6

    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v0, v10

    .line 29
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->validateBuildOverrideCookie()V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getBundleLocation()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x1

    .line 41
    const/4 v12, 0x0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getOtasRootDirectory()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v0, v1}, Lvf/j;->n(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    new-array v14, v7, [C

    .line 53
    .line 54
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 55
    .line 56
    aput-char v0, v14, v6

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    const/16 v17, 0x6

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    invoke-static/range {v13 .. v18}, Lpi/l;->y0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/String;

    .line 74
    .line 75
    move-object v13, v0

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move-object v13, v12

    .line 78
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getInProgressOtaCommit()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-direct {v9, v12}, Lcom/discord/bundle_updater/BundleUpdater;->setInProgressOtaCommit(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getInProgressOtaCommit()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, " - Existing OTA commit is "

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v2, ", in progress OTA commit is "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const/4 v2, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x6

    .line 126
    const/4 v5, 0x0

    .line 127
    move-object v0, v10

    .line 128
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x2

    .line 132
    new-array v0, v0, [Ljava/lang/String;

    .line 133
    .line 134
    aput-object v13, v0, v6

    .line 135
    .line 136
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getInProgressOtaCommit()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    aput-object v1, v0, v7

    .line 141
    .line 142
    invoke-direct {v9, v0}, Lcom/discord/bundle_updater/BundleUpdater;->deleteUnknownOtas([Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getVersion()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {v9, v0}, Lcom/discord/bundle_updater/BundleUpdater;->setOtaVersion(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v14, "manifest.json"

    .line 153
    .line 154
    invoke-direct {v9, v14}, Lcom/discord/bundle_updater/BundleUpdater;->otaTempFile(Ljava/lang/String;)Ljava/io/File;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getManifestURL()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getManifestETag()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    xor-int/2addr v2, v7

    .line 171
    if-eqz v2, :cond_2

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    move-object v0, v12

    .line 175
    :goto_1
    if-eqz v0, :cond_3

    .line 176
    .line 177
    const-string v2, "If-None-Match"

    .line 178
    .line 179
    invoke-static {v2, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object v2, v0

    .line 188
    goto :goto_2

    .line 189
    :cond_3
    move-object v2, v12

    .line 190
    :goto_2
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v6, 0x0

    .line 193
    const/16 v7, 0x2c

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    move-object/from16 v0, p0

    .line 197
    .line 198
    move-object v5, v15

    .line 199
    invoke-static/range {v0 .. v8}, Lcom/discord/bundle_updater/BundleUpdater;->downloadSingleFile-hUnOzRk$default(Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;IILjava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Llf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    const-string v6, ""

    .line 208
    .line 209
    if-nez v1, :cond_6

    .line 210
    .line 211
    check-cast v0, Lokhttp3/Headers;

    .line 212
    .line 213
    sget-object v1, Lcom/discord/bundle_updater/BundleUpdaterUtils;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdaterUtils;

    .line 214
    .line 215
    invoke-virtual {v1, v15}, Lcom/discord/bundle_updater/BundleUpdaterUtils;->getJSONFromFile(Ljava/io/File;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    const-string v1, "metadata"

    .line 220
    .line 221
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const-string v2, "commit"

    .line 226
    .line 227
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-static {v8, v13}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_4

    .line 236
    .line 237
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->NOOP:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 238
    .line 239
    return-object v0

    .line 240
    :cond_4
    const-string v1, "newOtaCommit"

    .line 241
    .line 242
    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v9, v8, v14}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-direct {v9, v15, v1}, Lcom/discord/bundle_updater/BundleUpdater;->moveFile(Ljava/io/File;Ljava/io/File;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v9, v8}, Lcom/discord/bundle_updater/BundleUpdater;->setInProgressOtaCommit(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-string v1, "Etag"

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-nez v0, :cond_5

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_5
    move-object v6, v0

    .line 265
    :goto_3
    invoke-direct {v9, v6}, Lcom/discord/bundle_updater/BundleUpdater;->setManifestETag(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 269
    .line 270
    const-string v1, "TAG"

    .line 271
    .line 272
    invoke-static {v11, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getManifestETag()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    new-instance v2, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v3, "Setting manifest ETag to "

    .line 285
    .line 286
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const/4 v3, 0x0

    .line 297
    const/4 v4, 0x4

    .line 298
    const/4 v5, 0x0

    .line 299
    move-object v1, v11

    .line 300
    invoke-static/range {v0 .. v5}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v9, v13, v7, v8}, Lcom/discord/bundle_updater/BundleUpdater;->downloadOtaFiles(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    return-object v0

    .line 308
    :cond_6
    const-string v0, "null cannot be cast to non-null type com.discord.bundle_updater.BundleUpdater.HttpException"

    .line 309
    .line 310
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    check-cast v1, Lcom/discord/bundle_updater/BundleUpdater$HttpException;

    .line 314
    .line 315
    invoke-virtual {v1}, Lcom/discord/bundle_updater/BundleUpdater$HttpException;->getStatusCode()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    const/16 v2, 0x130

    .line 320
    .line 321
    if-eq v0, v2, :cond_8

    .line 322
    .line 323
    const/16 v2, 0x194

    .line 324
    .line 325
    if-ne v0, v2, :cond_7

    .line 326
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v1, " - Got 404, clearing bundle location..."

    .line 336
    .line 337
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    const/4 v2, 0x0

    .line 345
    const/4 v3, 0x0

    .line 346
    const/4 v4, 0x6

    .line 347
    const/4 v5, 0x0

    .line 348
    move-object v0, v10

    .line 349
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v9, v12}, Lcom/discord/bundle_updater/BundleUpdater;->setBundleLocation(Ljava/io/File;)V

    .line 353
    .line 354
    .line 355
    invoke-direct {v9, v6}, Lcom/discord/bundle_updater/BundleUpdater;->setManifestETag(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->CLEARED:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_7
    throw v1

    .line 362
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getInProgressOtaCommit()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    if-nez v6, :cond_9

    .line 367
    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v1, " - Manifest not changed, already up to date at commit "

    .line 377
    .line 378
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    const/4 v2, 0x0

    .line 389
    const/4 v3, 0x0

    .line 390
    const/4 v4, 0x6

    .line 391
    const/4 v5, 0x0

    .line 392
    move-object v0, v10

    .line 393
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->NOOP:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v1, " - Manifest not changed, resuming download of commit "

    .line 408
    .line 409
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v1, "."

    .line 416
    .line 417
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    const/4 v2, 0x0

    .line 425
    const/4 v3, 0x0

    .line 426
    const/4 v4, 0x6

    .line 427
    const/4 v5, 0x0

    .line 428
    move-object v0, v10

    .line 429
    invoke-static/range {v0 .. v5}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v9, v6, v14}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    sget-object v1, Lcom/discord/bundle_updater/BundleUpdaterUtils;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdaterUtils;

    .line 437
    .line 438
    invoke-virtual {v1, v0}, Lcom/discord/bundle_updater/BundleUpdaterUtils;->getJSONFromFile(Ljava/io/File;)Lorg/json/JSONObject;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-direct {v9, v13, v0, v6}, Lcom/discord/bundle_updater/BundleUpdater;->downloadOtaFiles(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    :goto_4
    return-object v0
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private final downloadOtaFiles(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/discord/bundle_updater/BundleUpdater$OtaResult;
    .locals 25

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-object/from16 v13, p3

    .line 8
    .line 9
    iget-object v2, v12, Lcom/discord/bundle_updater/BundleUpdater;->assetManager:Landroid/content/res/AssetManager;

    .line 10
    .line 11
    const-string v3, "manifest.json"

    .line 12
    .line 13
    invoke-static {v2, v3}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getJSONFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v4, Lcom/discord/bundle_updater/BundleUpdaterUtils;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdaterUtils;

    .line 20
    .line 21
    invoke-direct {v12, v0, v3}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v4, v3}, Lcom/discord/bundle_updater/BundleUpdaterUtils;->getJSONFromFile(Ljava/io/File;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object v4, Lcom/discord/bundle_updater/BundleUpdaterUtils;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdaterUtils;

    .line 37
    .line 38
    const-string v5, "hashes"

    .line 39
    .line 40
    invoke-static {v2, v5}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getObjectOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    new-instance v2, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-static {v3, v5}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getObjectOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    new-instance v3, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-static {v1, v5}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getObjectOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-nez v6, :cond_4

    .line 67
    .line 68
    new-instance v6, Lorg/json/JSONObject;

    .line 69
    .line 70
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {v4, v2, v3, v6}, Lcom/discord/bundle_updater/BundleUpdaterUtils;->compareJSONData(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v3, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 78
    .line 79
    sget-object v4, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v4, " - Found "

    .line 94
    .line 95
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v4, " files to copy or download..."

    .line 102
    .line 103
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x6

    .line 113
    const/4 v11, 0x0

    .line 114
    move-object v6, v3

    .line 115
    invoke-static/range {v6 .. v11}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    const-string v7, "No files downloaded, returning..."

    .line 125
    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x6

    .line 129
    const/4 v11, 0x0

    .line 130
    move-object v6, v3

    .line 131
    invoke-static/range {v6 .. v11}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->NOOP:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_5
    const-string v3, "metadata"

    .line 138
    .line 139
    invoke-static {v1, v3}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getObjectOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const/4 v14, 0x0

    .line 144
    if-eqz v3, :cond_6

    .line 145
    .line 146
    const-string v4, "confirm_update"

    .line 147
    .line 148
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    move v15, v3

    .line 153
    goto :goto_0

    .line 154
    :cond_6
    move v15, v14

    .line 155
    :goto_0
    const-string v3, "patches"

    .line 156
    .line 157
    invoke-static {v1, v3}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getObjectOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    if-nez v3, :cond_7

    .line 162
    .line 163
    new-instance v3, Lorg/json/JSONObject;

    .line 164
    .line 165
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 166
    .line 167
    .line 168
    :cond_7
    move-object v11, v3

    .line 169
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    sget-object v1, Lcom/discord/bundle_updater/BundleUpdater;->BASE_OTA_URL:Landroid/net/Uri;

    .line 174
    .line 175
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v3, "assets"

    .line 180
    .line 181
    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const-string v3, "android"

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1, v13}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 196
    .line 197
    .line 198
    move-result-object v17

    .line 199
    new-instance v10, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v18

    .line 208
    const/4 v9, 0x0

    .line 209
    move-object v1, v9

    .line 210
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_d

    .line 215
    .line 216
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Lkotlin/Pair;

    .line 221
    .line 222
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    move-object v8, v3

    .line 227
    check-cast v8, Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, Lcom/discord/bundle_updater/AssetStatus;

    .line 234
    .line 235
    const-string v20, "/res/"

    .line 236
    .line 237
    const-string v21, "/assets/"

    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    const/16 v23, 0x4

    .line 242
    .line 243
    const/16 v24, 0x0

    .line 244
    .line 245
    move-object/from16 v19, v8

    .line 246
    .line 247
    invoke-static/range {v19 .. v24}, Lpi/l;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v3, v8}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    const-string v3, "index.android.bundle"

    .line 264
    .line 265
    const/4 v4, 0x2

    .line 266
    invoke-static {v8, v3, v14, v4, v9}, Lpi/l;->M(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    invoke-static {v11, v8}, Lcom/discord/bundle_updater/BundleUpdaterUtilsKt;->getStringOrNull(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    if-eqz v4, :cond_9

    .line 275
    .line 276
    if-eqz v6, :cond_8

    .line 277
    .line 278
    new-instance v9, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v14, ".base"

    .line 287
    .line 288
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-direct {v12, v9}, Lcom/discord/bundle_updater/BundleUpdater;->otaTempFile(Ljava/lang/String;)Ljava/io/File;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    new-instance v14, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v0, ".patch"

    .line 308
    .line 309
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-direct {v12, v0}, Lcom/discord/bundle_updater/BundleUpdater;->otaTempFile(Ljava/lang/String;)Ljava/io/File;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v14, v12, Lcom/discord/bundle_updater/BundleUpdater;->assetManager:Landroid/content/res/AssetManager;

    .line 321
    .line 322
    invoke-virtual {v14, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    :try_start_0
    new-instance v14, Ljava/io/FileOutputStream;

    .line 327
    .line 328
    move-object/from16 v21, v8

    .line 329
    .line 330
    invoke-direct {v12, v9}, Lcom/discord/bundle_updater/BundleUpdater;->ensureEmptyFile(Ljava/io/File;)Ljava/io/File;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-direct {v14, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 335
    .line 336
    .line 337
    :try_start_1
    const-string v8, "bundleStream"

    .line 338
    .line 339
    invoke-static {v3, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    move-object/from16 p2, v10

    .line 343
    .line 344
    move/from16 v19, v15

    .line 345
    .line 346
    const/4 v8, 0x2

    .line 347
    const/4 v10, 0x0

    .line 348
    const/4 v15, 0x0

    .line 349
    invoke-static {v3, v14, v15, v8, v10}, Lvf/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 350
    .line 351
    .line 352
    :try_start_2
    invoke-static {v14, v10}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 353
    .line 354
    .line 355
    invoke-static {v3, v10}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 356
    .line 357
    .line 358
    new-instance v3, Lcom/discord/bundle_updater/BundleUpdater$Patch;

    .line 359
    .line 360
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    invoke-virtual {v8, v4}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    const-string v8, "baseFileURL.buildUpon().\u2026th(it).build().toString()"

    .line 377
    .line 378
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-direct {v3, v4, v9, v0}, Lcom/discord/bundle_updater/BundleUpdater$Patch;-><init>(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V

    .line 382
    .line 383
    .line 384
    goto :goto_2

    .line 385
    :catchall_0
    move-exception v0

    .line 386
    move-object v1, v0

    .line 387
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 388
    :catchall_1
    move-exception v0

    .line 389
    move-object v2, v0

    .line 390
    :try_start_4
    invoke-static {v14, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 394
    :catchall_2
    move-exception v0

    .line 395
    move-object v1, v0

    .line 396
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 397
    :catchall_3
    move-exception v0

    .line 398
    move-object v2, v0

    .line 399
    invoke-static {v3, v1}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    throw v2

    .line 403
    :cond_8
    move-object/from16 v21, v8

    .line 404
    .line 405
    move-object/from16 p2, v10

    .line 406
    .line 407
    move/from16 v19, v15

    .line 408
    .line 409
    move-object v10, v9

    .line 410
    move v15, v14

    .line 411
    move-object v3, v10

    .line 412
    :goto_2
    move-object v0, v3

    .line 413
    goto :goto_3

    .line 414
    :cond_9
    move-object/from16 v21, v8

    .line 415
    .line 416
    move-object/from16 p2, v10

    .line 417
    .line 418
    move/from16 v19, v15

    .line 419
    .line 420
    move-object v10, v9

    .line 421
    move v15, v14

    .line 422
    move-object v0, v10

    .line 423
    :goto_3
    invoke-direct {v12, v5}, Lcom/discord/bundle_updater/BundleUpdater;->otaTempFile(Ljava/lang/String;)Ljava/io/File;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    invoke-direct {v12, v13, v5}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 428
    .line 429
    .line 430
    move-result-object v14

    .line 431
    if-eqz v6, :cond_a

    .line 432
    .line 433
    move-object/from16 v20, v14

    .line 434
    .line 435
    goto :goto_4

    .line 436
    :cond_a
    move-object/from16 v20, v1

    .line 437
    .line 438
    :goto_4
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_b

    .line 443
    .line 444
    move-object/from16 v13, p2

    .line 445
    .line 446
    move-object v9, v10

    .line 447
    move-object v0, v11

    .line 448
    goto :goto_5

    .line 449
    :cond_b
    iget-object v9, v12, Lcom/discord/bundle_updater/BundleUpdater;->executor:Ljava/util/concurrent/ExecutorService;

    .line 450
    .line 451
    new-instance v6, Lcom/discord/bundle_updater/a;

    .line 452
    .line 453
    move-object v1, v6

    .line 454
    move-object/from16 v3, p0

    .line 455
    .line 456
    move-object/from16 v4, p1

    .line 457
    .line 458
    move-object v15, v6

    .line 459
    move-object v6, v8

    .line 460
    move-object/from16 v8, v16

    .line 461
    .line 462
    move-object v13, v10

    .line 463
    move-object v10, v9

    .line 464
    move-object/from16 v9, v21

    .line 465
    .line 466
    move-object/from16 v13, p2

    .line 467
    .line 468
    move-object v12, v10

    .line 469
    move-object v10, v0

    .line 470
    move-object v0, v11

    .line 471
    move-object v11, v14

    .line 472
    invoke-direct/range {v1 .. v11}, Lcom/discord/bundle_updater/a;-><init>(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v12, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    :goto_5
    if-eqz v9, :cond_c

    .line 480
    .line 481
    invoke-interface {v13, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    :cond_c
    move-object/from16 v12, p0

    .line 485
    .line 486
    move-object v11, v0

    .line 487
    move-object v10, v13

    .line 488
    move/from16 v15, v19

    .line 489
    .line 490
    move-object/from16 v1, v20

    .line 491
    .line 492
    const/4 v9, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    move-object/from16 v0, p1

    .line 495
    .line 496
    move-object/from16 v13, p3

    .line 497
    .line 498
    goto/16 :goto_1

    .line 499
    .line 500
    :cond_d
    move-object v13, v10

    .line 501
    move/from16 v19, v15

    .line 502
    .line 503
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    if-eqz v2, :cond_e

    .line 512
    .line 513
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    check-cast v2, Ljava/util/concurrent/Future;

    .line 518
    .line 519
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    goto :goto_6

    .line 523
    :cond_e
    move-object/from16 v2, p0

    .line 524
    .line 525
    invoke-virtual {v2, v1}, Lcom/discord/bundle_updater/BundleUpdater;->setBundleLocation(Ljava/io/File;)V

    .line 526
    .line 527
    .line 528
    const/4 v0, 0x0

    .line 529
    invoke-direct {v2, v0}, Lcom/discord/bundle_updater/BundleUpdater;->setInProgressOtaCommit(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    sget-object v3, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 533
    .line 534
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 535
    .line 536
    new-instance v1, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    const-string v0, " - Done downloading OTA..."

    .line 545
    .line 546
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    const/4 v5, 0x0

    .line 554
    const/4 v6, 0x0

    .line 555
    const/4 v7, 0x6

    .line 556
    const/4 v8, 0x0

    .line 557
    invoke-static/range {v3 .. v8}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    if-eqz v19, :cond_f

    .line 561
    .line 562
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->SUCCESS_WITH_VERSION_REQUIRED:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :cond_f
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$OtaResult;->SUCCESS:Lcom/discord/bundle_updater/BundleUpdater$OtaResult;

    .line 566
    .line 567
    :goto_7
    return-object v0
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
.end method

.method private static final downloadOtaFiles$lambda$17$lambda$16(Lcom/discord/bundle_updater/AssetStatus;Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;)V
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    move-object/from16 v10, p4

    .line 3
    .line 4
    move-object/from16 v11, p9

    .line 5
    .line 6
    const-string v0, "$assetStatus"

    .line 7
    .line 8
    move-object v1, p0

    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "this$0"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "$localFileString"

    .line 18
    .line 19
    move-object v2, p3

    .line 20
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "$tempAsset"

    .line 24
    .line 25
    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "$fileString"

    .line 29
    .line 30
    move-object/from16 v3, p7

    .line 31
    .line 32
    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "$dstAsset"

    .line 36
    .line 37
    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    aget v0, v0, v1

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eq v0, v1, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    if-eq v0, v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual/range {p5 .. p5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v0, "url.toString()"

    .line 60
    .line 61
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual/range {p6 .. p7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v6, 0x0

    .line 70
    const/16 v7, 0x22

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    move-object v0, p1

    .line 74
    move-object/from16 v4, p8

    .line 75
    .line 76
    move-object/from16 v5, p4

    .line 77
    .line 78
    invoke-static/range {v0 .. v8}, Lcom/discord/bundle_updater/BundleUpdater;->downloadSingleFile-hUnOzRk$default(Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;IILjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-static {p2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, p2, p3}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const/4 v2, 0x1

    .line 94
    const/4 v3, 0x0

    .line 95
    const/4 v4, 0x4

    .line 96
    const/4 v5, 0x0

    .line 97
    move-object/from16 v1, p4

    .line 98
    .line 99
    invoke-static/range {v0 .. v5}, Lvf/j;->h(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 100
    .line 101
    .line 102
    :goto_0
    invoke-direct {p1, v10, v11}, Lcom/discord/bundle_updater/BundleUpdater;->moveFile(Ljava/io/File;Ljava/io/File;)V

    .line 103
    .line 104
    .line 105
    return-void
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
.end method

.method private final downloadSingleFile-hUnOzRk(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            "Lcom/discord/bundle_updater/BundleUpdater$Patch;",
            "Ljava/io/File;",
            "I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move/from16 v1, p6

    .line 8
    .line 9
    const-string v2, "Downloading file to "

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-ge v1, v0, :cond_d

    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getUrl()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    :cond_0
    move-object/from16 v0, p1

    .line 23
    .line 24
    :cond_1
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 25
    .line 26
    sget-object v5, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 27
    .line 28
    const-string v7, "TAG"

    .line 29
    .line 30
    invoke-static {v5, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v9, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v10, "Downloading to "

    .line 39
    .line 40
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v10, " url: "

    .line 47
    .line 48
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x4

    .line 60
    const/4 v14, 0x0

    .line 61
    move-object v9, v3

    .line 62
    move-object v10, v5

    .line 63
    invoke-static/range {v9 .. v14}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 v9, 0x2

    .line 67
    new-array v9, v9, [Lkotlin/Pair;

    .line 68
    .line 69
    const-string v10, "Accept"

    .line 70
    .line 71
    const-string v11, "application/gzip"

    .line 72
    .line 73
    invoke-static {v10, v11}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    const/4 v15, 0x0

    .line 78
    aput-object v10, v9, v15

    .line 79
    .line 80
    const-string v10, "Accept-Encoding"

    .line 81
    .line 82
    const-string v14, "gzip"

    .line 83
    .line 84
    invoke-static {v10, v14}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const/4 v13, 0x1

    .line 89
    aput-object v10, v9, v13

    .line 90
    .line 91
    invoke-static {v9}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    if-nez p2, :cond_2

    .line 96
    .line 97
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-object/from16 v10, p2

    .line 103
    .line 104
    :goto_0
    invoke-static {v9, v10}, Lmf/s;->n(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    sget-object v10, Lcom/discord/file_downloader/FileDownloader;->INSTANCE:Lcom/discord/file_downloader/FileDownloader;

    .line 109
    .line 110
    invoke-direct/range {p0 .. p0}, Lcom/discord/bundle_updater/BundleUpdater;->getClient()Lokhttp3/OkHttpClient;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v10, v0, v9, v11}, Lcom/discord/file_downloader/FileDownloader;->downloadBlob(Ljava/lang/String;Ljava/util/Map;Lokhttp3/OkHttpClient;)Lokhttp3/Response;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    :try_start_0
    invoke-virtual {v12}, Lokhttp3/Response;->Y()Z

    .line 119
    .line 120
    .line 121
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 122
    const/4 v11, 0x0

    .line 123
    if-nez v0, :cond_5

    .line 124
    .line 125
    :try_start_1
    invoke-virtual {v12}, Lokhttp3/Response;->l()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/16 v2, 0x1f4

    .line 130
    .line 131
    if-gt v2, v0, :cond_3

    .line 132
    .line 133
    const/16 v2, 0x258

    .line 134
    .line 135
    if-ge v0, v2, :cond_3

    .line 136
    .line 137
    move v15, v13

    .line 138
    :cond_3
    if-eqz v15, :cond_4

    .line 139
    .line 140
    add-int/lit8 v7, v1, 0x1

    .line 141
    .line 142
    move-object/from16 v1, p0

    .line 143
    .line 144
    move-object/from16 v2, p1

    .line 145
    .line 146
    move-object/from16 v3, p2

    .line 147
    .line 148
    move-object/from16 v4, p3

    .line 149
    .line 150
    move-object/from16 v5, p4

    .line 151
    .line 152
    move-object/from16 v6, p5

    .line 153
    .line 154
    invoke-direct/range {v1 .. v7}, Lcom/discord/bundle_updater/BundleUpdater;->downloadSingleFile-hUnOzRk(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    goto :goto_1

    .line 159
    :cond_4
    sget-object v0, Llf/s;->l:Llf/s$a;

    .line 160
    .line 161
    new-instance v0, Lcom/discord/bundle_updater/BundleUpdater$HttpException;

    .line 162
    .line 163
    invoke-virtual {v12}, Lokhttp3/Response;->l()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-direct {v0, v1}, Lcom/discord/bundle_updater/BundleUpdater$HttpException;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :goto_1
    invoke-static {v12, v11}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    move-object v2, v0

    .line 184
    move-object v1, v12

    .line 185
    goto/16 :goto_8

    .line 186
    .line 187
    :cond_5
    :try_start_2
    invoke-virtual {v12}, Lokhttp3/Response;->b()Lokhttp3/ResponseBody;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v5, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v9, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v10, "..."

    .line 209
    .line 210
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const/16 v18, 0x4

    .line 220
    .line 221
    const/16 v19, 0x0

    .line 222
    .line 223
    move-object v9, v3

    .line 224
    move-object v10, v5

    .line 225
    move-object v3, v11

    .line 226
    move-object/from16 v11, v16

    .line 227
    .line 228
    move-object/from16 v16, v12

    .line 229
    .line 230
    move-object/from16 v12, v17

    .line 231
    .line 232
    move/from16 v13, v18

    .line 233
    .line 234
    move-object v3, v14

    .line 235
    move-object/from16 v14, v19

    .line 236
    .line 237
    :try_start_3
    invoke-static/range {v9 .. v14}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v16 .. v16}, Lokhttp3/Response;->y()Lokhttp3/Headers;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    const-string v10, "content-encoding"

    .line 245
    .line 246
    invoke-virtual {v9, v10}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-static {v9, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 254
    if-eqz v3, :cond_6

    .line 255
    .line 256
    :try_start_4
    new-instance v3, Ldk/i;

    .line 257
    .line 258
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-direct {v3, v0}, Ldk/i;-><init>(Lokio/Source;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :catchall_1
    move-exception v0

    .line 267
    move-object v2, v0

    .line 268
    move-object/from16 v1, v16

    .line 269
    .line 270
    goto/16 :goto_8

    .line 271
    .line 272
    :cond_6
    :try_start_5
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    :goto_2
    invoke-static {v3}, Ldk/m;->d(Lokio/Source;)Lokio/BufferedSource;

    .line 277
    .line 278
    .line 279
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 280
    if-eqz p4, :cond_7

    .line 281
    .line 282
    :try_start_6
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getPatchPath()Ljava/io/File;

    .line 283
    .line 284
    .line 285
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 286
    if-nez v0, :cond_8

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :catchall_2
    move-exception v0

    .line 290
    move-object v2, v0

    .line 291
    move-object/from16 v1, v16

    .line 292
    .line 293
    goto/16 :goto_6

    .line 294
    .line 295
    :cond_7
    :goto_3
    move-object v0, v6

    .line 296
    :cond_8
    :try_start_7
    invoke-direct {v8, v0}, Lcom/discord/bundle_updater/BundleUpdater;->ensureEmptyFile(Ljava/io/File;)Ljava/io/File;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v10, 0x1

    .line 302
    invoke-static {v0, v15, v10, v9}, Ldk/m;->j(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v0}, Ldk/m;->c(Lokio/Sink;)Lokio/BufferedSink;

    .line 307
    .line 308
    .line 309
    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 310
    :try_start_8
    invoke-interface {v11, v3}, Lokio/BufferedSink;->N(Lokio/Source;)J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 311
    .line 312
    .line 313
    :try_start_9
    invoke-static {v11, v9}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 314
    .line 315
    .line 316
    :try_start_a
    invoke-static {v3, v9}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 317
    .line 318
    .line 319
    if-eqz p4, :cond_9

    .line 320
    .line 321
    :try_start_b
    sget-object v0, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 322
    .line 323
    new-instance v3, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v11, " - Patching file: "

    .line 332
    .line 333
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v18

    .line 343
    const/16 v19, 0x0

    .line 344
    .line 345
    const/16 v20, 0x0

    .line 346
    .line 347
    const/16 v21, 0x6

    .line 348
    .line 349
    const/16 v22, 0x0

    .line 350
    .line 351
    move-object/from16 v17, v0

    .line 352
    .line 353
    invoke-static/range {v17 .. v22}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    invoke-direct {v8, v6}, Lcom/discord/bundle_updater/BundleUpdater;->ensureEmptyFile(Ljava/io/File;)Ljava/io/File;

    .line 357
    .line 358
    .line 359
    sget-object v3, Lcom/discord/minibsdiff/BSDiff;->INSTANCE:Lcom/discord/minibsdiff/BSDiff;

    .line 360
    .line 361
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getBaseFilePath()Ljava/io/File;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getPatchPath()Ljava/io/File;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    invoke-virtual {v3, v11, v12, v6}, Lcom/discord/minibsdiff/BSDiff;->bspatchStreaming(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getBaseFilePath()Ljava/io/File;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {p4 .. p4}, Lcom/discord/bundle_updater/BundleUpdater$Patch;->getPatchPath()Ljava/io/File;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 384
    .line 385
    .line 386
    new-instance v3, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v5, " - Patched file: "

    .line 395
    .line 396
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v18

    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    const/16 v21, 0x6

    .line 411
    .line 412
    const/16 v22, 0x0

    .line 413
    .line 414
    move-object/from16 v17, v0

    .line 415
    .line 416
    invoke-static/range {v17 .. v22}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 417
    .line 418
    .line 419
    goto :goto_4

    .line 420
    :catch_0
    move-exception v0

    .line 421
    :try_start_c
    sget-object v3, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 422
    .line 423
    invoke-virtual {v3, v0}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 424
    .line 425
    .line 426
    :cond_9
    :goto_4
    :try_start_d
    invoke-virtual/range {p5 .. p5}, Ljava/io/File;->exists()Z

    .line 427
    .line 428
    .line 429
    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 430
    if-eqz v0, :cond_b

    .line 431
    .line 432
    if-eqz v4, :cond_a

    .line 433
    .line 434
    :try_start_e
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdaterUtils;->INSTANCE:Lcom/discord/bundle_updater/BundleUpdaterUtils;

    .line 435
    .line 436
    invoke-virtual {v0, v6}, Lcom/discord/bundle_updater/BundleUpdaterUtils;->md5(Ljava/io/File;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 444
    if-eqz v0, :cond_b

    .line 445
    .line 446
    :cond_a
    move v15, v10

    .line 447
    :cond_b
    if-nez v15, :cond_c

    .line 448
    .line 449
    :try_start_f
    sget-object v17, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 450
    .line 451
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 452
    .line 453
    invoke-static {v0, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    new-instance v2, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    const-string v3, "Failed to validate file: "

    .line 462
    .line 463
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    const-string v3, ", retrying full download..."

    .line 470
    .line 471
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v19

    .line 478
    const/16 v20, 0x0

    .line 479
    .line 480
    const/16 v21, 0x4

    .line 481
    .line 482
    const/16 v22, 0x0

    .line 483
    .line 484
    move-object/from16 v18, v0

    .line 485
    .line 486
    invoke-static/range {v17 .. v22}, Lcom/discord/crash_reporting/CrashReporting;->captureMessage$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;ILjava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    const/4 v5, 0x0

    .line 490
    add-int/lit8 v7, v1, 0x1

    .line 491
    .line 492
    move-object/from16 v1, p0

    .line 493
    .line 494
    move-object/from16 v2, p1

    .line 495
    .line 496
    move-object/from16 v3, p2

    .line 497
    .line 498
    move-object/from16 v4, p3

    .line 499
    .line 500
    move-object/from16 v6, p5

    .line 501
    .line 502
    invoke-direct/range {v1 .. v7}, Lcom/discord/bundle_updater/BundleUpdater;->downloadSingleFile-hUnOzRk(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 506
    move-object/from16 v1, v16

    .line 507
    .line 508
    invoke-static {v1, v9}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 509
    .line 510
    .line 511
    return-object v0

    .line 512
    :cond_c
    move-object/from16 v1, v16

    .line 513
    .line 514
    :try_start_10
    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 515
    .line 516
    sget-object v3, Lcom/discord/bundle_updater/BundleUpdater;->TAG:Ljava/lang/String;

    .line 517
    .line 518
    invoke-static {v3, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    new-instance v4, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    const-string v2, "...success! Invoking onSuccess..."

    .line 533
    .line 534
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    const/4 v4, 0x0

    .line 542
    const/4 v5, 0x4

    .line 543
    const/4 v6, 0x0

    .line 544
    move-object/from16 p1, v0

    .line 545
    .line 546
    move-object/from16 p2, v3

    .line 547
    .line 548
    move-object/from16 p3, v2

    .line 549
    .line 550
    move-object/from16 p4, v4

    .line 551
    .line 552
    move/from16 p5, v5

    .line 553
    .line 554
    move-object/from16 p6, v6

    .line 555
    .line 556
    invoke-static/range {p1 .. p6}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    sget-object v0, Llf/s;->l:Llf/s$a;

    .line 560
    .line 561
    invoke-virtual {v1}, Lokhttp3/Response;->y()Lokhttp3/Headers;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-static {v0}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 569
    invoke-static {v1, v9}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 570
    .line 571
    .line 572
    return-object v0

    .line 573
    :catchall_3
    move-exception v0

    .line 574
    move-object/from16 v1, v16

    .line 575
    .line 576
    move-object v2, v0

    .line 577
    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 578
    :catchall_4
    move-exception v0

    .line 579
    move-object v4, v0

    .line 580
    :try_start_12
    invoke-static {v11, v2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 581
    .line 582
    .line 583
    throw v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 584
    :catchall_5
    move-exception v0

    .line 585
    goto :goto_5

    .line 586
    :catchall_6
    move-exception v0

    .line 587
    move-object/from16 v1, v16

    .line 588
    .line 589
    :goto_5
    move-object v2, v0

    .line 590
    :goto_6
    :try_start_13
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 591
    :catchall_7
    move-exception v0

    .line 592
    move-object v4, v0

    .line 593
    :try_start_14
    invoke-static {v3, v2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 594
    .line 595
    .line 596
    throw v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 597
    :catchall_8
    move-exception v0

    .line 598
    goto :goto_7

    .line 599
    :catchall_9
    move-exception v0

    .line 600
    move-object/from16 v1, v16

    .line 601
    .line 602
    goto :goto_7

    .line 603
    :catchall_a
    move-exception v0

    .line 604
    move-object v1, v12

    .line 605
    :goto_7
    move-object v2, v0

    .line 606
    :goto_8
    :try_start_15
    throw v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 607
    :catchall_b
    move-exception v0

    .line 608
    move-object v3, v0

    .line 609
    invoke-static {v1, v2}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 610
    .line 611
    .line 612
    throw v3

    .line 613
    :cond_d
    new-instance v0, Lcom/discord/bundle_updater/BundleUpdater$MaxDownloadAttemptsException;

    .line 614
    .line 615
    move-object/from16 v2, p1

    .line 616
    .line 617
    invoke-direct {v0, v2, v1}, Lcom/discord/bundle_updater/BundleUpdater$MaxDownloadAttemptsException;-><init>(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    throw v0
.end method

.method static synthetic downloadSingleFile-hUnOzRk$default(Lcom/discord/bundle_updater/BundleUpdater;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;IILjava/lang/Object;)Ljava/lang/Object;
    .locals 9

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, p4

    :goto_2
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move v8, v0

    goto :goto_3

    :cond_3
    move v8, p6

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v7, p5

    invoke-direct/range {v2 .. v8}, Lcom/discord/bundle_updater/BundleUpdater;->downloadSingleFile-hUnOzRk(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/discord/bundle_updater/BundleUpdater$Patch;Ljava/io/File;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final ensureEmptyFile(Ljava/io/File;)Ljava/io/File;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception v2

    .line 28
    sget-object v3, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v6, "Failed to create file: "

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v4, ". "

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x5

    .line 57
    new-array v5, v5, [Lkotlin/Pair;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const/4 v7, 0x0

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v6, v7

    .line 72
    :goto_1
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const-string v8, "Parent path"

    .line 77
    .line 78
    invoke-static {v8, v6}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    aput-object v6, v5, v1

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v1, v7

    .line 96
    :goto_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v6, "Parent absolute path"

    .line 101
    .line 102
    invoke-static {v6, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const/4 v6, 0x1

    .line 107
    aput-object v1, v5, v6

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    move-object v1, v7

    .line 127
    :goto_3
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const-string v6, "Parent absolute file path"

    .line 132
    .line 133
    invoke-static {v6, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const/4 v6, 0x2

    .line 138
    aput-object v1, v5, v6

    .line 139
    .line 140
    const-string v1, "Directories created"

    .line 141
    .line 142
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const/4 v1, 0x3

    .line 151
    aput-object v0, v5, v1

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :cond_5
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    const-string v0, "Parent directory exists"

    .line 172
    .line 173
    invoke-static {v0, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const/4 v0, 0x4

    .line 178
    aput-object p1, v5, v0

    .line 179
    .line 180
    invoke-static {v5}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    const/4 v6, 0x0

    .line 185
    const/4 v7, 0x4

    .line 186
    const/4 v8, 0x0

    .line 187
    invoke-static/range {v3 .. v8}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    throw v2
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method private final getClient()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->client$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method private final getCookieManager()Landroid/webkit/CookieManager;
    .locals 1

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->cookieManager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/CookieManager;

    return-object v0
.end method

.method private final getInProgressOtaCommit()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "in_progress_ota_commit"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getManifestURL()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/discord/bundle_updater/BundleUpdater;->BASE_OTA_URL:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "android"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getVersion()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "manifest.json"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "BASE_OTA_URL\n           \u2026)\n            .toString()"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private final getOtasRootDirectory()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->otasRootDirectory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method private final getValidOTAVersion()Z
    .locals 2

    invoke-virtual {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getOtaVersion()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final getVersion()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/client_info/ClientInfo;->INSTANCE:Lcom/discord/client_info/ClientInfo;

    invoke-virtual {v0}, Lcom/discord/client_info/ClientInfo;->getVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final moveFile(Ljava/io/File;Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private final otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getOtasRootDirectory()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final otaTempFile(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    const-string v0, "temp"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/discord/bundle_updater/BundleUpdater;->otaFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setInProgressOtaCommit(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "editor"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "in_progress_ota_commit"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setManifestETag(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "editor"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "e_tag"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setOtaVersion(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "editor"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "ota_version"

    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final validateBuildOverrideCookie()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getCookieManager()Landroid/webkit/CookieManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->hasCookies()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getCookieManager()Landroid/webkit/CookieManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "cookieManager"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/discord/bundle_updater/BundleUpdater;->BASE_OTA_URL:Landroid/net/Uri;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "BASE_OTA_URL.toString()"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/discord/bundle_updater/CookieValidatorKt;->getCookiesForUrl(Landroid/webkit/CookieManager;Ljava/lang/String;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Loj/k;

    .line 56
    .line 57
    invoke-virtual {v2}, Loj/k;->e()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const-string v4, "buildOverride"

    .line 62
    .line 63
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2}, Loj/k;->g()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getVersion()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v3, v4}, Lcom/discord/bundle_updater/CookieValidatorKt;->validateBuildOverrideCookie(Ljava/lang/String;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_2

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    :cond_2
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const-string v2, "; "

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/16 v8, 0x3e

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    invoke-static/range {v1 .. v9}, Lkotlin/collections/h;->e0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getCookieManager()Landroid/webkit/CookieManager;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    sget-object v2, Lcom/discord/bundle_updater/BundleUpdater;->BASE_OTA_URL:Landroid/net/Uri;

    .line 109
    .line 110
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
.end method


# virtual methods
.method public final checkForUpdate(ILkotlin/jvm/functions/Function0;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/discord/bundle_updater/b;

    invoke-direct {v1, p1, p0, p2}, Lcom/discord/bundle_updater/b;-><init>(ILcom/discord/bundle_updater/BundleUpdater;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    const-string p2, "executor.submit {\n      \u2026)\n            }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getBundleLocation()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "key_android_js_bundle"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/discord/bundle_updater/BundleUpdater;->getValidOTAVersion()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    :cond_1
    return-object v2
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final getManifestETag()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "e_tag"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    return-object v2
.end method

.method public final getOnBundleDownloadedListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->onBundleDownloadedListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOtaVersion()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "ota_version"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    return-object v2
.end method

.method public final isVersionRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->isVersionRequired:Z

    return v0
.end method

.method public final setBundleLocation(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/bundle_updater/BundleUpdater;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "editor"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    const-string v1, "key_android_js_bundle"

    .line 21
    .line 22
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final setOnBundleDownloadedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/bundle_updater/BundleUpdater;->onBundleDownloadedListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
