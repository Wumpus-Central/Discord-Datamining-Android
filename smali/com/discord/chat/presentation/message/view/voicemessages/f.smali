.class public final synthetic Lcom/discord/chat/presentation/message/view/voicemessages/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

.field public final synthetic l:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->k:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->l:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->m:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->k:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->l:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    iget-boolean v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/f;->m:Z

    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->a(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZLandroid/view/View;)V

    return-void
.end method
