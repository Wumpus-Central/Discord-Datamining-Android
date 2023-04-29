.class public final Lcom/discord/nearby/NearbyHelperModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007J\u0008\u0010\r\u001a\u00020\u000cH\u0016J\u0008\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000cH\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000cH\u0007J\u0008\u0010\u0016\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/nearby/NearbyHelperModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "manager",
        "Lcom/discord/nearby/NearbyManager;",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "addListener",
        "",
        "type",
        "",
        "getName",
        "listenForNearbyMessages",
        "publishNearbyMessage",
        "message",
        "removeListeners",
        "count",
        "",
        "setupNearbyPermission",
        "apiKey",
        "stopNearby",
        "nearby_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final manager:Lcom/discord/nearby/NearbyManager;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/nearby/NearbyHelperModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance p1, Lcom/discord/reactevents/ReactEvents;

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    new-array v0, v0, [Lkotlin/Pair;

    .line 15
    .line 16
    const-class v1, Lcom/discord/nearby/reactevents/OnNearbyMessageReceivedEvent;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "nearbyMessageReceived"

    .line 23
    .line 24
    invoke-static {v2, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object v1, v0, v2

    .line 30
    .line 31
    const-class v1, Lcom/discord/nearby/reactevents/OnNearbyMessageLostEvent;

    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "nearbyMessageLost"

    .line 38
    .line 39
    invoke-static {v2, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x1

    .line 44
    aput-object v1, v0, v2

    .line 45
    .line 46
    const-class v1, Lcom/discord/nearby/reactevents/OnNearbyErrorEvent;

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "nearbyError"

    .line 53
    .line 54
    invoke-static {v2, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x2

    .line 59
    aput-object v1, v0, v2

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/discord/nearby/NearbyHelperModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 65
    .line 66
    new-instance p1, Lcom/discord/nearby/NearbyManager;

    .line 67
    .line 68
    new-instance v0, Lcom/discord/nearby/NearbyHelperModule$manager$1;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lcom/discord/nearby/NearbyHelperModule$manager$1;-><init>(Lcom/discord/nearby/NearbyHelperModule;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lcom/discord/nearby/NearbyHelperModule$manager$2;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lcom/discord/nearby/NearbyHelperModule$manager$2;-><init>(Lcom/discord/nearby/NearbyHelperModule;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Lcom/discord/nearby/NearbyHelperModule$manager$3;

    .line 79
    .line 80
    invoke-direct {v2, p0}, Lcom/discord/nearby/NearbyHelperModule$manager$3;-><init>(Lcom/discord/nearby/NearbyHelperModule;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, v0, v1, v2}, Lcom/discord/nearby/NearbyManager;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lcom/discord/nearby/NearbyHelperModule;->manager:Lcom/discord/nearby/NearbyManager;

    .line 87
    .line 88
    return-void
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

.method public static final synthetic access$getReactContext$p(Lcom/discord/nearby/NearbyHelperModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    iget-object p0, p0, Lcom/discord/nearby/NearbyHelperModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getReactEvents$p(Lcom/discord/nearby/NearbyHelperModule;)Lcom/discord/reactevents/ReactEvents;
    .locals 0

    iget-object p0, p0, Lcom/discord/nearby/NearbyHelperModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    return-object p0
.end method


# virtual methods
.method public final addListener(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "NearbyHelper"

    return-object v0
.end method

.method public final listenForNearbyMessages()V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/nearby/NearbyHelperModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/discord/nearby/NearbyHelperModule;->manager:Lcom/discord/nearby/NearbyManager;

    invoke-virtual {v1, v0}, Lcom/discord/nearby/NearbyManager;->enableNearby(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final publishNearbyMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/nearby/NearbyHelperModule;->manager:Lcom/discord/nearby/NearbyManager;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/discord/nearby/NearbyManager;->setOutboundMessage(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final removeListeners(I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public final setupNearbyPermission(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final stopNearby()V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/nearby/NearbyHelperModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/discord/nearby/NearbyHelperModule;->manager:Lcom/discord/nearby/NearbyManager;

    invoke-virtual {v1, v0}, Lcom/discord/nearby/NearbyManager;->disableNearby(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
