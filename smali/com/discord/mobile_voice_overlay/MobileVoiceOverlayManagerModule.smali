.class public final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;
.super Lcom/discord/codegen/NativeMobileVoiceOverlaySpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u000cH\u0016J\u0012\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000c2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;",
        "Lcom/discord/codegen/NativeMobileVoiceOverlaySpec;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "mobileVoiceOverlay",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;",
        "getMobileVoiceOverlay",
        "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;",
        "mobileVoiceOverlay$delegate",
        "Lkotlin/Lazy;",
        "enableOverlay",
        "",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "getName",
        "",
        "hideOverlay",
        "setData",
        "data",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "showOverlay",
        "assets",
        "Companion",
        "mobile_voice_overlay_release"
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
.field public static final Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;

.field public static final NAME:Ljava/lang/String; = "RTNMobileVoiceOverlay"

.field public static final OVERLAY_REQUEST_CODE:I = 0x3951c


# instance fields
.field private final mobileVoiceOverlay$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/discord/codegen/NativeMobileVoiceOverlaySpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->mobileVoiceOverlay$delegate:Lkotlin/Lazy;

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
.end method

.method public static final synthetic access$getMobileVoiceOverlay(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;
    .locals 0

    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->getMobileVoiceOverlay()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getReactApplicationContext(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method private final getMobileVoiceOverlay()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->mobileVoiceOverlay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    return-object v0
.end method


# virtual methods
.method public enableOverlay(Lcom/facebook/react/bridge/Promise;)V
    .locals 4

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "reactApplicationContext"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->canDrawOverlay(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$enableOverlay$listener$1;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$enableOverlay$listener$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;Lcom/facebook/react/bridge/Promise;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Landroid/content/Intent;

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v3, "package:"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 77
    .line 78
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    const v1, 0x3951c

    .line 82
    .line 83
    .line 84
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/bridge/ReactContext;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)Z

    .line 87
    .line 88
    .line 89
    return-void
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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RTNMobileVoiceOverlay"

    return-object v0
.end method

.method public hideOverlay()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->access$getMobileVoiceOverlay(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->hideOverlay$mobile_voice_overlay_release()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->getUiHandler()Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$hideOverlay$$inlined$postOrRunOnMainThread$1;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$hideOverlay$$inlined$postOrRunOnMainThread$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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
.end method

.method public setData(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getJson()Lkotlinx/serialization/json/Json;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->toJsonString(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0}, Lwi/e;->a()Lbj/c;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$Companion;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1, p1}, Lwi/m;->b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->access$getMobileVoiceOverlay(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->setData$mobile_voice_overlay_release(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->getUiHandler()Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$setData$$inlined$postOrRunOnMainThread$1;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$setData$$inlined$postOrRunOnMainThread$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
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
.end method

.method public showOverlay(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->getJson()Lkotlinx/serialization/json/Json;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->toJsonString(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0}, Lwi/e;->a()Lbj/c;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets$Companion;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1, p1}, Lwi/m;->b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->access$getMobileVoiceOverlay(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->showOverlay$mobile_voice_overlay_release(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->getUiHandler()Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
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
.end method
