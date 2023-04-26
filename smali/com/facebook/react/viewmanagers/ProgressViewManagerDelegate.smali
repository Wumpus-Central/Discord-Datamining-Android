.class public Lcom/facebook/react/viewmanagers/ProgressViewManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U::",
        "Lcom/facebook/react/uimanager/BaseViewManagerInterface<",
        "TT;>;:",
        "Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "trackImage"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x5

    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string v0, "progressTintColor"

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x4

    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v0, "progressImage"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x3

    .line 45
    goto :goto_0

    .line 46
    :sswitch_3
    const-string v0, "trackTintColor"

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x2

    .line 56
    goto :goto_0

    .line 57
    :sswitch_4
    const-string v0, "progress"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const/4 v1, 0x1

    .line 67
    goto :goto_0

    .line 68
    :sswitch_5
    const-string v0, "progressViewStyle"

    .line 69
    .line 70
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/4 v1, 0x0

    .line 78
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 86
    .line 87
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 88
    .line 89
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 90
    .line 91
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setTrackImage(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 96
    .line 97
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setProgressTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 112
    .line 113
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 114
    .line 115
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 116
    .line 117
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setProgressImage(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 122
    .line 123
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setTrackTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 138
    .line 139
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 140
    .line 141
    if-nez p3, :cond_6

    .line 142
    .line 143
    const/4 p3, 0x0

    .line 144
    goto :goto_1

    .line 145
    :cond_6
    check-cast p3, Ljava/lang/Double;

    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    :goto_1
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setProgress(Landroid/view/View;F)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 156
    .line 157
    check-cast p2, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;

    .line 158
    .line 159
    check-cast p3, Ljava/lang/String;

    .line 160
    .line 161
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ProgressViewManagerInterface;->setProgressViewStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    return-void

    .line 165
    :sswitch_data_0
    .sparse-switch
        -0x742aada1 -> :sswitch_5
        -0x3bab3dd3 -> :sswitch_4
        -0x1120fbe3 -> :sswitch_3
        0x2d564b2e -> :sswitch_2
        0x3962117b -> :sswitch_1
        0x43e9ded0 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
