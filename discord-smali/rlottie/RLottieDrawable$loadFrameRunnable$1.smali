.class final Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;
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

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$isRecycled$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 3
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableNoFrame$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "RLottieDrawable"

    if-nez v0, :cond_2

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v2

    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v3}, Lcom/discord/rlottie/RLottieDrawable;->access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/discord/rlottie/RLottieDrawable;->access$setBackgroundBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "Error Loading Frame in Runnable"

    .line 6
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    .line 8
    :try_start_1
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v0

    if-eqz v2, :cond_4

    .line 9
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 10
    sget-object v5, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v6}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    move-result-wide v6

    invoke-static {v5, v6, v7, v4, v3}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$setLayerColor(Lcom/discord/rlottie/RLottieDrawable$Companion;JLjava/lang/String;I)V

    goto :goto_1

    .line 11
    :cond_3
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 12
    :catch_0
    :cond_4
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;)[Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 13
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    iget-object v4, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v4}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    move-result-wide v4

    invoke-static {v2}, Lkotlin/collections/b;->n0([Ljava/lang/Integer;)[I

    move-result-object v2

    invoke-static {v3, v4, v5, v2}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$replaceColors(Lcom/discord/rlottie/RLottieDrawable$Companion;J[I)V

    .line 14
    :cond_5
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;[Ljava/lang/Integer;)V

    .line 15
    :try_start_2
    sget-object v4, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 16
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    move-result-wide v5

    .line 17
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v7

    .line 18
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    move-result-object v8

    if-nez v8, :cond_6

    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 19
    :cond_6
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v9

    .line 20
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v10

    .line 21
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    :cond_7
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v11

    const/4 v12, 0x1

    .line 22
    invoke-static/range {v4 .. v12}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$getFrame(Lcom/discord/rlottie/RLottieDrawable$Companion;JILandroid/graphics/Bitmap;IIIZ)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_8

    .line 23
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableNoFrame$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 24
    :cond_8
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    move-result-object v2

    const/4 v3, 0x2

    aget v2, v2, v3

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    .line 25
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    move-result-object v2

    iget-object v5, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v5}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableGenerateCache$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    move-result-object v2

    aput v4, v2, v3

    .line 27
    :cond_9
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextRenderingBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V

    .line 28
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getShouldLimitFps$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_2

    :cond_a
    move v3, v0

    .line 29
    :goto_2
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v2

    add-int/2addr v2, v3

    iget-object v5, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v5}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    move-result-object v5

    aget v5, v5, v4

    if-ge v2, v5, :cond_c

    .line 30
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    move-result-object v2

    sget-object v5, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->FREEZE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    if-ne v2, v5, :cond_b

    .line 31
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 32
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v3

    add-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    goto :goto_3

    .line 33
    :cond_b
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v0, v2}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 34
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    goto :goto_3

    .line 35
    :cond_c
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    move-result-object v2

    sget-object v3, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->LOOP:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    if-ne v2, v3, :cond_d

    .line 36
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 37
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    goto :goto_3

    .line 38
    :cond_d
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    move-result-object v2

    sget-object v3, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->ONCE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    if-ne v2, v3, :cond_e

    .line 39
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 40
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 41
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;)I

    move-result v3

    add-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    goto :goto_3

    .line 42
    :cond_e
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v2, "Error loading frame"

    .line 43
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    :cond_f
    :goto_3
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnable$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
