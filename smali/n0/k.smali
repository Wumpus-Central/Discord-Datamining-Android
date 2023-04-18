.class public Ln0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/core/util/i<",
        "Landroidx/camera/video/internal/encoder/c1;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Landroid/util/Size;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Li0/j1;

.field private final c:Landroid/util/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x500

    const/16 v2, 0x2d0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Ln0/k;->d:Landroid/util/Size;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Li0/j1;Landroid/util/Size;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln0/k;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ln0/k;->b:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Ln0/k;->c:Landroid/util/Size;

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public a()Landroidx/camera/video/internal/encoder/c1;
    .locals 9

    .line 1
    iget-object v0, p0, Ln0/k;->b:Li0/j1;

    .line 2
    .line 3
    invoke-static {v0}, Ln0/i;->a(Li0/j1;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ln0/k;->b:Li0/j1;

    .line 8
    .line 9
    invoke-virtual {v1}, Li0/j1;->c()Landroid/util/Range;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    const-string v1, "VidEncCfgDefaultRslvr"

    .line 14
    .line 15
    const-string v2, "Using fallback VIDEO bitrate"

    .line 16
    .line 17
    invoke-static {v1, v2}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const v1, 0xd59f80

    .line 21
    .line 22
    .line 23
    const/16 v3, 0x1e

    .line 24
    .line 25
    iget-object v2, p0, Ln0/k;->c:Landroid/util/Size;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sget-object v2, Ln0/k;->d:Landroid/util/Size;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-object v6, p0, Ln0/k;->c:Landroid/util/Size;

    .line 38
    .line 39
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    move v2, v0

    .line 48
    invoke-static/range {v1 .. v8}, Ln0/i;->b(IIIIIIILandroid/util/Range;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {}, Landroidx/camera/video/internal/encoder/c1;->b()Landroidx/camera/video/internal/encoder/c1$a;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v3, p0, Ln0/k;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroidx/camera/video/internal/encoder/c1$a;->f(Ljava/lang/String;)Landroidx/camera/video/internal/encoder/c1$a;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, p0, Ln0/k;->c:Landroid/util/Size;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroidx/camera/video/internal/encoder/c1$a;->g(Landroid/util/Size;)Landroidx/camera/video/internal/encoder/c1$a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, v1}, Landroidx/camera/video/internal/encoder/c1$a;->b(I)Landroidx/camera/video/internal/encoder/c1$a;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1, v0}, Landroidx/camera/video/internal/encoder/c1$a;->d(I)Landroidx/camera/video/internal/encoder/c1$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroidx/camera/video/internal/encoder/c1$a;->a()Landroidx/camera/video/internal/encoder/c1;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
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

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln0/k;->a()Landroidx/camera/video/internal/encoder/c1;

    move-result-object v0

    return-object v0
.end method
