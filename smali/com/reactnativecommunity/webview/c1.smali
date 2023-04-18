.class public final synthetic Lcom/reactnativecommunity/webview/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/c1;->k:Ljava/lang/String;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/c1;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/c1;->m:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c1;->k:Ljava/lang/String;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c1;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/reactnativecommunity/webview/c1;->m:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, v1, v2}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->b(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method
