.class final Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/notifications/renderer/NotificationChannels;->init(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/core/app/NotificationChannelCompat;",
        "Landroidx/core/app/NotificationChannelCompat$Builder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "legacyChannel",
        "Landroidx/core/app/NotificationChannelCompat;",
        "builder",
        "Landroidx/core/app/NotificationChannelCompat$Builder;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $category:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/discord/notifications/renderer/NotificationChannels$Category;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;->$category:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    iput-object p2, p0, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/core/app/NotificationChannelCompat;

    check-cast p2, Landroidx/core/app/NotificationChannelCompat$Builder;

    invoke-virtual {p0, p1, p2}, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;->invoke(Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;->$category:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    sget-object v1, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/discord/notifications/renderer/NotificationChannels;->INSTANCE:Lcom/discord/notifications/renderer/NotificationChannels;

    invoke-static {v0, p1, p2}, Lcom/discord/notifications/renderer/NotificationChannels;->access$configureMediaChannel(Lcom/discord/notifications/renderer/NotificationChannels;Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/discord/notifications/renderer/NotificationChannels;->INSTANCE:Lcom/discord/notifications/renderer/NotificationChannels;

    iget-object v1, p0, Lcom/discord/notifications/renderer/NotificationChannels$init$notificationChannels$1$1;->$context:Landroid/content/Context;

    invoke-static {v0, v1, p1, p2}, Lcom/discord/notifications/renderer/NotificationChannels;->access$configureCallChannel(Lcom/discord/notifications/renderer/NotificationChannels;Landroid/content/Context;Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V

    :goto_0
    return-void
.end method
