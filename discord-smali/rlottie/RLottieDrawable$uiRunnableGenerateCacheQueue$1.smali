.class final Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;
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

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getCacheGenerateTask$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 18
    .line 19
    invoke-static {v3}, Lcom/discord/rlottie/RLottieDrawable;->access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 24
    .line 25
    invoke-static {v4}, Lcom/discord/rlottie/RLottieDrawable;->access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v0, v1, v2, v3, v4}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$createCache(Lcom/discord/rlottie/RLottieDrawable$Companion;JII)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableCacheFinished$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method
