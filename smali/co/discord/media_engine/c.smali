.class public final synthetic Lco/discord/media_engine/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/hammerandchisel/libdiscord/Discord$VideoFrameCallback;


# instance fields
.field public final synthetic a:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/discord/media_engine/c;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final onFrame(Lorg/webrtc/VideoFrame;)Z
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/c;->a:Ljava/util/Set;

    invoke-static {v0, p1}, Lco/discord/media_engine/VideoStreamRenderer$Muxer;->a(Ljava/util/Set;Lorg/webrtc/VideoFrame;)Z

    move-result p1

    return p1
.end method
