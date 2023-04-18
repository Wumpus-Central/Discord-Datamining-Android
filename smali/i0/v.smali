.class public Li0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/v$b;
    }
.end annotation


# static fields
.field public static final a:Li0/v;

.field public static final b:Li0/v;

.field public static final c:Li0/v;

.field public static final d:Li0/v;

.field public static final e:Li0/v;

.field public static final f:Li0/v;

.field static final g:Li0/v;

.field private static final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Li0/v;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li0/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-string v0, "SD"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Li0/v;->a:Li0/v;

    .line 9
    .line 10
    const-string v2, "HD"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-static {v3, v2}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sput-object v2, Li0/v;->b:Li0/v;

    .line 18
    .line 19
    const-string v4, "FHD"

    .line 20
    .line 21
    const/4 v5, 0x6

    .line 22
    invoke-static {v5, v4}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    sput-object v4, Li0/v;->c:Li0/v;

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    const-string v7, "UHD"

    .line 31
    .line 32
    invoke-static {v6, v7}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    sput-object v6, Li0/v;->d:Li0/v;

    .line 37
    .line 38
    const-string v7, "LOWEST"

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-static {v8, v7}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    sput-object v7, Li0/v;->e:Li0/v;

    .line 46
    .line 47
    const-string v9, "HIGHEST"

    .line 48
    .line 49
    const/4 v10, 0x1

    .line 50
    invoke-static {v10, v9}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    sput-object v9, Li0/v;->f:Li0/v;

    .line 55
    .line 56
    const/4 v11, -0x1

    .line 57
    const-string v12, "NONE"

    .line 58
    .line 59
    invoke-static {v11, v12}, Li0/v$b;->e(ILjava/lang/String;)Li0/v$b;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    sput-object v11, Li0/v;->g:Li0/v;

    .line 64
    .line 65
    new-instance v11, Ljava/util/HashSet;

    .line 66
    .line 67
    new-array v5, v5, [Li0/v;

    .line 68
    .line 69
    aput-object v7, v5, v8

    .line 70
    .line 71
    aput-object v9, v5, v10

    .line 72
    .line 73
    const/4 v7, 0x2

    .line 74
    aput-object v0, v5, v7

    .line 75
    .line 76
    const/4 v9, 0x3

    .line 77
    aput-object v2, v5, v9

    .line 78
    .line 79
    aput-object v4, v5, v1

    .line 80
    .line 81
    aput-object v6, v5, v3

    .line 82
    .line 83
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-direct {v11, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    sput-object v11, Li0/v;->h:Ljava/util/Set;

    .line 91
    .line 92
    new-array v1, v1, [Li0/v;

    .line 93
    .line 94
    aput-object v6, v1, v8

    .line 95
    .line 96
    aput-object v4, v1, v10

    .line 97
    .line 98
    aput-object v2, v1, v7

    .line 99
    .line 100
    aput-object v0, v1, v9

    .line 101
    .line 102
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Li0/v;->i:Ljava/util/List;

    .line 107
    .line 108
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Li0/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li0/v;-><init>()V

    return-void
.end method

.method static a(Li0/v;)Z
    .locals 1

    sget-object v0, Li0/v;->h:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li0/v;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Li0/v;->i:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
