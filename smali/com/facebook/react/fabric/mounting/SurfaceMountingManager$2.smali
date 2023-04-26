.class Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->stopSurface()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$400(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)Lj$/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$500(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$400(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)Lj$/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lj$/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v0, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$602(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Ljava/util/Set;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-static {v0, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$402(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Lj$/util/concurrent/ConcurrentHashMap;)Lj$/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$702(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Lcom/facebook/react/touch/JSResponderHandler;)Lcom/facebook/react/touch/JSResponderHandler;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$802(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Lcom/facebook/react/uimanager/RootViewManager;)Lcom/facebook/react/uimanager/RootViewManager;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$902(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;)Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$1000(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 74
    .line 75
    .line 76
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableViewRecycling:Z

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 81
    .line 82
    invoke-static {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$1100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)Lcom/facebook/react/uimanager/ViewManagerRegistry;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$2;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 87
    .line 88
    invoke-static {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/ViewManagerRegistry;->onSurfaceStopped(I)V

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void
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
