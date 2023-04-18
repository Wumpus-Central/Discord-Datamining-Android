.class public final Landroidx/camera/core/m0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k1$a;
.implements Lw/x2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/k1$a<",
        "Landroidx/camera/core/m0$c;",
        ">;",
        "Lw/x2$a<",
        "Landroidx/camera/core/m0;",
        "Lw/e1;",
        "Landroidx/camera/core/m0$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lw/x1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lw/x1;->J()Lw/x1;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/m0$c;-><init>(Lw/x1;)V

    return-void
.end method

.method private constructor <init>(Lw/x1;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/core/m0$c;->a:Lw/x1;

    .line 4
    sget-object v0, Lz/i;->t:Lw/r0$a;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Lw/c2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 6
    const-class v0, Landroidx/camera/core/m0;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/camera/core/m0$c;->m(Ljava/lang/Class;)Landroidx/camera/core/m0$c;

    return-void
.end method

.method static f(Lw/r0;)Landroidx/camera/core/m0$c;
    .locals 1

    new-instance v0, Landroidx/camera/core/m0$c;

    invoke-static {p0}, Lw/x1;->K(Lw/r0;)Lw/x1;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/m0$c;-><init>(Lw/x1;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/m0$c;->o(Landroid/util/Size;)Landroidx/camera/core/m0$c;

    move-result-object p1

    return-object p1
.end method

.method public b()Lw/w1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/m0$c;->a:Lw/x1;

    return-object v0
.end method

.method public bridge synthetic c()Lw/x2;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->g()Lw/e1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/m0$c;->p(I)Landroidx/camera/core/m0$c;

    move-result-object p1

    return-object p1
.end method

.method public e()Landroidx/camera/core/m0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lw/k1;->f:Lw/r0$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lw/k1;->h:Lw/r0$a;

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v1, "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    :goto_0
    new-instance v0, Landroidx/camera/core/m0;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->g()Lw/e1;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Landroidx/camera/core/m0;-><init>(Lw/e1;)V

    .line 42
    .line 43
    .line 44
    return-object v0
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
.end method

.method public g()Lw/e1;
    .locals 2

    new-instance v0, Lw/e1;

    iget-object v1, p0, Landroidx/camera/core/m0$c;->a:Lw/x1;

    invoke-static {v1}, Lw/c2;->H(Lw/r0;)Lw/c2;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/e1;-><init>(Lw/c2;)V

    return-object v0
.end method

.method public h(Ljava/util/concurrent/Executor;)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lz/k;->u:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(I)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/e1;->x:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(Landroid/util/Size;)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/k1;->i:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(I)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/x2;->p:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(I)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/k1;->f:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(Ljava/lang/Class;)Landroidx/camera/core/m0$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/m0;",
            ">;)",
            "Landroidx/camera/core/m0$c;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz/i;->t:Lw/r0$a;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lz/i;->s:Lw/r0$a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v1, v2}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "-"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Landroidx/camera/core/m0$c;->n(Ljava/lang/String;)Landroidx/camera/core/m0$c;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-object p0
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
.end method

.method public n(Ljava/lang/String;)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lz/i;->s:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Landroid/util/Size;)Landroidx/camera/core/m0$c;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lw/k1;->h:Lw/r0$a;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
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
.end method

.method public p(I)Landroidx/camera/core/m0$c;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/m0$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/k1;->g:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method
