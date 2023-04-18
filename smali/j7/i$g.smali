.class Lj7/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lj7/i;


# direct methods
.method private constructor <init>(Lj7/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj7/i$g;->a:Lj7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj7/i;Lj7/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lj7/i$g;-><init>(Lj7/i;)V

    return-void
.end method

.method public static synthetic c(Lj7/h;)V
    .locals 0

    invoke-static {p0}, Lj7/i$g;->d(Lj7/h;)V

    return-void
.end method

.method private static synthetic d(Lj7/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj7/h;->f(Lj7/v$a;)V

    return-void
.end method


# virtual methods
.method public a(Lj7/h;I)V
    .locals 5

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne p2, v2, :cond_0

    .line 8
    .line 9
    iget-object v3, p0, Lj7/i$g;->a:Lj7/i;

    .line 10
    .line 11
    invoke-static {v3}, Lj7/i;->j(Lj7/i;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    cmp-long v3, v3, v0

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 20
    .line 21
    invoke-static {p2}, Lj7/i;->k(Lj7/i;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 29
    .line 30
    invoke-static {p2}, Lj7/i;->l(Lj7/i;)Landroid/os/Handler;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Landroid/os/Handler;

    .line 39
    .line 40
    new-instance v0, Lj7/j;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lj7/j;-><init>(Lj7/h;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    iget-object v3, p0, Lj7/i$g;->a:Lj7/i;

    .line 50
    .line 51
    invoke-static {v3}, Lj7/i;->j(Lj7/i;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    add-long/2addr v1, v3

    .line 56
    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 57
    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_0
    if-nez p2, :cond_4

    .line 62
    .line 63
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 64
    .line 65
    invoke-static {p2}, Lj7/i;->h(Lj7/i;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 73
    .line 74
    invoke-static {p2}, Lj7/i;->d(Lj7/i;)Lj7/h;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const/4 v3, 0x0

    .line 79
    if-ne p2, p1, :cond_1

    .line 80
    .line 81
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 82
    .line 83
    invoke-static {p2, v3}, Lj7/i;->e(Lj7/i;Lj7/h;)Lj7/h;

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 87
    .line 88
    invoke-static {p2}, Lj7/i;->f(Lj7/i;)Lj7/h;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-ne p2, p1, :cond_2

    .line 93
    .line 94
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 95
    .line 96
    invoke-static {p2, v3}, Lj7/i;->g(Lj7/i;Lj7/h;)Lj7/h;

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 100
    .line 101
    invoke-static {p2}, Lj7/i;->i(Lj7/i;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-le p2, v2, :cond_3

    .line 110
    .line 111
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 112
    .line 113
    invoke-static {p2}, Lj7/i;->i(Lj7/i;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const/4 v3, 0x0

    .line 118
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-ne p2, p1, :cond_3

    .line 123
    .line 124
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 125
    .line 126
    invoke-static {p2}, Lj7/i;->i(Lj7/i;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, Lj7/h;

    .line 135
    .line 136
    invoke-virtual {p2}, Lj7/h;->B()V

    .line 137
    .line 138
    .line 139
    :cond_3
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 140
    .line 141
    invoke-static {p2}, Lj7/i;->i(Lj7/i;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 149
    .line 150
    invoke-static {p2}, Lj7/i;->j(Lj7/i;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    cmp-long p2, v2, v0

    .line 155
    .line 156
    if-eqz p2, :cond_4

    .line 157
    .line 158
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 159
    .line 160
    invoke-static {p2}, Lj7/i;->l(Lj7/i;)Landroid/os/Handler;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, Landroid/os/Handler;

    .line 169
    .line 170
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 174
    .line 175
    invoke-static {p2}, Lj7/i;->k(Lj7/i;)Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :cond_4
    :goto_0
    return-void
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
.end method

.method public b(Lj7/h;I)V
    .locals 4

    .line 1
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 2
    .line 3
    invoke-static {p2}, Lj7/i;->j(Lj7/i;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 17
    .line 18
    invoke-static {p2}, Lj7/i;->k(Lj7/i;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lj7/i$g;->a:Lj7/i;

    .line 26
    .line 27
    invoke-static {p2}, Lj7/i;->l(Lj7/i;)Landroid/os/Handler;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
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
.end method
