.class public Lcom/shopify/reactnative/skia/SkiaPictureViewManager;
.super Lcom/shopify/reactnative/skia/SkiaBaseViewManager;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/shopify/reactnative/skia/SkiaPictureView;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/view/ReactViewGroup;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/shopify/reactnative/skia/SkiaPictureView;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/shopify/reactnative/skia/SkiaPictureView;
    .locals 1

    .line 3
    new-instance v0, Lcom/shopify/reactnative/skia/SkiaPictureView;

    invoke-direct {v0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "SkiaPictureView"

    return-object v0
.end method
