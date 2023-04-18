.class public Lcom/facebook/react/devsupport/DisabledDevSupportManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevSupportManager;


# instance fields
.field private final mDefaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/devsupport/DisabledDevSupportManager;->mDefaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public addCustomDevOption(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V
    .locals 0

    return-void
.end method

.method public createRootView(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public destroyRootView(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public downloadBundleResourceFromUrlSync(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getCurrentActivity()Landroid/app/Activity;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDevSettings()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDevSupportEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDownloadedJSBundleFile()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getJSBundleURLForRemoteDebugging()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastErrorCookie()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastErrorTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSourceMapUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSourceUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/DisabledDevSupportManager;->mDefaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    return-void
.end method

.method public handleReloadJS()V
    .locals 0

    return-void
.end method

.method public hasUpToDateJSBundleInCache()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hideRedboxDialog()V
    .locals 0

    return-void
.end method

.method public isPackagerRunning(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;->onPackagerStatusFetched(Z)V

    return-void
.end method

.method public loadSplitBundleFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSplitBundleCallback;)V
    .locals 0

    return-void
.end method

.method public onNewReactContextCreated(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    return-void
.end method

.method public onReactInstanceDestroyed(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    return-void
.end method

.method public processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;
    .locals 0
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

    return-object p1
.end method

.method public registerErrorCustomizer(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V
    .locals 0

    return-void
.end method

.method public reloadJSFromServer(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public reloadJSFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V
    .locals 0

    return-void
.end method

.method public reloadSettings()V
    .locals 0

    return-void
.end method

.method public setDevSupportEnabled(Z)V
    .locals 0

    return-void
.end method

.method public setFpsDebugEnabled(Z)V
    .locals 0

    return-void
.end method

.method public setHotModuleReplacementEnabled(Z)V
    .locals 0

    return-void
.end method

.method public setPackagerLocationCustomizer(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V
    .locals 0

    return-void
.end method

.method public setRemoteJSDebugEnabled(Z)V
    .locals 0

    return-void
.end method

.method public showDevOptionsDialog()V
    .locals 0

    return-void
.end method

.method public showNewJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
    .locals 0

    return-void
.end method

.method public showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public startInspector()V
    .locals 0

    return-void
.end method

.method public stopInspector()V
    .locals 0

    return-void
.end method

.method public toggleElementInspector()V
    .locals 0

    return-void
.end method

.method public updateJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
    .locals 0

    return-void
.end method
