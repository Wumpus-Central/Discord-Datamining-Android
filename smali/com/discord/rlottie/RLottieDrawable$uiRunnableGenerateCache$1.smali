.class final Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/rlottie/RLottieDrawable;-><init>(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/rlottie/RLottieDrawable;


# direct methods
.method constructor <init>(Lcom/discord/rlottie/RLottieDrawable;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$isRecycled$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getDestroyWhenDone$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getLottieCacheGenerateQueue$cp()Ljava/util/concurrent/ThreadPoolExecutor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableGenerateCacheQueue$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 42
    .line 43
    invoke-static {v2, v1}, Lcom/discord/rlottie/RLottieDrawable;->access$setCacheGenerateTask$p(Lcom/discord/rlottie/RLottieDrawable;Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$decodeFrameFinishedInternal(Lcom/discord/rlottie/RLottieDrawable;)V

    .line 52
    .line 53
    .line 54
    return-void
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
    .line 125
    .line 126
.end method
