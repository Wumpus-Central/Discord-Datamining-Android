.class Lorg/webrtc/VideoFileRenderer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/webrtc/VideoFileRenderer;-><init>(Ljava/lang/String;IILorg/webrtc/EglBase$Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/VideoFileRenderer;

.field final synthetic val$sharedContext:Lorg/webrtc/EglBase$Context;


# direct methods
.method constructor <init>(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/EglBase$Context;)V
    .locals 0

    iput-object p1, p0, Lorg/webrtc/VideoFileRenderer$1;->this$0:Lorg/webrtc/VideoFileRenderer;

    iput-object p2, p0, Lorg/webrtc/VideoFileRenderer$1;->val$sharedContext:Lorg/webrtc/EglBase$Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$1;->this$0:Lorg/webrtc/VideoFileRenderer;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/webrtc/VideoFileRenderer$1;->val$sharedContext:Lorg/webrtc/EglBase$Context;

    .line 4
    .line 5
    sget-object v2, Lorg/webrtc/EglBase;->CONFIG_PIXEL_BUFFER:[I

    .line 6
    .line 7
    invoke-static {v1, v2}, Lorg/webrtc/g;->d(Lorg/webrtc/EglBase$Context;[I)Lorg/webrtc/EglBase;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lorg/webrtc/VideoFileRenderer;->access$002(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/EglBase;)Lorg/webrtc/EglBase;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$1;->this$0:Lorg/webrtc/VideoFileRenderer;

    .line 15
    .line 16
    invoke-static {v0}, Lorg/webrtc/VideoFileRenderer;->access$000(Lorg/webrtc/VideoFileRenderer;)Lorg/webrtc/EglBase;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lorg/webrtc/EglBase;->createDummyPbufferSurface()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$1;->this$0:Lorg/webrtc/VideoFileRenderer;

    .line 24
    .line 25
    invoke-static {v0}, Lorg/webrtc/VideoFileRenderer;->access$000(Lorg/webrtc/VideoFileRenderer;)Lorg/webrtc/EglBase;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lorg/webrtc/EglBase;->makeCurrent()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lorg/webrtc/VideoFileRenderer$1;->this$0:Lorg/webrtc/VideoFileRenderer;

    .line 33
    .line 34
    new-instance v1, Lorg/webrtc/YuvConverter;

    .line 35
    .line 36
    invoke-direct {v1}, Lorg/webrtc/YuvConverter;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lorg/webrtc/VideoFileRenderer;->access$102(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/YuvConverter;)Lorg/webrtc/YuvConverter;

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
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
.end method
