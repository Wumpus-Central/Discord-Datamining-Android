.class public final synthetic Lcom/discord/media/engine/video/egl_renderer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/d;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iput-object p2, p0, Lcom/discord/media/engine/video/egl_renderer/d;->l:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/d;->k:Lcom/discord/media/engine/video/egl_renderer/EglRenderer;

    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/d;->l:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->e(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
