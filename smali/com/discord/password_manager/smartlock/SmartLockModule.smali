.class public final Lcom/discord/password_manager/smartlock/SmartLockModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u0008\u0010\u0013\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0008\u0010 \u001a\u0004\u0018\u00010\u0010H\u0007R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/discord/password_manager/smartlock/SmartLockModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "activityEventListener",
        "com/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1",
        "Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;",
        "credentialsClient",
        "Lcom/google/android/gms/auth/api/credentials/CredentialsClient;",
        "loginPromise",
        "Lcom/facebook/react/bridge/Promise;",
        "autoLogin",
        "",
        "promise",
        "getName",
        "",
        "removeCredentials",
        "login",
        "requestCredentials",
        "resolvePromiseWithCredentials",
        "password",
        "tryResolveResult",
        "activity",
        "Landroid/app/Activity;",
        "requestCode",
        "",
        "resolvableApiException",
        "Lcom/google/android/gms/common/api/ResolvableApiException;",
        "updateAccountCredentials",
        "",
        "usernameWithDiscriminator",
        "avatarUri",
        "Companion",
        "password_manager_release"
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
.field public static final Companion:Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;

.field public static final DISCORD_ACCOUNT_IDENTITY:Ljava/lang/String; = "https://discord.com/"

.field public static final GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE:I = 0xfa8

.field public static final GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST:I = 0xfa9

.field private static final logTag:Ljava/lang/String;


# instance fields
.field private final activityEventListener:Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;

.field private credentialsClient:Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

