.class public final synthetic Lcom/discord/chat/presentation/message/view/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/MediaView;

.field public final synthetic l:Z

.field public final synthetic m:Lcom/discord/media_player/MediaSource;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/d0;->k:Lcom/discord/chat/presentation/message/view/MediaView;

    iput-boolean p2, p0, Lcom/discord/chat/presentation/message/view/d0;->l:Z

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/d0;->m:Lcom/discord/media_player/MediaSource;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/d0;->k:Lcom/discord/chat/presentation/message/view/MediaView;

    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/view/d0;->l:Z

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/d0;->m:Lcom/discord/media_player/MediaSource;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/view/MediaView;->b(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;Landroid/view/View;)V

    return-void
.end method
