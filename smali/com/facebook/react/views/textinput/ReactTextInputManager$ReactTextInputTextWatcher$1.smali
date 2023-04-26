.class Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;->this$1:Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStateUpdate()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;->this$1:Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;

    .line 7
    .line 8
    invoke-static {v1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->access$100(Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;)Lcom/facebook/react/views/textinput/ReactEditText;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/facebook/react/views/textinput/ReactEditText;->incrementAndGetEventCounter()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "mostRecentEventCount"

    .line 17
    .line 18
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;->this$1:Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->access$100(Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;)Lcom/facebook/react/views/textinput/ReactEditText;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const-string v2, "opaqueCacheId"

    .line 32
    .line 33
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method
