.class public final Lcom/discord/bridge/DCDModuleProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J@\u0010\n\u001a\u00020\t2\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022 \u0008\u0002\u0010\u0008\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\u000c\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/bridge/DCDModuleProvider;",
        "",
        "Lkotlin/Function1;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "onNativeModule",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        "onViewManager",
        "Lcom/facebook/react/ReactPackage;",
        "getLegacyPackageForModuleWithViewManager",
        "getLegacyPackageForModule",
        "",
        "moduleName",
        "Lcom/facebook/react/bridge/NativeModule;",
        "Lcom/facebook/react/TurboReactPackage;",
        "getTurboPackageForModule",
        "<init>",
        "()V",
        "app_canaryRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/bridge/DCDModuleProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/bridge/DCDModuleProvider;

    invoke-direct {v0}, Lcom/discord/bridge/DCDModuleProvider;-><init>()V

    sput-object v0, Lcom/discord/bridge/DCDModuleProvider;->INSTANCE:Lcom/discord/bridge/DCDModuleProvider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getLegacyPackageForModuleWithViewManager$default(Lcom/discord/bridge/DCDModuleProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/facebook/react/ReactPackage;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getLegacyPackageForModule(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "+",
            "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
            ">;)",
            "Lcom/facebook/react/ReactPackage;"
        }
    .end annotation

    .line 1
    const-string v0, "onNativeModule"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p0, p1, v0, v1, v0}, Lcom/discord/bridge/DCDModuleProvider;->getLegacyPackageForModuleWithViewManager$default(Lcom/discord/bridge/DCDModuleProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/facebook/react/ReactPackage;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final getLegacyPackageForModuleWithViewManager(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/ReactPackage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "+",
            "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "+",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "*",
            "Lcom/facebook/react/uimanager/LayoutShadowNode;",
            ">;>;)",
            "Lcom/facebook/react/ReactPackage;"
        }
    .end annotation

    new-instance v0, Lcom/discord/bridge/DCDModuleProvider$getLegacyPackageForModuleWithViewManager$1;

    invoke-direct {v0, p1, p2}, Lcom/discord/bridge/DCDModuleProvider$getLegacyPackageForModuleWithViewManager$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final getTurboPackageForModule(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/TurboReactPackage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "+",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;)",
            "Lcom/facebook/react/TurboReactPackage;"
        }
    .end annotation

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onNativeModule"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/discord/bridge/DCDModuleProvider$getTurboPackageForModule$1;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/discord/bridge/DCDModuleProvider$getTurboPackageForModule$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
.end method
