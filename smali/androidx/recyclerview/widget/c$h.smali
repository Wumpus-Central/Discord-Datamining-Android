.class Landroidx/recyclerview/widget/c$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/c$h;->c:I

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->a:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->d:I

    iget v2, p0, Landroidx/recyclerview/widget/c$h;->b:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method b()Z
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/c$h;->d:I

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->b:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->c:I

    iget v2, p0, Landroidx/recyclerview/widget/c$h;->a:I

    sub-int/2addr v1, v2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method c()Z
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/c$h;->d:I

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->b:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/recyclerview/widget/c$h;->c:I

    iget v2, p0, Landroidx/recyclerview/widget/c$h;->a:I

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d()Landroidx/recyclerview/widget/c$d;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c$h;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/recyclerview/widget/c$h;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/recyclerview/widget/c$d;

    .line 12
    .line 13
    iget v1, p0, Landroidx/recyclerview/widget/c$h;->a:I

    .line 14
    .line 15
    iget v2, p0, Landroidx/recyclerview/widget/c$h;->b:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c$h;->a()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/c$d;-><init>(III)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c$h;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Landroidx/recyclerview/widget/c$d;

    .line 32
    .line 33
    iget v1, p0, Landroidx/recyclerview/widget/c$h;->a:I

    .line 34
    .line 35
    iget v2, p0, Landroidx/recyclerview/widget/c$h;->b:I

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c$h;->a()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/c$d;-><init>(III)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    new-instance v0, Landroidx/recyclerview/widget/c$d;

    .line 48
    .line 49
    iget v1, p0, Landroidx/recyclerview/widget/c$h;->a:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    iget v2, p0, Landroidx/recyclerview/widget/c$h;->b:I

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c$h;->a()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/c$d;-><init>(III)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    new-instance v0, Landroidx/recyclerview/widget/c$d;

    .line 64
    .line 65
    iget v1, p0, Landroidx/recyclerview/widget/c$h;->a:I

    .line 66
    .line 67
    iget v2, p0, Landroidx/recyclerview/widget/c$h;->b:I

    .line 68
    .line 69
    iget v3, p0, Landroidx/recyclerview/widget/c$h;->c:I

    .line 70
    .line 71
    sub-int/2addr v3, v1

    .line 72
    invoke-direct {v0, v1, v2, v3}, Landroidx/recyclerview/widget/c$d;-><init>(III)V

    .line 73
    .line 74
    .line 75
    return-object v0
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
