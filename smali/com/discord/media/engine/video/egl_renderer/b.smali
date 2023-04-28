.class public final synthetic Lcom/discord/media/engine/video/egl_renderer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

.field public final synthetic l:Landroid/os/Looper;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/b;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iput-object p2, p0, Lcom/discord/media/engine/video/egl_renderer/b;->l:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/b;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/b;->l:Landroid/os/Looper;

    invoke-static {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->a(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V

    return-void
.end method
