.class public final Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNSScreenStackHeaderConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/u;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface<",
        "Lcom/swmansion/rnscreens/u;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u0000 N2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001OB\u0007\u00a2\u0006\u0004\u0008L\u0010MJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0002H\u0014J\u001a\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0017J!\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\u000fH\u0017\u00a2\u0006\u0004\u0008%\u0010&J!\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010\'\u001a\u0004\u0018\u00010\u000fH\u0017\u00a2\u0006\u0004\u0008(\u0010&J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0018H\u0017J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0018H\u0017J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0018H\u0017J!\u00100\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u0010/\u001a\u0004\u0018\u00010\u000fH\u0017\u00a2\u0006\u0004\u00080\u0010&J\u0018\u00102\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0018H\u0017J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0018H\u0017J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0018H\u0017J\u001a\u00108\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0008\u00107\u001a\u0004\u0018\u00010\u0004H\u0017J\u0016\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000109H\u0016J\u000e\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00020<H\u0014J\u001c\u0010?\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010@\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010A\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001a\u0010B\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J\u001c\u0010C\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010D\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001c\u0010E\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J#\u0010F\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008F\u0010&J\u001a\u0010G\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J#\u0010H\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008H\u0010&J\u001a\u0010I\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016R\u001a\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006P"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/swmansion/rnscreens/u;",
        "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;",
        "",
        "propName",
        "",
        "logNotAvailable",
        "getName",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "reactContext",
        "createViewInstance",
        "parent",
        "Landroid/view/View;",
        "child",
        "",
        "index",
        "addView",
        "view",
        "onDropViewInstance",
        "removeAllViews",
        "removeViewAt",
        "getChildCount",
        "getChildAt",
        "",
        "needsCustomLayoutForChildren",
        "onAfterUpdateTransaction",
        "config",
        "title",
        "setTitle",
        "titleFontFamily",
        "setTitleFontFamily",
        "titleFontSize",
        "setTitleFontSize",
        "titleFontWeight",
        "setTitleFontWeight",
        "titleColor",
        "setTitleColor",
        "(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V",
        "backgroundColor",
        "setBackgroundColor",
        "hideShadow",
        "setHideShadow",
        "hideBackButton",
        "setHideBackButton",
        "topInsetEnabled",
        "setTopInsetEnabled",
        "color",
        "setColor",
        "hidden",
        "setHidden",
        "translucent",
        "setTranslucent",
        "backButtonInCustomView",
        "setBackButtonInCustomView",
        "direction",
        "setDirection",
        "",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getDelegate",
        "value",
        "setBackTitle",
        "setBackTitleFontFamily",
        "setBackTitleFontSize",
        "setLargeTitle",
        "setLargeTitleFontFamily",
        "setLargeTitleFontSize",
        "setLargeTitleFontWeight",
        "setLargeTitleBackgroundColor",
        "setLargeTitleHideShadow",
        "setLargeTitleColor",
        "setDisableBackButtonMenu",
        "mDelegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "<init>",
        "()V",
        "Companion",
        "a",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreenStackHeaderConfig"


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerDelegate;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

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
.end method

