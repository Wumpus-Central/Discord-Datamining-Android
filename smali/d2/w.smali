.class public final enum Ld2/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld2/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Ld2/w;

.field public static final enum q:Ld2/w;

.field public static final enum r:Ld2/w;

.field public static final enum s:Ld2/w;

.field private static final synthetic t:[Ld2/w;


# instance fields
.field k:I

.field l:J

.field m:J

.field n:D

.field o:D


# direct methods
.method static constructor <clinit>()V
    .locals 37

    .line 1
    new-instance v12, Ld2/w;

    .line 2
    .line 3
    const-string v1, "LONG_WAIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-wide/32 v4, 0x1d4c0

    .line 8
    .line 9
    .line 10
    const-wide/32 v6, 0x5265c00

    .line 11
    .line 12
    .line 13
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 14
    .line 15
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 16
    .line 17
    move-object v0, v12

    .line 18
    invoke-direct/range {v0 .. v11}, Ld2/w;-><init>(Ljava/lang/String;IIJJDD)V

    .line 19
    .line 20
    .line 21
    sput-object v12, Ld2/w;->p:Ld2/w;

    .line 22
    .line 23
    new-instance v0, Ld2/w;

    .line 24
    .line 25
    const-string v14, "SHORT_WAIT"

    .line 26
    .line 27
    const/4 v15, 0x1

    .line 28
    const/16 v16, 0x1

    .line 29
    .line 30
    const-wide/16 v17, 0xc8

    .line 31
    .line 32
    const-wide/32 v19, 0x36ee80

    .line 33
    .line 34
    .line 35
    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    .line 36
    .line 37
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 38
    .line 39
    move-object v13, v0

    .line 40
    invoke-direct/range {v13 .. v24}, Ld2/w;-><init>(Ljava/lang/String;IIJJDD)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Ld2/w;->q:Ld2/w;

    .line 44
    .line 45
    new-instance v1, Ld2/w;

    .line 46
    .line 47
    const-string v26, "TEST_WAIT"

    .line 48
    .line 49
    const/16 v27, 0x2

    .line 50
    .line 51
    const/16 v28, 0x1

    .line 52
    .line 53
    const-wide/16 v29, 0xc8

    .line 54
    .line 55
    const-wide/16 v31, 0x3e8

    .line 56
    .line 57
    const-wide/high16 v33, 0x3fe0000000000000L    # 0.5

    .line 58
    .line 59
    const-wide/high16 v35, 0x3ff0000000000000L    # 1.0

    .line 60
    .line 61
    move-object/from16 v25, v1

    .line 62
    .line 63
    invoke-direct/range {v25 .. v36}, Ld2/w;-><init>(Ljava/lang/String;IIJJDD)V

    .line 64
    .line 65
    .line 66
    sput-object v1, Ld2/w;->r:Ld2/w;

    .line 67
    .line 68
    new-instance v2, Ld2/w;

    .line 69
    .line 70
    const-string v14, "NO_WAIT"

    .line 71
    .line 72
    const/4 v15, 0x3

    .line 73
    const/16 v16, 0x64

    .line 74
    .line 75
    const-wide/16 v17, 0x1

    .line 76
    .line 77
    const-wide/16 v19, 0x3e8

    .line 78
    .line 79
    const-wide/high16 v21, 0x3ff0000000000000L    # 1.0

    .line 80
    .line 81
    move-object v13, v2

    .line 82
    invoke-direct/range {v13 .. v24}, Ld2/w;-><init>(Ljava/lang/String;IIJJDD)V

    .line 83
    .line 84
    .line 85
    sput-object v2, Ld2/w;->s:Ld2/w;

    .line 86
    .line 87
    const/4 v3, 0x4

    .line 88
    new-array v3, v3, [Ld2/w;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    aput-object v12, v3, v4

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    aput-object v0, v3, v4

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    aput-object v1, v3, v0

    .line 98
    .line 99
    const/4 v0, 0x3

    .line 100
    aput-object v2, v3, v0

    .line 101
    .line 102
    sput-object v3, Ld2/w;->t:[Ld2/w;

    .line 103
    .line 104
    return-void
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

.method private constructor <init>(Ljava/lang/String;IIJJDD)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJDD)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ld2/w;->k:I

    .line 5
    .line 6
    iput-wide p4, p0, Ld2/w;->l:J

    .line 7
    .line 8
    iput-wide p6, p0, Ld2/w;->m:J

    .line 9
    .line 10
    iput-wide p8, p0, Ld2/w;->n:D

    .line 11
    .line 12
    iput-wide p10, p0, Ld2/w;->o:D

    .line 13
    .line 14
    return-void
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
.end method

.method public static valueOf(Ljava/lang/String;)Ld2/w;
    .locals 1

    const-class v0, Ld2/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld2/w;

    return-object p0
.end method

.method public static values()[Ld2/w;
    .locals 1

    sget-object v0, Ld2/w;->t:[Ld2/w;

    invoke-virtual {v0}, [Ld2/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld2/w;

    return-object v0
.end method
