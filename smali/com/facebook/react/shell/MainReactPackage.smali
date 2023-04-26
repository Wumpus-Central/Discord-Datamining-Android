.class public Lcom/facebook/react/shell/MainReactPackage;
.super Lcom/facebook/react/TurboReactPackage;
.source "SourceFile"


# instance fields
.field private mConfig:Lcom/facebook/react/shell/MainPackageConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/facebook/react/shell/MainReactPackage;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    return-void
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 39
    .line 40
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v0, Lcom/facebook/react/views/slider/ReactSliderManager;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/facebook/react/views/slider/ReactSliderManager;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 55
    .line 56
    invoke-direct {v0}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    new-instance v0, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 63
    .line 64
    invoke-direct {v0}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 71
    .line 72
    invoke-direct {v0}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/facebook/react/views/image/ReactImageManager;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 87
    .line 88
    invoke-direct {v0}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/facebook/react/views/text/ReactRawTextManager;

    .line 95
    .line 96
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactRawTextManager;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 103
    .line 104
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 111
    .line 112
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    new-instance v0, Lcom/facebook/react/views/view/ReactViewManager;

    .line 119
    .line 120
    invoke-direct {v0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    new-instance v0, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;

    .line 127
    .line 128
    invoke-direct {v0}, Lcom/facebook/react/views/text/ReactVirtualTextViewManager;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 135
    .line 136
    invoke-direct {v0}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    return-object p1
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

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, -0x1

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :sswitch_0
    const-string v0, "Vibration"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    const/16 v2, 0x15

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v0, "NativeAnimatedModule"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_1
    const/16 v2, 0x14

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "ShareModule"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    const/16 v2, 0x13

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v0, "BlobModule"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    const/16 v2, 0x12

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "Networking"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_4
    const/16 v2, 0x11

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_5
    const-string v0, "AppState"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_5

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_5
    const/16 v2, 0x10

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_6
    const-string v0, "IntentAndroid"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_6
    const/16 v2, 0xf

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_7
    const-string v0, "Clipboard"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_7

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_7
    const/16 v2, 0xe

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_8
    const-string v0, "FrescoModule"

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_8

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_8
    const/16 v2, 0xd

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_9
    const-string v0, "WebSocketModule"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-nez p1, :cond_9

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_9
    const/16 v2, 0xc

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :sswitch_a
    const-string v0, "StatusBarManager"

    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_a

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_a
    const/16 v2, 0xb

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_b
    const-string v0, "AccessibilityInfo"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_b

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_b
    const/16 v2, 0xa

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :sswitch_c
    const-string v0, "Appearance"

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_c

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_c
    const/16 v2, 0x9

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :sswitch_d
    const-string v0, "I18nManager"

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-nez p1, :cond_d

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_d
    const/16 v2, 0x8

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :sswitch_e
    const-string v0, "ImageLoader"

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_e

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_e
    const/4 v2, 0x7

    .line 221
    goto :goto_0

    .line 222
    :sswitch_f
    const-string v0, "PermissionsAndroid"

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_f

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_f
    const/4 v2, 0x6

    .line 232
    goto :goto_0

    .line 233
    :sswitch_10
    const-string v0, "FileReaderModule"

    .line 234
    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-nez p1, :cond_10

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_10
    const/4 v2, 0x5

    .line 243
    goto :goto_0

    .line 244
    :sswitch_11
    const-string v0, "DialogManagerAndroid"

    .line 245
    .line 246
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-nez p1, :cond_11

    .line 251
    .line 252
    goto :goto_0

    .line 253
    :cond_11
    const/4 v2, 0x4

    .line 254
    goto :goto_0

    .line 255
    :sswitch_12
    const-string v0, "SoundManager"

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-nez p1, :cond_12

    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_12
    const/4 v2, 0x3

    .line 265
    goto :goto_0

    .line 266
    :sswitch_13
    const-string v0, "ImageStoreManager"

    .line 267
    .line 268
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-nez p1, :cond_13

    .line 273
    .line 274
    goto :goto_0

    .line 275
    :cond_13
    const/4 v2, 0x2

    .line 276
    goto :goto_0

    .line 277
    :sswitch_14
    const-string v0, "AsyncSQLiteDBStorage"

    .line 278
    .line 279
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-nez p1, :cond_14

    .line 284
    .line 285
    goto :goto_0

    .line 286
    :cond_14
    move v2, v1

    .line 287
    goto :goto_0

    .line 288
    :sswitch_15
    const-string v0, "ToastAndroid"

    .line 289
    .line 290
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-nez p1, :cond_15

    .line 295
    .line 296
    goto :goto_0

    .line 297
    :cond_15
    const/4 v2, 0x0

    .line 298
    :goto_0
    const/4 p1, 0x0

    .line 299
    packed-switch v2, :pswitch_data_0

    .line 300
    .line 301
    .line 302
    return-object p1

    .line 303
    :pswitch_0
    new-instance p1, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 304
    .line 305
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/vibration/VibrationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 306
    .line 307
    .line 308
    return-object p1

    .line 309
    :pswitch_1
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 310
    .line 311
    invoke-direct {p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 312
    .line 313
    .line 314
    return-object p1

    .line 315
    :pswitch_2
    new-instance p1, Lcom/facebook/react/modules/share/ShareModule;

    .line 316
    .line 317
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/share/ShareModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 318
    .line 319
    .line 320
    return-object p1

    .line 321
    :pswitch_3
    new-instance p1, Lcom/facebook/react/modules/blob/BlobModule;

    .line 322
    .line 323
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/BlobModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 324
    .line 325
    .line 326
    return-object p1

    .line 327
    :pswitch_4
    new-instance p1, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 328
    .line 329
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 330
    .line 331
    .line 332
    return-object p1

    .line 333
    :pswitch_5
    new-instance p1, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 334
    .line 335
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appstate/AppStateModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 336
    .line 337
    .line 338
    return-object p1

    .line 339
    :pswitch_6
    new-instance p1, Lcom/facebook/react/modules/intent/IntentModule;

    .line 340
    .line 341
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/intent/IntentModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 342
    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_7
    new-instance p1, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 346
    .line 347
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/clipboard/ClipboardModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 348
    .line 349
    .line 350
    return-object p1

    .line 351
    :pswitch_8
    new-instance v0, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 352
    .line 353
    iget-object v2, p0, Lcom/facebook/react/shell/MainReactPackage;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    .line 354
    .line 355
    if-eqz v2, :cond_16

    .line 356
    .line 357
    invoke-virtual {v2}, Lcom/facebook/react/shell/MainPackageConfig;->getFrescoConfig()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    :cond_16
    invoke-direct {v0, p2, v1, p1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLcom/facebook/imagepipeline/core/ImagePipelineConfig;)V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_9
    new-instance p1, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 366
    .line 367
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 368
    .line 369
    .line 370
    return-object p1

    .line 371
    :pswitch_a
    new-instance p1, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 372
    .line 373
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/statusbar/StatusBarModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 374
    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_b
    new-instance p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 378
    .line 379
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 380
    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_c
    new-instance p1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 384
    .line 385
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appearance/AppearanceModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 386
    .line 387
    .line 388
    return-object p1

    .line 389
    :pswitch_d
    new-instance p1, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 390
    .line 391
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 392
    .line 393
    .line 394
    return-object p1

    .line 395
    :pswitch_e
    new-instance p1, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 396
    .line 397
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/image/ImageLoaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 398
    .line 399
    .line 400
    return-object p1

    .line 401
    :pswitch_f
    new-instance p1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 402
    .line 403
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/permissions/PermissionsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 404
    .line 405
    .line 406
    return-object p1

    .line 407
    :pswitch_10
    new-instance p1, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 408
    .line 409
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/FileReaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 410
    .line 411
    .line 412
    return-object p1

    .line 413
    :pswitch_11
    new-instance p1, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 414
    .line 415
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 416
    .line 417
    .line 418
    return-object p1

    .line 419
    :pswitch_12
    new-instance p1, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 420
    .line 421
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/sound/SoundManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 422
    .line 423
    .line 424
    return-object p1

    .line 425
    :pswitch_13
    new-instance p1, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 426
    .line 427
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/camera/ImageStoreManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 428
    .line 429
    .line 430
    return-object p1

    .line 431
    :pswitch_14
    new-instance p1, Lcom/facebook/react/modules/storage/AsyncStorageModule;

    .line 432
    .line 433
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/storage/AsyncStorageModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 434
    .line 435
    .line 436
    return-object p1

    .line 437
    :pswitch_15
    new-instance p1, Lcom/facebook/react/modules/toast/ToastModule;

    .line 438
    .line 439
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 440
    .line 441
    .line 442
    return-object p1

    .line 443
    :sswitch_data_0
    .sparse-switch
        -0x7e115d98 -> :sswitch_15
        -0x79330c6b -> :sswitch_14
        -0x74ffd399 -> :sswitch_13
        -0x6e4e4c42 -> :sswitch_12
        -0x629eae76 -> :sswitch_11
        -0x501dbf35 -> :sswitch_10
        -0x3f4dc695 -> :sswitch_f
        -0x272d42d2 -> :sswitch_e
        -0x21ff2871 -> :sswitch_d
        -0x1e16677c -> :sswitch_c
        -0x1b4a7d04 -> :sswitch_b
        -0x16ced634 -> :sswitch_a
        -0xf2876ed -> :sswitch_9
        0x9baee92 -> :sswitch_8
        0x180dfd76 -> :sswitch_7
        0x219d6013 -> :sswitch_6
        0x48cceb10 -> :sswitch_5
        0x5a50c314 -> :sswitch_4
        0x5c43b489 -> :sswitch_3
        0x5cb5e70b -> :sswitch_2
        0x66989206 -> :sswitch_1
        0x72911272 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 16

    .line 1
    const-string v1, "No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    :try_start_0
    const-string v0, "com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    new-instance v2, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw v2

    .line 23
    :catch_1
    move-exception v0

    .line 24
    new-instance v2, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw v2

    .line 30
    :catch_2
    const/16 v0, 0x16

    .line 31
    .line 32
    new-array v1, v0, [Ljava/lang/Class;

    .line 33
    .line 34
    const-class v2, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    aput-object v2, v1, v3

    .line 38
    .line 39
    const-class v2, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    aput-object v2, v1, v4

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    const-class v4, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 46
    .line 47
    aput-object v4, v1, v2

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    const-class v4, Lcom/facebook/react/modules/blob/BlobModule;

    .line 51
    .line 52
    aput-object v4, v1, v2

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    const-class v4, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 56
    .line 57
    aput-object v4, v1, v2

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    const-class v4, Lcom/facebook/react/modules/storage/AsyncStorageModule;

    .line 61
    .line 62
    aput-object v4, v1, v2

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    const-class v4, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 66
    .line 67
    aput-object v4, v1, v2

    .line 68
    .line 69
    const/4 v2, 0x7

    .line 70
    const-class v4, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 71
    .line 72
    aput-object v4, v1, v2

    .line 73
    .line 74
    const/16 v2, 0x8

    .line 75
    .line 76
    const-class v4, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 77
    .line 78
    aput-object v4, v1, v2

    .line 79
    .line 80
    const/16 v2, 0x9

    .line 81
    .line 82
    const-class v4, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 83
    .line 84
    aput-object v4, v1, v2

    .line 85
    .line 86
    const/16 v2, 0xa

    .line 87
    .line 88
    const-class v4, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 89
    .line 90
    aput-object v4, v1, v2

    .line 91
    .line 92
    const/16 v2, 0xb

    .line 93
    .line 94
    const-class v4, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 95
    .line 96
    aput-object v4, v1, v2

    .line 97
    .line 98
    const/16 v2, 0xc

    .line 99
    .line 100
    const-class v4, Lcom/facebook/react/modules/intent/IntentModule;

    .line 101
    .line 102
    aput-object v4, v1, v2

    .line 103
    .line 104
    const/16 v2, 0xd

    .line 105
    .line 106
    const-class v4, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 107
    .line 108
    aput-object v4, v1, v2

    .line 109
    .line 110
    const/16 v2, 0xe

    .line 111
    .line 112
    const-class v4, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 113
    .line 114
    aput-object v4, v1, v2

    .line 115
    .line 116
    const/16 v2, 0xf

    .line 117
    .line 118
    const-class v4, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 119
    .line 120
    aput-object v4, v1, v2

    .line 121
    .line 122
    const/16 v2, 0x10

    .line 123
    .line 124
    const-class v4, Lcom/facebook/react/modules/share/ShareModule;

    .line 125
    .line 126
    aput-object v4, v1, v2

    .line 127
    .line 128
    const/16 v2, 0x11

    .line 129
    .line 130
    const-class v4, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 131
    .line 132
    aput-object v4, v1, v2

    .line 133
    .line 134
    const/16 v2, 0x12

    .line 135
    .line 136
    const-class v4, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 137
    .line 138
    aput-object v4, v1, v2

    .line 139
    .line 140
    const/16 v2, 0x13

    .line 141
    .line 142
    const-class v4, Lcom/facebook/react/modules/toast/ToastModule;

    .line 143
    .line 144
    aput-object v4, v1, v2

    .line 145
    .line 146
    const/16 v2, 0x14

    .line 147
    .line 148
    const-class v4, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 149
    .line 150
    aput-object v4, v1, v2

    .line 151
    .line 152
    const/16 v2, 0x15

    .line 153
    .line 154
    const-class v4, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 155
    .line 156
    aput-object v4, v1, v2

    .line 157
    .line 158
    new-instance v2, Ljava/util/HashMap;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    :goto_0
    if-ge v3, v0, :cond_0

    .line 164
    .line 165
    aget-object v4, v1, v3

    .line 166
    .line 167
    const-class v5, Lcom/facebook/react/module/annotations/ReactModule;

    .line 168
    .line 169
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Lcom/facebook/react/module/annotations/ReactModule;

    .line 174
    .line 175
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    new-instance v15, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 180
    .line 181
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->canOverrideExistingModule()Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->needsEagerInit()Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->hasConstants()Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    invoke-interface {v5}, Lcom/facebook/react/module/annotations/ReactModule;->isCxxModule()Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    const-class v5, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 206
    .line 207
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    move-object v7, v15

    .line 212
    invoke-direct/range {v7 .. v14}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v2, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    add-int/lit8 v3, v3, 0x1

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_0
    new-instance v0, Lcom/facebook/react/shell/MainReactPackage$1;

    .line 222
    .line 223
    move-object/from16 v1, p0

    .line 224
    .line 225
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/shell/MainReactPackage$1;-><init>(Lcom/facebook/react/shell/MainReactPackage;Ljava/util/Map;)V

    .line 226
    .line 227
    .line 228
    return-object v0
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
