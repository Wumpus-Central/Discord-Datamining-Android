.class final Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$5;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/image/animated_image/apng/APNGView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/image/animated_image/apng/APNGView$Config;",
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
        "Lcom/discord/image/animated_image/apng/APNGView$Config;",
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
.field final synthetic this$0:Lcom/discord/image/animated_image/apng/APNGView;


# direct methods
.method constructor <init>(Lcom/discord/image/animated_image/apng/APNGView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$5;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-virtual {p0, p1}, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$5;->invoke(Lcom/discord/image/animated_image/apng/APNGView$Config;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/image/animated_image/apng/APNGView$Config;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$5;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    invoke-static {v0, p1}, Lcom/discord/image/animated_image/apng/APNGView;->access$fetchAPNG(Lcom/discord/image/animated_image/apng/APNGView;Lcom/discord/image/animated_image/apng/APNGView$Config;)V

    return-void
.end method