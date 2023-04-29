.class final Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$4;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "config",
        "Lcom/discord/image/animated_image/apng/APNGView$Config;",
        "invoke",
        "(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;"
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

    iput-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$4;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$4;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/discord/image/animated_image/apng/APNGView;->Companion:Lcom/discord/image/animated_image/apng/APNGView$Companion;

    invoke-virtual {p1}, Lcom/discord/image/animated_image/apng/APNGView$Config;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/discord/image/animated_image/apng/APNGView$Companion;->access$hasFilename(Lcom/discord/image/animated_image/apng/APNGView$Companion;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-virtual {p0, p1}, Lcom/discord/image/animated_image/apng/APNGView$apngStateManager$4;->invoke(Lcom/discord/image/animated_image/apng/APNGView$Config;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
