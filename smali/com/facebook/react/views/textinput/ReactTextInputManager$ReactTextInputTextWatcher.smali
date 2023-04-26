.class final Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ReactTextInputTextWatcher"
.end annotation


# instance fields
.field private final mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private mPreviousText:Ljava/lang/String;

.field private final mSurfaceId:I

.field final synthetic this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->access$000(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/ReactEditText;)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mPreviousText:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mSurfaceId:I

    .line 22
    .line 23
    return-void
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

.method static synthetic access$100(Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;)Lcom/facebook/react/views/textinput/ReactEditText;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    return-object p0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mPreviousText:Ljava/lang/String;

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/facebook/react/views/textinput/ReactEditText;->mDisableTextDiffing:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p4, :cond_1

    .line 9
    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mPreviousText:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    add-int v1, p2, p4

    .line 23
    .line 24
    invoke-virtual {v0, p2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mPreviousText:Ljava/lang/String;

    .line 29
    .line 30
    add-int v8, p2, p3

    .line 31
    .line 32
    invoke-virtual {v0, p2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    if-ne p4, p3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 46
    .line 47
    invoke-virtual {p3}, Lcom/facebook/react/views/textinput/ReactEditText;->getFabricViewStateManager()Lcom/facebook/react/uimanager/FabricViewStateManager;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/FabricViewStateManager;->hasStateWrapper()Z

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    if-eqz p4, :cond_3

    .line 56
    .line 57
    new-instance p4, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;

    .line 58
    .line 59
    invoke-direct {p4, p0}, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher$1;-><init>(Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/FabricViewStateManager;->setState(Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object p3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 66
    .line 67
    new-instance p4, Lcom/facebook/react/views/textinput/ReactTextChangedEvent;

    .line 68
    .line 69
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mSurfaceId:I

    .line 70
    .line 71
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/facebook/react/views/textinput/ReactEditText;->incrementAndGetEventCounter()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-direct {p4, v0, v1, p1, v2}, Lcom/facebook/react/views/textinput/ReactTextChangedEvent;-><init>(IILjava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p3, p4}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 94
    .line 95
    new-instance p3, Lcom/facebook/react/views/textinput/ReactTextInputEvent;

    .line 96
    .line 97
    iget v3, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mSurfaceId:I

    .line 98
    .line 99
    iget-object p4, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$ReactTextInputTextWatcher;->mEditText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 100
    .line 101
    invoke-virtual {p4}, Landroid/view/View;->getId()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    move-object v2, p3

    .line 106
    move v7, p2

    .line 107
    invoke-direct/range {v2 .. v8}, Lcom/facebook/react/views/textinput/ReactTextInputEvent;-><init>(IILjava/lang/String;Ljava/lang/String;II)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, p3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 111
    .line 112
    .line 113
    return-void
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
