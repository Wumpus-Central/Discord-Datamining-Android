.class public Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface<",
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
    .locals 4
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
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, -0x1

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v0, "foreground"

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
    goto :goto_0

    .line 24
    :cond_0
    const/4 v3, 0x6

    .line 25
    goto :goto_0

    .line 26
    :sswitch_1
    const-string v0, "borderless"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x5

    .line 36
    goto :goto_0

    .line 37
    :sswitch_2
    const-string v0, "exclusive"

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v3, 0x4

    .line 47
    goto :goto_0

    .line 48
    :sswitch_3
    const-string v0, "touchSoundDisabled"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v3, 0x3

    .line 58
    goto :goto_0

    .line 59
    :sswitch_4
    const-string v0, "rippleColor"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/4 v3, 0x2

    .line 69
    goto :goto_0

    .line 70
    :sswitch_5
    const-string v0, "enabled"

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move v3, v1

    .line 80
    goto :goto_0

    .line 81
    :sswitch_6
    const-string v0, "rippleRadius"

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    move v3, v2

    .line 91
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 100
    .line 101
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 102
    .line 103
    if-nez p3, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    check-cast p3, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setForeground(Landroid/view/View;Z)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 118
    .line 119
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 120
    .line 121
    if-nez p3, :cond_8

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    check-cast p3, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setBorderless(Landroid/view/View;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_7

    .line 134
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 135
    .line 136
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 137
    .line 138
    if-nez p3, :cond_9

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_9
    check-cast p3, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setExclusive(Landroid/view/View;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 152
    .line 153
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 154
    .line 155
    if-nez p3, :cond_a

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_a
    check-cast p3, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setTouchSoundDisabled(Landroid/view/View;Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_7

    .line 168
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 169
    .line 170
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setRippleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 185
    .line 186
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 187
    .line 188
    if-nez p3, :cond_b

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_b
    check-cast p3, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setEnabled(Landroid/view/View;Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    .line 202
    .line 203
    check-cast p2, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;

    .line 204
    .line 205
    if-nez p3, :cond_c

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    check-cast p3, Ljava/lang/Double;

    .line 209
    .line 210
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;->setRippleRadius(Landroid/view/View;I)V

    .line 215
    .line 216
    .line 217
    :goto_7
    return-void

    .line 218
    nop

    .line 219
    :sswitch_data_0
    .sparse-switch
        -0x7fbd551e -> :sswitch_6
        -0x5ff074bf -> :sswitch_5
        -0x2e3618ed -> :sswitch_4
        0x52b237ac -> :sswitch_3
        0x6487be9e -> :sswitch_2
        0x6cd11fc5 -> :sswitch_1
        0x76486943 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
