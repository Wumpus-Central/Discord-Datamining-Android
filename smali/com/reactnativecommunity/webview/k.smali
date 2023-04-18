.class public final synthetic Lcom/reactnativecommunity/webview/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->s(Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method
