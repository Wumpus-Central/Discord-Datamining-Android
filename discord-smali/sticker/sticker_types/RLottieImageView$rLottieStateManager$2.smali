.class final Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sticker/sticker_types/RLottieImageView;-><init>(Landroid/content/Context;)V
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
.field final synthetic this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;


# direct methods
.method constructor <init>(Lcom/discord/sticker/sticker_types/RLottieImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$2;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieImageView;->pauseAnimation()V

    return-void
.end method
