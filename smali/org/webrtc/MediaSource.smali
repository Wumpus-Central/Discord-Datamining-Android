.class public Lorg/webrtc/MediaSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/MediaSource$State;
    }
.end annotation


# instance fields
.field private nativeSource:J

.field private final refCountDelegate:Lorg/webrtc/RefCountDelegate;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/webrtc/RefCountDelegate;

    .line 5
    .line 6
    new-instance v1, Lorg/webrtc/s;

    .line 7
    .line 8
    invoke-direct {v1, p1, p2}, Lorg/webrtc/s;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lorg/webrtc/RefCountDelegate;-><init>(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lorg/webrtc/MediaSource;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    .line 15
    .line 16
    iput-wide p1, p0, Lorg/webrtc/MediaSource;->nativeSource:J

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lorg/webrtc/MediaSource;->lambda$new$0(J)V

    return-void
.end method

.method private checkMediaSourceExists()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/webrtc/MediaSource;->nativeSource:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "MediaSource has been disposed."

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static synthetic lambda$new$0(J)V
    .locals 0

    invoke-static {p0, p1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    return-void
.end method

.method private static native nativeGetState(J)Lorg/webrtc/MediaSource$State;
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/webrtc/MediaSource;->checkMediaSourceExists()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/webrtc/MediaSource;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->release()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lorg/webrtc/MediaSource;->nativeSource:J

    .line 12
    .line 13
    return-void
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

.method protected getNativeMediaSource()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/webrtc/MediaSource;->checkMediaSourceExists()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lorg/webrtc/MediaSource;->nativeSource:J

    .line 5
    .line 6
    return-wide v0
    .line 7
    .line 8
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
.end method

.method runWithReference(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/webrtc/MediaSource;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->safeRetain()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/webrtc/MediaSource;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    .line 13
    .line 14
    invoke-virtual {p1}, Lorg/webrtc/RefCountDelegate;->release()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    iget-object v0, p0, Lorg/webrtc/MediaSource;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->release()V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_0
    :goto_0
    return-void
    .line 26
    .line 27
.end method

.method public state()Lorg/webrtc/MediaSource$State;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/webrtc/MediaSource;->checkMediaSourceExists()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lorg/webrtc/MediaSource;->nativeSource:J

    .line 5
    .line 6
    invoke-static {v0, v1}, Lorg/webrtc/MediaSource;->nativeGetState(J)Lorg/webrtc/MediaSource$State;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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
.end method
