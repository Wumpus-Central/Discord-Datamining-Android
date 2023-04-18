.class public Lorg/webrtc/Metrics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/Metrics$HistogramInfo;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "Metrics"


# instance fields
.field public final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/webrtc/Metrics$HistogramInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/webrtc/Metrics;->map:Ljava/util/Map;

    .line 10
    .line 11
    return-void
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
.end method

.method private add(Ljava/lang/String;Lorg/webrtc/Metrics$HistogramInfo;)V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/Metrics;->map:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static enable()V
    .locals 0

    invoke-static {}, Lorg/webrtc/Metrics;->nativeEnable()V

    return-void
.end method

.method public static getAndReset()Lorg/webrtc/Metrics;
    .locals 1

    invoke-static {}, Lorg/webrtc/Metrics;->nativeGetAndReset()Lorg/webrtc/Metrics;

    move-result-object v0

    return-object v0
.end method

.method private static native nativeEnable()V
.end method

.method private static native nativeGetAndReset()Lorg/webrtc/Metrics;
.end method
