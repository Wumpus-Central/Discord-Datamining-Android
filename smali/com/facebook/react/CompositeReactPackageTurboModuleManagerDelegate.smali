.class public Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;
.super Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate$Builder;
    }
.end annotation


# static fields
.field private static volatile sIsSoLibraryLoaded:Z


# instance fields
.field private final mDelegates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/turbomodule/core/TurboModuleManagerDelegate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/ReactPackage;",
            ">;",
            "Ljava/util/List<",
            "Lcom/facebook/react/turbomodule/core/TurboModuleManagerDelegate;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V

    .line 3
    iput-object p3, p0, Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;->mDelegates:Ljava/util/List;

    .line 4
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/turbomodule/core/TurboModuleManagerDelegate;

    .line 5
    invoke-direct {p0, p2}, Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;->addTurboModuleManagerDelegate(Lcom/facebook/react/turbomodule/core/TurboModuleManagerDelegate;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private native addTurboModuleManagerDelegate(Lcom/facebook/react/turbomodule/core/TurboModuleManagerDelegate;)V
.end method


# virtual methods
.method protected native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method protected declared-synchronized maybeLoadOtherSoLibraries()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-boolean v0, Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;->sIsSoLibraryLoaded:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "turbomodulejsijni"

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->r(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    sput-boolean v0, Lcom/facebook/react/CompositeReactPackageTurboModuleManagerDelegate;->sIsSoLibraryLoaded:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    :cond_0
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit p0

    .line 18
    throw v0
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
