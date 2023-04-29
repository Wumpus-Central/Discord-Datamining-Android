.class public interface abstract Lcom/discord/notifications/actions/intents/NotificationAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/actions/intents/NotificationAction$Companion;,
        Lcom/discord/notifications/actions/intents/NotificationAction$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\rH\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/notifications/actions/intents/NotificationAction;",
        "Landroid/os/Parcelable;",
        "pendingIntentRequestCode",
        "",
        "getPendingIntentRequestCode",
        "()I",
        "tag",
        "",
        "getTag",
        "()Ljava/lang/String;",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "launchActivity",
        "",
        "onNotificationAction",
        "",
        "intent",
        "onNotificationActionComplete",
        "toPendingIntent",
        "Landroid/app/PendingIntent;",
        "flags",
        "Companion",
        "notification_actions_release"
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
.field public static final Companion:Lcom/discord/notifications/actions/intents/NotificationAction$Companion;

.field public static final activityAction:Ljava/lang/String; = "android.intent.action.VIEW"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/discord/notifications/actions/intents/NotificationAction$Companion;->$$INSTANCE:Lcom/discord/notifications/actions/intents/NotificationAction$Companion;

    sput-object v0, Lcom/discord/notifications/actions/intents/NotificationAction;->Companion:Lcom/discord/notifications/actions/intents/NotificationAction$Companion;

    return-void
.end method


# virtual methods
.method public abstract getPendingIntentRequestCode()I
.end method

.method public abstract getTag()Ljava/lang/String;
.end method

.method public abstract onNotificationAction(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract onNotificationActionComplete(Landroid/content/Context;)V
.end method

.method public abstract toPendingIntent(Landroid/content/Context;IZ)Landroid/app/PendingIntent;
.end method
