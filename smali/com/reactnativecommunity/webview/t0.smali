.class public final synthetic Lcom/reactnativecommunity/webview/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:Lcom/reactnativecommunity/webview/RNCWebViewManager;

.field public final synthetic b:Lcom/reactnativecommunity/webview/b;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/t0;->a:Lcom/reactnativecommunity/webview/RNCWebViewManager;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/t0;->b:Lcom/reactnativecommunity/webview/b;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 2

    iget-object v0, p0, Lcom/reactnativecommunity/webview/t0;->a:Lcom/reactnativecommunity/webview/RNCWebViewManager;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/t0;->b:Lcom/reactnativecommunity/webview/b;

    invoke-static {v0, v1, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->e(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/reactnativecommunity/webview/b;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method
