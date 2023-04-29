.class final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->setUploadProgress(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getBinding()Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlayBackground:Landroid/widget/LinearLayout;

    const-string v1, "binding.uploadOverlayBackground"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;->this$0:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->access$setUploadFinished$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V

    return-void
.end method
