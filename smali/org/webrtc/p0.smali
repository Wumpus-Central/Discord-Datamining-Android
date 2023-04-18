.class public final synthetic Lorg/webrtc/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/VideoFileRenderer;

.field public final synthetic l:Lorg/webrtc/VideoFrame$I420Buffer;

.field public final synthetic m:Lorg/webrtc/VideoFrame;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame$I420Buffer;Lorg/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/p0;->k:Lorg/webrtc/VideoFileRenderer;

    iput-object p2, p0, Lorg/webrtc/p0;->l:Lorg/webrtc/VideoFrame$I420Buffer;

    iput-object p3, p0, Lorg/webrtc/p0;->m:Lorg/webrtc/VideoFrame;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/p0;->k:Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/p0;->l:Lorg/webrtc/VideoFrame$I420Buffer;

    iget-object v2, p0, Lorg/webrtc/p0;->m:Lorg/webrtc/VideoFrame;

    invoke-static {v0, v1, v2}, Lorg/webrtc/VideoFileRenderer;->d(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame$I420Buffer;Lorg/webrtc/VideoFrame;)V

    return-void
.end method
