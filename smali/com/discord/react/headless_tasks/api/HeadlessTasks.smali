.class public final Lcom/discord/react/headless_tasks/api/HeadlessTasks;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/react/headless_tasks/api/HeadlessTasks;",
        "",
        "taskConfig",
        "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;",
        "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V",
        "getTaskConfig",
        "()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
        "react_headless_tasks_api_release"
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
.field public static final Companion:Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;

.field private static final SERVICE_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final TASK_ALLOWED_IN_FOREGROUND_KEY:Ljava/lang/String; = "intent.discord.headless_tasks_aif"

.field private static final TASK_KEY:Ljava/lang/String; = "intent.discord.headless_tasks_key"

.field private static final TASK_NAME_KEY:Ljava/lang/String; = "intent.discord.headless_tasks_name"

.field private static final TASK_PARAMS_KEY:Ljava/lang/String; = "intent.discord.headless_tasks_params"

.field private static final TASK_TIMEOUT_DEFAULT:J = 0x1388L

.field private static final TASK_TIMEOUT_KEY:Ljava/lang/String; = "intent.discord.headless_tasks_timeout"


# instance fields
.field private final taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->Companion:Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;

    .line 8
    .line 9
    sget v0, Lcom/discord/react/headless_tasks/service/HeadlessTasksService;->k:I

    .line 10
    .line 11
    const-class v0, Lcom/discord/react/headless_tasks/service/HeadlessTasksService;

    .line 12
    .line 13
    sput-object v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->SERVICE_CLASS:Ljava/lang/Class;

    .line 14
    .line 15
    return-void
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
.end method

.method public constructor <init>(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V
    .locals 1

    .line 1
    const-string v0, "taskConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

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
.end method

.method public static final synthetic access$getSERVICE_CLASS$cp()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->SERVICE_CLASS:Ljava/lang/Class;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/discord/react/headless_tasks/api/HeadlessTasks;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;ILjava/lang/Object;)Lcom/discord/react/headless_tasks/api/HeadlessTasks;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->copy(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)Lcom/discord/react/headless_tasks/api/HeadlessTasks;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;
    .locals 1

    iget-object v0, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    return-object v0
.end method

.method public final copy(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)Lcom/discord/react/headless_tasks/api/HeadlessTasks;
    .locals 1

    const-string v0, "taskConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;

    invoke-direct {v0, p1}, Lcom/discord/react/headless_tasks/api/HeadlessTasks;-><init>(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/react/headless_tasks/api/HeadlessTasks;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/react/headless_tasks/api/HeadlessTasks;

    iget-object v1, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    iget-object p1, p1, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getTaskConfig()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;
    .locals 1

    iget-object v0, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HeadlessTasks(taskConfig="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
