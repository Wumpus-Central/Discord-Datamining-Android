.class public final Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;
.super Lcom/discord/chat/presentation/message/view/MediaView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\u00020\u0008X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;",
        "Lcom/discord/chat/presentation/message/view/MediaView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "target",
        "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;",
        "getTarget",
        "()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;",
        "setTarget",
        "(Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;)V",
        "",
        "width",
        "",
        "height",
        "maxHeightPx",
        "maxWidthPx",
        "Target",
        "chat_release"
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
.field public target:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 2
    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/MediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final getTarget()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->target:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "target"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setTarget(IIII)V
    .locals 10

    .line 2
    new-instance v0, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;-><init>(IIII)V

    .line 3
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->target:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->getTarget()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    :cond_0
    invoke-virtual {p0, v0}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->setTarget(Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;)V

    .line 6
    :cond_1
    sget-object v1, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;->INSTANCE:Lcom/discord/chat/presentation/media/MediaContainingViewResizer;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->getTarget()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    move-result-object p1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->getTarget()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    move-result-object p1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;->getHeight()I

    move-result v4

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v9, 0x0

    move-object v2, p0

    move v5, p4

    move v6, p3

    invoke-static/range {v1 .. v9}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;->resizeLayoutParams$default(Lcom/discord/chat/presentation/media/MediaContainingViewResizer;Landroid/view/View;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ILjava/lang/Object;)V

    return-void
.end method

.method public final setTarget(Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;->target:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;

    return-void
.end method
