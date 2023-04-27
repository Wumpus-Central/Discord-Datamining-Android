.class public Lcom/reactnativecommunity/webview/RNCWebViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCWebView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/webview/RNCWebViewManager$e;,
        Lcom/reactnativecommunity/webview/RNCWebViewManager$f;,
        Lcom/reactnativecommunity/webview/RNCWebViewManager$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativecommunity/webview/b;",
        ">;"
    }
.end annotation


# static fields
.field protected static final BLANK_URL:Ljava/lang/String; = "about:blank"

.field public static final COMMAND_CLEAR_CACHE:I = 0x3e9

.field public static final COMMAND_CLEAR_FORM_DATA:I = 0x3e8

.field public static final COMMAND_CLEAR_HISTORY:I = 0x3ea

.field public static final COMMAND_FOCUS:I = 0x8

.field public static final COMMAND_GO_BACK:I = 0x1

.field public static final COMMAND_GO_FORWARD:I = 0x2

.field public static final COMMAND_INJECT_JAVASCRIPT:I = 0x6

.field public static final COMMAND_LOAD_URL:I = 0x7

.field public static final COMMAND_POST_MESSAGE:I = 0x5

.field public static final COMMAND_RELEASE:I = 0xfa1

.field public static final COMMAND_RELOAD:I = 0x3

.field public static final COMMAND_STOP_LOADING:I = 0x4

.field protected static final HTML_ENCODING:Ljava/lang/String; = "UTF-8"

.field protected static final HTML_MIME_TYPE:Ljava/lang/String; = "text/html"

.field protected static final HTTP_METHOD_POST:Ljava/lang/String; = "POST"

.field protected static final JAVASCRIPT_INTERFACE:Ljava/lang/String; = "ReactNativeWebView"

.field protected static final REACT_CLASS:Ljava/lang/String; = "RNCWebView"

.field protected static final SHOULD_OVERRIDE_URL_LOADING_TIMEOUT:I = 0xfa

.field private static final TAG:Ljava/lang/String; = "RNCWebViewManager"


# instance fields
.field assetLoaderHandlerTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected mAllowsFullscreenVideo:Z

.field protected mUserAgent:Ljava/lang/String;

.field protected mUserAgentWithApplicationName:Ljava/lang/String;

.field protected mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

.field protected mWebViewConfig:Lcom/reactnativecommunity/webview/f1;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mAllowsFullscreenVideo:Z

    .line 4
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "internal"

    const-string v2, "resources"

    const-string v3, "assets"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->assetLoaderHandlerTypes:Ljava/util/Set;

    .line 7
    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$a;

    invoke-direct {v0, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$a;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;)V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebViewConfig:Lcom/reactnativecommunity/webview/f1;

    return-void
.end method

