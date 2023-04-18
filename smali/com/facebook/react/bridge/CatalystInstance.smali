.class public interface abstract Lcom/facebook/react/bridge/CatalystInstance;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/MemoryPressureListener;
.implements Lcom/facebook/react/bridge/JSInstance;
.implements Lcom/facebook/react/bridge/JSBundleLoaderDelegate;


# annotations
.annotation build Ld6/a;
.end annotation


# virtual methods
.method public abstract addBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V
.end method

.method public abstract addJSIModules(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/JSIModuleSpec;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract callFunction(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V
    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract destroy()V
.end method

.method public abstract extendNativeModules(Lcom/facebook/react/bridge/NativeModuleRegistry;)V
.end method

.method public abstract getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
.end method

.method public abstract getJSIModule(Lcom/facebook/react/bridge/JSIModuleType;)Lcom/facebook/react/bridge/JSIModule;
.end method

.method public abstract getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/facebook/react/bridge/JavaScriptModule;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getNativeCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
.end method

.method public abstract getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
.end method

.method public abstract getNativeModules()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getReactQueueConfiguration()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;
.end method

.method public abstract getRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;
.end method

.method public abstract getRuntimeScheduler()Lcom/facebook/react/bridge/RuntimeScheduler;
.end method

.method public abstract getSourceURL()Ljava/lang/String;
.end method

.method public abstract hasNativeModule(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)Z"
        }
    .end annotation
.end method

.method public abstract hasRunJSBundle()Z
.end method

.method public abstract initialize()V
    .annotation build Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation
.end method

.method public abstract invokeCallback(ILcom/facebook/react/bridge/NativeArrayInterface;)V
    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract isDestroyed()Z
.end method

.method public abstract registerSegment(ILjava/lang/String;)V
.end method

.method public abstract removeBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V
.end method

.method public abstract runJSBundle()V
.end method

.method public abstract setGlobalVariable(Ljava/lang/String;Ljava/lang/String;)V
    .annotation build Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation
.end method

.method public abstract setTurboModuleManager(Lcom/facebook/react/bridge/JSIModule;)V
.end method
