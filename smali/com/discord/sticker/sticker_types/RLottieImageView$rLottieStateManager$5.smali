.class final Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "config",
        "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;",
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

    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    invoke-virtual {p0, p1}, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;->invoke(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$rLottieStateManager$5;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    invoke-static {v0, p1}, Lcom/discord/sticker/sticker_types/RLottieImageView;->access$fetchSticker(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V

    return-void
.end method
