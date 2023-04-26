.class Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->addRootView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

.field final synthetic val$rootView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    iput-object p2, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->isStopped()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->TAG:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v1, Lcom/facebook/react/uimanager/IllegalViewOperationException;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "Race condition in addRootView detected. Trying to set an id of ["

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 40
    .line 41
    invoke-static {v4}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v4, "] on the RootView, but that id has already been set. "

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v1, v3}, Lcom/facebook/react/uimanager/IllegalViewOperationException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v1, -0x1

    .line 71
    if-ne v0, v1, :cond_3

    .line 72
    .line 73
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    .line 74
    .line 75
    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 76
    .line 77
    invoke-static {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    .line 85
    .line 86
    instance-of v1, v0, Lcom/facebook/react/uimanager/ReactRoot;

    .line 87
    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    check-cast v0, Lcom/facebook/react/uimanager/ReactRoot;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 93
    .line 94
    invoke-static {v1}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/ReactRoot;->setRootViewTag(I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 102
    .line 103
    invoke-static {v0, v2}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$202(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;Z)Z

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 107
    .line 108
    invoke-static {v0}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$300(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    sget-object v0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->TAG:Ljava/lang/String;

    .line 113
    .line 114
    const/4 v1, 0x2

    .line 115
    new-array v1, v1, [Ljava/lang/Object;

    .line 116
    .line 117
    iget-object v3, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->val$rootView:Landroid/view/View;

    .line 118
    .line 119
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const/4 v4, 0x0

    .line 128
    aput-object v3, v1, v4

    .line 129
    .line 130
    iget-object v3, p0, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$1;->this$0:Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 131
    .line 132
    invoke-static {v3}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->access$100(Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    aput-object v3, v1, v2

    .line 141
    .line 142
    const-string v2, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]"

    .line 143
    .line 144
    invoke-static {v0, v2, v1}, Lw3/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Lcom/facebook/react/uimanager/IllegalViewOperationException;

    .line 148
    .line 149
    const-string v1, "Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."

    .line 150
    .line 151
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/IllegalViewOperationException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0
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
