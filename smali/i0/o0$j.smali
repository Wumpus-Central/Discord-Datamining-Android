.class final enum Li0/o0$j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li0/o0$j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Li0/o0$j;

.field public static final enum l:Li0/o0$j;

.field public static final enum m:Li0/o0$j;

.field public static final enum n:Li0/o0$j;

.field public static final enum o:Li0/o0$j;

.field public static final enum p:Li0/o0$j;

.field public static final enum q:Li0/o0$j;

.field public static final enum r:Li0/o0$j;

.field public static final enum s:Li0/o0$j;

.field private static final synthetic t:[Li0/o0$j;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Li0/o0$j;

    .line 2
    .line 3
    const-string v1, "INITIALIZING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Li0/o0$j;->k:Li0/o0$j;

    .line 10
    .line 11
    new-instance v1, Li0/o0$j;

    .line 12
    .line 13
    const-string v3, "PENDING_RECORDING"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Li0/o0$j;->l:Li0/o0$j;

    .line 20
    .line 21
    new-instance v3, Li0/o0$j;

    .line 22
    .line 23
    const-string v5, "PENDING_PAUSED"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Li0/o0$j;->m:Li0/o0$j;

    .line 30
    .line 31
    new-instance v5, Li0/o0$j;

    .line 32
    .line 33
    const-string v7, "IDLING"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Li0/o0$j;->n:Li0/o0$j;

    .line 40
    .line 41
    new-instance v7, Li0/o0$j;

    .line 42
    .line 43
    const-string v9, "RECORDING"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Li0/o0$j;->o:Li0/o0$j;

    .line 50
    .line 51
    new-instance v9, Li0/o0$j;

    .line 52
    .line 53
    const-string v11, "PAUSED"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Li0/o0$j;->p:Li0/o0$j;

    .line 60
    .line 61
    new-instance v11, Li0/o0$j;

    .line 62
    .line 63
    const-string v13, "STOPPING"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Li0/o0$j;->q:Li0/o0$j;

    .line 70
    .line 71
    new-instance v13, Li0/o0$j;

    .line 72
    .line 73
    const-string v15, "RESETTING"

    .line 74
    .line 75
    const/4 v14, 0x7

    .line 76
    invoke-direct {v13, v15, v14}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v13, Li0/o0$j;->r:Li0/o0$j;

    .line 80
    .line 81
    new-instance v15, Li0/o0$j;

    .line 82
    .line 83
    const-string v14, "ERROR"

    .line 84
    .line 85
    const/16 v12, 0x8

    .line 86
    .line 87
    invoke-direct {v15, v14, v12}, Li0/o0$j;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v15, Li0/o0$j;->s:Li0/o0$j;

    .line 91
    .line 92
    const/16 v14, 0x9

    .line 93
    .line 94
    new-array v14, v14, [Li0/o0$j;

    .line 95
    .line 96
    aput-object v0, v14, v2

    .line 97
    .line 98
    aput-object v1, v14, v4

    .line 99
    .line 100
    aput-object v3, v14, v6

    .line 101
    .line 102
    aput-object v5, v14, v8

    .line 103
    .line 104
    aput-object v7, v14, v10

    .line 105
    .line 106
    const/4 v0, 0x5

    .line 107
    aput-object v9, v14, v0

    .line 108
    .line 109
    const/4 v0, 0x6

    .line 110
    aput-object v11, v14, v0

    .line 111
    .line 112
    const/4 v0, 0x7

    .line 113
    aput-object v13, v14, v0

    .line 114
    .line 115
    aput-object v15, v14, v12

    .line 116
    .line 117
    sput-object v14, Li0/o0$j;->t:[Li0/o0$j;

    .line 118
    .line 119
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li0/o0$j;
    .locals 1

    const-class v0, Li0/o0$j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li0/o0$j;

    return-object p0
.end method

.method public static values()[Li0/o0$j;
    .locals 1

    sget-object v0, Li0/o0$j;->t:[Li0/o0$j;

    invoke-virtual {v0}, [Li0/o0$j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li0/o0$j;

    return-object v0
.end method
