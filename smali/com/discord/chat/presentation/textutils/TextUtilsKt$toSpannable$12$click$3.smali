.class final Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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
.field final synthetic $contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

.field final synthetic $rc:Lcom/discord/chat/presentation/textutils/RenderContext;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    iput-object p2, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getOnTapMention()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/discord/primitives/UserId;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
