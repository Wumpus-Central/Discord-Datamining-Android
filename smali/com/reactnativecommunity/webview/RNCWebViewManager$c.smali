.class Lcom/reactnativecommunity/webview/RNCWebViewManager$c;
.super Lcom/reactnativecommunity/webview/RNCWebViewManager$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/RNCWebViewManager;->setupWebChromeClient(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic x:Landroid/app/Activity;

.field final synthetic y:I

.field final synthetic z:Lcom/reactnativecommunity/webview/RNCWebViewManager;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewManager;Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->z:Lcom/reactnativecommunity/webview/RNCWebViewManager;

    iput-object p4, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->x:Landroid/app/Activity;

    iput p5, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->y:I

    invoke-direct {p0, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;-><init>(Lcom/facebook/react/bridge/ReactContext;Landroid/webkit/WebView;)V

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 2

    const/16 v0, 0x32

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public onHideCustomView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->c()Landroid/view/ViewGroup;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->x:Landroid/app/Activity;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/16 v2, 0x200

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 55
    .line 56
    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 61
    .line 62
    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->x:Landroid/app/Activity;

    .line 65
    .line 66
    iget v1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->y:I

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->k:Lcom/facebook/react/bridge/ReactContext;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->x:Landroid/app/Activity;

    .line 14
    .line 15
    const/4 p2, -0x1

    .line 16
    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 20
    .line 21
    const/16 p2, 0x1f06

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$c;->x:Landroid/app/Activity;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/16 p2, 0x200

    .line 33
    .line 34
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 38
    .line 39
    const/high16 p2, -0x1000000

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->c()Landroid/view/ViewGroup;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->m:Landroid/view/View;

    .line 49
    .line 50
    sget-object v0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->w:Landroid/widget/FrameLayout$LayoutParams;

    .line 51
    .line 52
    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p2, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    if-eq p1, p2, :cond_1

    .line 68
    .line 69
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->l:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    :goto_0
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager$f;->k:Lcom/facebook/react/bridge/ReactContext;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 87
    .line 88
    .line 89
    return-void
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
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method
