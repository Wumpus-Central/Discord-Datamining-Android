.class public Ld2/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ld2/c0;

.field private b:Landroid/content/Context;

.field private final c:Ld2/i0;

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld2/i0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ld2/l;->j()Ld2/c0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ld2/h0;->a:Ld2/c0;

    .line 9
    .line 10
    iput-object p1, p0, Ld2/h0;->b:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Ld2/h0;->c:Ld2/i0;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ld2/h0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    return-void
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

.method private a(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public c()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ld2/h0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v1, Ld2/h0;->a:Ld2/c0;

    .line 13
    .line 14
    const-string v3, "Should not try to read Install referrer Huawei"

    .line 15
    .line 16
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0, v3, v2}, Ld2/c0;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, v1, Ld2/h0;->b:Landroid/content/Context;

    .line 23
    .line 24
    const-string v3, "com.huawei.appmarket.commondata"

    .line 25
    .line 26
    invoke-static {v0, v3}, Ld2/i1;->c0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const-string v0, "content://com.huawei.appmarket.commondata/item/5"

    .line 34
    .line 35
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v3, v1, Ld2/h0;->b:Landroid/content/Context;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v9, 0x1

    .line 46
    new-array v7, v9, [Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, v1, Ld2/h0;->b:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    aput-object v4, v7, v2

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    move-object v4, v0

    .line 61
    :try_start_0
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const/4 v3, 0x2

    .line 66
    if-eqz v10, :cond_3

    .line 67
    .line 68
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    const/4 v0, 0x4

    .line 79
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v4, v1, Ld2/h0;->a:Ld2/c0;

    .line 84
    .line 85
    const-string v5, "InstallReferrerHuawei reads index_referrer[%s] index_track_id[%s]"

    .line 86
    .line 87
    new-array v6, v3, [Ljava/lang/Object;

    .line 88
    .line 89
    aput-object v12, v6, v2

    .line 90
    .line 91
    aput-object v0, v6, v9

    .line 92
    .line 93
    invoke-interface {v4, v5, v6}, Ld2/c0;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v10, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v10, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v6, v1, Ld2/h0;->a:Ld2/c0;

    .line 105
    .line 106
    const-string v7, "InstallReferrerHuawei reads clickTime[%s] installTime[%s]"

    .line 107
    .line 108
    new-array v3, v3, [Ljava/lang/Object;

    .line 109
    .line 110
    aput-object v4, v3, v2

    .line 111
    .line 112
    aput-object v5, v3, v9

    .line 113
    .line 114
    invoke-interface {v6, v7, v3}, Ld2/c0;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v17

    .line 125
    invoke-direct {v1, v12}, Ld2/h0;->a(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_2

    .line 130
    .line 131
    new-instance v5, Ld2/x0;

    .line 132
    .line 133
    move-object v11, v5

    .line 134
    move-wide v13, v3

    .line 135
    move-wide/from16 v15, v17

    .line 136
    .line 137
    invoke-direct/range {v11 .. v16}, Ld2/x0;-><init>(Ljava/lang/String;JJ)V

    .line 138
    .line 139
    .line 140
    iget-object v6, v1, Ld2/h0;->c:Ld2/i0;

    .line 141
    .line 142
    const-string v7, "huawei_ads"

    .line 143
    .line 144
    invoke-interface {v6, v5, v7}, Ld2/i0;->a(Ld2/x0;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    invoke-direct {v1, v0}, Ld2/h0;->b(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_4

    .line 152
    .line 153
    new-instance v5, Ld2/x0;

    .line 154
    .line 155
    move-object v13, v5

    .line 156
    move-object v14, v0

    .line 157
    move-wide v15, v3

    .line 158
    invoke-direct/range {v13 .. v18}, Ld2/x0;-><init>(Ljava/lang/String;JJ)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v1, Ld2/h0;->c:Ld2/i0;

    .line 162
    .line 163
    const-string v3, "huawei_app_gallery"

    .line 164
    .line 165
    invoke-interface {v0, v5, v3}, Ld2/i0;->a(Ld2/x0;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_3
    iget-object v4, v1, Ld2/h0;->a:Ld2/c0;

    .line 170
    .line 171
    const-string v5, "InstallReferrerHuawei fail to read referrer for package [%s] and content uri [%s]"

    .line 172
    .line 173
    new-array v3, v3, [Ljava/lang/Object;

    .line 174
    .line 175
    iget-object v6, v1, Ld2/h0;->b:Landroid/content/Context;

    .line 176
    .line 177
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    aput-object v6, v3, v2

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    aput-object v0, v3, v9

    .line 188
    .line 189
    invoke-interface {v4, v5, v3}, Ld2/c0;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    .line 192
    :cond_4
    :goto_0
    if-eqz v10, :cond_5

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    goto :goto_2

    .line 197
    :catch_0
    move-exception v0

    .line 198
    :try_start_1
    iget-object v3, v1, Ld2/h0;->a:Ld2/c0;

    .line 199
    .line 200
    const-string v4, "InstallReferrerHuawei error [%s]"

    .line 201
    .line 202
    new-array v5, v9, [Ljava/lang/Object;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    aput-object v0, v5, v2

    .line 209
    .line 210
    invoke-interface {v3, v4, v5}, Ld2/c0;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    .line 212
    .line 213
    if-eqz v10, :cond_5

    .line 214
    .line 215
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 216
    .line 217
    .line 218
    :cond_5
    iget-object v0, v1, Ld2/h0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 219
    .line 220
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :goto_2
    if-eqz v10, :cond_6

    .line 225
    .line 226
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 227
    .line 228
    .line 229
    :cond_6
    throw v0
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
.end method
