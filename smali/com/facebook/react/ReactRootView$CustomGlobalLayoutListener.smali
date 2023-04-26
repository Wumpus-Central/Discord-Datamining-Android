.class Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactRootView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CustomGlobalLayoutListener"
.end annotation


# instance fields
.field private mDeviceRotation:I

.field private mKeyboardHeight:I

.field private final mMinKeyboardHeightDetected:I

.field private final mVisibleViewArea:Landroid/graphics/Rect;

.field final synthetic this$0:Lcom/facebook/react/ReactRootView;


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactRootView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mKeyboardHeight:I

    .line 8
    .line 9
    iput v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mDeviceRotation:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->initDisplayMetricsIfNotInitialized(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 28
    .line 29
    const/high16 p1, 0x42700000    # 60.0f

    .line 30
    .line 31
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    float-to-int p1, p1

    .line 36
    iput p1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mMinKeyboardHeightDetected:I

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method static synthetic access$000(Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->checkForKeyboardEvents()V

    return-void
.end method

.method private checkForDeviceDimensionsChanges()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->emitUpdateDimensionsEvent()V

    return-void
.end method

.method private checkForDeviceOrientationChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "window"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/WindowManager;

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mDeviceRotation:I

    .line 24
    .line 25
    if-ne v1, v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iput v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mDeviceRotation:I

    .line 29
    .line 30
    iget-object v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->initDisplayMetrics(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->emitOrientationChanged(I)V

    .line 44
    .line 45
    .line 46
    return-void
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
.end method

.method private checkForKeyboardEvents()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1c

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {v0}, Landroidx/core/view/i3;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-static {v0}, Landroidx/core/view/q;->a(Landroid/view/DisplayCutout;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v0, v2

    .line 43
    :goto_0
    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getWindowDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 48
    .line 49
    iget-object v3, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 50
    .line 51
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    sub-int/2addr v1, v3

    .line 54
    add-int/2addr v1, v0

    .line 55
    iget v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mKeyboardHeight:I

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    if-eq v0, v1, :cond_1

    .line 59
    .line 60
    iget v5, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mMinKeyboardHeightDetected:I

    .line 61
    .line 62
    if-le v1, v5, :cond_1

    .line 63
    .line 64
    move v5, v4

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v5, v2

    .line 67
    :goto_1
    if-eqz v5, :cond_2

    .line 68
    .line 69
    iput v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mKeyboardHeight:I

    .line 70
    .line 71
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 72
    .line 73
    int-to-float v1, v3

    .line 74
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    float-to-double v3, v1

    .line 79
    iget-object v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 80
    .line 81
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    int-to-float v1, v1

    .line 84
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    float-to-double v5, v1

    .line 89
    iget-object v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    int-to-float v1, v1

    .line 96
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    float-to-double v7, v1

    .line 101
    iget v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mKeyboardHeight:I

    .line 102
    .line 103
    int-to-float v1, v1

    .line 104
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    float-to-double v9, v1

    .line 109
    move-object v2, p0

    .line 110
    invoke-direct/range {v2 .. v10}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->createKeyboardEventPayload(DDDD)Lcom/facebook/react/bridge/WritableMap;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v2, "keyboardDidShow"

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/ReactRootView;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    if-eqz v0, :cond_3

    .line 121
    .line 122
    iget v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mMinKeyboardHeightDetected:I

    .line 123
    .line 124
    if-gt v1, v0, :cond_3

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_3
    move v4, v2

    .line 128
    :goto_2
    if-eqz v4, :cond_4

    .line 129
    .line 130
    iput v2, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mKeyboardHeight:I

    .line 131
    .line 132
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 133
    .line 134
    invoke-static {v0}, Lcom/facebook/react/ReactRootView;->access$300(Lcom/facebook/react/ReactRootView;)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    int-to-float v1, v1

    .line 139
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    float-to-double v3, v1

    .line 144
    const-wide/16 v5, 0x0

    .line 145
    .line 146
    iget-object v1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->mVisibleViewArea:Landroid/graphics/Rect;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    int-to-float v1, v1

    .line 153
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    float-to-double v7, v1

    .line 158
    const-wide/16 v9, 0x0

    .line 159
    .line 160
    move-object v2, p0

    .line 161
    invoke-direct/range {v2 .. v10}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->createKeyboardEventPayload(DDDD)Lcom/facebook/react/bridge/WritableMap;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v2, "keyboardDidHide"

    .line 166
    .line 167
    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/ReactRootView;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    return-void
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

.method private createKeyboardEventPayload(DDDD)Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "height"

    .line 10
    .line 11
    invoke-interface {v1, v2, p7, p8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 12
    .line 13
    .line 14
    const-string p7, "screenX"

    .line 15
    .line 16
    invoke-interface {v1, p7, p3, p4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 17
    .line 18
    .line 19
    const-string p3, "width"

    .line 20
    .line 21
    invoke-interface {v1, p3, p5, p6}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 22
    .line 23
    .line 24
    const-string p3, "screenY"

    .line 25
    .line 26
    invoke-interface {v1, p3, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 27
    .line 28
    .line 29
    const-string p1, "endCoordinates"

    .line 30
    .line 31
    invoke-interface {v0, p1, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "easing"

    .line 35
    .line 36
    const-string p2, "keyboard"

    .line 37
    .line 38
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "duration"

    .line 42
    .line 43
    const-wide/16 p2, 0x0

    .line 44
    .line 45
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 46
    .line 47
    .line 48
    return-object v0
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

.method private emitOrientationChanged(I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p1, v1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq p1, v2, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p1, "landscape-secondary"

    .line 15
    .line 16
    const-wide v2, 0x4056800000000000L    # 90.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-string p1, "portrait-secondary"

    .line 23
    .line 24
    const-wide v2, 0x4066800000000000L    # 180.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    const-string p1, "landscape-primary"

    .line 31
    .line 32
    const-wide v2, -0x3fa9800000000000L    # -90.0

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    :goto_0
    move v0, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const-string p1, "portrait-primary"

    .line 40
    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    :goto_1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v4, "name"

    .line 48
    .line 49
    invoke-interface {v1, v4, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p1, "rotationDegrees"

    .line 53
    .line 54
    invoke-interface {v1, p1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 55
    .line 56
    .line 57
    const-string p1, "isLandscape"

    .line 58
    .line 59
    invoke-interface {v1, p1, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 63
    .line 64
    const-string v0, "namedOrientationDidChange"

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/ReactRootView;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 67
    .line 68
    .line 69
    return-void
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
.end method

.method private emitUpdateDimensionsEvent()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/ReactRootView;->access$100(Lcom/facebook/react/ReactRootView;)Lcom/facebook/react/ReactInstanceManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/ReactInstanceManager;->getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->emitUpdateDimensionsEvent()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
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
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/ReactRootView;->access$100(Lcom/facebook/react/ReactRootView;)Lcom/facebook/react/ReactInstanceManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/ReactRootView;->access$200(Lcom/facebook/react/ReactRootView;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->this$0:Lcom/facebook/react/ReactRootView;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/facebook/react/ReactRootView;->access$100(Lcom/facebook/react/ReactRootView;)Lcom/facebook/react/ReactInstanceManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/facebook/react/ReactInstanceManager;->getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->checkForKeyboardEvents()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->checkForDeviceOrientationChanges()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/facebook/react/ReactRootView$CustomGlobalLayoutListener;->checkForDeviceDimensionsChanges()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method
