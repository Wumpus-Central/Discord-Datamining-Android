.class public final synthetic Lcom/discord/chat/presentation/message/view/voicemessages/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

.field public final synthetic b:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/k;->a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/k;->b:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/k;->a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/k;->b:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$scaleAnimator$2;->a(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;Landroid/animation/ValueAnimator;)V

    return-void
.end method
