.class Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->k(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/webkit/WebView;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

.field final synthetic n:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager$e;Landroid/webkit/WebView;Ljava/lang/String;Lcom/reactnativecommunity/webview/RNCWebViewManager$e;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->n:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->k:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->l:Ljava/lang/String;

    iput-object p4, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->m:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->n:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->r:Lcom/reactnativecommunity/webview/RNCWebViewManager$g;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->k:Landroid/webkit/WebView;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/reactnativecommunity/webview/RNCWebViewManager$g;->a(Landroid/webkit/WebView;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "data"

    .line 19
    .line 20
    iget-object v2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->l:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->n:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    .line 26
    .line 27
    iget-object v2, v1, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->s:Lcom/facebook/react/bridge/CatalystInstance;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->m:Lcom/reactnativecommunity/webview/RNCWebViewManager$e;

    .line 32
    .line 33
    const-string v2, "onMessage"

    .line 34
    .line 35
    invoke-virtual {v1, v2, v0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->l(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->k:Landroid/webkit/WebView;

    .line 40
    .line 41
    new-instance v3, Lze/f;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$e$a;->k:Landroid/webkit/WebView;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/reactnativecommunity/webview/b;->c(Landroid/webkit/WebView;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-direct {v3, v4, v0}, Lze/f;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Lcom/reactnativecommunity/webview/RNCWebViewManager$e;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/Event;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
