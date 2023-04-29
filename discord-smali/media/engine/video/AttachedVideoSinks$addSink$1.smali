.class final synthetic Lcom/discord/media/engine/video/AttachedVideoSinks$addSink$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/video/AttachedVideoSinks;->addSink(Lcom/discord/media/engine/MediaEngine;Lorg/webrtc/VideoSink;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/webrtc/VideoFrame;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;

    const-string v4, "onFrame"

    const-string v5, "onFrame(Lorg/webrtc/VideoFrame;)Z"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lorg/webrtc/VideoFrame;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/e;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;

    invoke-virtual {v0, p1}, Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;->onFrame(Lorg/webrtc/VideoFrame;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lorg/webrtc/VideoFrame;

    invoke-virtual {p0, p1}, Lcom/discord/media/engine/video/AttachedVideoSinks$addSink$1;->invoke(Lorg/webrtc/VideoFrame;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
