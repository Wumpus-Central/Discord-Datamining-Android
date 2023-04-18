.class Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;
.super Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;
.source "SourceFile"


# instance fields
.field private mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

.field private mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private volatile mInitialized:Z

.field private mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mInitialized:Z

    .line 9
    .line 10
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    return-void
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
.end method

.method public static synthetic a(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V
    .locals 0

    invoke-static {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->lambda$deleteView$0(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->lambda$dfs$1(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V

    return-void
.end method

.method private dfs(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p2, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    :try_start_1
    new-instance v1, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 22
    .line 23
    invoke-direct {v1, p1, v2}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;-><init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/view/ViewGroup;

    .line 33
    .line 34
    new-instance v4, Lcom/swmansion/reanimated/layoutReanimation/c;

    .line 35
    .line 36
    invoke-direct {v4, p2, p1}, Lcom/swmansion/reanimated/layoutReanimation/c;-><init>(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1, v3, v1, v4}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->onViewRemoval(Landroid/view/View;Landroid/view/ViewGroup;Lcom/swmansion/reanimated/layoutReanimation/Snapshot;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception v1

    .line 44
    goto :goto_0

    .line 45
    :catch_1
    move-exception v1

    .line 46
    const/4 v0, 0x0

    .line 47
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :goto_1
    instance-of v1, v0, Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    check-cast v0, Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    :goto_2
    move-object v2, p1

    .line 58
    check-cast v2, Landroid/view/ViewGroup;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ge v1, v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {p0, v2, p2}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->dfs(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
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

.method private static synthetic lambda$deleteView$0(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V
    .locals 0

    invoke-interface {p0}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;->onAnimationEnd()V

    return-void
.end method

.method private static synthetic lambda$dfs$1(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->publicDropView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method


# virtual methods
.method public applyLayoutUpdate(Landroid/view/View;IIII)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->isLayoutAnimationEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->applyLayoutUpdate(Landroid/view/View;IIII)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->maybeInit()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 39
    .line 40
    invoke-direct {v0, p1, v1}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;-><init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 41
    .line 42
    .line 43
    add-int/2addr p4, p2

    .line 44
    add-int/2addr p5, p3

    .line 45
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 46
    .line 47
    .line 48
    new-instance p2, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;

    .line 49
    .line 50
    iget-object p3, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    check-cast p3, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 57
    .line 58
    invoke-direct {p2, p1, p3}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;-><init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 59
    .line 60
    .line 61
    iget-object p3, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 62
    .line 63
    invoke-virtual {p3, p1, v0, p2}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->onViewUpdate(Landroid/view/View;Lcom/swmansion/reanimated/layoutReanimation/Snapshot;Lcom/swmansion/reanimated/layoutReanimation/Snapshot;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    add-int/2addr p4, p2

    .line 68
    add-int/2addr p5, p3

    .line 69
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    const/4 p3, -0x1

    .line 77
    if-eq p2, p3, :cond_3

    .line 78
    .line 79
    iget-object p2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Landroid/view/ViewGroup;

    .line 86
    .line 87
    new-instance p4, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;

    .line 88
    .line 89
    iget-object p5, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    invoke-virtual {p5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p5

    .line 95
    check-cast p5, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 96
    .line 97
    invoke-direct {p4, p1, p5}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;-><init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, p1, p3, p4}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->onViewCreate(Landroid/view/View;Landroid/view/ViewGroup;Lcom/swmansion/reanimated/layoutReanimation/Snapshot;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    return-void
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
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
.end method

.method public deleteView(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->isLayoutAnimationEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->deleteView(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    .line 27
    .line 28
    .line 29
    move-result-object v1
    :try_end_0
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 30
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "RNSScreen"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v2, v2, Landroid/view/View;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Landroid/view/View;

    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    .line 75
    .line 76
    .line 77
    move-result-object v2
    :try_end_1
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "RNSScreenStack"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->deleteView(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->deleteView(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->maybeInit()V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 114
    .line 115
    invoke-direct {v2, p1, v3}, Lcom/swmansion/reanimated/layoutReanimation/Snapshot;-><init>(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 116
    .line 117
    .line 118
    iget-object v3, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Landroid/view/ViewGroup;

    .line 125
    .line 126
    new-instance v5, Lcom/swmansion/reanimated/layoutReanimation/b;

    .line 127
    .line 128
    invoke-direct {v5, p2}, Lcom/swmansion/reanimated/layoutReanimation/b;-><init>(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p1, v4, v2, v5}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->onViewRemoval(Landroid/view/View;Landroid/view/ViewGroup;Lcom/swmansion/reanimated/layoutReanimation/Snapshot;Ljava/lang/Runnable;)V

    .line 132
    .line 133
    .line 134
    instance-of p2, v1, Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 135
    .line 136
    if-eqz p2, :cond_2

    .line 137
    .line 138
    check-cast v1, Lcom/facebook/react/uimanager/ViewGroupManager;

    .line 139
    .line 140
    const/4 p2, 0x0

    .line 141
    :goto_0
    move-object v2, p1

    .line 142
    check-cast v2, Landroid/view/ViewGroup;

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ge p2, v3, :cond_2

    .line 149
    .line 150
    invoke-virtual {v1, v2, p2}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-direct {p0, v2, v0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->dfs(Landroid/view/View;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 p2, p2, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_2
    return-void

    .line 161
    :catch_1
    move-exception v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 163
    .line 164
    .line 165
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->deleteView(Landroid/view/View;Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    .line 166
    .line 167
    .line 168
    return-void
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

.method public isLayoutAnimationEnabled()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->maybeInit()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->isLayoutAnimationEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
    .line 11
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
.end method

.method public maybeInit()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mInitialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mInitialized:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    const-class v1, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/swmansion/reanimated/ReanimatedModule;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/swmansion/reanimated/ReanimatedModule;->getNodesManager()Lcom/swmansion/reanimated/NodesManager;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->getAnimationsManager()Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mAnimationsManager:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->mWeakNativeViewHierarchyManage:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->setReanimatedNativeHierarchyManager(Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
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
.end method

.method public shouldAnimateLayout(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->isLayoutAnimationEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;->shouldAnimateLayout(Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_2
    return v0
    .line 24
    .line 25
    .line 26
    .line 27
.end method
