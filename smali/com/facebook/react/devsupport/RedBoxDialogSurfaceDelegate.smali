.class public Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/common/SurfaceDelegate;


# instance fields
.field private final mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private mDialog:Landroid/app/Dialog;

.field private final mDoubleTapReloadRecognizer:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

.field private mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDoubleTapReloadRecognizer:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    .line 12
    .line 13
    return-void
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
.end method

.method static synthetic access$000(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;)Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDoubleTapReloadRecognizer:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    return-object p0
.end method


# virtual methods
.method public createContentView(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getCurrentActivity()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/RedBoxContentView;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->setDevSupportManager(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->setRedBoxHandler(Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->init()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 44
    .line 45
    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v1, "Unable to launch redbox because react activity is not available, here is the error that redbox would\'ve displayed: "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string p1, "N/A"

    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "ReactNative"

    .line 72
    .line 73
    invoke-static {v0, p1}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

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

.method public destroyContentView()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    return-void
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->destroyContentView()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 13
    .line 14
    :cond_0
    return-void
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
.end method

.method public isContentViewReady()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isShowing()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public show()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getCurrentActivity()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    :cond_1
    const-string v0, "RedBox"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->createContentView(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->refreshContentView()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    new-instance v0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;

    .line 47
    .line 48
    sget v2, Lcom/facebook/react/R$style;->Theme_Catalyst_RedBox:I

    .line 49
    .line 50
    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$1;-><init>(Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;Landroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mRedBoxContentView:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->mDialog:Landroid/app/Dialog;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v2, "Unable to launch redbox because react activity is not available, here is the error that redbox would\'ve displayed: "

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const-string v0, "N/A"

    .line 86
    .line 87
    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "ReactNative"

    .line 95
    .line 96
    invoke-static {v1, v0}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
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
