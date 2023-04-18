.class public final synthetic Lcom/reactnativecommunity/webview/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/webview/b$b;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/reactnativecommunity/webview/b;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/p;->b:Lcom/reactnativecommunity/webview/b;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/p;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/reactnativecommunity/webview/p;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 4

    iget-object v0, p0, Lcom/reactnativecommunity/webview/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/p;->b:Lcom/reactnativecommunity/webview/b;

    iget-object v2, p0, Lcom/reactnativecommunity/webview/p;->c:Ljava/util/Map;

    iget-object v3, p0, Lcom/reactnativecommunity/webview/p;->d:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->J(Ljava/lang/String;Lcom/reactnativecommunity/webview/b;Ljava/util/Map;Ljava/util/Map;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V

    return-void
.end method
