.class public final Lcom/discord/share/ShareActivity$getActivityDelegate$1;
.super Lcom/discord/react_activities/ReactActivity$ActivityDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/share/ShareActivity;->getActivityDelegate()Lcom/discord/react_activities/ReactActivity$ActivityDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0008\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "com/discord/share/ShareActivity$getActivityDelegate$1",
        "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;",
        "Lcom/discord/react_activities/ReactActivity;",
        "shareProps",
        "Lcom/discord/share/ShareProps;",
        "getLaunchOptions",
        "Landroid/os/Bundle;",
        "onCreate",
        "",
        "savedInstanceState",
        "share_release"
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
.field private shareProps:Lcom/discord/share/ShareProps;

.field final synthetic this$0:Lcom/discord/share/ShareActivity;


# direct methods
.method constructor <init>(Lcom/discord/share/ShareActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/discord/share/ShareActivity$getActivityDelegate$1;->this$0:Lcom/discord/share/ShareActivity;

    .line 2
    .line 3
    invoke-direct {p0, p1, p1}, Lcom/discord/react_activities/ReactActivity$ActivityDelegate;-><init>(Lcom/discord/react_activities/ReactActivity;Lcom/discord/react_activities/ReactActivity;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method


# virtual methods
.method protected getLaunchOptions()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/discord/share/ShareActivity$getActivityDelegate$1;->shareProps:Lcom/discord/share/ShareProps;

    if-nez v0, :cond_0

    const-string v0, "shareProps"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/discord/share/ShareProps;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/discord/share/ShareProps;->Companion:Lcom/discord/share/ShareProps$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/discord/share/ShareActivity$getActivityDelegate$1;->this$0:Lcom/discord/share/ShareActivity;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "intent"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/facebook/react/ReactActivityDelegate;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "context"

    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/discord/share/ShareProps$Companion;->createShareProps(Landroid/content/Intent;Landroid/content/Context;)Lcom/discord/share/ShareProps;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/discord/share/ShareActivity$getActivityDelegate$1;->shareProps:Lcom/discord/share/ShareProps;

    .line 28
    .line 29
    invoke-super {p0, p1}, Lcom/facebook/react/ReactActivityDelegate;->onCreate(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void
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
.end method
