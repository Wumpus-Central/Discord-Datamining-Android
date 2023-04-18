.class public final Landroidx/core/app/NotificationCompat$d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/app/PendingIntent;

.field private b:Landroidx/core/graphics/drawable/IconCompat;

.field private c:I

.field private d:I

.field private e:I

.field private f:Landroid/app/PendingIntent;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 6
    iput-object p1, p0, Landroidx/core/app/NotificationCompat$d$c;->a:Landroid/app/PendingIntent;

    .line 7
    iput-object p2, p0, Landroidx/core/app/NotificationCompat$d$c;->b:Landroidx/core/graphics/drawable/IconCompat;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Bubbles require non-null icon"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Bubble requires non-null pending intent"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Landroidx/core/app/NotificationCompat$d$c;->g:Ljava/lang/String;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bubble requires a non-null shortcut id"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private f(IZ)Landroidx/core/app/NotificationCompat$d$c;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget p2, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 4
    .line 5
    or-int/2addr p1, p2

    .line 6
    iput p1, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p2, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 10
    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, p2

    .line 13
    iput p1, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 14
    .line 15
    :goto_0
    return-object p0
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
.end method


# virtual methods
.method public a()Landroidx/core/app/NotificationCompat$d;
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    iget-object v7, p0, Landroidx/core/app/NotificationCompat$d$c;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v7, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$d$c;->a:Landroid/app/PendingIntent;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 11
    .line 12
    const-string v1, "Must supply pending intent or shortcut to bubble"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :cond_1
    :goto_0
    if-nez v7, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$d$c;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string v1, "Must supply an icon or shortcut for the bubble"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_3
    :goto_1
    new-instance v9, Landroidx/core/app/NotificationCompat$d;

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/core/app/NotificationCompat$d$c;->a:Landroid/app/PendingIntent;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/core/app/NotificationCompat$d$c;->f:Landroid/app/PendingIntent;

    .line 38
    .line 39
    iget-object v3, p0, Landroidx/core/app/NotificationCompat$d$c;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 40
    .line 41
    iget v4, p0, Landroidx/core/app/NotificationCompat$d$c;->c:I

    .line 42
    .line 43
    iget v5, p0, Landroidx/core/app/NotificationCompat$d$c;->d:I

    .line 44
    .line 45
    iget v6, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    move-object v0, v9

    .line 49
    invoke-direct/range {v0 .. v8}, Landroidx/core/app/NotificationCompat$d;-><init>(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;IIILjava/lang/String;Landroidx/core/app/NotificationCompat$a;)V

    .line 50
    .line 51
    .line 52
    iget v0, p0, Landroidx/core/app/NotificationCompat$d$c;->e:I

    .line 53
    .line 54
    invoke-virtual {v9, v0}, Landroidx/core/app/NotificationCompat$d;->j(I)V

    .line 55
    .line 56
    .line 57
    return-object v9
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

.method public b(Z)Landroidx/core/app/NotificationCompat$d$c;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Landroidx/core/app/NotificationCompat$d$c;->f(IZ)Landroidx/core/app/NotificationCompat$d$c;

    return-object p0
.end method

.method public c(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$d$c;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/NotificationCompat$d$c;->f:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public d(I)Landroidx/core/app/NotificationCompat$d$c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Landroidx/core/app/NotificationCompat$d$c;->c:I

    .line 7
    .line 8
    iput v0, p0, Landroidx/core/app/NotificationCompat$d$c;->d:I

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

.method public e(I)Landroidx/core/app/NotificationCompat$d$c;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/core/app/NotificationCompat$d$c;->d:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Landroidx/core/app/NotificationCompat$d$c;->c:I

    .line 5
    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public g(Z)Landroidx/core/app/NotificationCompat$d$c;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Landroidx/core/app/NotificationCompat$d$c;->f(IZ)Landroidx/core/app/NotificationCompat$d$c;

    return-object p0
.end method
