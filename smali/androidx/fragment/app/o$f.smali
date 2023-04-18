.class Landroidx/fragment/app/o$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/o;->l(Landroidx/fragment/app/q;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/collection/a;Landroidx/fragment/app/o$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/fragment/app/q;

.field final synthetic l:Landroidx/collection/a;

.field final synthetic m:Ljava/lang/Object;

.field final synthetic n:Landroidx/fragment/app/o$h;

.field final synthetic o:Ljava/util/ArrayList;

.field final synthetic p:Landroid/view/View;

.field final synthetic q:Landroidx/fragment/app/Fragment;

.field final synthetic r:Landroidx/fragment/app/Fragment;

.field final synthetic s:Z

.field final synthetic t:Ljava/util/ArrayList;

.field final synthetic u:Ljava/lang/Object;

.field final synthetic v:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroidx/fragment/app/q;Landroidx/collection/a;Ljava/lang/Object;Landroidx/fragment/app/o$h;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/o$f;->k:Landroidx/fragment/app/q;

    iput-object p2, p0, Landroidx/fragment/app/o$f;->l:Landroidx/collection/a;

    iput-object p3, p0, Landroidx/fragment/app/o$f;->m:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/o$f;->n:Landroidx/fragment/app/o$h;

    iput-object p5, p0, Landroidx/fragment/app/o$f;->o:Ljava/util/ArrayList;

    iput-object p6, p0, Landroidx/fragment/app/o$f;->p:Landroid/view/View;

    iput-object p7, p0, Landroidx/fragment/app/o$f;->q:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Landroidx/fragment/app/o$f;->r:Landroidx/fragment/app/Fragment;

    iput-boolean p9, p0, Landroidx/fragment/app/o$f;->s:Z

    iput-object p10, p0, Landroidx/fragment/app/o$f;->t:Ljava/util/ArrayList;

    iput-object p11, p0, Landroidx/fragment/app/o$f;->u:Ljava/lang/Object;

    iput-object p12, p0, Landroidx/fragment/app/o$f;->v:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o$f;->k:Landroidx/fragment/app/q;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/o$f;->l:Landroidx/collection/a;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/o$f;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/fragment/app/o$f;->n:Landroidx/fragment/app/o$h;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/o;->h(Landroidx/fragment/app/q;Landroidx/collection/a;Ljava/lang/Object;Landroidx/fragment/app/o$h;)Landroidx/collection/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/fragment/app/o$f;->o:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/collection/a;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/fragment/app/o$f;->o:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/fragment/app/o$f;->p:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/o$f;->q:Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/fragment/app/o$f;->r:Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    iget-boolean v3, p0, Landroidx/fragment/app/o$f;->s:Z

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v1, v2, v3, v0, v4}, Landroidx/fragment/app/o;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/a;Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/fragment/app/o$f;->m:Ljava/lang/Object;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/fragment/app/o$f;->k:Landroidx/fragment/app/q;

    .line 46
    .line 47
    iget-object v3, p0, Landroidx/fragment/app/o$f;->t:Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/fragment/app/o$f;->o:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v2, v1, v3, v4}, Landroidx/fragment/app/q;->A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Landroidx/fragment/app/o$f;->n:Landroidx/fragment/app/o$h;

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/fragment/app/o$f;->u:Ljava/lang/Object;

    .line 57
    .line 58
    iget-boolean v3, p0, Landroidx/fragment/app/o$f;->s:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/o;->t(Landroidx/collection/a;Landroidx/fragment/app/o$h;Ljava/lang/Object;Z)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/fragment/app/o$f;->k:Landroidx/fragment/app/q;

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/fragment/app/o$f;->v:Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/q;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
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
