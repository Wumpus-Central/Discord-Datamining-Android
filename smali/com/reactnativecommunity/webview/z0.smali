.class public final synthetic Lcom/reactnativecommunity/webview/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/modules/core/PermissionListener;


# instance fields
.field public final synthetic k:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/z0;->k:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/z0;->k:Lcom/reactnativecommunity/webview/RNCWebViewManager$f;

    invoke-static {v0, p1, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->a(Lcom/reactnativecommunity/webview/RNCWebViewManager$f;I[Ljava/lang/String;[I)Z

    move-result p1

    return p1
.end method
