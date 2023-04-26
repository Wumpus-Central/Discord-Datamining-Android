.class public final Lcom/discord/permissions/NativePermissionManagerModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "NativePermissionManager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/permissions/NativePermissionManagerModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/discord/permissions/NativePermissionManagerModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "permissionsModule",
        "Lcom/facebook/react/modules/permissions/PermissionsModule;",
        "getPermissionsModule",
        "()Lcom/facebook/react/modules/permissions/PermissionsModule;",
        "getName",
        "",
        "getNotificationAuthorizationStatus",
        "",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "hasBluetoothAuthorization",
        "hasCameraAuthorization",
        "hasContactAuthorization",
        "hasExternalStorageAuthorization",
        "hasMicrophoneAuthorization",
        "hasModifyAudioAuthorization",
        "hasPhotoAuthorization",
        "requestBluetoothAuthorization",
        "requestCameraAuthorization",
        "requestContactsAuthorization",
        "requestExternalStorageAuthorization",
        "requestMicrophoneAuthorization",
        "requestModifyAudioAuthorization",
        "requestPhotoAuthorization",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

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
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private final getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const-class v1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast v0, Lcom/facebook/react/modules/permissions/PermissionsModule;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "NativePermissionManager"

    return-object v0
.end method

.method public final getNotificationAuthorizationStatus(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroidx/core/app/NotificationManagerCompat;->g(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
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
.end method

.method public final hasBluetoothAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.BLUETOOTH"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasCameraAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.CAMERA"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasContactAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.READ_CONTACTS"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasExternalStorageAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasMicrophoneAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasModifyAudioAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.MODIFY_AUDIO_SETTINGS"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final hasPhotoAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformHasAuthorizationResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->checkPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestBluetoothAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.BLUETOOTH"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestCameraAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.CAMERA"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestContactsAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.READ_CONTACTS"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestExternalStorageAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestMicrophoneAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestModifyAudioAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.MODIFY_AUDIO_SETTINGS"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public final requestPhotoAuthorization(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/permissions/NativePermissionManagerModule;->getPermissionsModule()Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/discord/permissions/NativePermissionManagerModule;->Companion:Lcom/discord/permissions/NativePermissionManagerModule$Companion;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion;->access$transformRequestResult(Lcom/discord/permissions/NativePermissionManagerModule$Companion;Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method
