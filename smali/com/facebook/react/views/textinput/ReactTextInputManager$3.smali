.class Lcom/facebook/react/views/textinput/ReactTextInputManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

.field final synthetic val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

.field final synthetic val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

    iput-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    iput-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/ThemedReactContext;->getSurfaceId()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->access$000(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputFocusEvent;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {p2, p1, v1}, Lcom/facebook/react/views/textinput/ReactTextInputFocusEvent;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputBlurEvent;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {p2, p1, v1}, Lcom/facebook/react/views/textinput/ReactTextInputBlurEvent;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 44
    .line 45
    .line 46
    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputEndEditingEvent;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$3;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {p2, p1, v1, v2}, Lcom/facebook/react/views/textinput/ReactTextInputEndEditingEvent;-><init>(IILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, p2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void
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
.end method
