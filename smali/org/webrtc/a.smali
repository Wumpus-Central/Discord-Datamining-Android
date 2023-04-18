.class public final synthetic Lorg/webrtc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoSink;


# instance fields
.field public final synthetic k:Lorg/webrtc/Camera1Session;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/Camera1Session;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/a;->k:Lorg/webrtc/Camera1Session;

    return-void
.end method


# virtual methods
.method public final onFrame(Lorg/webrtc/VideoFrame;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/a;->k:Lorg/webrtc/Camera1Session;

    invoke-static {v0, p1}, Lorg/webrtc/Camera1Session;->a(Lorg/webrtc/Camera1Session;Lorg/webrtc/VideoFrame;)V

    return-void
.end method
