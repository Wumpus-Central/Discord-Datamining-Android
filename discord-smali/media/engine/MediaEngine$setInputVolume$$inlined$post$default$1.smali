.class public final Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/MediaEngine;->setInputVolume$media_engine_release(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "com/discord/async_init/AsyncInitDispatcher$post$1"
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
.field final synthetic $volume$inlined:F

.field final synthetic this$0:Lcom/discord/media/engine/MediaEngine;


# direct methods
.method public constructor <init>(Lcom/discord/media/engine/MediaEngine;F)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;->this$0:Lcom/discord/media/engine/MediaEngine;

    iput p2, p0, Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;->$volume$inlined:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;->this$0:Lcom/discord/media/engine/MediaEngine;

    invoke-static {v0}, Lcom/discord/media/engine/MediaEngine;->access$getEngine(Lcom/discord/media/engine/MediaEngine;)Lcom/discord/native/engine/NativeEngine;

    move-result-object v0

    iget v1, p0, Lcom/discord/media/engine/MediaEngine$setInputVolume$$inlined$post$default$1;->$volume$inlined:F

    invoke-virtual {v0, v1}, Lcom/discord/native/engine/NativeEngine;->setInputVolume(F)V

    return-void
.end method