.method private final logNotAvailable(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " prop is not available on Android"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RN SCREENS"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->addView(Lcom/swmansion/rnscreens/u;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/swmansion/rnscreens/u;Landroid/view/View;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p2, Lcom/swmansion/rnscreens/v;

    if-eqz v0, :cond_0

    .line 3
    check-cast p2, Lcom/swmansion/rnscreens/v;

    invoke-virtual {p1, p2, p3}, Lcom/swmansion/rnscreens/u;->b(Lcom/swmansion/rnscreens/v;I)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;

    const-string p2, "Config children should be of type RNSScreenStackHeaderSubview"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/u;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/u;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/u;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildAt(Lcom/swmansion/rnscreens/u;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/swmansion/rnscreens/u;I)Landroid/view/View;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->d(I)Lcom/swmansion/rnscreens/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildCount(Lcom/swmansion/rnscreens/u;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/swmansion/rnscreens/u;)I
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->getConfigSubviewsCount()I

    move-result p1

    return p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
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
    const-string v1, "registrationName"

    .line 6
    .line 7
    const-string v2, "onAttached"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0, v2, v3}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "onDetached"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/common/MapBuilder$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/react/common/MapBuilder$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/facebook/react/common/MapBuilder$Builder;->build()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
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
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreenStackHeaderConfig"

    return-object v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->onAfterUpdateTransaction(Lcom/swmansion/rnscreens/u;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/swmansion/rnscreens/u;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->g()V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->onDropViewInstance(Lcom/swmansion/rnscreens/u;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/swmansion/rnscreens/u;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->c()V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->removeAllViews(Lcom/swmansion/rnscreens/u;)V

    return-void
.end method

.method public removeAllViews(Lcom/swmansion/rnscreens/u;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->h()V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->removeViewAt(Lcom/swmansion/rnscreens/u;I)V

    return-void
.end method

.method public removeViewAt(Lcom/swmansion/rnscreens/u;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->i(I)V

    return-void
.end method

.method public bridge synthetic setBackButtonInCustomView(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackButtonInCustomView(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setBackButtonInCustomView(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "backButtonInCustomView"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setBackButtonInCustomView(Z)V

    return-void
.end method

.method public bridge synthetic setBackTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitle(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setBackTitle(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 0

    const-string p1, "backTitle"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setBackTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 0

    const-string p1, "backTitleFontFamily"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitleFontSize(Lcom/swmansion/rnscreens/u;I)V

    return-void
.end method

.method public setBackTitleFontSize(Lcom/swmansion/rnscreens/u;I)V
    .locals 0

    const-string p1, "backTitleFontSize"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackgroundColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V

    return-void
.end method

.method public setBackgroundColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "backgroundColor"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setBackgroundColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V

    return-void
.end method

.method public setColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "color"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTintColor(I)V

    return-void
.end method

.method public bridge synthetic setDirection(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setDirection(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setDirection(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "direction"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setDirection(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDisableBackButtonMenu(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setDisableBackButtonMenu(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setDisableBackButtonMenu(Lcom/swmansion/rnscreens/u;Z)V
    .locals 0

    const-string p1, "disableBackButtonMenu"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHidden(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setHidden(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "hidden"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setHidden(Z)V

    return-void
.end method

.method public bridge synthetic setHideBackButton(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHideBackButton(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setHideBackButton(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "hideBackButton"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setHideBackButton(Z)V

    return-void
.end method

.method public bridge synthetic setHideShadow(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHideShadow(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setHideShadow(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "hideShadow"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setHideShadow(Z)V

    return-void
.end method

.method public bridge synthetic setLargeTitle(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitle(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setLargeTitle(Lcom/swmansion/rnscreens/u;Z)V
    .locals 0

    const-string p1, "largeTitle"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleBackgroundColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V

    return-void
.end method

.method public setLargeTitleBackgroundColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V
    .locals 0

    const-string p1, "largeTitleBackgroundColor"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V

    return-void
.end method

.method public setLargeTitleColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V
    .locals 0

    const-string p1, "largeTitleColor"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setLargeTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 0

    const-string p1, "largeTitleFontFamily"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontSize(Lcom/swmansion/rnscreens/u;I)V

    return-void
.end method

.method public setLargeTitleFontSize(Lcom/swmansion/rnscreens/u;I)V
    .locals 0

    const-string p1, "largeTitleFontSize"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontWeight(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setLargeTitleFontWeight(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 0

    const-string p1, "largeTitleFontWeight"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleHideShadow(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleHideShadow(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setLargeTitleHideShadow(Lcom/swmansion/rnscreens/u;Z)V
    .locals 0

    const-string p1, "largeTitleHideShadow"

    .line 2
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitle(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setTitle(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "title"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTitleColor(Lcom/swmansion/rnscreens/u;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "titleColor"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTitleColor(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleFontFamily(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "titleFontFamily"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTitleFontFamily(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontSize(Lcom/swmansion/rnscreens/u;I)V

    return-void
.end method

.method public setTitleFontSize(Lcom/swmansion/rnscreens/u;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "titleFontSize"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p2, p2

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTitleFontSize(F)V

    return-void
.end method

.method public bridge synthetic setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontWeight(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleFontWeight(Lcom/swmansion/rnscreens/u;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "titleFontWeight"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTitleFontWeight(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTopInsetEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTopInsetEnabled(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setTopInsetEnabled(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "topInsetEnabled"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTopInsetEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setTranslucent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTranslucent(Lcom/swmansion/rnscreens/u;Z)V

    return-void
.end method

.method public setTranslucent(Lcom/swmansion/rnscreens/u;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "translucent"
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/u;->setTranslucent(Z)V

    return-void
.end method
