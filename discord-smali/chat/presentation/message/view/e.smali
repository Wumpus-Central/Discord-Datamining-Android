.class public final synthetic Lcom/discord/chat/presentation/message/view/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/e;->a:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/e;->a:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->c(Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;Landroid/animation/ValueAnimator;)V

    return-void
.end method