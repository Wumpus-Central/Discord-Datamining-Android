.class final Lcom/otaliastudios/zoom/ZoomEngine$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Lte/a$a;
.implements Lve/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/otaliastudios/zoom/ZoomEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u0008H\u0016J\u0010\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0008\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0008\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/otaliastudios/zoom/ZoomEngine$a;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Lte/a$a;",
        "Lve/b$a;",
        "",
        "onGlobalLayout",
        "Ljava/lang/Runnable;",
        "action",
        "",
        "a",
        "g",
        "j",
        "",
        "oldZoom",
        "firstTime",
        "f",
        "",
        "newState",
        "e",
        "d",
        "oldState",
        "c",
        "h",
        "Landroid/view/MotionEvent;",
        "event",
        "b",
        "i",
        "<init>",
        "(Lcom/otaliastudios/zoom/ZoomEngine;)V",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic k:Lcom/otaliastudios/zoom/ZoomEngine;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/zoom/ZoomEngine;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)Z
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->d(Lcom/otaliastudios/zoom/ZoomEngine;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    const-string p1, "container"

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1
    .line 26
    .line 27
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->h(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lue/a;->f(Landroid/view/MotionEvent;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
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
.end method

.method public c(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->i(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lue/b;->e()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lve/b;->i()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->e(Lcom/otaliastudios/zoom/ZoomEngine;)Lte/b;

    move-result-object v0

    invoke-virtual {v0}, Lte/b;->b()V

    return-void
.end method

.method public e(I)Z
    .locals 0

    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;

    move-result-object p1

    invoke-virtual {p1}, Lve/b;->z()Z

    move-result p1

    return p1
.end method

.method public f(FZ)V
    .locals 10

    .line 1
    invoke-static {}, Lcom/otaliastudios/zoom/ZoomEngine;->f()Lcom/otaliastudios/zoom/ZoomLogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "onMatrixSizeChanged: firstTime:"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v4, 0x1

    .line 19
    aput-object v2, v1, v4

    .line 20
    .line 21
    const-string v2, "oldZoom:"

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    aput-object v2, v1, v5

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x3

    .line 31
    aput-object p1, v1, v2

    .line 32
    .line 33
    const-string p1, "transformation:"

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    aput-object p1, v1, v6

    .line 37
    .line 38
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->k(Lcom/otaliastudios/zoom/ZoomEngine;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v7, 0x5

    .line 49
    aput-object p1, v1, v7

    .line 50
    .line 51
    const-string p1, "transformationZoom:"

    .line 52
    .line 53
    const/4 v8, 0x6

    .line 54
    aput-object p1, v1, v8

    .line 55
    .line 56
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->L()Lwe/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lwe/c;->k()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v9, 0x7

    .line 71
    aput-object p1, v1, v9

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLogger;->h([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->j(Lcom/otaliastudios/zoom/ZoomEngine;)Lte/a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lte/a;->f()Z

    .line 83
    .line 84
    .line 85
    if-eqz p2, :cond_0

    .line 86
    .line 87
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->L()Lwe/c;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 94
    .line 95
    invoke-static {p2}, Lcom/otaliastudios/zoom/ZoomEngine;->b(Lcom/otaliastudios/zoom/ZoomEngine;)F

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    invoke-virtual {p1, p2}, Lwe/c;->t(F)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 103
    .line 104
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, Lcom/otaliastudios/zoom/ZoomEngine$a$a;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 111
    .line 112
    invoke-direct {p2, v0}, Lcom/otaliastudios/zoom/ZoomEngine$a$a;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lve/b;->g(Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 119
    .line 120
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->a(Lcom/otaliastudios/zoom/ZoomEngine;)Lcom/otaliastudios/zoom/ScaledPoint;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 125
    .line 126
    invoke-static {p2}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    new-instance v0, Lcom/otaliastudios/zoom/ZoomEngine$a$b;

    .line 131
    .line 132
    invoke-direct {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine$a$b;-><init>(Lcom/otaliastudios/zoom/ScaledPoint;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v0}, Lve/b;->g(Lkotlin/jvm/functions/Function1;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->L()Lwe/c;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 146
    .line 147
    invoke-static {p2}, Lcom/otaliastudios/zoom/ZoomEngine;->b(Lcom/otaliastudios/zoom/ZoomEngine;)F

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-virtual {p1, p2}, Lwe/c;->t(F)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 155
    .line 156
    invoke-static {p1}, Lcom/otaliastudios/zoom/ZoomEngine;->g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance p2, Lcom/otaliastudios/zoom/ZoomEngine$a$c;

    .line 161
    .line 162
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 163
    .line 164
    invoke-direct {p2, v0}, Lcom/otaliastudios/zoom/ZoomEngine$a$c;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2}, Lve/b;->g(Lkotlin/jvm/functions/Function1;)V

    .line 168
    .line 169
    .line 170
    :goto_0
    invoke-static {}, Lcom/otaliastudios/zoom/ZoomEngine;->f()Lcom/otaliastudios/zoom/ZoomLogger;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-array p2, v8, [Ljava/lang/Object;

    .line 175
    .line 176
    const-string v0, "onMatrixSizeChanged: newTransformationZoom:"

    .line 177
    .line 178
    aput-object v0, p2, v3

    .line 179
    .line 180
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->L()Lwe/c;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lwe/c;->k()F

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    aput-object v0, p2, v4

    .line 195
    .line 196
    const-string v0, "newRealZoom:"

    .line 197
    .line 198
    aput-object v0, p2, v5

    .line 199
    .line 200
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 201
    .line 202
    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    aput-object v0, p2, v2

    .line 211
    .line 212
    const-string v0, "newZoom:"

    .line 213
    .line 214
    aput-object v0, p2, v6

    .line 215
    .line 216
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->K()F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    aput-object v0, p2, v7

    .line 227
    .line 228
    invoke-virtual {p1, p2}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    return-void
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
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
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
.end method

.method public g(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->d(Lcom/otaliastudios/zoom/ZoomEngine;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "container"

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
    .line 25
    .line 26
    .line 27
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->i(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/b;

    move-result-object v0

    invoke-virtual {v0}, Lue/b;->f()V

    return-void
.end method

.method public i(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->i(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lue/b;->h(Landroid/view/MotionEvent;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
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
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->e(Lcom/otaliastudios/zoom/ZoomEngine;)Lte/b;

    move-result-object v0

    invoke-virtual {v0}, Lte/b;->c()V

    return-void
.end method

.method public onGlobalLayout()V
    .locals 6

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->d(Lcom/otaliastudios/zoom/ZoomEngine;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "container"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v4, p0, Lcom/otaliastudios/zoom/ZoomEngine$a;->k:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-static {v4}, Lcom/otaliastudios/zoom/ZoomEngine;->d(Lcom/otaliastudios/zoom/ZoomEngine;)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/otaliastudios/zoom/ZoomEngine;->Y(Lcom/otaliastudios/zoom/ZoomEngine;FFZILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    throw v2
.end method
