.class public interface abstract Lcom/facebook/react/devsupport/interfaces/DevSupportManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/JSExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;
    }
.end annotation


# virtual methods
.method public abstract addCustomDevOption(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V
.end method

.method public abstract createRootView(Ljava/lang/String;)Landroid/view/View;
.end method

.method public abstract createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;
.end method

.method public abstract destroyRootView(Landroid/view/View;)V
.end method

.method public abstract downloadBundleResourceFromUrlSync(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
.end method

.method public abstract getCurrentActivity()Landroid/app/Activity;
.end method

.method public abstract getDevSettings()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;
.end method

.method public abstract getDevSupportEnabled()Z
.end method

.method public abstract getDownloadedJSBundleFile()Ljava/lang/String;
.end method

.method public abstract getJSBundleURLForRemoteDebugging()Ljava/lang/String;
.end method

.method public abstract getLastErrorCookie()I
.end method

.method public abstract getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;
.end method

.method public abstract getLastErrorTitle()Ljava/lang/String;
.end method

.method public abstract getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;
.end method

.method public abstract getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
.end method

.method public abstract getSourceMapUrl()Ljava/lang/String;
.end method

.method public abstract getSourceUrl()Ljava/lang/String;
.end method

.method public abstract handleReloadJS()V
.end method

.method public abstract hasUpToDateJSBundleInCache()Z
.end method

.method public abstract hideRedboxDialog()V
.end method

.method public abstract isPackagerRunning(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
.end method

.method public abstract loadSplitBundleFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSplitBundleCallback;)V
.end method

.method public abstract onNewReactContextCreated(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract onReactInstanceDestroyed(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;"
        }
    .end annotation
.end method

.method public abstract registerErrorCustomizer(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V
.end method

.method public abstract reloadJSFromServer(Ljava/lang/String;)V
.end method

.method public abstract reloadJSFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V
.end method

.method public abstract reloadSettings()V
.end method

.method public abstract setDevSupportEnabled(Z)V
.end method

.method public abstract setFpsDebugEnabled(Z)V
.end method

.method public abstract setHotModuleReplacementEnabled(Z)V
.end method

.method public abstract setPackagerLocationCustomizer(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V
.end method

.method public abstract setRemoteJSDebugEnabled(Z)V
.end method

.method public abstract showDevOptionsDialog()V
.end method

.method public abstract showNewJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
.end method

.method public abstract showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract startInspector()V
.end method

.method public abstract stopInspector()V
.end method

.method public abstract toggleElementInspector()V
.end method

.method public abstract updateJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
.end method
