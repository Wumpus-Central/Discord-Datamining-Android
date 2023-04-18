.class final Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt;->renderNotificationMessageContent(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/text/MatchResult;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lkotlin/text/MatchResult;",
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
.field public static final INSTANCE:Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;

    invoke-direct {v0}, Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;-><init>()V

    sput-object v0, Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;->INSTANCE:Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lkotlin/text/MatchResult;->c()Lpi/g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lpi/g;->get(I)Lpi/f;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lpi/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const-string v0, "X"

    invoke-static {v0, p1}, Lpi/l;->z(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/text/MatchResult;

    invoke-virtual {p0, p1}, Lcom/discord/notifications/renderer/utils/RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$1;->invoke(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
