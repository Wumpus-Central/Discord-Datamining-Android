.class public final synthetic Lcom/reactnativecommunity/webview/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/u0;->a:Lcom/facebook/react/bridge/ReadableArray;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/u0;->a:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->C(Lcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method
