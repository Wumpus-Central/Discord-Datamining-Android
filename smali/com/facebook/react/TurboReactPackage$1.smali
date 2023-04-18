.class Lcom/facebook/react/TurboReactPackage$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/TurboReactPackage;->getNativeModuleIterator(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;
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
.field final synthetic this$0:Lcom/facebook/react/TurboReactPackage;

.field final synthetic val$entrySetIterator:Ljava/util/Iterator;

.field final synthetic val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method constructor <init>(Lcom/facebook/react/TurboReactPackage;Ljava/util/Iterator;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/TurboReactPackage$1;->this$0:Lcom/facebook/react/TurboReactPackage;

    iput-object p2, p0, Lcom/facebook/react/TurboReactPackage$1;->val$entrySetIterator:Ljava/util/Iterator;

    iput-object p3, p0, Lcom/facebook/react/TurboReactPackage$1;->val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

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

    new-instance v0, Lcom/facebook/react/TurboReactPackage$1$1;

    invoke-direct {v0, p0}, Lcom/facebook/react/TurboReactPackage$1$1;-><init>(Lcom/facebook/react/TurboReactPackage$1;)V

    return-object v0
.end method
