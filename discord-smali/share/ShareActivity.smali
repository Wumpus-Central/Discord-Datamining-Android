.class public final Lcom/discord/share/ShareActivity;
.super Lcom/discord/react_activities/ReactActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\u0003\u001a\u00060\u0004R\u00020\u0001H\u0016J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/share/ShareActivity;",
        "Lcom/discord/react_activities/ReactActivity;",
        "()V",
        "getActivityDelegate",
        "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;",
        "getNameOfComponent",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/react_activities/ReactActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityDelegate()Lcom/discord/react_activities/ReactActivity$ActivityDelegate;
    .locals 1

    new-instance v0, Lcom/discord/share/ShareActivity$getActivityDelegate$1;

    invoke-direct {v0, p0}, Lcom/discord/share/ShareActivity$getActivityDelegate$1;-><init>(Lcom/discord/share/ShareActivity;)V

    return-object v0
.end method

.method public getNameOfComponent()Ljava/lang/String;
    .locals 1

    const-string v0, "Share"

    return-object v0
.end method
