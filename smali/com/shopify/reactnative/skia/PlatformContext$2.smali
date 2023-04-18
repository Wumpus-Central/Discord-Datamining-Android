.class Lcom/shopify/reactnative/skia/PlatformContext$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopify/reactnative/skia/PlatformContext;->raise(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopify/reactnative/skia/PlatformContext;

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopify/reactnative/skia/PlatformContext;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$2;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    iput-object p2, p0, Lcom/shopify/reactnative/skia/PlatformContext$2;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/shopify/reactnative/skia/PlatformContext$2;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    invoke-static {v0}, Lcom/shopify/reactnative/skia/PlatformContext;->access$400(Lcom/shopify/reactnative/skia/PlatformContext;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    iget-object v2, p0, Lcom/shopify/reactnative/skia/PlatformContext$2;->val$message:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    return-void
.end method
