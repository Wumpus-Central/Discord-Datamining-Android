.class Lcom/swmansion/reanimated/ReanimatedPackage$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/module/model/ReactModuleInfoProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/ReanimatedPackage;->getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/ReanimatedPackage;

.field final synthetic val$reactModuleInfoMap:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/ReanimatedPackage;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/ReanimatedPackage$1;->this$0:Lcom/swmansion/reanimated/ReanimatedPackage;

    iput-object p2, p0, Lcom/swmansion/reanimated/ReanimatedPackage$1;->val$reactModuleInfoMap:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getReactModuleInfos()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/module/model/ReactModuleInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/reanimated/ReanimatedPackage$1;->val$reactModuleInfoMap:Ljava/util/Map;

    return-object v0
.end method
