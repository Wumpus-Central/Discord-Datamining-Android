.class public interface abstract Lcom/facebook/react/uimanager/events/EventDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
.end method

.method public abstract addListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
.end method

.method public abstract dispatchAllEvents()V
.end method

.method public abstract dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V
.end method

.method public abstract onCatalystInstanceDestroyed()V
.end method

.method public abstract registerEventEmitter(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract registerEventEmitter(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
.end method

.method public abstract removeBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
.end method

.method public abstract removeListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
.end method

.method public abstract unregisterEventEmitter(I)V
.end method
