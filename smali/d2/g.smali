.class public Ld2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final v:[Ljava/io/ObjectStreamField;


# instance fields
.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Double;

.field public u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v0, v0, [Ljava/io/ObjectStreamField;

    .line 4
    .line 5
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 6
    .line 7
    const-string v2, "trackerToken"

    .line 8
    .line 9
    const-class v3, Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 18
    .line 19
    const-string v2, "trackerName"

    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 28
    .line 29
    const-string v2, "network"

    .line 30
    .line 31
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    aput-object v1, v0, v2

    .line 36
    .line 37
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 38
    .line 39
    const-string v2, "campaign"

    .line 40
    .line 41
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 48
    .line 49
    const-string v2, "adgroup"

    .line 50
    .line 51
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    aput-object v1, v0, v2

    .line 56
    .line 57
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 58
    .line 59
    const-string v2, "creative"

    .line 60
    .line 61
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x5

    .line 65
    aput-object v1, v0, v2

    .line 66
    .line 67
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 68
    .line 69
    const-string v2, "clickLabel"

    .line 70
    .line 71
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x6

    .line 75
    aput-object v1, v0, v2

    .line 76
    .line 77
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 78
    .line 79
    const-string v2, "adid"

    .line 80
    .line 81
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x7

    .line 85
    aput-object v1, v0, v2

    .line 86
    .line 87
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 88
    .line 89
    const-string v2, "costType"

    .line 90
    .line 91
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    const/16 v2, 0x8

    .line 95
    .line 96
    aput-object v1, v0, v2

    .line 97
    .line 98
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 99
    .line 100
    const-string v2, "costAmount"

    .line 101
    .line 102
    const-class v4, Ljava/lang/Double;

    .line 103
    .line 104
    invoke-direct {v1, v2, v4}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    const/16 v2, 0x9

    .line 108
    .line 109
    aput-object v1, v0, v2

    .line 110
    .line 111
    new-instance v1, Ljava/io/ObjectStreamField;

    .line 112
    .line 113
    const-string v2, "costCurrency"

    .line 114
    .line 115
    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    const/16 v2, 0xa

    .line 119
    .line 120
    aput-object v1, v0, v2

    .line 121
    .line 122
    sput-object v0, Ld2/g;->v:[Ljava/io/ObjectStreamField;

    .line 123
    .line 124
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ld2/g;
    .locals 11

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ld2/g;

    .line 6
    .line 7
    invoke-direct {v0}, Ld2/g;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "unity"

    .line 11
    .line 12
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const-string v1, "cost_currency"

    .line 17
    .line 18
    const-string v2, "cost_amount"

    .line 19
    .line 20
    const-string v3, "cost_type"

    .line 21
    .line 22
    const-string v4, "click_label"

    .line 23
    .line 24
    const-string v5, "creative"

    .line 25
    .line 26
    const-string v6, "adgroup"

    .line 27
    .line 28
    const-string v7, "campaign"

    .line 29
    .line 30
    const-string v8, "network"

    .line 31
    .line 32
    const-string v9, "tracker_name"

    .line 33
    .line 34
    const-string v10, "tracker_token"

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    const-string p2, ""

    .line 39
    .line 40
    invoke-virtual {p0, v10, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    iput-object v10, v0, Ld2/g;->k:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0, v9, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    iput-object v9, v0, Ld2/g;->l:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v8, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    iput-object v8, v0, Ld2/g;->m:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0, v7, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iput-object v7, v0, Ld2/g;->n:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p0, v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iput-object v6, v0, Ld2/g;->o:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p0, v5, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iput-object v5, v0, Ld2/g;->p:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p0, v4, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput-object v4, v0, Ld2/g;->q:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-object p1, p2

    .line 86
    :goto_0
    iput-object p1, v0, Ld2/g;->r:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p0, v3, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, v0, Ld2/g;->s:Ljava/lang/String;

    .line 93
    .line 94
    const-wide/16 v3, 0x0

    .line 95
    .line 96
    invoke-virtual {p0, v2, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, v0, Ld2/g;->t:Ljava/lang/Double;

    .line 105
    .line 106
    invoke-virtual {p0, v1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v0, Ld2/g;->u:Ljava/lang/String;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-virtual {p0, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iput-object p2, v0, Ld2/g;->k:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iput-object p2, v0, Ld2/g;->l:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    iput-object p2, v0, Ld2/g;->m:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    iput-object p2, v0, Ld2/g;->n:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iput-object p2, v0, Ld2/g;->o:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iput-object p2, v0, Ld2/g;->p:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    iput-object p2, v0, Ld2/g;->q:Ljava/lang/String;

    .line 154
    .line 155
    iput-object p1, v0, Ld2/g;->r:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, v0, Ld2/g;->s:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 164
    .line 165
    .line 166
    move-result-wide p1

    .line 167
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, v0, Ld2/g;->t:Ljava/lang/Double;

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    iput-object p0, v0, Ld2/g;->u:Ljava/lang/String;

    .line 178
    .line 179
    :goto_1
    return-object v0
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
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    check-cast p1, Ld2/g;

    .line 21
    .line 22
    iget-object v2, p0, Ld2/g;->k:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Ld2/g;->k:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Ld2/g;->l:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Ld2/g;->l:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Ld2/g;->m:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Ld2/g;->m:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Ld2/g;->n:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Ld2/g;->n:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Ld2/g;->o:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, p1, Ld2/g;->o:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object v2, p0, Ld2/g;->p:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v3, p1, Ld2/g;->p:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object v2, p0, Ld2/g;->q:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v3, p1, Ld2/g;->q:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
    iget-object v2, p0, Ld2/g;->r:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v3, p1, Ld2/g;->r:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_a

    .line 108
    .line 109
    return v1

    .line 110
    :cond_a
    iget-object v2, p0, Ld2/g;->s:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v3, p1, Ld2/g;->s:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v2, v3}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    return v1

    .line 121
    :cond_b
    iget-object v2, p0, Ld2/g;->t:Ljava/lang/Double;

    .line 122
    .line 123
    iget-object v3, p1, Ld2/g;->t:Ljava/lang/Double;

    .line 124
    .line 125
    invoke-static {v2, v3}, Ld2/i1;->k(Ljava/lang/Double;Ljava/lang/Double;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_c

    .line 130
    .line 131
    return v1

    .line 132
    :cond_c
    iget-object v2, p0, Ld2/g;->u:Ljava/lang/String;

    .line 133
    .line 134
    iget-object p1, p1, Ld2/g;->u:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v2, p1}, Ld2/i1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_d

    .line 141
    .line 142
    return v1

    .line 143
    :cond_d
    return v0
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

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ld2/g;->k:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x275

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    mul-int/lit8 v1, v1, 0x25

    .line 11
    .line 12
    iget-object v0, p0, Ld2/g;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v1, v0

    .line 19
    mul-int/lit8 v1, v1, 0x25

    .line 20
    .line 21
    iget-object v0, p0, Ld2/g;->m:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x25

    .line 29
    .line 30
    iget-object v0, p0, Ld2/g;->n:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v1, v0

    .line 37
    mul-int/lit8 v1, v1, 0x25

    .line 38
    .line 39
    iget-object v0, p0, Ld2/g;->o:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v1, v0

    .line 46
    mul-int/lit8 v1, v1, 0x25

    .line 47
    .line 48
    iget-object v0, p0, Ld2/g;->p:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v1, v0

    .line 55
    mul-int/lit8 v1, v1, 0x25

    .line 56
    .line 57
    iget-object v0, p0, Ld2/g;->q:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v1, v0

    .line 64
    mul-int/lit8 v1, v1, 0x25

    .line 65
    .line 66
    iget-object v0, p0, Ld2/g;->r:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    mul-int/lit8 v1, v1, 0x25

    .line 74
    .line 75
    iget-object v0, p0, Ld2/g;->s:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v1, v0

    .line 82
    mul-int/lit8 v1, v1, 0x25

    .line 83
    .line 84
    iget-object v0, p0, Ld2/g;->t:Ljava/lang/Double;

    .line 85
    .line 86
    invoke-static {v0}, Ld2/i1;->L(Ljava/lang/Double;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    add-int/2addr v1, v0

    .line 91
    mul-int/lit8 v1, v1, 0x25

    .line 92
    .line 93
    iget-object v0, p0, Ld2/g;->u:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v0}, Ld2/i1;->P(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    add-int/2addr v1, v0

    .line 100
    return v1
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Ld2/g;->k:Ljava/lang/String;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p0, Ld2/g;->l:Ljava/lang/String;

    .line 12
    .line 13
    aput-object v2, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    iget-object v2, p0, Ld2/g;->m:Ljava/lang/String;

    .line 17
    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Ld2/g;->n:Ljava/lang/String;

    .line 22
    .line 23
    aput-object v2, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    iget-object v2, p0, Ld2/g;->o:Ljava/lang/String;

    .line 27
    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    iget-object v2, p0, Ld2/g;->p:Ljava/lang/String;

    .line 32
    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    iget-object v2, p0, Ld2/g;->q:Ljava/lang/String;

    .line 37
    .line 38
    aput-object v2, v0, v1

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    iget-object v2, p0, Ld2/g;->r:Ljava/lang/String;

    .line 42
    .line 43
    aput-object v2, v0, v1

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    iget-object v2, p0, Ld2/g;->s:Ljava/lang/String;

    .line 48
    .line 49
    aput-object v2, v0, v1

    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    iget-object v2, p0, Ld2/g;->t:Ljava/lang/Double;

    .line 54
    .line 55
    aput-object v2, v0, v1

    .line 56
    .line 57
    const/16 v1, 0xa

    .line 58
    .line 59
    iget-object v2, p0, Ld2/g;->u:Ljava/lang/String;

    .line 60
    .line 61
    aput-object v2, v0, v1

    .line 62
    .line 63
    const-string v1, "tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s ct:%s ca:%.2f cc:%s"

    .line 64
    .line 65
    invoke-static {v1, v0}, Ld2/i1;->l(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
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
