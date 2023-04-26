.class public abstract Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# instance fields
.field private mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private mPackages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    const-string v1, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lc6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mPackages:Ljava/util/List;

    .line 9
    .line 10
    const-string v1, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lc6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mPackages:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->build(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
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
.end method

.method protected abstract build(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Lcom/facebook/react/ReactPackage;",
            ">;)",
            "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;"
        }
    .end annotation
.end method

.method public setPackages(Ljava/util/List;)Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/react/ReactPackage;",
            ">;)",
            "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mPackages:Ljava/util/List;

    return-object p0
.end method

.method public setReactApplicationContext(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method
