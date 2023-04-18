.class public Ld2/d1;
.super Ld2/z0;
.source "SourceFile"


# instance fields
.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld2/z0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ld2/c;->f()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Ld2/i1;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ld2/d1;->o:Ljava/lang/String;

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
.end method


# virtual methods
.method public b()Ld2/o;
    .locals 3

    .line 1
    iget-boolean v0, p0, Ld2/z0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v0, Ld2/o;

    .line 8
    .line 9
    invoke-direct {v0}, Ld2/o;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "unity"

    .line 13
    .line 14
    iget-object v2, p0, Ld2/d1;->o:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    iget-object v1, p0, Ld2/z0;->d:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v2

    .line 30
    :goto_0
    iput-object v1, v0, Ld2/o;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v1, p0, Ld2/z0;->e:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v1, v2

    .line 38
    :goto_1
    iput-object v1, v0, Ld2/o;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p0, Ld2/z0;->c:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    move-object v2, v1

    .line 45
    :cond_3
    iput-object v2, v0, Ld2/o;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-boolean v1, p0, Ld2/z0;->b:Z

    .line 48
    .line 49
    iput-boolean v1, v0, Ld2/o;->a:Z

    .line 50
    .line 51
    iget-object v1, p0, Ld2/z0;->f:Lorg/json/JSONObject;

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    new-instance v1, Lorg/json/JSONObject;

    .line 57
    .line 58
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 59
    .line 60
    .line 61
    :goto_2
    iput-object v1, v0, Ld2/o;->e:Lorg/json/JSONObject;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_5
    iget-object v1, p0, Ld2/z0;->d:Ljava/lang/String;

    .line 65
    .line 66
    iput-object v1, v0, Ld2/o;->c:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p0, Ld2/z0;->e:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v1, v0, Ld2/o;->d:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p0, Ld2/z0;->c:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v1, v0, Ld2/o;->b:Ljava/lang/String;

    .line 75
    .line 76
    iget-boolean v1, p0, Ld2/z0;->b:Z

    .line 77
    .line 78
    iput-boolean v1, v0, Ld2/o;->a:Z

    .line 79
    .line 80
    iget-object v1, p0, Ld2/z0;->f:Lorg/json/JSONObject;

    .line 81
    .line 82
    iput-object v1, v0, Ld2/o;->e:Lorg/json/JSONObject;

    .line 83
    .line 84
    :goto_3
    return-object v0
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

.method public c()Ld2/p;
    .locals 3

    .line 1
    iget-boolean v0, p0, Ld2/z0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v0, Ld2/p;

    .line 8
    .line 9
    invoke-direct {v0}, Ld2/p;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "unity"

    .line 13
    .line 14
    iget-object v2, p0, Ld2/d1;->o:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    iget-object v1, p0, Ld2/z0;->d:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v2

    .line 30
    :goto_0
    iput-object v1, v0, Ld2/p;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v1, p0, Ld2/z0;->e:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v1, v2

    .line 38
    :goto_1
    iput-object v1, v0, Ld2/p;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p0, Ld2/z0;->c:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    move-object v2, v1

    .line 45
    :cond_3
    iput-object v2, v0, Ld2/p;->a:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, Ld2/z0;->f:Lorg/json/JSONObject;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    new-instance v1, Lorg/json/JSONObject;

    .line 53
    .line 54
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 55
    .line 56
    .line 57
    :goto_2
    iput-object v1, v0, Ld2/p;->d:Lorg/json/JSONObject;

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_5
    iget-object v1, p0, Ld2/z0;->d:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v1, v0, Ld2/p;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p0, Ld2/z0;->e:Ljava/lang/String;

    .line 65
    .line 66
    iput-object v1, v0, Ld2/p;->c:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p0, Ld2/z0;->c:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v1, v0, Ld2/p;->a:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p0, Ld2/z0;->f:Lorg/json/JSONObject;

    .line 73
    .line 74
    iput-object v1, v0, Ld2/p;->d:Lorg/json/JSONObject;

    .line 75
    .line 76
    :goto_3
    return-object v0
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
