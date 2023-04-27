.class Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;->receiveCommand(Lh2/h;ILcom/facebook/react/bridge/ReadableArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic l:Lh2/h;

.field final synthetic m:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;


# direct methods
.method constructor <init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;Lcom/facebook/react/bridge/ReadableArray;Lh2/h;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->m:Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;

    iput-object p2, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->k:Lcom/facebook/react/bridge/ReadableArray;

    iput-object p3, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 24
    .line 25
    invoke-virtual {v3, v1, v0}, Lh2/h;->A(II)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 29
    .line 30
    invoke-virtual {v0}, Lh2/h;->getSpeed()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    cmpl-float v0, v0, v2

    .line 35
    .line 36
    if-lez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 39
    .line 40
    invoke-virtual {v0}, Lh2/h;->w()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v3, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 45
    .line 46
    invoke-virtual {v3, v0, v1}, Lh2/h;->A(II)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 50
    .line 51
    invoke-virtual {v0}, Lh2/h;->getSpeed()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    cmpg-float v0, v0, v2

    .line 56
    .line 57
    if-gez v0, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 60
    .line 61
    invoke-virtual {v0}, Lh2/h;->w()V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 65
    .line 66
    invoke-static {v0}, Landroidx/core/view/w0;->T(Landroid/view/View;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Lh2/h;->setProgress(F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 78
    .line 79
    invoke-virtual {v0}, Lh2/h;->playAnimation()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iget-object v0, p0, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;->l:Lh2/h;

    .line 84
    .line 85
    new-instance v1, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b$a;

    .line 86
    .line 87
    invoke-direct {v1, p0}, Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b$a;-><init>(Lcom/airbnb/android/react/lottie/LottieAnimationViewManager$b;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    return-void
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
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
