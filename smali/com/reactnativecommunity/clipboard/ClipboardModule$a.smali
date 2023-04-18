.class Lcom/reactnativecommunity/clipboard/ClipboardModule$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/clipboard/ClipboardModule;->setListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/reactnativecommunity/clipboard/ClipboardModule;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/clipboard/ClipboardModule;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/clipboard/ClipboardModule$a;->a:Lcom/reactnativecommunity/clipboard/ClipboardModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrimaryClipChanged()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/clipboard/ClipboardModule$a;->a:Lcom/reactnativecommunity/clipboard/ClipboardModule;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/reactnativecommunity/clipboard/ClipboardModule;->access$000(Lcom/reactnativecommunity/clipboard/ClipboardModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 14
    .line 15
    const-string v1, "RNCClipboard_TEXT_CHANGED"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method
