.class public Lorg/webrtc/VideoDecoderFallback;
.super Lorg/webrtc/WrappedNativeVideoDecoder;
.source "SourceFile"


# instance fields
.field private final fallback:Lorg/webrtc/VideoDecoder;

.field private final primary:Lorg/webrtc/VideoDecoder;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/webrtc/VideoDecoderFallback;->fallback:Lorg/webrtc/VideoDecoder;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/webrtc/VideoDecoderFallback;->primary:Lorg/webrtc/VideoDecoder;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static native nativeCreateDecoder(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)J
.end method


# virtual methods
.method public createNativeVideoDecoder()J
    .locals 2

    iget-object v0, p0, Lorg/webrtc/VideoDecoderFallback;->fallback:Lorg/webrtc/VideoDecoder;

    iget-object v1, p0, Lorg/webrtc/VideoDecoderFallback;->primary:Lorg/webrtc/VideoDecoder;

    invoke-static {v0, v1}, Lorg/webrtc/VideoDecoderFallback;->nativeCreateDecoder(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)J

    move-result-wide v0

    return-wide v0
.end method
