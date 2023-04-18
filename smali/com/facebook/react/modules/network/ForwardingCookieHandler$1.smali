.class Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ForwardingCookieHandler;->clearCookiesAsync(Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

.field final synthetic val$callback:Lcom/facebook/react/bridge/Callback;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/ForwardingCookieHandler;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;->this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    iput-object p2, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;->val$callback:Lcom/facebook/react/bridge/Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;->this$0:Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    invoke-static {v0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler;->access$000(Lcom/facebook/react/modules/network/ForwardingCookieHandler;)Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$CookieSaver;->onCookiesModified()V

    .line 3
    iget-object v0, p0, Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;->val$callback:Lcom/facebook/react/bridge/Callback;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/network/ForwardingCookieHandler$1;->onReceiveValue(Ljava/lang/Boolean;)V

    return-void
.end method
