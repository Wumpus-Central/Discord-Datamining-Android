.class public final Lcom/discord/permissions/NativePermissionManagerModule$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/permissions/NativePermissionManagerModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002J\u000c\u0010\u0006\u001a\u00020\u0004*\u00020\u0005H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/permissions/NativePermissionManagerModule$Companion;",
        "",
        "()V",
        "transformHasAuthorizationResult",
        "Lcom/discord/react/utilities/PromiseWrapper;",
        "Lcom/facebook/react/bridge/Promise;",
        "transformRequestResult",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->transformHasAuthorizationResult(Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->transformRequestResult(Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    move-result-object p0

    return-object p0
.end method

.method private final transformHasAuthorizationResult(Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;
    .locals 7

    .line 1
    new-instance v6, Lcom/discord/react/utilities/PromiseWrapper;

    .line 2
    .line 3
    new-instance v2, Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1;

    .line 4
    .line 5
    sget-object v0, Lcom/discord/permissions/NativePermissionStatus;->Companion:Lcom/discord/permissions/NativePermissionStatus$Companion;

    .line 6
    .line 7
    invoke-direct {v2, v0}, Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v0, v6

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/discord/react/utilities/PromiseWrapper;-><init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    return-object v6
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
.end method

.method private final transformRequestResult(Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;
    .locals 7

    .line 1
    new-instance v6, Lcom/discord/react/utilities/PromiseWrapper;

    .line 2
    .line 3
    new-instance v2, Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformRequestResult$1;

    .line 4
    .line 5
    sget-object v0, Lcom/discord/permissions/NativePermissionStatus;->Companion:Lcom/discord/permissions/NativePermissionStatus$Companion;

    .line 6
    .line 7
    invoke-direct {v2, v0}, Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformRequestResult$1;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v0, v6

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/discord/react/utilities/PromiseWrapper;-><init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    return-object v6
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
.end method
