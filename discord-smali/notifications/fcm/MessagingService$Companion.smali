.class public final Lcom/discord/notifications/fcm/MessagingService$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/fcm/MessagingService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/notifications/fcm/MessagingService$Companion;",
        "",
        "()V",
        "init",
        "",
        "notification_fcm_release"
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

    invoke-direct {p0}, Lcom/discord/notifications/fcm/MessagingService$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final init()V
    .locals 3

    sget-object v0, Lcom/discord/notifications/fcm/utils/FCMTokenHelper;->INSTANCE:Lcom/discord/notifications/fcm/utils/FCMTokenHelper;

    new-instance v1, Lcom/discord/notifications/fcm/MessagingService$Companion$init$1;

    sget-object v2, Lcom/discord/notifications/client/NotificationClient;->Companion:Lcom/discord/notifications/client/NotificationClient$Companion;

    invoke-virtual {v2}, Lcom/discord/notifications/client/NotificationClient$Companion;->getInstance()Lcom/discord/notifications/client/NotificationClient;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/discord/notifications/fcm/MessagingService$Companion$init$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/discord/notifications/fcm/utils/FCMTokenHelper;->getToken(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
