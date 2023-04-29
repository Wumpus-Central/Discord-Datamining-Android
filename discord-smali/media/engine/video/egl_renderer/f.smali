.class public final synthetic Lcom/discord/media/engine/video/egl_renderer/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/f;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/f;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    invoke-static {v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->b(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    return-void
.end method
