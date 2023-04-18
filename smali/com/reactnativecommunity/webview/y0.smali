.class public final synthetic Lcom/reactnativecommunity/webview/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

.field public final synthetic l:Landroid/webkit/WebView;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;Landroid/webkit/WebView;Ljava/lang/String;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/y0;->k:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/y0;->l:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/y0;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/reactnativecommunity/webview/y0;->n:Lcom/facebook/react/bridge/ReactContext;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/reactnativecommunity/webview/y0;->k:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/y0;->l:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/reactnativecommunity/webview/y0;->m:Ljava/lang/String;

    iget-object v3, p0, Lcom/reactnativecommunity/webview/y0;->n:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v0, v1, v2, v3}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;Landroid/webkit/WebView;Ljava/lang/String;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method
