.class public Lorg/webrtc/DataChannel$Init;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/DataChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Init"
.end annotation


# instance fields
.field public id:I

.field public maxRetransmitTimeMs:I

.field public maxRetransmits:I

.field public negotiated:Z

.field public ordered:Z

.field public protocol:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/webrtc/DataChannel$Init;->ordered:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lorg/webrtc/DataChannel$Init;->maxRetransmitTimeMs:I

    .line 9
    .line 10
    iput v0, p0, Lorg/webrtc/DataChannel$Init;->maxRetransmits:I

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    iput-object v1, p0, Lorg/webrtc/DataChannel$Init;->protocol:Ljava/lang/String;

    .line 15
    .line 16
    iput v0, p0, Lorg/webrtc/DataChannel$Init;->id:I

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method getId()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget v0, p0, Lorg/webrtc/DataChannel$Init;->id:I

    return v0
.end method

.method getMaxRetransmitTimeMs()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget v0, p0, Lorg/webrtc/DataChannel$Init;->maxRetransmitTimeMs:I

    return v0
.end method

.method getMaxRetransmits()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget v0, p0, Lorg/webrtc/DataChannel$Init;->maxRetransmits:I

    return v0
.end method

.method getNegotiated()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget-boolean v0, p0, Lorg/webrtc/DataChannel$Init;->negotiated:Z

    return v0
.end method

.method getOrdered()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget-boolean v0, p0, Lorg/webrtc/DataChannel$Init;->ordered:Z

    return v0
.end method

.method getProtocol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Init"
    .end annotation

    iget-object v0, p0, Lorg/webrtc/DataChannel$Init;->protocol:Ljava/lang/String;

    return-object v0
.end method
