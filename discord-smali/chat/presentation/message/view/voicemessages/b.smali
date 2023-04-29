.class public final synthetic Lcom/discord/chat/presentation/message/view/voicemessages/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 0

    invoke-static {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->a(I)V

    return-void
.end method
