.class public final synthetic Lcom/discord/chat/presentation/message/view/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/MediaView;

.field public final synthetic l:Lcom/discord/media_player/MediaSource;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/c0;->k:Lcom/discord/chat/presentation/message/view/MediaView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/c0;->l:Lcom/discord/media_player/MediaSource;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/c0;->k:Lcom/discord/chat/presentation/message/view/MediaView;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/c0;->l:Lcom/discord/media_player/MediaSource;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/view/MediaView;->a(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;Landroid/view/View;)V

    return-void
.end method
