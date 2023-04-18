.class public abstract Lcom/shopify/reactnative/skia/SkiaBaseViewManager;
.super Lcom/facebook/react/views/view/ReactViewManager;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->onDropViewInstance(Lcom/facebook/react/views/view/ReactViewGroup;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/facebook/react/views/view/ReactViewGroup;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 3
    check-cast p1, Lcom/shopify/reactnative/skia/SkiaBaseView;

    invoke-virtual {p1}, Lcom/shopify/reactnative/skia/SkiaBaseView;->unregisterView()V

    return-void
.end method

.method public setDebug(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "debug"
    .end annotation

    check-cast p1, Lcom/shopify/reactnative/skia/SkiaBaseView;

    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseView;->setDebugMode(Z)V

    return-void
.end method

.method public setMode(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "mode"
    .end annotation

    check-cast p1, Lcom/shopify/reactnative/skia/SkiaBaseView;

    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseView;->setMode(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setNativeId(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->setNativeId(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V

    return-void
.end method

.method public setNativeId(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    .line 4
    check-cast p1, Lcom/shopify/reactnative/skia/SkiaBaseView;

    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseView;->registerView(I)V

    return-void
.end method
