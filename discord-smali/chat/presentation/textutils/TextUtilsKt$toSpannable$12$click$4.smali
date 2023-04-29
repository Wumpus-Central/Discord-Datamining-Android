.class final Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke",
        "(Landroid/view/View;)Ljava/lang/Boolean;"
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

    iput-object p1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    iput-object p2, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/view/View;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$rc:Lcom/discord/chat/presentation/textutils/RenderContext;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getOnLongPressChannel()Lkotlin/jvm/functions/Function4;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v0, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->getChannelId()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v1, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->getGuildId()Ljava/lang/String;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v2, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->getMessageId()Ljava/lang/String;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->$contentNode:Lcom/discord/chat/bridge/contentnode/ContentNode;

    check-cast v3, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->getOriginalLink()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-interface {p1, v0, v1, v2, v3}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;->invoke(Landroid/view/View;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
