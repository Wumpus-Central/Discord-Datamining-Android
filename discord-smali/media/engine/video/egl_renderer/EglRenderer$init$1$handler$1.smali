.class final Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Exception;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "ex",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
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
.field final synthetic this$0:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;


# direct methods
.method constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;->this$0:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;->invoke(Ljava/lang/Exception;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EglRenderer"

    const-string v1, "Exception on EglRenderer thread"

    .line 2
    invoke-static {v0, v1, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    iget-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;->this$0:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    invoke-static {p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->access$getHandlerLock$p(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;->this$0:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    monitor-enter p1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->access$setRenderThreadHandler$p(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Handler;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method
