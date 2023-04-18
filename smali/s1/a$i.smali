.class Ls1/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/a;->e(Ljava/util/List;)Lfc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ljava/util/List;

.field final synthetic l:Landroidx/concurrent/futures/d;

.field final synthetic m:Ls1/a;


# direct methods
.method constructor <init>(Ls1/a;Ljava/util/List;Landroidx/concurrent/futures/d;)V
    .locals 0

    iput-object p1, p0, Ls1/a$i;->m:Ls1/a;

    iput-object p2, p0, Ls1/a$i;->k:Ljava/util/List;

    iput-object p3, p0, Ls1/a$i;->l:Landroidx/concurrent/futures/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls1/a$i;->k:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/core/content/pm/ShortcutInfoCompat;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/core/content/pm/ShortcutInfoCompat;->c()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Ls1/a$i;->m:Ls1/a;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ls1/a;->f(Landroidx/core/content/pm/ShortcutInfoCompat;)Ls1/b$a;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Landroidx/core/content/pm/ShortcutInfoCompat;->e()Landroidx/core/graphics/drawable/IconCompat;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, v2, Ls1/b$a;->b:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, Landroidx/core/graphics/drawable/IconCompat;->m()Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v3, 0x0

    .line 52
    :goto_1
    invoke-virtual {v1}, Landroidx/core/content/pm/ShortcutInfoCompat;->f()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v4, p0, Ls1/a$i;->m:Ls1/a;

    .line 57
    .line 58
    iget-object v4, v4, Ls1/a;->b:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    iget-object v4, p0, Ls1/a$i;->m:Ls1/a;

    .line 66
    .line 67
    iget-object v2, v2, Ls1/b$a;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, v3, v2}, Ls1/a;->o(Landroid/graphics/Bitmap;Ljava/lang/String;)Lfc/b;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v3, p0, Ls1/a$i;->m:Ls1/a;

    .line 74
    .line 75
    iget-object v3, v3, Ls1/a;->c:Ljava/util/Map;

    .line 76
    .line 77
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lfc/b;

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 87
    .line 88
    .line 89
    :cond_3
    new-instance v3, Ls1/a$i$a;

    .line 90
    .line 91
    invoke-direct {v3, p0, v1, v2}, Ls1/a$i$a;-><init>(Ls1/a$i;Ljava/lang/String;Lfc/b;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Ls1/a$i;->m:Ls1/a;

    .line 95
    .line 96
    iget-object v1, v1, Ls1/a;->d:Ljava/util/concurrent/ExecutorService;

    .line 97
    .line 98
    invoke-interface {v2, v3, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    iget-object v0, p0, Ls1/a$i;->m:Ls1/a;

    .line 103
    .line 104
    iget-object v1, p0, Ls1/a$i;->l:Landroidx/concurrent/futures/d;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ls1/a;->p(Landroidx/concurrent/futures/d;)V

    .line 107
    .line 108
    .line 109
    return-void
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
