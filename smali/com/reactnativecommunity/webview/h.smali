.class public final synthetic Lcom/reactnativecommunity/webview/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method public synthetic constructor <init>(ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/reactnativecommunity/webview/h;->a:I

    iput-object p2, p0, Lcom/reactnativecommunity/webview/h;->b:Lcom/facebook/react/bridge/ReadableArray;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 2

    iget v0, p0, Lcom/reactnativecommunity/webview/h;->a:I

    iget-object v1, p0, Lcom/reactnativecommunity/webview/h;->b:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v0, v1, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->k(ILcom/facebook/react/bridge/ReadableArray;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method
