.class public final synthetic Lcom/discord/media/engine/video/egl_renderer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/c;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iput-wide p2, p0, Lcom/discord/media/engine/video/egl_renderer/c;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/c;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iget-wide v1, p0, Lcom/discord/media/engine/video/egl_renderer/c;->l:J

    invoke-static {v0, v1, v2}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->f(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V

    return-void
.end method
