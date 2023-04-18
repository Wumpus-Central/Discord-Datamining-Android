.class Lcom/facebook/react/LazyReactPackage$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/LazyReactPackage;->getNativeModuleIterator(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/facebook/react/bridge/ModuleHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/LazyReactPackage;

.field final synthetic val$nativeModules:Ljava/util/List;

.field final synthetic val$reactModuleInfoMap:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/facebook/react/LazyReactPackage;Ljava/util/List;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/LazyReactPackage$2;->this$0:Lcom/facebook/react/LazyReactPackage;

    iput-object p2, p0, Lcom/facebook/react/LazyReactPackage$2;->val$nativeModules:Ljava/util/List;

    iput-object p3, p0, Lcom/facebook/react/LazyReactPackage$2;->val$reactModuleInfoMap:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/facebook/react/bridge/ModuleHolder;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/facebook/react/LazyReactPackage$2$1;

    invoke-direct {v0, p0}, Lcom/facebook/react/LazyReactPackage$2$1;-><init>(Lcom/facebook/react/LazyReactPackage$2;)V

    return-object v0
.end method
