.class public final synthetic Lcom/discord/media/engine/video/egl_renderer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

.field public final synthetic l:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/a;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iput-object p2, p0, Lcom/discord/media/engine/video/egl_renderer/a;->l:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/a;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/a;->l:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->c(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
