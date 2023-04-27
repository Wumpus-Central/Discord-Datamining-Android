.class public Lcom/discord/rlottie/RLottieDrawable;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;,
        Lcom/discord/rlottie/RLottieDrawable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0016\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0003\u007f\u0080\u0001BC\u0008\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fBO\u0008\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010U\u001a\u00020V2\u0008\u0010W\u001a\u0004\u0018\u00010\'J\u0006\u0010X\u001a\u00020VJ\u0008\u0010Y\u001a\u00020VH\u0002J\u0006\u0010Z\u001a\u00020VJ\u0008\u0010[\u001a\u00020VH\u0002J\u0010\u0010\\\u001a\u00020V2\u0006\u0010]\u001a\u00020^H\u0016J\u0008\u0010_\u001a\u00020\u0006H\u0016J\u0008\u0010`\u001a\u00020\u0006H\u0016J\u0008\u0010a\u001a\u00020\u0006H\u0016J\u0008\u0010b\u001a\u00020\u0006H\u0016J\u0008\u0010c\u001a\u00020\u0006H\u0016J\u0006\u0010d\u001a\u00020\tJ\u0008\u0010e\u001a\u00020\tH\u0002J\u0008\u0010f\u001a\u00020VH\u0002J\u0008\u00101\u001a\u00020\tH\u0016J\u0010\u0010g\u001a\u00020V2\u0006\u0010h\u001a\u00020,H\u0014J\u0006\u0010i\u001a\u00020VJ\u0008\u0010j\u001a\u00020VH\u0002J\u0010\u0010k\u001a\u00020V2\u0008\u0010W\u001a\u0004\u0018\u00010\'J\u001b\u0010l\u001a\u00020V2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;\u00a2\u0006\u0002\u0010nJ\u0008\u0010o\u001a\u00020VH\u0002J\u0006\u0010p\u001a\u00020\tJ\u0008\u0010q\u001a\u00020\tH\u0002J\u000e\u0010r\u001a\u00020V2\u0006\u0010s\u001a\u00020\tJ\u0010\u0010t\u001a\u00020V2\u0008\u0010W\u001a\u0004\u0018\u00010\'J\u0016\u0010u\u001a\u00020V2\u0006\u0010v\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u0006J\u000e\u0010x\u001a\u00020V2\u0006\u0010s\u001a\u00020FJ\u000e\u0010y\u001a\u00020V2\u0006\u0010z\u001a\u00020\u000cJ\u001c\u0010{\u001a\u00020V2\u0014\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109J\u0008\u0010}\u001a\u00020VH\u0016J\u0008\u0010~\u001a\u00020VH\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010\u001a2\u0008\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u000e\u00100\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010<R\u000e\u0010=\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010>\u001a\u0004\u0018\u00010\u001a2\u0008\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010\u001cR\u001c\u0010@\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\'0B0AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010<R\u000e\u0010E\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010G\u001a\u0004\u0018\u00010\u001a2\u0008\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010\u001cR\u000e\u0010I\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0081\u0001"
    }
    d2 = {
        "Lcom/discord/rlottie/RLottieDrawable;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        "Landroid/graphics/drawable/Animatable;",
        "file",
        "Ljava/io/File;",
        "w",
        "",
        "h",
        "precache",
        "",
        "limitFps",
        "screenRefreshRate",
        "",
        "colorReplacement",
        "",
        "(Ljava/io/File;IIZZF[I)V",
        "context",
        "Landroid/content/Context;",
        "rawRes",
        "name",
        "",
        "width",
        "height",
        "startDecode",
        "(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V",
        "animatedBitmap",
        "Landroid/graphics/Bitmap;",
        "getAnimatedBitmap",
        "()Landroid/graphics/Bitmap;",
        "applyTransformation",
        "applyingLayerColors",
        "autoRepeatPlayCount",
        "<set-?>",
        "backgroundBitmap",
        "getBackgroundBitmap",
        "cacheGenerateTask",
        "Ljava/lang/Runnable;",
        "currentFrame",
        "currentParentView",
        "Landroid/view/View;",
        "customEndFrame",
        "decodeSingleFrame",
        "destroyWhenDone",
        "dstRect",
        "Landroid/graphics/Rect;",
        "forceFrameRedraw",
        "isCurrentParentViewMaster",
        "()Z",
        "isRecycled",
        "isRunning",
        "lastFrameTime",
        "",
        "loadFrameRunnable",
        "loadFrameTask",
        "metaData",
        "nativePtr",
        "newColorUpdates",
        "Ljava/util/HashMap;",
        "newReplaceColors",
        "",
        "[Ljava/lang/Integer;",
        "nextFrameIsLast",
        "nextRenderingBitmap",
        "getNextRenderingBitmap",
        "parentViews",
        "Ljava/util/ArrayList;",
        "Ljava/lang/ref/WeakReference;",
        "pendingColorUpdates",
        "pendingReplaceColors",
        "playbackMode",
        "Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;",
        "renderingBitmap",
        "getRenderingBitmap",
        "scaleX",
        "scaleY",
        "shouldLimitFps",
        "singleFrameDecoded",
        "timeBetweenFrames",
        "uiRunnable",
        "uiRunnableCacheFinished",
        "uiRunnableGenerateCache",
        "uiRunnableGenerateCacheQueue",
        "uiRunnableLastFrame",
        "uiRunnableNoFrame",
        "vibrationPattern",
        "addParentView",
        "",
        "view",
        "beginApplyLayerColors",
        "checkRunningTasks",
        "commitApplyLayerColors",
        "decodeFrameFinishedInternal",
        "draw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "getIntrinsicHeight",
        "getIntrinsicWidth",
        "getMinimumHeight",
        "getMinimumWidth",
        "getOpacity",
        "hasBitmap",
        "hasParentView",
        "invalidateInternal",
        "onBoundsChange",
        "bounds",
        "recycle",
        "recycleResources",
        "removeParentView",
        "replaceColors",
        "colors",
        "([Ljava/lang/Integer;)V",
        "requestRedrawColors",
        "restart",
        "scheduleNextGetFrame",
        "setAllowDecodeSingleFrame",
        "value",
        "setCurrentParentView",
        "setLayerColor",
        "layerName",
        "color",
        "setPlaybackMode",
        "setProgress",
        "oldProgress",
        "setVibrationPattern",
        "pattern",
        "start",
        "stop",
        "Companion",
        "PlaybackMode",
        "rlottie_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

.field private static final buffer:[B

.field private static final loadFrameRunnableQueue:Ljava/util/concurrent/ExecutorService;

.field private static lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static readBuffer:[B

.field private static final uiHandler:Landroid/os/Handler;


# instance fields
.field private applyTransformation:Z

.field private applyingLayerColors:Z

.field private autoRepeatPlayCount:I

.field private volatile backgroundBitmap:Landroid/graphics/Bitmap;

.field private cacheGenerateTask:Ljava/lang/Runnable;

.field private currentFrame:I

.field private currentParentView:Landroid/view/View;

.field private customEndFrame:I

.field private decodeSingleFrame:Z

.field private destroyWhenDone:Z

.field private final dstRect:Landroid/graphics/Rect;

.field private forceFrameRedraw:Z

.field private height:I

.field private volatile isRecycled:Z

.field private volatile isRunning:Z

.field private lastFrameTime:J

.field private final loadFrameRunnable:Ljava/lang/Runnable;

.field private loadFrameTask:Ljava/lang/Runnable;

.field private final metaData:[I

.field private volatile nativePtr:J

.field private final newColorUpdates:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private newReplaceColors:[Ljava/lang/Integer;

.field private volatile nextFrameIsLast:Z

.field private volatile nextRenderingBitmap:Landroid/graphics/Bitmap;

.field private final parentViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile pendingColorUpdates:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private pendingReplaceColors:[Ljava/lang/Integer;

.field private playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

.field private volatile renderingBitmap:Landroid/graphics/Bitmap;

.field private scaleX:F

.field private scaleY:F

.field private screenRefreshRate:F

.field private shouldLimitFps:Z

.field private singleFrameDecoded:Z

.field private timeBetweenFrames:I

.field private final uiRunnable:Ljava/lang/Runnable;

.field private final uiRunnableCacheFinished:Ljava/lang/Runnable;

.field private final uiRunnableGenerateCache:Ljava/lang/Runnable;

.field private final uiRunnableGenerateCacheQueue:Ljava/lang/Runnable;

.field private final uiRunnableLastFrame:Ljava/lang/Runnable;

.field private final uiRunnableNoFrame:Ljava/lang/Runnable;

.field private vibrationPattern:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/rlottie/RLottieDrawable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/discord/rlottie/RLottieDrawable;->uiHandler:Landroid/os/Handler;

    .line 19
    .line 20
    const/high16 v0, 0x10000

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    sput-object v0, Lcom/discord/rlottie/RLottieDrawable;->readBuffer:[B

    .line 25
    .line 26
    const/16 v0, 0x1000

    .line 27
    .line 28
    new-array v0, v0, [B

    .line 29
    .line 30
    sput-object v0, Lcom/discord/rlottie/RLottieDrawable;->buffer:[B

    .line 31
    .line 32
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameRunnableQueue:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    return-void
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

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;IIF)V
    .locals 11

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v10}, Lcom/discord/rlottie/RLottieDrawable;-><init>(Landroid/content/Context;ILjava/lang/String;IIFZ[IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;IIFZ)V
    .locals 11

    const/4 v8, 0x0

    const/16 v9, 0x80

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v10}, Lcom/discord/rlottie/RLottieDrawable;-><init>(Landroid/content/Context;ILjava/lang/String;IIFZ[IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 42
    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    const/4 v0, -0x1

    .line 43
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->customEndFrame:I

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingColorUpdates:Ljava/util/HashMap;

    .line 46
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->LOOP:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    const/high16 v0, 0x42700000    # 60.0f

    .line 47
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleX:F

    .line 49
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleY:F

    .line 50
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 52
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableNoFrame$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableNoFrame$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableNoFrame:Ljava/lang/Runnable;

    .line 53
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableCacheFinished$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableCacheFinished$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableCacheFinished:Ljava/lang/Runnable;

    .line 54
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnable$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnable$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnable:Ljava/lang/Runnable;

    .line 55
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableLastFrame$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableLastFrame$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableLastFrame:Ljava/lang/Runnable;

    .line 56
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCacheQueue:Ljava/lang/Runnable;

    .line 57
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCache:Ljava/lang/Runnable;

    .line 58
    new-instance v0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;

    invoke-direct {v0, p0}, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameRunnable:Ljava/lang/Runnable;

    .line 59
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    const-string p2, "context.resources.openRawResource(rawRes)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance p2, Lkotlin/jvm/internal/e0;

    invoke-direct {p2}, Lkotlin/jvm/internal/e0;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    .line 61
    :goto_0
    sget-object v2, Lcom/discord/rlottie/RLottieDrawable;->buffer:[B

    array-length v3, v2

    invoke-virtual {p1, v2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    iput v3, p2, Lkotlin/jvm/internal/e0;->k:I

    const/4 v4, 0x2

    if-lez v3, :cond_1

    .line 62
    sget-object v5, Lcom/discord/rlottie/RLottieDrawable;->readBuffer:[B

    array-length v6, v5

    add-int/2addr v3, v1

    if-ge v6, v3, :cond_0

    .line 63
    array-length v3, v5

    mul-int/2addr v3, v4

    new-array v3, v3, [B

    .line 64
    invoke-static {v5, v0, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    sput-object v3, Lcom/discord/rlottie/RLottieDrawable;->readBuffer:[B

    .line 66
    :cond_0
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable;->readBuffer:[B

    iget v4, p2, Lkotlin/jvm/internal/e0;->k:I

    invoke-static {v2, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    iget v2, p2, Lkotlin/jvm/internal/e0;->k:I

    add-int/2addr v1, v2

    goto :goto_0

    .line 68
    :cond_1
    sget-object p2, Lcom/discord/rlottie/RLottieDrawable;->readBuffer:[B

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lri/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, v0, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 69
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 70
    iput p4, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    .line 71
    iput p5, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    .line 72
    iput p6, p0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    .line 73
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    const-string p2, "paint"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setFlags(I)V

    .line 74
    sget-object p1, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    iget-object p2, p0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    invoke-static {p1, v2, p3, p2, p8}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$createWithJson(Lcom/discord/rlottie/RLottieDrawable$Companion;Ljava/lang/String;Ljava/lang/String;[I[I)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 75
    iget-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    const/4 p2, 0x1

    aget p1, p1, p2

    int-to-float p1, p1

    const/high16 p3, 0x447a0000    # 1000.0f

    div-float/2addr p3, p1

    float-to-int p1, p3

    const/16 p3, 0x10

    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->timeBetweenFrames:I

    .line 76
    sget-object p1, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->LOOP:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    if-eqz p7, :cond_2

    .line 77
    invoke-virtual {p0, p2}, Lcom/discord/rlottie/RLottieDrawable;->setAllowDecodeSingleFrame(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    const-string p2, "RLottieDrawable"

    const-string p3, "Error Constructing"

    .line 78
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ILjava/lang/String;IIFZ[IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v9, v1

    goto :goto_0

    :cond_0
    move/from16 v9, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_1

    :cond_1
    move-object/from16 v10, p8

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    .line 40
    invoke-direct/range {v2 .. v10}, Lcom/discord/rlottie/RLottieDrawable;-><init>(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;IIZZF)V
    .locals 10

    const/4 v7, 0x0

    const/16 v8, 0x40

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v9}, Lcom/discord/rlottie/RLottieDrawable;-><init>(Ljava/io/File;IIZZF[IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;IIZZF[I)V
    .locals 11

    move-object v0, p0

    const-string v1, "file"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    const/4 v1, 0x3

    new-array v1, v1, [I

    .line 3
    iput-object v1, v0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    const/4 v3, -0x1

    .line 4
    iput v3, v0, Lcom/discord/rlottie/RLottieDrawable;->customEndFrame:I

    .line 5
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 6
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->pendingColorUpdates:Ljava/util/HashMap;

    .line 7
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->LOOP:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    const/high16 v3, 0x42700000    # 60.0f

    .line 8
    iput v3, v0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 9
    iput v3, v0, Lcom/discord/rlottie/RLottieDrawable;->scaleX:F

    .line 10
    iput v3, v0, Lcom/discord/rlottie/RLottieDrawable;->scaleY:F

    .line 11
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 12
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 13
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnableNoFrame$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableNoFrame$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableNoFrame:Ljava/lang/Runnable;

    .line 14
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnableCacheFinished$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableCacheFinished$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableCacheFinished:Ljava/lang/Runnable;

    .line 15
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnable$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnable$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnable:Ljava/lang/Runnable;

    .line 16
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnableLastFrame$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableLastFrame$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableLastFrame:Ljava/lang/Runnable;

    .line 17
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCacheQueue$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCacheQueue:Ljava/lang/Runnable;

    .line 18
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$uiRunnableGenerateCache$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCache:Ljava/lang/Runnable;

    .line 19
    new-instance v3, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;

    invoke-direct {v3, p0}, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;-><init>(Lcom/discord/rlottie/RLottieDrawable;)V

    iput-object v3, v0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameRunnable:Ljava/lang/Runnable;

    move v5, p2

    .line 20
    iput v5, v0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    move v6, p3

    .line 21
    iput v6, v0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    move/from16 v3, p5

    .line 22
    iput-boolean v3, v0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    move/from16 v3, p6

    .line 23
    iput v3, v0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v3

    const-string v4, "paint"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFlags(I)V

    .line 25
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 26
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v7, "file.absolutePath"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-boolean v10, v0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    move-object v7, v1

    move v8, p4

    move-object/from16 v9, p7

    .line 28
    invoke-static/range {v3 .. v10}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$create(Lcom/discord/rlottie/RLottieDrawable$Companion;Ljava/lang/String;II[IZ[IZ)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    if-eqz p4, :cond_0

    .line 29
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable;->lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v3, :cond_0

    .line 30
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v5, 0x1

    const/4 v6, 0x1

    const-wide/16 v7, 0x0

    .line 31
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v4, v3

    .line 33
    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v3, Lcom/discord/rlottie/RLottieDrawable;->lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 34
    :cond_0
    iget-wide v3, v0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    .line 35
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 36
    :cond_1
    iget-boolean v2, v0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    aget v2, v1, v3

    const/16 v4, 0x3c

    if-ge v2, v4, :cond_2

    const/4 v2, 0x0

    .line 37
    iput-boolean v2, v0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    .line 38
    :cond_2
    iget-boolean v2, v0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    if-eqz v2, :cond_3

    const/16 v2, 0x21

    goto :goto_0

    :cond_3
    const/16 v2, 0x10

    :goto_0
    aget v1, v1, v3

    int-to-float v1, v1

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v3, v1

    float-to-int v1, v3

    .line 39
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/discord/rlottie/RLottieDrawable;->timeBetweenFrames:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;IIZZF[IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    .line 1
    invoke-direct/range {v1 .. v8}, Lcom/discord/rlottie/RLottieDrawable;-><init>(Ljava/io/File;IIZZF[I)V

    return-void
.end method

.method public static final synthetic access$decodeFrameFinishedInternal(Lcom/discord/rlottie/RLottieDrawable;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->decodeFrameFinishedInternal()V

    return-void
.end method

.method public static final synthetic access$getAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;)I
    .locals 0

    iget p0, p0, Lcom/discord/rlottie/RLottieDrawable;->autoRepeatPlayCount:I

    return p0
.end method

.method public static final synthetic access$getBackgroundBitmap$p(Lcom/discord/rlottie/RLottieDrawable;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getCacheGenerateTask$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I
    .locals 0

    iget p0, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    return p0
.end method

.method public static final synthetic access$getDestroyWhenDone$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    return p0
.end method

.method public static final synthetic access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I
    .locals 0

    iget p0, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    return p0
.end method

.method public static final synthetic access$getLoadFrameTask$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getLottieCacheGenerateQueue$cp()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static final synthetic access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    return-object p0
.end method

.method public static final synthetic access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J
    .locals 2

    iget-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    return-wide v0
.end method

.method public static final synthetic access$getNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    return p0
.end method

.method public static final synthetic access$getNextRenderingBitmap$p(Lcom/discord/rlottie/RLottieDrawable;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingColorUpdates:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;)[Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingReplaceColors:[Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    return-object p0
.end method

.method public static final synthetic access$getShouldLimitFps$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    return p0
.end method

.method public static final synthetic access$getSingleFrameDecoded$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    return p0
.end method

.method public static final synthetic access$getUiHandler$cp()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->uiHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public static final synthetic access$getUiRunnable$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getUiRunnableCacheFinished$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableCacheFinished:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getUiRunnableGenerateCache$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCache:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getUiRunnableGenerateCacheQueue$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableGenerateCacheQueue:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getUiRunnableNoFrame$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/discord/rlottie/RLottieDrawable;->uiRunnableNoFrame:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I
    .locals 0

    iget p0, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    return p0
.end method

.method public static final synthetic access$invalidateInternal(Lcom/discord/rlottie/RLottieDrawable;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->invalidateInternal()V

    return-void
.end method

.method public static final synthetic access$isRecycled$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRecycled:Z

    return p0
.end method

.method public static final synthetic access$isRunning$p(Lcom/discord/rlottie/RLottieDrawable;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    return p0
.end method

.method public static final synthetic access$setAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;I)V
    .locals 0

    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->autoRepeatPlayCount:I

    return-void
.end method

.method public static final synthetic access$setBackgroundBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public static final synthetic access$setCacheGenerateTask$p(Lcom/discord/rlottie/RLottieDrawable;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V
    .locals 0

    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    return-void
.end method

.method public static final synthetic access$setDestroyWhenDone$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    return-void
.end method

.method public static final synthetic access$setHeight$p(Lcom/discord/rlottie/RLottieDrawable;I)V
    .locals 0

    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    return-void
.end method

.method public static final synthetic access$setLoadFrameTask$p(Lcom/discord/rlottie/RLottieDrawable;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic access$setLottieCacheGenerateQueue$cp(Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    sput-object p0, Lcom/discord/rlottie/RLottieDrawable;->lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static final synthetic access$setNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;J)V
    .locals 0

    iput-wide p1, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    return-void
.end method

.method public static final synthetic access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    return-void
.end method

.method public static final synthetic access$setNextRenderingBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public static final synthetic access$setPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingColorUpdates:Ljava/util/HashMap;

    return-void
.end method

.method public static final synthetic access$setPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;[Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingReplaceColors:[Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic access$setPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    return-void
.end method

.method public static final synthetic access$setRecycled$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->isRecycled:Z

    return-void
.end method

.method public static final synthetic access$setRunning$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    return-void
.end method

.method public static final synthetic access$setShouldLimitFps$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->shouldLimitFps:Z

    return-void
.end method

.method public static final synthetic access$setSingleFrameDecoded$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    return-void
.end method

.method public static final synthetic access$setWidth$p(Lcom/discord/rlottie/RLottieDrawable;I)V
    .locals 0

    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    return-void
.end method

.method private final checkRunningTasks()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->lottieCacheGenerateQueue:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    .line 22
    .line 23
    :cond_1
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->hasParentView()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 38
    .line 39
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    :cond_2
    return-void
    .line 42
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

.method private final decodeFrameFinishedInternal()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->checkRunningTasks()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-wide v3, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 19
    .line 20
    cmp-long v0, v3, v1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 25
    .line 26
    iget-wide v3, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 27
    .line 28
    invoke-static {v0, v3, v4}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$destroy(Lcom/discord/rlottie/RLottieDrawable$Companion;J)V

    .line 29
    .line 30
    .line 31
    iput-wide v1, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 32
    .line 33
    :cond_0
    iget-wide v3, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 34
    .line 35
    cmp-long v0, v3, v1

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->recycleResources()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->hasParentView()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/discord/rlottie/RLottieDrawable;->stop()V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 53
    .line 54
    .line 55
    return-void
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

.method private final hasParentView()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    if-lez v0, :cond_2

    .line 17
    .line 18
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/view/View;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v2
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

.method private final invalidateInternal()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
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

.method private final isCurrentParentViewMaster()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    if-lez v0, :cond_3

    .line 16
    .line 17
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/view/View;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->currentParentView:Landroid/view/View;

    .line 55
    .line 56
    if-ne v0, v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v1, v3

    .line 60
    :cond_3
    :goto_1
    return v1
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

.method private final recycleResources()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    :cond_3
    return-void
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

.method private final requestRedrawColors()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->applyingLayerColors:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->decodeSingleFrame:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    if-gt v0, v1, :cond_0

    .line 18
    .line 19
    iput v2, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 20
    .line 21
    :cond_0
    iput-boolean v2, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    .line 22
    .line 23
    iput-boolean v2, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 33
    .line 34
    :cond_1
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->invalidateInternal()V

    .line 35
    .line 36
    .line 37
    return-void
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

.method private final scheduleNextGetFrame()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    .line 18
    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->decodeSingleFrame:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    xor-int/2addr v0, v1

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingColorUpdates:Ljava/util/HashMap;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newReplaceColors:[Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->pendingReplaceColors:[Ljava/lang/Integer;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newReplaceColors:[Ljava/lang/Integer;

    .line 66
    .line 67
    :cond_2
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameRunnableQueue:Ljava/util/concurrent/ExecutorService;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameRunnable:Ljava/lang/Runnable;

    .line 70
    .line 71
    iput-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 72
    .line 73
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 78
    return v0
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


# virtual methods
.method public final addParentView(Landroid/view/View;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_3

    .line 13
    .line 14
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/view/View;

    .line 27
    .line 28
    if-ne v3, p1, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v0, v0, -0x1

    .line 51
    .line 52
    add-int/lit8 v2, v2, -0x1

    .line 53
    .line 54
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
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
.end method

.method public final beginApplyLayerColors()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->applyingLayerColors:Z

    return-void
.end method

.method public final commitApplyLayerColors()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->applyingLayerColors:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->applyingLayerColors:Z

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/discord/rlottie/RLottieDrawable;->decodeSingleFrame:Z

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget v1, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-gt v1, v2, :cond_1

    .line 21
    .line 22
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 23
    .line 24
    :cond_1
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 36
    .line 37
    :cond_2
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->invalidateInternal()V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
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

.method public draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_11

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Lcom/discord/rlottie/RLottieDrawable;->lastFrameTime:J

    .line 25
    .line 26
    sub-long v2, v0, v2

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iget v4, p0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    .line 33
    .line 34
    const/16 v5, 0x3c

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    cmpg-float v4, v4, v5

    .line 38
    .line 39
    if-gtz v4, :cond_1

    .line 40
    .line 41
    iget v4, p0, Lcom/discord/rlottie/RLottieDrawable;->timeBetweenFrames:I

    .line 42
    .line 43
    add-int/lit8 v4, v4, -0x6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget v4, p0, Lcom/discord/rlottie/RLottieDrawable;->timeBetweenFrames:I

    .line 47
    .line 48
    :goto_0
    iget-boolean v6, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 49
    .line 50
    const-wide/16 v7, 0x10

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x1

    .line 54
    const/4 v11, 0x0

    .line 55
    if-eqz v6, :cond_9

    .line 56
    .line 57
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 58
    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 66
    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_2
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    if-eqz v6, :cond_d

    .line 73
    .line 74
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    int-to-long v12, v4

    .line 79
    cmp-long v6, v2, v12

    .line 80
    .line 81
    if-ltz v6, :cond_d

    .line 82
    .line 83
    :cond_3
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->isCurrentParentViewMaster()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_d

    .line 88
    .line 89
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->vibrationPattern:Ljava/util/HashMap;

    .line 90
    .line 91
    if-eqz v6, :cond_6

    .line 92
    .line 93
    iget-object v12, p0, Lcom/discord/rlottie/RLottieDrawable;->currentParentView:Landroid/view/View;

    .line 94
    .line 95
    if-eqz v12, :cond_6

    .line 96
    .line 97
    if-nez v6, :cond_4

    .line 98
    .line 99
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 100
    .line 101
    .line 102
    :cond_4
    iget v12, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 103
    .line 104
    sub-int/2addr v12, v10

    .line 105
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    invoke-virtual {v6, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Ljava/lang/Integer;

    .line 114
    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    iget-object v12, p0, Lcom/discord/rlottie/RLottieDrawable;->currentParentView:Landroid/view/View;

    .line 118
    .line 119
    if-eqz v12, :cond_6

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-ne v6, v10, :cond_5

    .line 126
    .line 127
    move v6, v9

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const/4 v6, 0x3

    .line 130
    :goto_1
    const/4 v13, 0x2

    .line 131
    invoke-virtual {v12, v6, v13}, Landroid/view/View;->performHapticFeedback(II)Z

    .line 132
    .line 133
    .line 134
    :cond_6
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 135
    .line 136
    iput-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    .line 137
    .line 138
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 139
    .line 140
    iput-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 141
    .line 142
    iget-boolean v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    .line 143
    .line 144
    if-eqz v6, :cond_7

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/discord/rlottie/RLottieDrawable;->stop()V

    .line 147
    .line 148
    .line 149
    :cond_7
    iput-object v11, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 150
    .line 151
    iput-boolean v10, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 152
    .line 153
    iput-object v11, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 154
    .line 155
    iget v6, p0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    .line 156
    .line 157
    cmpg-float v5, v6, v5

    .line 158
    .line 159
    if-gtz v5, :cond_8

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    int-to-long v4, v4

    .line 163
    sub-long/2addr v2, v4

    .line 164
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    sub-long/2addr v0, v2

    .line 169
    :goto_2
    iput-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->lastFrameTime:J

    .line 170
    .line 171
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    iget-boolean v6, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 176
    .line 177
    if-nez v6, :cond_a

    .line 178
    .line 179
    iget-boolean v6, p0, Lcom/discord/rlottie/RLottieDrawable;->decodeSingleFrame:Z

    .line 180
    .line 181
    if-eqz v6, :cond_d

    .line 182
    .line 183
    int-to-long v12, v4

    .line 184
    cmp-long v6, v2, v12

    .line 185
    .line 186
    if-ltz v6, :cond_d

    .line 187
    .line 188
    :cond_a
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 189
    .line 190
    if-eqz v6, :cond_d

    .line 191
    .line 192
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 193
    .line 194
    iput-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    .line 195
    .line 196
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 197
    .line 198
    iput-object v6, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 199
    .line 200
    iput-object v11, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 201
    .line 202
    iput-boolean v10, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 203
    .line 204
    iput-object v11, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 205
    .line 206
    iget v6, p0, Lcom/discord/rlottie/RLottieDrawable;->screenRefreshRate:F

    .line 207
    .line 208
    cmpg-float v5, v6, v5

    .line 209
    .line 210
    if-gtz v5, :cond_b

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_b
    int-to-long v4, v4

    .line 214
    sub-long/2addr v2, v4

    .line 215
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v2

    .line 219
    sub-long/2addr v0, v2

    .line 220
    :goto_3
    iput-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->lastFrameTime:J

    .line 221
    .line 222
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 223
    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    iput-boolean v9, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 227
    .line 228
    iput-boolean v9, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 229
    .line 230
    :cond_c
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 231
    .line 232
    .line 233
    :cond_d
    :goto_4
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 234
    .line 235
    if-eqz v0, :cond_11

    .line 236
    .line 237
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->applyTransformation:Z

    .line 238
    .line 239
    if-eqz v0, :cond_e

    .line 240
    .line 241
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    int-to-float v0, v0

    .line 257
    iget v1, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    .line 258
    .line 259
    int-to-float v1, v1

    .line 260
    div-float/2addr v0, v1

    .line 261
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleX:F

    .line 262
    .line 263
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    int-to-float v0, v0

    .line 270
    iget v1, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    .line 271
    .line 272
    int-to-float v1, v1

    .line 273
    div-float/2addr v0, v1

    .line 274
    iput v0, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleY:F

    .line 275
    .line 276
    iput-boolean v9, p0, Lcom/discord/rlottie/RLottieDrawable;->applyTransformation:Z

    .line 277
    .line 278
    :cond_e
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 279
    .line 280
    .line 281
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->dstRect:Landroid/graphics/Rect;

    .line 282
    .line 283
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 284
    .line 285
    int-to-float v1, v1

    .line 286
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 287
    .line 288
    int-to-float v0, v0

    .line 289
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 290
    .line 291
    .line 292
    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleX:F

    .line 293
    .line 294
    iget v1, p0, Lcom/discord/rlottie/RLottieDrawable;->scaleY:F

    .line 295
    .line 296
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 297
    .line 298
    .line 299
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 300
    .line 301
    if-nez v0, :cond_f

    .line 302
    .line 303
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 304
    .line 305
    .line 306
    :cond_f
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    const/4 v2, 0x0

    .line 311
    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 312
    .line 313
    .line 314
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 315
    .line 316
    if-eqz v0, :cond_10

    .line 317
    .line 318
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->invalidateInternal()V

    .line 319
    .line 320
    .line 321
    :cond_10
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 322
    .line 323
    .line 324
    :cond_11
    :goto_5
    return-void
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
.end method

.method public final getAnimatedBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
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

.method public final getBackgroundBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->backgroundBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    return v0
.end method

.method public getMinimumHeight()I
    .locals 1

    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->height:I

    return v0
.end method

.method public getMinimumWidth()I
    .locals 1

    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->width:I

    return v0
.end method

.method public final getNextRenderingBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final getRenderingBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final hasBitmap()Z
    .locals 4

    iget-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->renderingBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nextRenderingBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "bounds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/graphics/drawable/BitmapDrawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->applyTransformation:Z

    .line 11
    .line 12
    return-void
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
.end method

.method public final recycle()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRecycled:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->checkRunningTasks()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->loadFrameTask:Ljava/lang/Runnable;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->cacheGenerateTask:Ljava/lang/Runnable;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-wide v0, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 27
    .line 28
    iget-wide v4, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 29
    .line 30
    invoke-static {v0, v4, v5}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$destroy(Lcom/discord/rlottie/RLottieDrawable$Companion;J)V

    .line 31
    .line 32
    .line 33
    iput-wide v2, p0, Lcom/discord/rlottie/RLottieDrawable;->nativePtr:J

    .line 34
    .line 35
    :cond_0
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->recycleResources()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->destroyWhenDone:Z

    .line 40
    .line 41
    :goto_0
    return-void
    .line 42
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

.method public final removeParentView(Landroid/view/View;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/view/View;

    .line 26
    .line 27
    if-eq v2, p1, :cond_1

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable;->parentViews:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-void
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
.end method

.method public final replaceColors([Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->newReplaceColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->requestRedrawColors()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final restart()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 2
    .line 3
    sget-object v1, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->ONCE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->autoRepeatPlayCount:I

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput v2, p0, Lcom/discord/rlottie/RLottieDrawable;->autoRepeatPlayCount:I

    .line 18
    .line 19
    iput-object v1, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/discord/rlottie/RLottieDrawable;->start()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    return v2
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

.method public final setAllowDecodeSingleFrame(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->decodeSingleFrame:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 6
    .line 7
    .line 8
    :cond_0
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
.end method

.method public final setCurrentParentView(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->currentParentView:Landroid/view/View;

    return-void
.end method

.method public final setLayerColor(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const-string v0, "layerName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->newColorUpdates:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->requestRedrawColors()V

    .line 16
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
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
.end method

.method public final setPlaybackMode(Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 7
    .line 8
    sget-object v1, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->ONCE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->FREEZE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 22
    .line 23
    return-void
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
.end method

.method public final setProgress(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    :goto_0
    move p1, v0

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpl-float v1, p1, v0

    .line 11
    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->metaData:[I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aget v0, v0, v1

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    mul-float/2addr v0, p1

    .line 22
    float-to-int p1, v0

    .line 23
    iput p1, p0, Lcom/discord/rlottie/RLottieDrawable;->currentFrame:I

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/discord/rlottie/RLottieDrawable;->nextFrameIsLast:Z

    .line 26
    .line 27
    iput-boolean v1, p0, Lcom/discord/rlottie/RLottieDrawable;->singleFrameDecoded:Z

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lcom/discord/rlottie/RLottieDrawable;->forceFrameRedraw:Z

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
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
.end method

.method public final setVibrationPattern(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable;->vibrationPattern:Ljava/util/HashMap;

    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable;->playbackMode:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 6
    .line 7
    sget-object v1, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->ONCE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lcom/discord/rlottie/RLottieDrawable;->autoRepeatPlayCount:I

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->scheduleNextGetFrame()Z

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/discord/rlottie/RLottieDrawable;->invalidateInternal()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
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

.method public stop()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/discord/rlottie/RLottieDrawable;->isRunning:Z

    return-void
.end method
