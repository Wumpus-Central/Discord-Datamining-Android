.class final Lcom/discord/chat/presentation/message/view/ImageAttachmentView$setContent$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/ImageAttachmentView;->setContent(Ljava/lang/String;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ILjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;",
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
.field final synthetic this$0:Lcom/discord/chat/presentation/message/view/ImageAttachmentView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/message/view/ImageAttachmentView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/ImageAttachmentView$setContent$2;->this$0:Lcom/discord/chat/presentation/message/view/ImageAttachmentView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/ImageAttachmentView$setContent$2;->invoke(Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;)V
    .locals 2

    const-string v0, "$this$setOptionalImageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/ImageAttachmentView$setContent$2;->this$0:Lcom/discord/chat/presentation/message/view/ImageAttachmentView;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/ImageAttachmentView;->getBinding()Lcom/discord/chat/databinding/ImageAttachmentViewBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/discord/chat/databinding/ImageAttachmentViewBinding;->image:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v1, "binding.image"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/discord/chat/presentation/message/utils/SetMediaImagePlaceholderStatesKt;->setMediaImagePlaceholderStates(Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;Lcom/facebook/drawee/view/SimpleDraweeView;)Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    return-void
.end method
