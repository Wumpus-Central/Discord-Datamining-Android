.class public interface abstract Lcom/facebook/react/bridge/UIManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/JSIModule;
.implements Lcom/facebook/react/bridge/PerformanceCounter;


# virtual methods
.method public abstract addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Lcom/facebook/react/bridge/WritableMap;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
.end method

.method public abstract dispatchCommand(IILcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract getEventDispatcher()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation
.end method

.method public abstract preInitializeViewManagers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
.end method

.method public abstract resolveCustomDirectEventName(Ljava/lang/String;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract resolveView(I)Landroid/view/View;
.end method

.method public abstract sendAccessibilityEvent(II)V
.end method

.method public abstract startSurface(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/WritableMap;",
            "II)I"
        }
    .end annotation
.end method

.method public abstract stopSurface(I)V
.end method

.method public abstract synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V
.end method

.method public abstract updateRootLayoutSpecs(IIIII)V
.end method
