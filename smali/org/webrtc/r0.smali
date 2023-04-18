.class public final synthetic Lorg/webrtc/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/VideoSource;

.field public final synthetic l:Lorg/webrtc/VideoFrame;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/VideoSource;Lorg/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/r0;->k:Lorg/webrtc/VideoSource;

    iput-object p2, p0, Lorg/webrtc/r0;->l:Lorg/webrtc/VideoFrame;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/r0;->k:Lorg/webrtc/VideoSource;

    iget-object v1, p0, Lorg/webrtc/r0;->l:Lorg/webrtc/VideoFrame;

    invoke-static {v0, v1}, Lorg/webrtc/VideoSource;->b(Lorg/webrtc/VideoSource;Lorg/webrtc/VideoFrame;)V

    return-void
.end method
