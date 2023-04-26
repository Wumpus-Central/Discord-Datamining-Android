.class Lcom/shopify/reactnative/skia/PlatformContext$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopify/reactnative/skia/PlatformContext;->postFrameLoop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopify/reactnative/skia/PlatformContext;


# direct methods
.method constructor <init>(Lcom/shopify/reactnative/skia/PlatformContext;)V
    .locals 0

    iput-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$1;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$1;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/shopify/reactnative/skia/PlatformContext;->access$000(Lcom/shopify/reactnative/skia/PlatformContext;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$1;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/shopify/reactnative/skia/PlatformContext;->access$100(Lcom/shopify/reactnative/skia/PlatformContext;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$1;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/shopify/reactnative/skia/PlatformContext;->access$200(Lcom/shopify/reactnative/skia/PlatformContext;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/shopify/reactnative/skia/PlatformContext$1;->this$0:Lcom/shopify/reactnative/skia/PlatformContext;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/shopify/reactnative/skia/PlatformContext;->access$300(Lcom/shopify/reactnative/skia/PlatformContext;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method