.field private loginPromise:Lcom/facebook/react/bridge/Promise;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->Companion:Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;

    .line 8
    .line 9
    const-class v0, Lcom/discord/password_manager/smartlock/SmartLockModule;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "SmartLockModule::class.java.simpleName"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 21
    .line 22
    return-void
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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

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
    iput-object p1, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;-><init>(Lcom/discord/password_manager/smartlock/SmartLockModule;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->activityEventListener:Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ln9/d$a;

    .line 22
    .line 23
    invoke-direct {v0}, Ln9/d$a;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ln9/d$a;->c()Ln9/d$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ln9/d$a;->b()Ln9/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "Builder()\n            .f\u2026og()\n            .build()"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/auth/api/credentials/b;->a(Landroid/content/Context;Ln9/d;)Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "getClient(reactContext, options)"

    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->credentialsClient:Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

    .line 49
    .line 50
    return-void
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

.method public static synthetic a(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->updateAccountCredentials$lambda$4(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static final synthetic access$getLogTag$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$resolvePromiseWithCredentials(Lcom/discord/password_manager/smartlock/SmartLockModule;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/password_manager/smartlock/SmartLockModule;->resolvePromiseWithCredentials(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->requestCredentials$lambda$0(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private final requestCredentials()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/a$a;->c(Z)Lcom/google/android/gms/auth/api/credentials/a$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "https://discord.com/"

    .line 12
    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/a$a;->b([Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/a$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/a$a;->a()Lcom/google/android/gms/auth/api/credentials/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "Builder()\n            .s\u2026ITY)\n            .build()"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->credentialsClient:Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/google/android/gms/auth/api/credentials/CredentialsClient;->D(Lcom/google/android/gms/auth/api/credentials/a;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lcom/discord/password_manager/smartlock/a;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lcom/discord/password_manager/smartlock/a;-><init>(Lcom/discord/password_manager/smartlock/SmartLockModule;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->b(Ldb/d;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method private static final requestCredentials$lambda$0(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "task"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->k()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln9/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Ln9/a;->c()Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/Credential;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->k()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ln9/a;

    .line 41
    .line 42
    invoke-virtual {p1}, Ln9/a;->c()Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->B()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_1
    if-eqz v0, :cond_6

    .line 53
    .line 54
    invoke-direct {p0, v0, v1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->resolvePromiseWithCredentials(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->j()Ljava/lang/Exception;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    move-object v0, p1

    .line 67
    check-cast v0, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 68
    .line 69
    invoke-virtual {v0}, Lv9/b;->b()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x4

    .line 74
    if-ne v1, v2, :cond_3

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v1, 0x1

    .line 79
    :goto_1
    sget-object v2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 80
    .line 81
    sget-object v3, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 82
    .line 83
    const-string v4, "Resolvable Exception requesting credentials"

    .line 84
    .line 85
    invoke-virtual {v2, v3, v4, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    const/16 v1, 0xfa9

    .line 99
    .line 100
    invoke-direct {p0, p1, v1, v0}, Lcom/discord/password_manager/smartlock/SmartLockModule;->tryResolveResult(Landroid/app/Activity;ILcom/google/android/gms/common/api/ResolvableApiException;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    instance-of p0, p1, Lv9/b;

    .line 105
    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    sget-object p0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 109
    .line 110
    sget-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 111
    .line 112
    const-string v1, "API Exception requesting credentials"

    .line 113
    .line 114
    invoke-virtual {p0, v0, v1, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sget-object p0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 119
    .line 120
    sget-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 121
    .line 122
    const-string v1, "Exception requesting credentials"

    .line 123
    .line 124
    invoke-virtual {p0, v0, v1, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_2
    return-void
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
.end method

.method private final resolvePromiseWithCredentials(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->loginPromise:Lcom/facebook/react/bridge/Promise;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [Lkotlin/Pair;

    .line 7
    .line 8
    const-string v2, "login"

    .line 9
    .line 10
    invoke-static {v2, p1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object p1, v1, v2

    .line 16
    .line 17
    const-string p1, "password"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x1

    .line 24
    aput-object p1, v1, p2

    .line 25
    .line 26
    invoke-static {v1}, Lof/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->makeNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
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
.end method

.method private final tryResolveResult(Landroid/app/Activity;ILcom/google/android/gms/common/api/ResolvableApiException;)V
    .locals 2

    .line 3
    :try_start_0
    invoke-virtual {p3}, Lv9/b;->b()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/common/api/ResolvableApiException;->c(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    sget-object p2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    sget-object p3, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    const-string v0, "Failed to resolve"

    invoke-virtual {p2, p3, v0, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception p1

    .line 7
    sget-object p2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    sget-object p3, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    const-string v0, "Failed to send resolution."

    invoke-virtual {p2, p3, v0, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method

.method private final tryResolveResult(Lcom/google/android/gms/common/api/ResolvableApiException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0xfa8

    .line 2
    invoke-direct {p0, v0, v1, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->tryResolveResult(Landroid/app/Activity;ILcom/google/android/gms/common/api/ResolvableApiException;)V

    :cond_0
    return-void
.end method

.method private static final updateAccountCredentials$lambda$4(Lcom/discord/password_manager/smartlock/SmartLockModule;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "task"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->j()Ljava/lang/Exception;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 26
    .line 27
    sget-object v1, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 28
    .line 29
    const-string v2, "Resolving Exception saving credentials"

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/discord/password_manager/smartlock/SmartLockModule;->tryResolveResult(Lcom/google/android/gms/common/api/ResolvableApiException;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 41
    .line 42
    sget-object v0, Lcom/discord/password_manager/smartlock/SmartLockModule;->logTag:Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "Exception saving credentials"

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void
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
.end method


# virtual methods
.method public final autoLogin(Lcom/facebook/react/bridge/Promise;)V
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
    iput-object p1, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->loginPromise:Lcom/facebook/react/bridge/Promise;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/discord/password_manager/smartlock/SmartLockModule;->requestCredentials()V

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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "SmartLockModule"

    return-object v0
.end method

.method public final removeCredentials(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "login"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->credentialsClient:Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/auth/api/credentials/Credential$a;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a()Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/CredentialsClient;->C(Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/tasks/Task;

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

.method public final updateAccountCredentials(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "login"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "password"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential$a;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p3}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;

    .line 19
    .line 20
    .line 21
    :cond_0
    if-eqz p4, :cond_1

    .line 22
    .line 23
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->d(Landroid/net/Uri;)Lcom/google/android/gms/auth/api/credentials/Credential$a;

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0, p2}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/Credential$a;->a()Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "Builder(login).apply {\n \u2026ssword)\n        }.build()"

    .line 38
    .line 39
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/discord/password_manager/smartlock/SmartLockModule;->credentialsClient:Lcom/google/android/gms/auth/api/credentials/CredentialsClient;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lcom/google/android/gms/auth/api/credentials/CredentialsClient;->E(Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/discord/password_manager/smartlock/b;

    .line 49
    .line 50
    invoke-direct {p2, p0}, Lcom/discord/password_manager/smartlock/b;-><init>(Lcom/discord/password_manager/smartlock/SmartLockModule;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->b(Ldb/d;)Lcom/google/android/gms/tasks/Task;

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    return p1
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
.end method
