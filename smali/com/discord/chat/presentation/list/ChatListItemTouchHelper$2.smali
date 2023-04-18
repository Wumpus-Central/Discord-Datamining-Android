.class Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mGestureDetector:Landroidx/core/view/GestureDetectorCompat;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Landroidx/core/view/GestureDetectorCompat;->a(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 17
    .line 18
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 23
    .line 24
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchX:F

    .line 31
    .line 32
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchY:F

    .line 39
    .line 40
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->obtainVelocityTracker()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 46
    .line 47
    iget-object v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->findAnimation(Landroid/view/MotionEvent;)Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 58
    .line 59
    iget v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchX:F

    .line 60
    .line 61
    iget v4, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mX:F

    .line 62
    .line 63
    sub-float/2addr v3, v4

    .line 64
    iput v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchX:F

    .line 65
    .line 66
    iget v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchY:F

    .line 67
    .line 68
    iget v4, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mY:F

    .line 69
    .line 70
    sub-float/2addr v3, v4

    .line 71
    iput v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mInitialTouchY:F

    .line 72
    .line 73
    iget-object v3, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->endRecoverAnimation(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Z)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mPendingCleanup:Ljava/util/List;

    .line 81
    .line 82
    iget-object v3, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 83
    .line 84
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 85
    .line 86
    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 93
    .line 94
    iget-object v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mCallback:Lcom/discord/chat/presentation/list/ChatListCallback;

    .line 95
    .line 96
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    iget-object v4, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 99
    .line 100
    invoke-virtual {v3, v0, v4}, Landroidx/recyclerview/widget/ItemTouchHelper$c;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 101
    .line 102
    .line 103
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 104
    .line 105
    iget-object v3, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 106
    .line 107
    iget p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mActionState:I

    .line 108
    .line 109
    invoke-virtual {v0, v3, p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 113
    .line 114
    iget v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelectedFlags:I

    .line 115
    .line 116
    invoke-virtual {p1, p2, v0, v2}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->updateDxDy(Landroid/view/MotionEvent;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const/4 v3, 0x3

    .line 121
    const/4 v4, -0x1

    .line 122
    if-eq v0, v3, :cond_3

    .line 123
    .line 124
    if-ne v0, v1, :cond_2

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 128
    .line 129
    iget p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 130
    .line 131
    if-eq p1, v4, :cond_4

    .line 132
    .line 133
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-ltz p1, :cond_4

    .line 138
    .line 139
    iget-object v3, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 140
    .line 141
    invoke-virtual {v3, v0, p2, p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->checkSelectForSwipe(ILandroid/view/MotionEvent;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 146
    .line 147
    iget-object v3, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mCallback:Lcom/discord/chat/presentation/list/ChatListCallback;

    .line 148
    .line 149
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 150
    .line 151
    invoke-virtual {v3, p1, v0}, Lcom/discord/chat/presentation/list/ChatListCallback;->onReleased(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 155
    .line 156
    iput v4, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    invoke-virtual {p1, v0, v2}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 160
    .line 161
    .line 162
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 163
    .line 164
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 165
    .line 166
    if-eqz p1, :cond_5

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 174
    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    move v1, v2

    .line 179
    :goto_2
    return v1
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
.end method

.method public onRequestDisallowInterceptTouchEvent(Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mGestureDetector:Landroidx/core/view/GestureDetectorCompat;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Landroidx/core/view/GestureDetectorCompat;->a(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 18
    .line 19
    iget v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 30
    .line 31
    iget v2, v2, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 32
    .line 33
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ltz v2, :cond_2

    .line 38
    .line 39
    iget-object v3, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 40
    .line 41
    invoke-virtual {v3, v0, p2, v2}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->checkSelectForSwipe(ILandroid/view/MotionEvent;I)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v3, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 45
    .line 46
    iget-object v4, v3, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 47
    .line 48
    if-nez v4, :cond_3

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x1

    .line 53
    if-eq v0, v6, :cond_8

    .line 54
    .line 55
    const/4 v7, 0x2

    .line 56
    if-eq v0, v7, :cond_7

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    if-eq v0, v2, :cond_6

    .line 60
    .line 61
    const/4 p1, 0x6

    .line 62
    if-eq v0, p1, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 74
    .line 75
    iget v2, v1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 76
    .line 77
    if-ne v0, v2, :cond_9

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    move v5, v6

    .line 82
    :cond_5
    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, v1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 87
    .line 88
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 89
    .line 90
    iget v1, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelectedFlags:I

    .line 91
    .line 92
    invoke-virtual {v0, p2, v1, p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->updateDxDy(Landroid/view/MotionEvent;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    iget-object p2, v3, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 97
    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/VelocityTracker;->clear()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_7
    if-ltz v2, :cond_9

    .line 105
    .line 106
    iget p1, v3, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelectedFlags:I

    .line 107
    .line 108
    invoke-virtual {v3, p2, p1, v2}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->updateDxDy(Landroid/view/MotionEvent;II)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->moveIfNecessary(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 117
    .line 118
    iget-object p2, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mScrollRunnable:Ljava/lang/Runnable;

    .line 121
    .line 122
    invoke-virtual {p2, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 126
    .line 127
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mScrollRunnable:Ljava/lang/Runnable;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 133
    .line 134
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    :goto_0
    iget-object p2, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 141
    .line 142
    iget-object v0, p2, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mCallback:Lcom/discord/chat/presentation/list/ChatListCallback;

    .line 143
    .line 144
    iget-object p2, p2, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 145
    .line 146
    invoke-virtual {v0, p1, p2}, Lcom/discord/chat/presentation/list/ChatListCallback;->onReleased(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 150
    .line 151
    const/4 p2, 0x0

    .line 152
    invoke-virtual {p1, p2, v5}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$2;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 156
    .line 157
    iput v1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mActivePointerId:I

    .line 158
    .line 159
    :cond_9
    :goto_1
    return-void
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
.end method