.method public constructor <init>(Lcom/reactnativecommunity/webview/f1;)V
    .locals 4

    .line 8
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mAllowsFullscreenVideo:Z

    .line 11
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 12
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 13
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "internal"

    const-string v2, "resources"

    const-string v3, "assets"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->assetLoaderHandlerTypes:Ljava/util/Set;

    .line 14
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebViewConfig:Lcom/reactnativecommunity/webview/f1;

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setInjectedJavaScript$24(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic B(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setHardwareAccelerationDisabled$10(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic C(Lcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setUrlPrefixesForDefaultIntent$37(Lcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic D(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setIncognito$30(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic E(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMinimumFontSize$43(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic F(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setAllowUniversalAccessFromFileURLs$22(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic G(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setScalesPageToFit$17(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic H(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setInjectedJavaScriptForMainFrameOnly$26(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic I(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setAllowFileAccess$39(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic J(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setWebViewKey$4(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic K(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMixedContentMode$35(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic L(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setLayerType$11(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic M(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setShowsVerticalScrollIndicator$6(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic N(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setOverScrollMode$13(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic O(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setDomStorageEnabled$18(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic P(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setSupportMultipleWindows$3(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic Q(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setNestedScrollEnabled$14(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic R(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMixedContentMode$36(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic S(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setJavaScriptCanOpenWindowsAutomatically$20(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic T(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setCacheMode$9(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic U(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setBasicAuthCredential$32(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic a(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setShowsHorizontalScrollIndicator$5(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic b(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setCacheEnabled$8(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic c(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setSaveFormDataDisabled$23(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic d(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setAllowFileAccessFromFileURLs$21(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic e(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$onDropViewInstance$46(Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic f(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMessagingEnabled$28(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic g(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setDisplayZoomControls$2(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static getModule(Lcom/facebook/react/bridge/ReactContext;)Lcom/reactnativecommunity/webview/RNCWebViewModule;
    .locals 1

    const-class v0, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    invoke-virtual {p0, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    check-cast p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    return-object p0
.end method

.method public static synthetic h(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setBuiltInZoomControls$1(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic i(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setForceDarkOn$42(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic j(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setThirdPartyCookiesEnabled$15(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic k(ILcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$receiveCommand$45(ILcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic l(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setInjectedJavaScriptBeforeContentLoaded$25(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method private static synthetic lambda$addEventEmitters$44(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$g;

    invoke-direct {v0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method private synthetic lambda$onDropViewInstance$46(Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/ThemedReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->d()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/b;->e()V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/reactnativecommunity/webview/b1;->a:Lcom/reactnativecommunity/webview/b1;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/b1;->b()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p2, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->p:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/b1;->c()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget v0, p1, Lcom/reactnativecommunity/webview/b;->k:I

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 59
    .line 60
    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 67
    .line 68
    iget p1, p1, Lcom/reactnativecommunity/webview/b;->k:I

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/UIManagerModule;->resolveView(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Landroid/view/ViewGroup;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/high16 v1, 0x40000000    # 2.0f

    .line 84
    .line 85
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {p2, v0, p1}, Landroid/view/View;->measure(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-virtual {p2, v1, v1, p1, v0}, Landroid/view/View;->layout(IIII)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    return-void
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

.method private static synthetic lambda$receiveCommand$45(ILcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p0, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    packed-switch p0, :pswitch_data_1

    .line 6
    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :pswitch_0
    invoke-virtual {p2}, Landroid/webkit/WebView;->clearHistory()V

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :pswitch_1
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    :cond_0
    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_2
    invoke-virtual {p2}, Landroid/webkit/WebView;->clearFormData()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_3
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_4
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p0, p2, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->x:Lcom/reactnativecommunity/webview/RNCWebViewManager$e$b;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$b;->b(Z)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p2, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    const-string p1, "Arguments for loading an url are null!"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :pswitch_5
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p2, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_6
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 68
    .line 69
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v1, "data"

    .line 73
    .line 74
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    new-instance p1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v0, "(function () {var event;var data = "

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p0, ";try {event = new MessageEvent(\'message\', data);} catch (e) {event = document.createEvent(\'MessageEvent\');event.initMessageEvent(\'message\', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();"

    .line 99
    .line 100
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p2, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->h(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catch_0
    move-exception p0

    .line 112
    new-instance p1, Ljava/lang/RuntimeException;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :pswitch_7
    invoke-virtual {p2}, Landroid/webkit/WebView;->stopLoading()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_8
    invoke-virtual {p2}, Landroid/webkit/WebView;->reload()V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_9
    invoke-virtual {p2}, Landroid/webkit/WebView;->goForward()V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_a
    invoke-virtual {p2}, Landroid/webkit/WebView;->goBack()V

    .line 131
    .line 132
    .line 133
    :goto_0
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x3e8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
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
.end method

.method private static synthetic lambda$setAllowFileAccess$39(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    return-void
.end method

.method private static synthetic lambda$setAllowFileAccessFromFileURLs$21(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    return-void
.end method

.method private static synthetic lambda$setAllowUniversalAccessFromFileURLs$22(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    return-void
.end method

.method private synthetic lambda$setAllowsFullscreenVideo$38(Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setupWebChromeClient(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V

    return-void
.end method

.method private static synthetic lambda$setAssetLoaderConfig$12(Lz1/c;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setWebViewAssetLoader(Lz1/c;)V

    return-void
.end method

.method private static synthetic lambda$setBasicAuthCredential$32(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "username"

    .line 4
    .line 5
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "password"

    .line 12
    .line 13
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v1, Lcom/reactnativecommunity/webview/a;

    .line 28
    .line 29
    invoke-direct {v1, v0, p0}, Lcom/reactnativecommunity/webview/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    invoke-virtual {p1, v1}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setBasicAuthCredential(Lcom/reactnativecommunity/webview/a;)V

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
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
.end method

.method private static synthetic lambda$setBuiltInZoomControls$1(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void
.end method

.method private static synthetic lambda$setCacheEnabled$7(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void
.end method

.method private static synthetic lambda$setCacheEnabled$8(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void
.end method

.method private static synthetic lambda$setCacheMode$9(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void
.end method

.method private static synthetic lambda$setDisplayZoomControls$2(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    return-void
.end method

.method private static synthetic lambda$setDomStorageEnabled$18(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setForceDarkOn$42(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-le v0, v1, :cond_2

    .line 6
    .line 7
    const-string v0, "FORCE_DARK"

    .line 8
    .line 9
    invoke-static {v0}, Lz1/d;->a(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2, v0}, Lz1/b;->b(Landroid/webkit/WebSettings;I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    if-eqz p0, :cond_2

    .line 29
    .line 30
    const-string p0, "FORCE_DARK_STRATEGY"

    .line 31
    .line 32
    invoke-static {p0}, Lz1/d;->a(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0, v1}, Lz1/b;->c(Landroid/webkit/WebSettings;I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
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

.method private static synthetic lambda$setGeolocationEnabled$40(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setHardwareAccelerationDisabled$10(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method private static synthetic lambda$setIncognito$30(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/webkit/WebView;->clearHistory()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/webkit/WebView;->clearFormData()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, v1}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 32
    .line 33
    .line 34
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
.end method

.method private static synthetic lambda$setInjectedJavaScript$24(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setInjectedJavaScript(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$setInjectedJavaScriptBeforeContentLoaded$25(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setInjectedJavaScriptBeforeContentLoaded(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly$27(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(Z)V

    return-void
.end method

.method private static synthetic lambda$setInjectedJavaScriptForMainFrameOnly$26(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setInjectedJavaScriptForMainFrameOnly(Z)V

    return-void
.end method

.method private static synthetic lambda$setJavaScriptCanOpenWindowsAutomatically$20(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    return-void
.end method

.method private static synthetic lambda$setJavaScriptEnabled$0(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setLayerType$11(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method private static synthetic lambda$setMediaPlaybackRequiresUserAction$19(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    return-void
.end method

.method private static synthetic lambda$setMessagingEnabled$28(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setMessagingEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setMessagingModuleName$29(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setMessagingModuleName(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$setMinimumFontSize$43(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setMinimumFontSize(I)V

    return-void
.end method

.method private static synthetic lambda$setMixedContentMode$34(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    return-void
.end method

.method private static synthetic lambda$setMixedContentMode$35(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    return-void
.end method

.method private static synthetic lambda$setMixedContentMode$36(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    return-void
.end method

.method private static synthetic lambda$setNestedScrollEnabled$14(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setNestedScrollEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setOnContentSizeChange$33(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setSendContentSizeChangeEvents(Z)V

    return-void
.end method

.method private static synthetic lambda$setOnScroll$41(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setHasScrollEvent(Z)V

    return-void
.end method

.method private static synthetic lambda$setOverScrollMode$13(Ljava/lang/Integer;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setOverScrollMode(I)V

    return-void
.end method

.method private static synthetic lambda$setSaveFormDataDisabled$23(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    return-void
.end method

.method private static synthetic lambda$setScalesPageToFit$17(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method private static synthetic lambda$setShowsHorizontalScrollIndicator$5(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setShowsVerticalScrollIndicator$6(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method private static synthetic lambda$setSource$31(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->i(Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setSource(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 13
    .line 14
    .line 15
    if-eqz p0, :cond_a

    .line 16
    .line 17
    const-string v0, "html"

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v0, "baseUrl"

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string p0, ""

    .line 43
    .line 44
    :goto_0
    move-object v3, p0

    .line 45
    const-string v5, "text/html"

    .line 46
    .line 47
    const-string v6, "UTF-8"

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    move-object v2, p1

    .line 51
    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const-string v0, "uri"

    .line 56
    .line 57
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_a

    .line 62
    .line 63
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    const-string v1, "method"

    .line 81
    .line 82
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const-string v2, "POST"

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    const-string v1, "body"

    .line 101
    .line 102
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_4

    .line 107
    .line 108
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :try_start_0
    const-string v1, "UTF-8"

    .line 113
    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 115
    .line 116
    .line 117
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    goto :goto_1

    .line 119
    :catch_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    const/4 p0, 0x0

    .line 125
    :goto_1
    if-nez p0, :cond_5

    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    new-array p0, p0, [B

    .line 129
    .line 130
    :cond_5
    invoke-virtual {p1, v0, p0}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_6
    new-instance v1, Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v2, "headers"

    .line 140
    .line 141
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_9

    .line 146
    .line 147
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :cond_7
    :goto_2
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_9

    .line 160
    .line 161
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 166
    .line 167
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    const-string v5, "user-agent"

    .line 172
    .line 173
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_8

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-eqz v4, :cond_7

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v4, v3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_8
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_9
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_a
    const-string p0, "about:blank"

    .line 210
    .line 211
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
.end method

.method private static synthetic lambda$setSupportMultipleWindows$3(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    return-void
.end method

.method private static synthetic lambda$setTextZoom$16(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    return-void
.end method

.method private static synthetic lambda$setThirdPartyCookiesEnabled$15(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    return-void
.end method

.method private static synthetic lambda$setUrlPrefixesForDefaultIntent$37(Lcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->getRNCWebViewClient()Lcom/reactnativecommunity/webview/RNCWebViewManager$g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$g;->f(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 10
    .line 11
    .line 12
    :cond_0
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

.method private static synthetic lambda$setWebViewKey$4(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 3

    .line 1
    invoke-virtual {p4, p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->setWebViewKey(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/reactnativecommunity/webview/b1;->a:Lcom/reactnativecommunity/webview/b1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/b1;->c()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p4}, Landroid/view/View;->getId()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-interface {p3, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void
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
    .line 192
    .line 193
.end method

.method public static synthetic m(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setGeolocationEnabled$40(Ljava/lang/Boolean;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic n(Lz1/c;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setAssetLoaderConfig$12(Lz1/c;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic o(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setCacheEnabled$7(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic p(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMixedContentMode$34(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic q(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMessagingModuleName$29(Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic r(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$addEventEmitters$44(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic s(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setSource$31(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic t(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setMediaPlaybackRequiresUserAction$19(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic u(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly$27(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic v(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setTextZoom$16(ILcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic w(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setAllowsFullscreenVideo$38(Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic x(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setOnScroll$41(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic y(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setJavaScriptEnabled$0(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method

.method public static synthetic z(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->lambda$setOnContentSizeChange$33(ZLcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/reactnativecommunity/webview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativecommunity/webview/b;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativecommunity/webview/b;)V
    .locals 0

    .line 2
    new-instance p1, Lcom/reactnativecommunity/webview/o;

    invoke-direct {p1}, Lcom/reactnativecommunity/webview/o;-><init>()V

    invoke-virtual {p2, p1}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method protected createInternalWebViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativecommunity/webview/RNCWebViewManager$e;
    .locals 1

    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    invoke-direct {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method protected bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativecommunity/webview/b;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativecommunity/webview/b;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 2
    new-instance v0, Lcom/reactnativecommunity/webview/b;

    invoke-direct {v0, p1}, Lcom/reactnativecommunity/webview/b;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->createInternalWebViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/reactnativecommunity/webview/b;->a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    .line 5
    sget-object v2, Lcom/reactnativecommunity/webview/b1;->a:Lcom/reactnativecommunity/webview/b1;

    invoke-virtual {v2}, Lcom/reactnativecommunity/webview/b1;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0, p1, v1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setupWebChromeClient(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V

    .line 7
    invoke-virtual {p1, v1}, Lcom/facebook/react/uimanager/ThemedReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 8
    iget-object v2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebViewConfig:Lcom/reactnativecommunity/webview/f1;

    invoke-interface {v2, v1}, Lcom/reactnativecommunity/webview/f1;->a(Landroid/webkit/WebView;)V

    .line 9
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    const/4 v4, 0x0

    .line 11
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 12
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 13
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 14
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 15
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 16
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 17
    invoke-virtual {p0, v0, v4}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setAllowUniversalAccessFromFileURLs(Lcom/reactnativecommunity/webview/b;Z)V

    const-string v2, "never"

    .line 18
    invoke-virtual {p0, v0, v2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setMixedContentMode(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    move v4, v3

    :cond_0
    if-eqz v4, :cond_1

    .line 20
    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 21
    :cond_1
    new-instance v2, Lcom/reactnativecommunity/webview/RNCWebViewManager$b;

    invoke-direct {v2, p0, v1, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager$b;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;Lcom/facebook/react/uimanager/ThemedReactContext;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    return-object v0
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->builder()Lcom/facebook/react/common/MapBuilder$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "goBack"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "goForward"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "reload"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x4

    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "stopLoading"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "postMessage"

    .line 55
    .line 56
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v1, 0x6

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "injectJavaScript"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v1, 0x7

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "loadUrl"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/16 v1, 0x8

    .line 83
    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "requestFocus"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/16 v1, 0x3e8

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v2, "clearFormData"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/16 v1, 0x3e9

    .line 107
    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "clearCache"

    .line 113
    .line 114
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const/16 v1, 0x3ea

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v2, "clearHistory"

    .line 125
    .line 126
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const/16 v1, 0xfa1

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "release"

    .line 137
    .line 138
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Lcom/facebook/react/common/MapBuilder$Builder;->build()Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0
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

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->newHashMap()Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    const-string v1, "onLoadingProgress"

    .line 12
    .line 13
    const-string v2, "registrationName"

    .line 14
    .line 15
    invoke-static {v2, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v3, "topLoadingProgress"

    .line 20
    .line 21
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    const-string v1, "onShouldStartLoadWithRequest"

    .line 25
    .line 26
    invoke-static {v2, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "topShouldStartLoadWithRequest"

    .line 31
    .line 32
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object v1, Lcom/facebook/react/views/scroll/ScrollEventType;->SCROLL:Lcom/facebook/react/views/scroll/ScrollEventType;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/facebook/react/views/scroll/ScrollEventType;->getJSEventName(Lcom/facebook/react/views/scroll/ScrollEventType;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "onScroll"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const-string v1, "onHttpError"

    .line 51
    .line 52
    invoke-static {v2, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v3, "topHttpError"

    .line 57
    .line 58
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    const-string v1, "onRenderProcessGone"

    .line 62
    .line 63
    invoke-static {v2, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "topRenderProcessGone"

    .line 68
    .line 69
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-object v0
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

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNCWebView"

    return-object v0
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativecommunity/webview/b;

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->onDropViewInstance(Lcom/reactnativecommunity/webview/b;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/reactnativecommunity/webview/b;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/b;->getWebView()Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/reactnativecommunity/webview/t0;

    invoke-direct {v0, p0, p1}, Lcom/reactnativecommunity/webview/t0;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativecommunity/webview/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->receiveCommand(Lcom/reactnativecommunity/webview/b;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/reactnativecommunity/webview/b;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/reactnativecommunity/webview/h;

    invoke-direct {v0, p2, p3}, Lcom/reactnativecommunity/webview/h;-><init>(ILcom/facebook/react/bridge/ReadableArray;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setAllowFileAccess(Lcom/reactnativecommunity/webview/b;Ljava/lang/Boolean;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "allowFileAccess"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/d;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/d;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setAllowFileAccessFromFileURLs(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "allowFileAccessFromFileURLs"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/q0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/q0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setAllowUniversalAccessFromFileURLs(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "allowUniversalAccessFromFileURLs"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/d0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/d0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setAllowsFullscreenVideo(Lcom/reactnativecommunity/webview/b;Ljava/lang/Boolean;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "allowsFullscreenVideo"
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    iput-boolean p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mAllowsFullscreenVideo:Z

    .line 13
    .line 14
    new-instance p2, Lcom/reactnativecommunity/webview/f;

    .line 15
    .line 16
    invoke-direct {p2, p0, p1}, Lcom/reactnativecommunity/webview/f;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public setApplicationNameForUserAgent(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "applicationNameForUserAgent"
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, " "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 36
    .line 37
    :goto_0
    new-instance p2, Lcom/reactnativecommunity/webview/w;

    .line 38
    .line 39
    invoke-direct {p2, p0}, Lcom/reactnativecommunity/webview/w;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public setAssetLoaderConfig(Lcom/reactnativecommunity/webview/b;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 8
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "androidAssetLoaderConfig"
    .end annotation

    .line 1
    new-instance v0, Lz1/c$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lz1/c$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "domain"

    .line 7
    .line 8
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lz1/c$b;->c(Ljava/lang/String;)Lz1/c$b;

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string v1, "httpAllowed"

    .line 18
    .line 19
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lz1/c$b;->d(Z)Lz1/c$b;

    .line 30
    .line 31
    .line 32
    :cond_1
    const-string v1, "pathHandlers"

    .line 33
    .line 34
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v1, "RNCWebViewManager"

    .line 39
    .line 40
    if-eqz p2, :cond_9

    .line 41
    .line 42
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-lez v2, :cond_9

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge v2, v3, :cond_a

    .line 54
    .line 55
    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "type"

    .line 60
    .line 61
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    const-string v3, "WebViewAssetLoader error. Path Handler type is null."

    .line 68
    .line 69
    invoke-static {v1, v3}, Lx3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_2
    iget-object v5, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->assetLoaderHandlerTypes:Ljava/util/Set;

    .line 75
    .line 76
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v5, "WebViewAssetLoader error. Skipping Path Handler. Unexpected handler type: "

    .line 88
    .line 89
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v4, ". Path Handler type must be one of "

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v4, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->assetLoaderHandlerTypes:Ljava/util/Set;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {v1, v3}, Lx3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    const-string v5, "path"

    .line 114
    .line 115
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-nez v5, :cond_4

    .line 120
    .line 121
    const-string v3, "WebViewAssetLoader error. Skipping Path Handler. Handler path is missing"

    .line 122
    .line 123
    invoke-static {v1, v3}, Lx3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const-string v6, "resources"

    .line 128
    .line 129
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    new-instance v3, Lz1/c$f;

    .line 136
    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-direct {v3, v4}, Lz1/c$f;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v5, v3}, Lz1/c$b;->a(Ljava/lang/String;Lz1/c$d;)Lz1/c$b;

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    const-string v6, "assets"

    .line 149
    .line 150
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-eqz v6, :cond_6

    .line 155
    .line 156
    new-instance v3, Lz1/c$a;

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-direct {v3, v4}, Lz1/c$a;-><init>(Landroid/content/Context;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v5, v3}, Lz1/c$b;->a(Ljava/lang/String;Lz1/c$d;)Lz1/c$b;

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    const-string v6, "internal"

    .line 170
    .line 171
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_8

    .line 176
    .line 177
    const-string v4, "directory"

    .line 178
    .line 179
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-nez v3, :cond_7

    .line 184
    .line 185
    const-string v3, "WebViewAssetLoader error. Skipping Path Handler. Directory is missing for internal handler path"

    .line 186
    .line 187
    invoke-static {v1, v3}, Lx3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_7
    new-instance v4, Lz1/c$c;

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    new-instance v7, Ljava/io/File;

    .line 198
    .line 199
    invoke-direct {v7, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {v4, v6, v7}, Lz1/c$c;-><init>(Landroid/content/Context;Ljava/io/File;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v5, v4}, Lz1/c$b;->a(Ljava/lang/String;Lz1/c$d;)Lz1/c$b;

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_9
    const-string p2, "WebViewAssetLoader error. No Path Handlers found."

    .line 213
    .line 214
    invoke-static {v1, p2}, Lx3/a;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-virtual {v0}, Lz1/c$b;->b()Lz1/c;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    new-instance v0, Lcom/reactnativecommunity/webview/i0;

    .line 222
    .line 223
    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/i0;-><init>(Lz1/c;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 227
    .line 228
    .line 229
    return-void
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
.end method

.method public setBasicAuthCredential(Lcom/reactnativecommunity/webview/b;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "basicAuthCredential"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/z;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/z;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setBuiltInZoomControls(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "setBuiltInZoomControls"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/j;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/j;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setCacheEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cacheEnabled"
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    new-instance p2, Lcom/reactnativecommunity/webview/l;

    .line 10
    .line 11
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/l;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p2, Lcom/reactnativecommunity/webview/m;

    .line 19
    .line 20
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/m;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
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

.method public setCacheMode(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cacheMode"
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "LOAD_CACHE_ONLY"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    goto :goto_1

    .line 23
    :sswitch_1
    const-string v0, "LOAD_CACHE_ELSE_NETWORK"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    move p2, v3

    .line 32
    goto :goto_1

    .line 33
    :sswitch_2
    const-string v0, "LOAD_DEFAULT"

    .line 34
    .line 35
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    move p2, v1

    .line 42
    goto :goto_1

    .line 43
    :sswitch_3
    const-string v0, "LOAD_NO_CACHE"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    move p2, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_0
    move p2, v4

    .line 54
    :goto_1
    if-eqz p2, :cond_3

    .line 55
    .line 56
    if-eq p2, v3, :cond_2

    .line 57
    .line 58
    if-eq p2, v2, :cond_1

    .line 59
    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :goto_2
    new-instance v0, Lcom/reactnativecommunity/webview/x;

    .line 80
    .line 81
    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/x;-><init>(Ljava/lang/Integer;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x7abc5963 -> :sswitch_3
        -0x486d8038 -> :sswitch_2
        -0x34165142 -> :sswitch_1
        0x5c4e1362 -> :sswitch_0
    .end sparse-switch
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

.method public setDisplayZoomControls(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "setDisplayZoomControls"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/o0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/o0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setDomStorageEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "domStorageEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/v0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/v0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setForceDarkOn(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "forceDarkOn"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/n0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/n0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setGeolocationEnabled(Lcom/reactnativecommunity/webview/b;Ljava/lang/Boolean;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "geolocationEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/e0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/e0;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setHardwareAccelerationDisabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "androidHardwareAccelerationDisabled"
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lcom/reactnativecommunity/webview/x0;

    invoke-direct {p2}, Lcom/reactnativecommunity/webview/x0;-><init>()V

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    :cond_0
    return-void
.end method

.method public setIncognito(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "incognito"
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p2, v0}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 10
    .line 11
    .line 12
    new-instance p2, Lcom/reactnativecommunity/webview/s;

    .line 13
    .line 14
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/s;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public setInjectedJavaScript(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "injectedJavaScript"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/l0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/l0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setInjectedJavaScriptBeforeContentLoaded(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "injectedJavaScriptBeforeContentLoaded"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/e;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/r0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/r0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setInjectedJavaScriptForMainFrameOnly(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "injectedJavaScriptForMainFrameOnly"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/m0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/m0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setJavaScriptCanOpenWindowsAutomatically(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "javaScriptCanOpenWindowsAutomatically"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/p0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/p0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setJavaScriptEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "javaScriptEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/h0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/h0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setLayerType(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "androidLayerType"
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    const-string v0, "hardware"

    .line 5
    .line 6
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "software"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p2, 0x2

    .line 25
    :goto_0
    new-instance v0, Lcom/reactnativecommunity/webview/j0;

    .line 26
    .line 27
    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/j0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public setMediaPlaybackRequiresUserAction(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "mediaPlaybackRequiresUserAction"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/i;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/i;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setMessagingEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "messagingEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/g;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/g;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setMessagingModuleName(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "messagingModuleName"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/r;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setMinimumFontSize(Lcom/reactnativecommunity/webview/b;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "minimumFontSize"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/c;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/c;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setMixedContentMode(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "mixedContentMode"
    .end annotation

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    const-string v0, "never"

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "always"

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance p2, Lcom/reactnativecommunity/webview/u;

    .line 21
    .line 22
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/u;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-string v0, "compatibility"

    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    new-instance p2, Lcom/reactnativecommunity/webview/v;

    .line 38
    .line 39
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/v;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    new-instance p2, Lcom/reactnativecommunity/webview/t;

    .line 47
    .line 48
    invoke-direct {p2}, Lcom/reactnativecommunity/webview/t;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    return-void
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

.method public setNestedScrollEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "nestedScrollEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/f0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/f0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setOnContentSizeChange(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "onContentSizeChange"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/w0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/w0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setOnScroll(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "onScroll"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/s0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/s0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setOverScrollMode(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "overScrollMode"
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, -0x54506df1

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    const v1, 0x63dca8c

    .line 14
    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const v1, 0x38b73479

    .line 19
    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "content"

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    move p2, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v0, "never"

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    move p2, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-string v0, "always"

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    move p2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    const/4 p2, -0x1

    .line 55
    :goto_1
    if-eqz p2, :cond_5

    .line 56
    .line 57
    if-eq p2, v4, :cond_4

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :goto_2
    new-instance v0, Lcom/reactnativecommunity/webview/n;

    .line 74
    .line 75
    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/n;-><init>(Ljava/lang/Integer;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 79
    .line 80
    .line 81
    return-void
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

.method public setSaveFormDataDisabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "saveFormDataDisabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/g0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/g0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setScalesPageToFit(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "scalesPageToFit"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/c0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/c0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setShowsHorizontalScrollIndicator(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "showsHorizontalScrollIndicator"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/q;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/q;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setShowsVerticalScrollIndicator(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "showsVerticalScrollIndicator"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/y;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/y;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setSource(Lcom/reactnativecommunity/webview/b;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "source"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/k;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/k;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setSupportMultipleWindows(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "setSupportMultipleWindows"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/b0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/b0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setTemporaryParentNodeTag(Lcom/reactnativecommunity/webview/b;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "temporaryParentNodeTag"
    .end annotation

    iput p2, p1, Lcom/reactnativecommunity/webview/b;->k:I

    return-void
.end method

.method public setTextZoom(Lcom/reactnativecommunity/webview/b;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "textZoom"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/k0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/k0;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setThirdPartyCookiesEnabled(Lcom/reactnativecommunity/webview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "thirdPartyCookiesEnabled"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/a0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/a0;-><init>(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setUrlPrefixesForDefaultIntent(Lcom/reactnativecommunity/webview/b;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "urlPrefixesForDefaultIntent"
    .end annotation

    new-instance v0, Lcom/reactnativecommunity/webview/u0;

    invoke-direct {v0, p2}, Lcom/reactnativecommunity/webview/u0;-><init>(Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    return-void
.end method

.method public setUserAgent(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "userAgent"
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p2, 0x0

    .line 7
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 8
    .line 9
    :goto_0
    new-instance p2, Lcom/reactnativecommunity/webview/w;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lcom/reactnativecommunity/webview/w;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 15
    .line 16
    .line 17
    return-void
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
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
.end method

.method protected setUserAgentString(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgent:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mUserAgentWithApplicationName:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
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

.method public setWebViewKey(Lcom/reactnativecommunity/webview/b;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "webViewKey"
    .end annotation

    .line 1
    sget-object v0, Lcom/reactnativecommunity/webview/b1;->a:Lcom/reactnativecommunity/webview/b1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/b1;->a()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/b1;->b()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/reactnativecommunity/webview/b;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/reactnativecommunity/webview/b;->b()Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, Lcom/reactnativecommunity/webview/b;->a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 35
    .line 36
    invoke-virtual {p0, v3, v2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setupWebChromeClient(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Landroid/view/ViewGroup;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1, v2}, Lcom/reactnativecommunity/webview/b;->a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    new-instance v2, Lcom/reactnativecommunity/webview/p;

    .line 67
    .line 68
    invoke-direct {v2, p2, p1, v1, v0}, Lcom/reactnativecommunity/webview/p;-><init>(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2}, Lcom/reactnativecommunity/webview/b;->d(Lcom/reactnativecommunity/webview/b$b;)V

    .line 72
    .line 73
    .line 74
    return-void
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

.method protected setupWebChromeClient(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mAllowsFullscreenVideo:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    invoke-virtual {v4}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    new-instance v6, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;

    .line 16
    .line 17
    move-object v0, v6

    .line 18
    move-object v1, p0

    .line 19
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;Landroid/app/Activity;I)V

    .line 22
    .line 23
    .line 24
    iput-object v6, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    .line 25
    .line 26
    invoke-virtual {p2, v6}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$d;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager$d;-><init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mWebChromeClient:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
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
