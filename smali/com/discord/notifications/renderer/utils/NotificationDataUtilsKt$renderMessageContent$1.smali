.class final Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->renderMessageContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/react_strings/RenderContext;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/discord/react_strings/RenderContext;",
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
.field final synthetic $sticker:Lcom/discord/notifications/api/Sticker;


# direct methods
.method constructor <init>(Lcom/discord/notifications/api/Sticker;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;->$sticker:Lcom/discord/notifications/api/Sticker;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/react_strings/RenderContext;

    invoke-virtual {p0, p1}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;->invoke(Lcom/discord/react_strings/RenderContext;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/react_strings/RenderContext;)V
    .locals 2

    const-string v0, "$this$i18nFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/discord/react_strings/RenderContext;->getArgs()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt$renderMessageContent$1;->$sticker:Lcom/discord/notifications/api/Sticker;

    invoke-virtual {v0}, Lcom/discord/notifications/api/Sticker;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "stickerName"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method