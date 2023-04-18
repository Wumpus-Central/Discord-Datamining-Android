.class public final synthetic Lcom/reactnativecommunity/webview/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:Lcom/reactnativecommunity/webview/RNCWebViewManager;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/w;->a:Lcom/reactnativecommunity/webview/RNCWebViewManager;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/w;->a:Lcom/reactnativecommunity/webview/RNCWebViewManager;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->setUserAgentString(Landroid/webkit/WebView;)V

    return-void
.end method
