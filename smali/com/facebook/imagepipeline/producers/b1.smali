.class public Lcom/facebook/imagepipeline/producers/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/l0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/b1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/l0<",
        "Lv5/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lz3/h;

.field private final c:Lcom/facebook/imagepipeline/producers/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lv5/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lz3/h;Lcom/facebook/imagepipeline/producers/l0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lz3/h;",
            "Lcom/facebook/imagepipeline/producers/l0<",
            "Lv5/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b1;->a:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    invoke-static {p2}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lz3/h;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b1;->b:Lz3/h;

    .line 19
    .line 20
    invoke-static {p3}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/facebook/imagepipeline/producers/l0;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b1;->c:Lcom/facebook/imagepipeline/producers/l0;

    .line 27
    .line 28
    return-void
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

.method static synthetic c(Lv5/e;)Le4/e;
    .locals 0

    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/b1;->h(Lv5/e;)Le4/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/facebook/imagepipeline/producers/b1;Lv5/e;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/b1;->i(Lv5/e;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    return-void
.end method

.method static synthetic e(Lcom/facebook/imagepipeline/producers/b1;)Lz3/h;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/b1;->b:Lz3/h;

    return-object p0
.end method

.method static synthetic f(Lv5/e;Lz3/j;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/facebook/imagepipeline/producers/b1;->g(Lv5/e;Lz3/j;)V

    return-void
.end method

.method private static g(Lv5/e;Lz3/j;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv5/e;->z()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/io/InputStream;

    .line 10
    .line 11
    invoke-static {v0}, Lj5/d;->c(Ljava/io/InputStream;)Lj5/c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lj5/b;->f:Lj5/c;

    .line 16
    .line 17
    if-eq v1, v2, :cond_3

    .line 18
    .line 19
    sget-object v2, Lj5/b;->h:Lj5/c;

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object v2, Lj5/b;->g:Lj5/c;

    .line 25
    .line 26
    if-eq v1, v2, :cond_2

    .line 27
    .line 28
    sget-object v2, Lj5/b;->i:Lj5/c;

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string p1, "Wrong image format"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_2
    :goto_0
    invoke-static {}, Lcom/facebook/imagepipeline/nativecode/j;->a()Lcom/facebook/imagepipeline/nativecode/i;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1, v0, p1}, Lcom/facebook/imagepipeline/nativecode/i;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lj5/b;->b:Lj5/c;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lv5/e;->K0(Lj5/c;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    invoke-static {}, Lcom/facebook/imagepipeline/nativecode/j;->a()Lcom/facebook/imagepipeline/nativecode/i;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/16 v2, 0x50

    .line 59
    .line 60
    invoke-interface {v1, v0, p1, v2}, Lcom/facebook/imagepipeline/nativecode/i;->c(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lj5/b;->a:Lj5/c;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lv5/e;->K0(Lj5/c;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    return-void
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
.end method

.method private static h(Lv5/e;)Le4/e;
    .locals 1

    .line 1
    invoke-static {p0}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv5/e;->z()Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-static {p0}, Lj5/d;->c(Ljava/io/InputStream;)Lj5/c;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lj5/b;->a(Lj5/c;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lcom/facebook/imagepipeline/nativecode/j;->a()Lcom/facebook/imagepipeline/nativecode/i;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    sget-object p0, Le4/e;->l:Le4/e;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    invoke-interface {v0, p0}, Lcom/facebook/imagepipeline/nativecode/i;->b(Lj5/c;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    xor-int/lit8 p0, p0, 0x1

    .line 38
    .line 39
    invoke-static {p0}, Le4/e;->c(Z)Le4/e;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    sget-object v0, Lj5/c;->c:Lj5/c;

    .line 45
    .line 46
    if-ne p0, v0, :cond_2

    .line 47
    .line 48
    sget-object p0, Le4/e;->m:Le4/e;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    sget-object p0, Le4/e;->l:Le4/e;

    .line 52
    .line 53
    return-object p0
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
.end method

.method private i(Lv5/e;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/e;",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lv5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lv5/e;->g(Lv5/e;)Lv5/e;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    new-instance p1, Lcom/facebook/imagepipeline/producers/b1$a;

    .line 9
    .line 10
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/ProducerContext;->h()Lcom/facebook/imagepipeline/producers/n0;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v5, "WebpTranscodeProducer"

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p2

    .line 19
    move-object v4, p3

    .line 20
    invoke-direct/range {v0 .. v6}, Lcom/facebook/imagepipeline/producers/b1$a;-><init>(Lcom/facebook/imagepipeline/producers/b1;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Lv5/e;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/b1;->a:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
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


# virtual methods
.method public b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/Consumer<",
            "Lv5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/ProducerContext;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/b1;->c:Lcom/facebook/imagepipeline/producers/l0;

    new-instance v1, Lcom/facebook/imagepipeline/producers/b1$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/imagepipeline/producers/b1$b;-><init>(Lcom/facebook/imagepipeline/producers/b1;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    invoke-interface {v0, v1, p2}, Lcom/facebook/imagepipeline/producers/l0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V

    return-void
.end method
