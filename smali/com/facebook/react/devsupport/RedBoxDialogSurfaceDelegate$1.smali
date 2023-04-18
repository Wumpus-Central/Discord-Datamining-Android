.class Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->show()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;->this$0:Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const/16 v0, 0x52

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;->this$0:Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->access$000(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->showDevOptionsDialog()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;->this$0:Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->access$100(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;)Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;->didDoubleTapR(ILandroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;->this$0:Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->access$000(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
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
.end method
