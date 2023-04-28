.class final Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MediaView;->registerForPortal()V
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
        "view",
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
.field final synthetic $mediaSource:Lcom/discord/media_player/MediaSource;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/MediaView;


# direct methods
.method constructor <init>(Lcom/discord/media_player/MediaSource;Lcom/discord/chat/presentation/message/view/MediaView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->$mediaSource:Lcom/discord/media_player/MediaSource;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "view"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->$mediaSource:Lcom/discord/media_player/MediaSource;

    invoke-virtual {v2}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    move-result-object v2

    iget-object v3, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    invoke-static {v3}, Lcom/discord/chat/presentation/message/view/MediaView;->access$getMediaSource$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/media_player/MediaSource;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->a(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 3
    iget-object v3, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7ff

    const/16 v16, 0x0

    invoke-static/range {v3 .. v16}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V

    .line 4
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 5
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    invoke-static {v1}, Lcom/discord/misc/utilities/measure/ViewMeasureExtensionsKt;->measureAndLayout(Landroid/view/View;)V

    .line 6
    :cond_1
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;->this$0:Lcom/discord/chat/presentation/message/view/MediaView;

    invoke-static {v1}, Lcom/discord/chat/presentation/message/view/MediaView;->access$getAttachStateChangeListener$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method
