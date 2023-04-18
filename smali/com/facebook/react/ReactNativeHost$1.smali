.class Lcom/facebook/react/ReactNativeHost$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/common/SurfaceDelegateFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/ReactNativeHost;->getSurfaceDelegateFactory()Lcom/facebook/react/common/SurfaceDelegateFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactNativeHost;


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactNativeHost;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactNativeHost$1;->this$0:Lcom/facebook/react/ReactNativeHost;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
