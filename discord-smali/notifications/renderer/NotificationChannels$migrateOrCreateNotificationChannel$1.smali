.class final Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/notifications/renderer/NotificationChannels;->migrateOrCreateNotificationChannel$default(Lcom/discord/notifications/renderer/NotificationChannels;Landroid/content/Context;Lcom/discord/notifications/renderer/NotificationChannels$Category;ILjava/util/Map;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/core/app/NotificationChannelCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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
        "<anonymous parameter 0>",
        "Landroidx/core/app/NotificationChannelCompat;",
        "<anonymous parameter 1>",
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


# static fields
.field public static final INSTANCE:Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;

    invoke-direct {v0}, Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;-><init>()V

    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;->INSTANCE:Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/core/app/NotificationChannelCompat;

    check-cast p2, Landroidx/core/app/NotificationChannelCompat$Builder;

    invoke-virtual {p0, p1, p2}, Lcom/discord/notifications/renderer/NotificationChannels$migrateOrCreateNotificationChannel$1;->invoke(Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/core/app/NotificationChannelCompat;Landroidx/core/app/NotificationChannelCompat$Builder;)V
    .locals 0

    const-string p1, "<anonymous parameter 1>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
