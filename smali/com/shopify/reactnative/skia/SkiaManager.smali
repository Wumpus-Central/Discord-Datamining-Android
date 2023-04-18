.class public Lcom/shopify/reactnative/skia/SkiaManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation


# instance fields
.field private mContext:Lcom/facebook/react/bridge/ReactContext;
    .annotation build Ld6/a;
    .end annotation
.end field

.field private mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field

.field private mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;
    .annotation build Ld6/a;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 3
    .annotation build Ld6/a;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lcom/facebook/react/bridge/CatalystInstance;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    .line 15
    .line 16
    new-instance v1, Lcom/shopify/reactnative/skia/PlatformContext;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/shopify/reactnative/skia/PlatformContext;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    iget-object p1, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 32
    .line 33
    invoke-direct {p0, v1, v2, v0, p1}, Lcom/shopify/reactnative/skia/SkiaManager;->initHybrid(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/shopify/reactnative/skia/PlatformContext;)Lcom/facebook/jni/HybridData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/SkiaManager;->initializeRuntime()V

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
.end method

.method private native initHybrid(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/shopify/reactnative/skia/PlatformContext;)Lcom/facebook/jni/HybridData;
.end method

.method private native initializeRuntime()V
.end method


# virtual methods
.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    return-void
.end method

.method public getPixelDensity()F
    .locals 1

    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method public getPlatformContext()Lcom/shopify/reactnative/skia/PlatformContext;
    .locals 1

    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;

    return-object v0
.end method

.method public native invalidate()V
.end method

.method public onHostPause()V
    .locals 1

    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;

    invoke-virtual {v0}, Lcom/shopify/reactnative/skia/PlatformContext;->onPause()V

    return-void
.end method

.method public onHostResume()V
    .locals 1

    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaManager;->mPlatformContext:Lcom/shopify/reactnative/skia/PlatformContext;

    invoke-virtual {v0}, Lcom/shopify/reactnative/skia/PlatformContext;->onResume()V

    return-void
.end method
