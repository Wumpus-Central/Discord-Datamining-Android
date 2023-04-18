.class Lcom/facebook/react/ReactActivityDelegate$1;
.super Lcom/facebook/react/ReactDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/ReactActivityDelegate;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactActivityDelegate;


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactActivityDelegate;Landroid/app/Activity;Lcom/facebook/react/ReactNativeHost;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactActivityDelegate$1;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/facebook/react/ReactDelegate;-><init>(Landroid/app/Activity;Lcom/facebook/react/ReactNativeHost;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected createRootView()Lcom/facebook/react/ReactRootView;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivityDelegate$1;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    invoke-virtual {v0}, Lcom/facebook/react/ReactActivityDelegate;->createRootView()Lcom/facebook/react/ReactRootView;

    move-result-object v0

    return-object v0
.end method
