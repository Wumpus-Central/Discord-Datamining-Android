.class public final Lcom/swmansion/rnscreens/h0;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/h0$a;,
        Lcom/swmansion/rnscreens/h0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0002WXB\u0011\u0012\u0008\u0010T\u001a\u0004\u0018\u00010S\u00a2\u0006\u0004\u0008U\u0010VJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0008\u0010\u0015\u001a\u00020\u0002H\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R$\u0010-\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010%\u001a\u0004\u0008+\u0010\'\"\u0004\u0008,\u0010)R$\u00100\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010%\u001a\u0004\u0008.\u0010\'\"\u0004\u0008/\u0010)R$\u00103\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010%\u001a\u0004\u00081\u0010\'\"\u0004\u00082\u0010)R\"\u0010:\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\"\u0010A\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\"\u0010E\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010<\u001a\u0004\u0008C\u0010>\"\u0004\u0008D\u0010@R\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010<\u001a\u0004\u0008F\u0010>\"\u0004\u0008G\u0010@R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010<R\u0016\u0010R\u001a\u0004\u0018\u00010O8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010Q\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/h0;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "",
        "t",
        "Landroidx/appcompat/widget/SearchView;",
        "searchView",
        "setSearchViewListeners",
        "",
        "newText",
        "m",
        "",
        "hasFocus",
        "k",
        "j",
        "l",
        "n",
        "eventName",
        "Lcom/facebook/react/bridge/WritableMap;",
        "eventContent",
        "p",
        "o",
        "onAttachedToWindow",
        "Lcom/swmansion/rnscreens/h0$b;",
        "Lcom/swmansion/rnscreens/h0$b;",
        "getInputType",
        "()Lcom/swmansion/rnscreens/h0$b;",
        "setInputType",
        "(Lcom/swmansion/rnscreens/h0$b;)V",
        "inputType",
        "Lcom/swmansion/rnscreens/h0$a;",
        "Lcom/swmansion/rnscreens/h0$a;",
        "getAutoCapitalize",
        "()Lcom/swmansion/rnscreens/h0$a;",
        "setAutoCapitalize",
        "(Lcom/swmansion/rnscreens/h0$a;)V",
        "autoCapitalize",
        "",
        "Ljava/lang/Integer;",
        "getTextColor",
        "()Ljava/lang/Integer;",
        "setTextColor",
        "(Ljava/lang/Integer;)V",
        "textColor",
        "getTintColor",
        "setTintColor",
        "tintColor",
        "getHeaderIconColor",
        "setHeaderIconColor",
        "headerIconColor",
        "getHintTextColor",
        "setHintTextColor",
        "hintTextColor",
        "q",
        "Ljava/lang/String;",
        "getPlaceholder",
        "()Ljava/lang/String;",
        "setPlaceholder",
        "(Ljava/lang/String;)V",
        "placeholder",
        "r",
        "Z",
        "getShouldOverrideBackButton",
        "()Z",
        "setShouldOverrideBackButton",
        "(Z)V",
        "shouldOverrideBackButton",
        "s",
        "getAutoFocus",
        "setAutoFocus",
        "autoFocus",
        "getShouldShowHintSearchIcon",
        "setShouldShowHintSearchIcon",
        "shouldShowHintSearchIcon",
        "Lcom/swmansion/rnscreens/i0;",
        "u",
        "Lcom/swmansion/rnscreens/i0;",
        "mSearchViewFormatter",
        "v",
        "mAreListenersSet",
        "Lcom/swmansion/rnscreens/s;",
        "getScreenStackFragment",
        "()Lcom/swmansion/rnscreens/s;",
        "screenStackFragment",
        "Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "a",
        "b",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private k:Lcom/swmansion/rnscreens/h0$b;

.field private l:Lcom/swmansion/rnscreens/h0$a;

.field private m:Ljava/lang/Integer;

.field private n:Ljava/lang/Integer;

.field private o:Ljava/lang/Integer;

.field private p:Ljava/lang/Integer;

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Lcom/swmansion/rnscreens/i0;

