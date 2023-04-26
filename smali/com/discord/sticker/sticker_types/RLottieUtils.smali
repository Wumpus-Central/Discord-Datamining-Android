.class public final Lcom/discord/sticker/sticker_types/RLottieUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000c\u0010\u000b\u001a\u00020\n*\u00020\u000cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/discord/sticker/sticker_types/RLottieUtils;",
        "",
        "()V",
        "initialized",
        "",
        "getInitialized$sticker_release",
        "()Z",
        "setInitialized$sticker_release",
        "(Z)V",
        "init",
        "",
        "warn",
        "Ljava/lang/UnsatisfiedLinkError;",
        "sticker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/sticker/sticker_types/RLottieUtils;

.field private static initialized:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/sticker/sticker_types/RLottieUtils;

    invoke-direct {v0}, Lcom/discord/sticker/sticker_types/RLottieUtils;-><init>()V

    sput-object v0, Lcom/discord/sticker/sticker_types/RLottieUtils;->INSTANCE:Lcom/discord/sticker/sticker_types/RLottieUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final warn(Ljava/lang/UnsatisfiedLinkError;)V
    .locals 3

    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    const-string v1, "RLottie"

    const-string v2, "Unable to load animated sticker library."

    invoke-virtual {v0, v1, v2, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getInitialized$sticker_release()Z
    .locals 1

    sget-boolean v0, Lcom/discord/sticker/sticker_types/RLottieUtils;->initialized:Z

    return v0
.end method

.method public final init()V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/discord/rlottie/RLottie;->INSTANCE:Lcom/discord/rlottie/RLottie;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/discord/rlottie/RLottie;->init()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lcom/discord/sticker/sticker_types/RLottieUtils;->initialized:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-direct {p0, v0}, Lcom/discord/sticker/sticker_types/RLottieUtils;->warn(Ljava/lang/UnsatisfiedLinkError;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
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
.end method

.method public final setInitialized$sticker_release(Z)V
    .locals 0

    sput-boolean p1, Lcom/discord/sticker/sticker_types/RLottieUtils;->initialized:Z

    return-void
.end method
