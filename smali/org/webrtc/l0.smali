.class public final synthetic Lorg/webrtc/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoder$Callback;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lorg/webrtc/l0;->a:J

    return-void
.end method


# virtual methods
.method public final onEncodedFrame(Lorg/webrtc/EncodedImage;Lorg/webrtc/VideoEncoder$CodecSpecificInfo;)V
    .locals 2

    iget-wide v0, p0, Lorg/webrtc/l0;->a:J

    invoke-static {v0, v1, p1, p2}, Lorg/webrtc/VideoEncoderWrapper;->a(JLorg/webrtc/EncodedImage;Lorg/webrtc/VideoEncoder$CodecSpecificInfo;)V

    return-void
.end method
