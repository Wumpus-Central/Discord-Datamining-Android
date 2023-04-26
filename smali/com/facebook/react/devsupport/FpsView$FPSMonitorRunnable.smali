.class Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/FpsView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FPSMonitorRunnable"
.end annotation


# instance fields
.field private mShouldStop:Z

.field private mTotal4PlusFrameStutters:I

.field private mTotalFramesDropped:I

.field final synthetic this$0:Lcom/facebook/react/devsupport/FpsView;


# direct methods
.method private constructor <init>(Lcom/facebook/react/devsupport/FpsView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mShouldStop:Z

    .line 3
    iput p1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotalFramesDropped:I

    .line 4
    iput p1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotal4PlusFrameStutters:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/devsupport/FpsView;Lcom/facebook/react/devsupport/FpsView$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;-><init>(Lcom/facebook/react/devsupport/FpsView;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mShouldStop:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotalFramesDropped:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getExpectedNumFrames()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 19
    .line 20
    invoke-static {v2}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getNumFrames()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v1, v2

    .line 29
    add-int/2addr v0, v1

    .line 30
    iput v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotalFramesDropped:I

    .line 31
    .line 32
    iget v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotal4PlusFrameStutters:I

    .line 33
    .line 34
    iget-object v1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->get4PlusFrameStutters()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    iput v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotal4PlusFrameStutters:I

    .line 46
    .line 47
    iget-object v1, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getFPS()D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    iget-object v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->getJSFPS()D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    iget v6, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotalFramesDropped:I

    .line 68
    .line 69
    iget v7, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mTotal4PlusFrameStutters:I

    .line 70
    .line 71
    invoke-static/range {v1 .. v7}, Lcom/facebook/react/devsupport/FpsView;->access$200(Lcom/facebook/react/devsupport/FpsView;DDII)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/facebook/react/devsupport/FpsView;->access$100(Lcom/facebook/react/devsupport/FpsView;)Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->reset()V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 84
    .line 85
    const-wide/16 v1, 0x1f4

    .line 86
    .line 87
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 88
    .line 89
    .line 90
    return-void
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

.method public start()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mShouldStop:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->this$0:Lcom/facebook/react/devsupport/FpsView;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;->mShouldStop:Z

    return-void
.end method
