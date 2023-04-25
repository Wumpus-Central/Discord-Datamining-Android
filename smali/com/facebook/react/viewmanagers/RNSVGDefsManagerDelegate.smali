.class public Lcom/facebook/react/viewmanagers/RNSVGDefsManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface<",
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
    .locals 3
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
    const/4 v1, 0x0

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
    const-string v0, "responsible"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    const/16 v2, 0xb

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v0, "display"

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_1
    const/16 v2, 0xa

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_2
    const-string v0, "clipRule"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    const/16 v2, 0x9

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_3
    const-string v0, "clipPath"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    const/16 v2, 0x8

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "markerStart"

    .line 72
    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/4 v2, 0x7

    .line 81
    goto :goto_0

    .line 82
    :sswitch_5
    const-string v0, "name"

    .line 83
    .line 84
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const/4 v2, 0x6

    .line 92
    goto :goto_0

    .line 93
    :sswitch_6
    const-string v0, "mask"

    .line 94
    .line 95
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    const/4 v2, 0x5

    .line 103
    goto :goto_0

    .line 104
    :sswitch_7
    const-string v0, "pointerEvents"

    .line 105
    .line 106
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_7

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    const/4 v2, 0x4

    .line 114
    goto :goto_0

    .line 115
    :sswitch_8
    const-string v0, "markerMid"

    .line 116
    .line 117
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_8

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    const/4 v2, 0x3

    .line 125
    goto :goto_0

    .line 126
    :sswitch_9
    const-string v0, "markerEnd"

    .line 127
    .line 128
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_9

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_9
    const/4 v2, 0x2

    .line 136
    goto :goto_0

    .line 137
    :sswitch_a
    const-string v0, "matrix"

    .line 138
    .line 139
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_a

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_a
    const/4 v2, 0x1

    .line 147
    goto :goto_0

    .line 148
    :sswitch_b
    const-string v0, "opacity"

    .line 149
    .line 150
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_b

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_b
    move v2, v1

    .line 158
    :goto_0
    const/4 v0, 0x0

    .line 159
    packed-switch v2, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_c

    .line 166
    .line 167
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 168
    .line 169
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 170
    .line 171
    if-nez p3, :cond_c

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_c
    check-cast p3, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_c

    .line 184
    .line 185
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 186
    .line 187
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 188
    .line 189
    if-nez p3, :cond_d

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_d
    move-object v0, p3

    .line 193
    check-cast v0, Ljava/lang/String;

    .line 194
    .line 195
    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_c

    .line 199
    .line 200
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 201
    .line 202
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 203
    .line 204
    if-nez p3, :cond_e

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_e
    check-cast p3, Ljava/lang/Double;

    .line 208
    .line 209
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_c

    .line 217
    .line 218
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 219
    .line 220
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 221
    .line 222
    if-nez p3, :cond_f

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_f
    move-object v0, p3

    .line 226
    check-cast v0, Ljava/lang/String;

    .line 227
    .line 228
    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_c

    .line 232
    .line 233
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 234
    .line 235
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 236
    .line 237
    if-nez p3, :cond_10

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_10
    move-object v0, p3

    .line 241
    check-cast v0, Ljava/lang/String;

    .line 242
    .line 243
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_c

    .line 247
    .line 248
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 249
    .line 250
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 251
    .line 252
    if-nez p3, :cond_11

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_11
    move-object v0, p3

    .line 256
    check-cast v0, Ljava/lang/String;

    .line 257
    .line 258
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_c

    .line 262
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 263
    .line 264
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 265
    .line 266
    if-nez p3, :cond_12

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_12
    move-object v0, p3

    .line 270
    check-cast v0, Ljava/lang/String;

    .line 271
    .line 272
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_c

    .line 276
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 277
    .line 278
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 279
    .line 280
    if-nez p3, :cond_13

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_13
    move-object v0, p3

    .line 284
    check-cast v0, Ljava/lang/String;

    .line 285
    .line 286
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto :goto_c

    .line 290
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 291
    .line 292
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 293
    .line 294
    if-nez p3, :cond_14

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_14
    move-object v0, p3

    .line 298
    check-cast v0, Ljava/lang/String;

    .line 299
    .line 300
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_c

    .line 304
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 305
    .line 306
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 307
    .line 308
    if-nez p3, :cond_15

    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_15
    move-object v0, p3

    .line 312
    check-cast v0, Ljava/lang/String;

    .line 313
    .line 314
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    goto :goto_c

    .line 318
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 319
    .line 320
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;

    .line 321
    .line 322
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 323
    .line 324
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGDefsManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 325
    .line 326
    .line 327
    goto :goto_c

    .line 328
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 329
    .line 330
    if-nez p3, :cond_16

    .line 331
    .line 332
    const/high16 p3, 0x3f800000    # 1.0f

    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_16
    check-cast p3, Ljava/lang/Double;

    .line 336
    .line 337
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 338
    .line 339
    .line 340
    move-result p3

    .line 341
    :goto_b
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    .line 342
    .line 343
    .line 344
    :goto_c
    return-void

    .line 345
    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_b
        -0x4072683f -> :sswitch_a
        -0x37a9a5bf -> :sswitch_9
        -0x37a98852 -> :sswitch_8
        -0x117e564a -> :sswitch_7
        0x3306ec -> :sswitch_6
        0x337a8b -> :sswitch_5
        0xcf0d448 -> :sswitch_4
        0x36b25395 -> :sswitch_3
        0x36b3866c -> :sswitch_2
        0x63a518c2 -> :sswitch_1
        0x6e2146f6 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