.field private v:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/swmansion/rnscreens/h0$b;->k:Lcom/swmansion/rnscreens/h0$b;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->k:Lcom/swmansion/rnscreens/h0$b;

    .line 7
    .line 8
    sget-object p1, Lcom/swmansion/rnscreens/h0$a;->k:Lcom/swmansion/rnscreens/h0$a;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->l:Lcom/swmansion/rnscreens/h0$a;

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->q:Ljava/lang/String;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/h0;->r:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/h0;->t:Z

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/h0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/h0;->s(Lcom/swmansion/rnscreens/h0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/swmansion/rnscreens/h0;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/h0;->q(Lcom/swmansion/rnscreens/h0;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic c(Lcom/swmansion/rnscreens/h0;)Z
    .locals 0

    invoke-static {p0}, Lcom/swmansion/rnscreens/h0;->r(Lcom/swmansion/rnscreens/h0;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lcom/swmansion/rnscreens/h0;)Lcom/swmansion/rnscreens/i0;
    .locals 0

    iget-object p0, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    return-object p0
.end method

.method public static final synthetic e(Lcom/swmansion/rnscreens/h0;)Lcom/swmansion/rnscreens/s;
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->getScreenStackFragment()Lcom/swmansion/rnscreens/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/swmansion/rnscreens/h0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/h0;->m(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic g(Lcom/swmansion/rnscreens/h0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/h0;->n(Ljava/lang/String;)V

    return-void
.end method

.method private final getScreenStackFragment()Lcom/swmansion/rnscreens/s;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/swmansion/rnscreens/v;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/swmansion/rnscreens/v;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/v;->getConfig()Lcom/swmansion/rnscreens/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->getScreenFragment()Lcom/swmansion/rnscreens/s;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    return-object v2
    .line 23
.end method

.method public static final synthetic h(Lcom/swmansion/rnscreens/h0;Lcom/swmansion/rnscreens/i0;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    return-void
.end method

.method public static final synthetic i(Lcom/swmansion/rnscreens/h0;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->t()V

    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    const-string v0, "onClose"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/swmansion/rnscreens/h0;->p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method private final k(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "onFocus"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "onBlur"

    .line 7
    .line 8
    :goto_0
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/swmansion/rnscreens/h0;->p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 10
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
.end method

.method private final l()V
    .locals 2

    .line 1
    const-string v0, "onOpen"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/swmansion/rnscreens/h0;->p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method private final m(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "text"

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "onChangeText"

    .line 11
    .line 12
    invoke-direct {p0, p1, v0}, Lcom/swmansion/rnscreens/h0;->p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

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
.end method

.method private final n(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "text"

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "onSearchButtonPress"

    .line 11
    .line 12
    invoke-direct {p0, p1, v0}, Lcom/swmansion/rnscreens/h0;->p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

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
.end method

.method private final p(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    const-class v1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 27
    .line 28
    .line 29
    :cond_0
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
.end method

.method private static final q(Lcom/swmansion/rnscreens/h0;Landroid/view/View;Z)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/h0;->k(Z)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private static final r(Lcom/swmansion/rnscreens/h0;)Z
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->j()V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
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
.end method

.method private static final s(Lcom/swmansion/rnscreens/h0;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->l()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private final setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/h0$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/h0$d;-><init>(Lcom/swmansion/rnscreens/h0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$l;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/swmansion/rnscreens/e0;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/e0;-><init>(Lcom/swmansion/rnscreens/h0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/swmansion/rnscreens/f0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/f0;-><init>(Lcom/swmansion/rnscreens/h0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$k;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/swmansion/rnscreens/g0;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/g0;-><init>(Lcom/swmansion/rnscreens/h0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnSearchClickListener(Landroid/view/View$OnClickListener;)V

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
.end method

.method private final t()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->getScreenStackFragment()Lcom/swmansion/rnscreens/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/s;->D()Lcom/swmansion/rnscreens/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/h0;->v:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/h0;->setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/h0;->v:Z

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->k:Lcom/swmansion/rnscreens/h0$b;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->l:Lcom/swmansion/rnscreens/h0$a;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/h0$b;->b(Lcom/swmansion/rnscreens/h0$a;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->m:Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/i0;->h(Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->n:Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/i0;->i(Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->o:Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/i0;->e(Ljava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->p:Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/i0;->f(Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    iget-object v1, p0, Lcom/swmansion/rnscreens/h0;->u:Lcom/swmansion/rnscreens/i0;

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    iget-object v2, p0, Lcom/swmansion/rnscreens/h0;->q:Ljava/lang/String;

    .line 77
    .line 78
    iget-boolean v3, p0, Lcom/swmansion/rnscreens/h0;->t:Z

    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/rnscreens/i0;->g(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :cond_6
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/h0;->r:Z

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/c;->setOverrideBackAction(Z)V

    .line 86
    .line 87
    .line 88
    :cond_7
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final getAutoCapitalize()Lcom/swmansion/rnscreens/h0$a;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->l:Lcom/swmansion/rnscreens/h0$a;

    return-object v0
.end method

.method public final getAutoFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/h0;->s:Z

    return v0
.end method

.method public final getHeaderIconColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->o:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHintTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInputType()Lcom/swmansion/rnscreens/h0$b;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->k:Lcom/swmansion/rnscreens/h0$b;

    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldOverrideBackButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/h0;->r:Z

    return v0
.end method

.method public final getShouldShowHintSearchIcon()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/h0;->t:Z

    return v0
.end method

.method public final getTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTintColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/h0;->n:Ljava/lang/Integer;

    return-object v0
.end method

.method public final o()V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->t()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/h0;->getScreenStackFragment()Lcom/swmansion/rnscreens/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Lcom/swmansion/rnscreens/h0$c;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/h0$c;-><init>(Lcom/swmansion/rnscreens/h0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/s;->G(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final setAutoCapitalize(Lcom/swmansion/rnscreens/h0$a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->l:Lcom/swmansion/rnscreens/h0$a;

    .line 7
    .line 8
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
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/h0;->s:Z

    return-void
.end method

.method public final setHeaderIconColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->o:Ljava/lang/Integer;

    return-void
.end method

.method public final setHintTextColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->p:Ljava/lang/Integer;

    return-void
.end method

.method public final setInputType(Lcom/swmansion/rnscreens/h0$b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->k:Lcom/swmansion/rnscreens/h0$b;

    .line 7
    .line 8
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
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->q:Ljava/lang/String;

    .line 7
    .line 8
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
.end method

.method public final setShouldOverrideBackButton(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/h0;->r:Z

    return-void
.end method

.method public final setShouldShowHintSearchIcon(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/h0;->t:Z

    return-void
.end method

.method public final setTextColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->m:Ljava/lang/Integer;

    return-void
.end method

.method public final setTintColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0;->n:Ljava/lang/Integer;

    return-void
.end method
