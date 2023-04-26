.class final Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Watchdog"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;",
        "Ljava/lang/Runnable;",
        "(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)V",
        "run",
        "",
        "media_engine_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;


# direct methods
.method public constructor <init>(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;->this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;->this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->access$getFramerate$p(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;->this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->access$getLastFrameTimestamp$p(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;->this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-static {}, Lorg/webrtc/TimestampAligner;->getRtcTimeNanos()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    sub-long/2addr v4, v2

    .line 28
    invoke-static {v1}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->access$getIntervalNanos$p(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    int-to-long v2, v0

    .line 33
    cmp-long v0, v4, v2

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->access$getNativeObserver$p(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;)Lco/discord/media_engine/NativeCapturerObserver;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    const-string v0, "nativeObserver"

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    :cond_0
    invoke-virtual {v0}, Lco/discord/media_engine/NativeCapturerObserver;->repeatLastFrame()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Watchdog;->this$0:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->scheduleWatchdog()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
.end method
