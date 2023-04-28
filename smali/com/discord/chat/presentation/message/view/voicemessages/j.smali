.class public final synthetic Lcom/discord/chat/presentation/message/view/voicemessages/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/j;->a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/j;->a:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager$progressColorAnimator$2;->a(Lcom/discord/chat/databinding/AudioPlayerViewBinding;Landroid/animation/ValueAnimator;)V

    return-void
.end method
