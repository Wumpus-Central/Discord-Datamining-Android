.class public final Lcom/discord/BuildConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPLICATION_ID:Ljava/lang/String; = "com.discord"

.field public static final BUILD_TYPE:Ljava/lang/String; = "release"

.field public static final DEBUG:Z = false

.field public static final FLAVOR:Ljava/lang/String; = "canary"

.field public static final INTEGRATION_TEST_PASSWORD:Ljava/lang/String; = "null"

.field public static final INTEGRATION_TEST_USERNAME:Ljava/lang/String; = "null"

.field public static final MAIN_MODULE:Ljava/lang/String; = "index.native"

.field public static final USER_AGENT:Ljava/lang/String; = "Discord-Android/178201"

.field public static final VERSION_CODE:I = 0x2b819

.field public static final VERSION_NAME:Ljava/lang/String; = "178.1 - Alpha"

.field public static final VERSION_NAME_RNA:Ljava/lang/String; = "178.1"

.field public static final logTTIMetrics:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/discord/BuildConfig;->logTTIMetrics:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
