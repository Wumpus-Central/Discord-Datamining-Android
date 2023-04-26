.class Lcom/facebook/react/uimanager/UIViewOperationQueue$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;->dispatchViewUpdates(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

.field final synthetic val$batchId:I

.field final synthetic val$batchedOperations:Ljava/util/ArrayList;

.field final synthetic val$commitStartTime:J

.field final synthetic val$dispatchViewUpdatesTime:J

.field final synthetic val$layoutTime:J

.field final synthetic val$nativeModulesThreadCpuTime:J

.field final synthetic val$nonBatchedOperations:Ljava/util/ArrayDeque;

.field final synthetic val$viewCommandOperations:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILjava/util/ArrayList;Ljava/util/ArrayDeque;Ljava/util/ArrayList;JJJJ)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    iput p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$batchId:I

    iput-object p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$viewCommandOperations:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$nonBatchedOperations:Ljava/util/ArrayDeque;

    iput-object p5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$batchedOperations:Ljava/util/ArrayList;

    iput-wide p6, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$commitStartTime:J

    iput-wide p8, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$layoutTime:J

    iput-wide p10, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$dispatchViewUpdatesTime:J

    iput-wide p12, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$nativeModulesThreadCpuTime:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "DispatchUI"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, v0}, Lg6/b;->a(JLjava/lang/String;)Lg6/b$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v4, "BatchId"

    .line 12
    .line 13
    iget v5, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$batchId:I

    .line 14
    .line 15
    invoke-virtual {v0, v4, v5}, Lg6/b$b;->a(Ljava/lang/String;I)Lg6/b$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lg6/b$b;->c()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$viewCommandOperations:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v7, v0

    .line 45
    check-cast v7, Lcom/facebook/react/uimanager/UIViewOperationQueue$DispatchCommandViewOperation;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    .line 47
    :try_start_1
    invoke-interface {v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue$DispatchCommandViewOperation;->executeWithExceptions()V
    :try_end_1
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object v7, v0

    .line 53
    :try_start_2
    invoke-static {}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$200()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0, v7}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object v8, v0

    .line 63
    invoke-interface {v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue$DispatchCommandViewOperation;->getRetries()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_0

    .line 68
    .line 69
    invoke-interface {v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue$DispatchCommandViewOperation;->incrementRetries()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1500(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-static {}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$200()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v7, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 87
    .line 88
    invoke-direct {v7, v8}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v7}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$nonBatchedOperations:Ljava/util/ArrayDeque;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_2

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;

    .line 114
    .line 115
    invoke-interface {v6}, Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;->execute()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$batchedOperations:Ljava/util/ArrayList;

    .line 120
    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_3

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    check-cast v6, Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;

    .line 138
    .line 139
    invoke-interface {v6}, Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;->execute()V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 144
    .line 145
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1600(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 152
    .line 153
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1700(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    cmp-long v0, v6, v2

    .line 158
    .line 159
    if-nez v0, :cond_4

    .line 160
    .line 161
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 162
    .line 163
    iget-wide v6, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$commitStartTime:J

    .line 164
    .line 165
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1702(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 166
    .line 167
    .line 168
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 169
    .line 170
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1802(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 175
    .line 176
    .line 177
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 178
    .line 179
    iget-wide v6, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$layoutTime:J

    .line 180
    .line 181
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1902(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 182
    .line 183
    .line 184
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 185
    .line 186
    iget-wide v6, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$dispatchViewUpdatesTime:J

    .line 187
    .line 188
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2002(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 189
    .line 190
    .line 191
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 192
    .line 193
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2102(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 194
    .line 195
    .line 196
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 197
    .line 198
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1800(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2202(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 203
    .line 204
    .line 205
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 206
    .line 207
    iget-wide v4, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->val$nativeModulesThreadCpuTime:J

    .line 208
    .line 209
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2302(Lcom/facebook/react/uimanager/UIViewOperationQueue;J)J

    .line 210
    .line 211
    .line 212
    const-wide/16 v6, 0x0

    .line 213
    .line 214
    const-string v8, "delayBeforeDispatchViewUpdates"

    .line 215
    .line 216
    const/4 v9, 0x0

    .line 217
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 218
    .line 219
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$1700(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v4

    .line 223
    const-wide/32 v12, 0xf4240

    .line 224
    .line 225
    .line 226
    mul-long v10, v4, v12

    .line 227
    .line 228
    invoke-static/range {v6 .. v11}, Lg6/a;->b(JLjava/lang/String;IJ)V

    .line 229
    .line 230
    .line 231
    const-wide/16 v14, 0x0

    .line 232
    .line 233
    const-string v16, "delayBeforeDispatchViewUpdates"

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 238
    .line 239
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    mul-long v18, v4, v12

    .line 244
    .line 245
    invoke-static/range {v14 .. v19}, Lg6/a;->f(JLjava/lang/String;IJ)V

    .line 246
    .line 247
    .line 248
    const-wide/16 v4, 0x0

    .line 249
    .line 250
    const-string v6, "delayBeforeBatchRunStart"

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 254
    .line 255
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 256
    .line 257
    .line 258
    move-result-wide v8

    .line 259
    mul-long/2addr v8, v12

    .line 260
    invoke-static/range {v4 .. v9}, Lg6/a;->b(JLjava/lang/String;IJ)V

    .line 261
    .line 262
    .line 263
    const-wide/16 v14, 0x0

    .line 264
    .line 265
    const-string v16, "delayBeforeBatchRunStart"

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 270
    .line 271
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2100(Lcom/facebook/react/uimanager/UIViewOperationQueue;)J

    .line 272
    .line 273
    .line 274
    move-result-wide v4

    .line 275
    mul-long v18, v4, v12

    .line 276
    .line 277
    invoke-static/range {v14 .. v19}, Lg6/a;->f(JLjava/lang/String;IJ)V

    .line 278
    .line 279
    .line 280
    :cond_4
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 281
    .line 282
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$000(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->clearLayoutAnimation()V

    .line 287
    .line 288
    .line 289
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 290
    .line 291
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2400(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-eqz v0, :cond_5

    .line 296
    .line 297
    iget-object v0, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 298
    .line 299
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2400(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-interface {v0}, Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;->onViewHierarchyUpdateFinished()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 304
    .line 305
    .line 306
    :cond_5
    invoke-static {v2, v3}, Lg6/a;->g(J)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :catchall_1
    move-exception v0

    .line 311
    goto :goto_3

    .line 312
    :catch_1
    move-exception v0

    .line 313
    :try_start_3
    iget-object v4, v1, Lcom/facebook/react/uimanager/UIViewOperationQueue$1;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 314
    .line 315
    const/4 v5, 0x1

    .line 316
    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->access$2502(Lcom/facebook/react/uimanager/UIViewOperationQueue;Z)Z

    .line 317
    .line 318
    .line 319
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 320
    :goto_3
    invoke-static {v2, v3}, Lg6/a;->g(J)V

    .line 321
    .line 322
    .line 323
    throw v0
.end method
