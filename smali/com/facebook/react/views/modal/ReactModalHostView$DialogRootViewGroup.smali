.class Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/RootView;
.implements Lcom/facebook/react/uimanager/FabricViewStateManager$HasFabricViewStateManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/modal/ReactModalHostView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DialogRootViewGroup"
.end annotation


# instance fields
.field private hasAdjustedSize:Z

.field private mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private final mFabricViewStateManager:Lcom/facebook/react/uimanager/FabricViewStateManager;

.field private mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

.field private final mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

.field private viewHeight:I

.field private viewWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->hasAdjustedSize:Z

    .line 6
    .line 7
    new-instance p1, Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 8
    .line 9
    invoke-direct {p1}, Lcom/facebook/react/uimanager/FabricViewStateManager;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mFabricViewStateManager:Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 13
    .line 14
    new-instance p1, Lcom/facebook/react/uimanager/JSTouchDispatcher;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/JSTouchDispatcher;-><init>(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

    .line 20
    .line 21
    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    new-instance p1, Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/JSPointerDispatcher;-><init>(Landroid/view/ViewGroup;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 31
    .line 32
    :cond_0
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method static synthetic access$000(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->setEventDispatcher(Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;)Lcom/facebook/react/bridge/ReactContext;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;)I
    .locals 0

    iget p0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewWidth:I

    return p0
.end method

.method static synthetic access$400(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;)I
    .locals 0

    iget p0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewHeight:I

    return p0
.end method

.method private getReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    return-object v0
.end method

.method private setEventDispatcher(Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    return-void
.end method

.method private updateFirstChildView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->hasAdjustedSize:Z

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mFabricViewStateManager:Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/FabricViewStateManager;->hasStateWrapper()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewWidth:I

    .line 27
    .line 28
    iget v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewHeight:I

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->updateState(II)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$1;

    .line 39
    .line 40
    invoke-direct {v2, p0, v1, v0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$1;-><init>(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;Lcom/facebook/react/bridge/ReactContext;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->hasAdjustedSize:Z

    .line 49
    .line 50
    :goto_0
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/views/view/ReactViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->hasAdjustedSize:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->updateFirstChildView()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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

.method public getFabricViewStateManager()Lcom/facebook/react/uimanager/FabricViewStateManager;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mFabricViewStateManager:Lcom/facebook/react/uimanager/FabricViewStateManager;

    return-object v0
.end method

.method public handleException(Ljava/lang/Throwable;)V
    .locals 2

    invoke-direct {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    return-void
.end method

.method public onChildEndedNativeGesture(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->onChildEndedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->onChildEndedNativeGesture()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
.end method

.method public onChildStartedNativeGesture(Landroid/view/MotionEvent;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->onChildStartedNativeGesture(Landroid/view/View;Landroid/view/MotionEvent;)V

    return-void
.end method

.method public onChildStartedNativeGesture(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    invoke-virtual {v0, p2, v1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->onChildStartedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    invoke-virtual {v0, p1, p2, v1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->onChildStartedNativeGesture(Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    :cond_0
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->handleMotionEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public onInterceptHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->handleMotionEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->handleTouchEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->handleMotionEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/ReactViewGroup;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewWidth:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->viewHeight:I

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->updateFirstChildView()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSTouchDispatcher:Lcom/facebook/react/uimanager/JSTouchDispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->handleTouchEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mJSPointerDispatcher:Lcom/facebook/react/uimanager/JSPointerDispatcher;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/uimanager/JSPointerDispatcher;->handleMotionEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    return-void
.end method

.method public updateState(II)V
    .locals 5

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    int-to-float p2, p2

    .line 7
    invoke-static {p2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->getFabricViewStateManager()Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/FabricViewStateManager;->getStateData()Lcom/facebook/react/bridge/ReadableMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v1, "screenHeight"

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    double-to-float v1, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v1, v3

    .line 37
    :goto_0
    const-string v2, "screenWidth"

    .line 38
    .line 39
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    double-to-float v3, v2

    .line 50
    :cond_1
    sub-float/2addr v3, p1

    .line 51
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const v2, 0x3f666666    # 0.9f

    .line 56
    .line 57
    .line 58
    cmpg-float v0, v0, v2

    .line 59
    .line 60
    if-gez v0, :cond_2

    .line 61
    .line 62
    sub-float/2addr v1, p2

    .line 63
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    cmpg-float v0, v0, v2

    .line 68
    .line 69
    if-gez v0, :cond_2

    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;->mFabricViewStateManager:Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 73
    .line 74
    new-instance v1, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;

    .line 75
    .line 76
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup$2;-><init>(Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;FF)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/FabricViewStateManager;->setState(Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;)V

    .line 80
    .line 81
    .line 82
    return-void
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
