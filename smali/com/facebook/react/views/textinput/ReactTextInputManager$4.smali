.class Lcom/facebook/react/views/textinput/ReactTextInputManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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
.method constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Lcom/facebook/react/views/textinput/ReactEditText;Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

    iput-object p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    iput-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    and-int/lit16 p1, p2, 0xff

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return p3

    .line 10
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/ReactEditText;->getBlurOnSubmit()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/facebook/react/views/textinput/ReactEditText;->isMultiline()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 25
    .line 26
    invoke-static {v1, v2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->access$000(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Lcom/facebook/react/views/textinput/ReactTextInputSubmitEditingEvent;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/ThemedReactContext;->getSurfaceId()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object v4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object v5, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 45
    .line 46
    invoke-virtual {v5}, Landroidx/appcompat/widget/k;->getText()Landroid/text/Editable;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/react/views/textinput/ReactTextInputSubmitEditingEvent;-><init>(IILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 58
    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$4;->val$editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/facebook/react/views/textinput/ReactEditText;->clearFocus()V

    .line 65
    .line 66
    .line 67
    :cond_2
    if-nez p1, :cond_5

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 p1, 0x5

    .line 73
    if-eq p2, p1, :cond_5

    .line 74
    .line 75
    const/4 p1, 0x7

    .line 76
    if-ne p2, p1, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const/4 p3, 0x0

    .line 80
    :cond_5
    :goto_1
    return p3
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
.end method
