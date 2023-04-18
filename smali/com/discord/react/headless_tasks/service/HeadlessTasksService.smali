.class public final Lcom/discord/react/headless_tasks/service/HeadlessTasksService;
.super Lcom/facebook/react/HeadlessJsTaskService;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/react/headless_tasks/service/HeadlessTasksService;",
        "Lcom/facebook/react/HeadlessJsTaskService;",
        "()V",
        "getTaskConfig",
        "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;",
        "intent",
        "Landroid/content/Intent;",
        "react_headless_tasks_service_release"
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
.field public static final synthetic k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/HeadlessJsTaskService;-><init>()V

    return-void
.end method


# virtual methods
.method protected getTaskConfig(Landroid/content/Intent;)Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;
    .locals 1

    sget-object v0, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->Companion:Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;

    invoke-virtual {v0, p1}, Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;->fromIntent(Landroid/content/Intent;)Lcom/discord/react/headless_tasks/api/HeadlessTasks;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/discord/react/headless_tasks/api/HeadlessTasks;->getTaskConfig()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
