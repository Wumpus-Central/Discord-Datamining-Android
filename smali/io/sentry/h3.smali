.class public final Lio/sentry/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/h3$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Lio/sentry/i3;

.field private final b:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "[B>;"
        }
    .end annotation
.end field

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
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
.end method

.method constructor <init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/i3;",
            "Ljava/util/concurrent/Callable<",
            "[B>;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SentryEnvelopeItemHeader is required."

    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/i3;

    iput-object p1, p0, Lio/sentry/h3;->a:Lio/sentry/i3;

    const-string p1, "DataFactory is required."

    .line 7
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Callable;

    iput-object p1, p0, Lio/sentry/h3;->b:Ljava/util/concurrent/Callable;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lio/sentry/h3;->c:[B

    return-void
.end method

.method constructor <init>(Lio/sentry/i3;[B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SentryEnvelopeItemHeader is required."

    .line 2
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/i3;

    iput-object p1, p0, Lio/sentry/h3;->a:Lio/sentry/i3;

    .line 3
    iput-object p2, p0, Lio/sentry/h3;->c:[B

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lio/sentry/h3;->b:Ljava/util/concurrent/Callable;

    return-void
.end method

.method private static synthetic A(Lio/sentry/l0;Lio/sentry/clientreport/b;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    .line 7
    .line 8
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 9
    .line 10
    sget-object v3, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-direct {v2, v0, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-interface {p0, p1, v1}, Lio/sentry/l0;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p0

    .line 43
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_3
    move-exception p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    throw p0
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
.end method

.method private static synthetic B(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic C(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method private static synthetic D(Lio/sentry/l0;Lio/sentry/l2;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    .line 7
    .line 8
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 9
    .line 10
    sget-object v3, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-direct {v2, v0, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-interface {p0, p1, v1}, Lio/sentry/l0;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p0

    .line 43
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_3
    move-exception p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    throw p0
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
.end method

.method private static synthetic E(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic F(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method private static synthetic G(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1, p2}, Lio/sentry/h3;->M(Ljava/lang/String;J)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-static {p1, p2}, Lio/sentry/vendor/a;->c([BI)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p3, p1}, Lio/sentry/w1;->F(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3}, Lio/sentry/w1;->E()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 37
    .line 38
    .line 39
    :try_start_1
    new-instance p2, Ljava/io/BufferedWriter;

    .line 40
    .line 41
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 42
    .line 43
    sget-object v3, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 44
    .line 45
    invoke-direct {v0, p1, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 49
    .line 50
    .line 51
    :try_start_2
    invoke-interface {p4, p3, p2}, Lio/sentry/l0;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 55
    .line 56
    .line 57
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :try_start_3
    invoke-virtual {p2}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 59
    .line 60
    .line 61
    :try_start_4
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 65
    .line 66
    .line 67
    return-object p3

    .line 68
    :catchall_0
    move-exception p3

    .line 69
    :try_start_5
    invoke-virtual {p2}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception p2

    .line 74
    :try_start_6
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    throw p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 78
    :catchall_2
    move-exception p2

    .line 79
    :try_start_7
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_3
    move-exception p1

    .line 84
    :try_start_8
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    throw p2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 88
    :catchall_4
    move-exception p1

    .line 89
    goto :goto_2

    .line 90
    :catch_0
    move-exception p1

    .line 91
    :try_start_9
    new-instance p2, Lio/sentry/exception/b;

    .line 92
    .line 93
    const-string p3, "Failed to serialize profiling trace data\n%s"

    .line 94
    .line 95
    new-array p4, v2, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    aput-object p1, p4, v1

    .line 102
    .line 103
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p2, p1}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 111
    :goto_2
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_0
    new-instance p0, Lio/sentry/exception/b;

    .line 116
    .line 117
    const-string p1, "Profiling trace file is empty"

    .line 118
    .line 119
    invoke-direct {p0, p1}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :cond_1
    new-instance p1, Lio/sentry/exception/b;

    .line 124
    .line 125
    new-array p2, v2, [Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    aput-object p0, p2, v1

    .line 132
    .line 133
    const-string p0, "Dropping profiling trace data, because the file \'%s\' doesn\'t exists"

    .line 134
    .line 135
    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method private static synthetic H(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic I(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method private static synthetic J(Lio/sentry/l0;Lio/sentry/y3;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    .line 7
    .line 8
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 9
    .line 10
    sget-object v3, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-direct {v2, v0, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-interface {p0, p1, v1}, Lio/sentry/l0;->a(Ljava/lang/Object;Ljava/io/Writer;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p0

    .line 43
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_3
    move-exception p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    throw p0
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
.end method

.method private static synthetic K(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic L(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method private static M(Ljava/lang/String;J)[B
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_3

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    cmp-long v4, v4, p1

    .line 26
    .line 27
    if-gtz v4, :cond_1

    .line 28
    .line 29
    new-instance p1, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    :try_start_1
    new-instance p2, Ljava/io/BufferedInputStream;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 37
    .line 38
    .line 39
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 42
    .line 43
    .line 44
    const/16 v4, 0x400

    .line 45
    .line 46
    :try_start_3
    new-array v4, v4, [B

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p2, v4}, Ljava/io/InputStream;->read([B)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/4 v6, -0x1

    .line 53
    if-eq v5, v6, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3, v4, v2, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 60
    .line 61
    .line 62
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 64
    .line 65
    .line 66
    :try_start_5
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 67
    .line 68
    .line 69
    :try_start_6
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_0

    .line 70
    .line 71
    .line 72
    return-object v4

    .line 73
    :catchall_0
    move-exception v4

    .line 74
    :try_start_7
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception v3

    .line 79
    :try_start_8
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 83
    :catchall_2
    move-exception v3

    .line 84
    :try_start_9
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_3
    move-exception p2

    .line 89
    :try_start_a
    invoke-virtual {v3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 93
    :catchall_4
    move-exception p2

    .line 94
    :try_start_b
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :catchall_5
    move-exception p1

    .line 99
    :try_start_c
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    throw p2

    .line 103
    :cond_1
    new-instance v4, Lio/sentry/exception/b;

    .line 104
    .line 105
    const-string v5, "Dropping item, because its size located at \'%s\' with %d bytes is bigger than the maximum allowed size of %d bytes."

    .line 106
    .line 107
    const/4 v6, 0x3

    .line 108
    new-array v6, v6, [Ljava/lang/Object;

    .line 109
    .line 110
    aput-object p0, v6, v2

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 113
    .line 114
    .line 115
    move-result-wide v7

    .line 116
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    aput-object v3, v6, v1

    .line 121
    .line 122
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    aput-object p1, v6, v0

    .line 127
    .line 128
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {v4, p1}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v4

    .line 136
    :cond_2
    new-instance p1, Lio/sentry/exception/b;

    .line 137
    .line 138
    const-string p2, "Reading the item %s failed, because can\'t read the file."

    .line 139
    .line 140
    new-array v3, v1, [Ljava/lang/Object;

    .line 141
    .line 142
    aput-object p0, v3, v2

    .line 143
    .line 144
    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-direct {p1, p2}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_3
    new-instance p1, Lio/sentry/exception/b;

    .line 153
    .line 154
    const-string p2, "Reading the item %s failed, because the file located at the path is not a file."

    .line 155
    .line 156
    new-array v3, v1, [Ljava/lang/Object;

    .line 157
    .line 158
    aput-object p0, v3, v2

    .line 159
    .line 160
    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-direct {p1, p2}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_0

    .line 168
    :catch_0
    move-exception p1

    .line 169
    goto :goto_4

    .line 170
    :catch_1
    move-exception p1

    .line 171
    :goto_4
    new-instance p2, Lio/sentry/exception/b;

    .line 172
    .line 173
    new-array v0, v0, [Ljava/lang/Object;

    .line 174
    .line 175
    aput-object p0, v0, v2

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    aput-object p0, v0, v1

    .line 182
    .line 183
    const-string p0, "Reading the item %s failed.\n%s"

    .line 184
    .line 185
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-direct {p2, p0}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p2
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public static synthetic a(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->B(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)[B
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/sentry/h3;->G(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->I(Lio/sentry/h3$a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->x(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lio/sentry/l0;Lio/sentry/l2;)[B
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/h3;->D(Lio/sentry/l0;Lio/sentry/l2;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/sentry/b;J)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/h3;->z(Lio/sentry/b;J)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->C(Lio/sentry/h3$a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->y(Lio/sentry/h3$a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/sentry/l0;Lio/sentry/clientreport/b;)[B
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/h3;->A(Lio/sentry/l0;Lio/sentry/clientreport/b;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->H(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->F(Lio/sentry/h3$a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->L(Lio/sentry/h3$a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->E(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lio/sentry/h3;->K(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lio/sentry/l0;Lio/sentry/y3;)[B
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/h3;->J(Lio/sentry/l0;Lio/sentry/y3;)[B

    move-result-object p0

    return-object p0
.end method

.method public static p(Lio/sentry/b;J)Lio/sentry/h3;
    .locals 8

    .line 1
    new-instance v0, Lio/sentry/h3$a;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/g3;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lio/sentry/g3;-><init>(Lio/sentry/b;J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lio/sentry/h3$a;-><init>(Ljava/util/concurrent/Callable;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lio/sentry/i3;

    .line 12
    .line 13
    sget-object v3, Lio/sentry/m3;->Attachment:Lio/sentry/m3;

    .line 14
    .line 15
    new-instance v4, Lio/sentry/t2;

    .line 16
    .line 17
    invoke-direct {v4, v0}, Lio/sentry/t2;-><init>(Lio/sentry/h3$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/b;->d()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {p0}, Lio/sentry/b;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {p0}, Lio/sentry/b;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    move-object v2, p1

    .line 33
    invoke-direct/range {v2 .. v7}, Lio/sentry/i3;-><init>(Lio/sentry/m3;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lio/sentry/h3;

    .line 37
    .line 38
    new-instance p2, Lio/sentry/u2;

    .line 39
    .line 40
    invoke-direct {p2, v0}, Lio/sentry/u2;-><init>(Lio/sentry/h3$a;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1, p2}, Lio/sentry/h3;-><init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V

    .line 44
    .line 45
    .line 46
    return-object p0
    .line 47
    .line 48
    .line 49
.end method

.method public static q(Lio/sentry/l0;Lio/sentry/clientreport/b;)Lio/sentry/h3;
    .locals 4

    .line 1
    const-string v0, "ISerializer is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "ClientReport is required."

    .line 7
    .line 8
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/sentry/h3$a;

    .line 12
    .line 13
    new-instance v1, Lio/sentry/a3;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lio/sentry/a3;-><init>(Lio/sentry/l0;Lio/sentry/clientreport/b;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lio/sentry/h3$a;-><init>(Ljava/util/concurrent/Callable;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lio/sentry/i3;

    .line 22
    .line 23
    invoke-static {p1}, Lio/sentry/m3;->resolve(Ljava/lang/Object;)Lio/sentry/m3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Lio/sentry/b3;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lio/sentry/b3;-><init>(Lio/sentry/h3$a;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "application/json"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {p0, p1, v1, v2, v3}, Lio/sentry/i3;-><init>(Lio/sentry/m3;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lio/sentry/h3;

    .line 39
    .line 40
    new-instance v1, Lio/sentry/c3;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lio/sentry/c3;-><init>(Lio/sentry/h3$a;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p0, v1}, Lio/sentry/h3;-><init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V

    .line 46
    .line 47
    .line 48
    return-object p1
    .line 49
.end method

.method public static r(Lio/sentry/l0;Lio/sentry/l2;)Lio/sentry/h3;
    .locals 4

    .line 1
    const-string v0, "ISerializer is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "SentryEvent is required."

    .line 7
    .line 8
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/sentry/h3$a;

    .line 12
    .line 13
    new-instance v1, Lio/sentry/d3;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lio/sentry/d3;-><init>(Lio/sentry/l0;Lio/sentry/l2;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lio/sentry/h3$a;-><init>(Ljava/util/concurrent/Callable;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lio/sentry/i3;

    .line 22
    .line 23
    invoke-static {p1}, Lio/sentry/m3;->resolve(Ljava/lang/Object;)Lio/sentry/m3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Lio/sentry/e3;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lio/sentry/e3;-><init>(Lio/sentry/h3$a;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "application/json"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {p0, p1, v1, v2, v3}, Lio/sentry/i3;-><init>(Lio/sentry/m3;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lio/sentry/h3;

    .line 39
    .line 40
    new-instance v1, Lio/sentry/f3;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lio/sentry/f3;-><init>(Lio/sentry/h3$a;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p0, v1}, Lio/sentry/h3;-><init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V

    .line 46
    .line 47
    .line 48
    return-object p1
    .line 49
.end method

.method public static s(Lio/sentry/w1;JLio/sentry/l0;)Lio/sentry/h3;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lio/sentry/w1;->B()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    new-instance v7, Lio/sentry/h3$a;

    .line 6
    .line 7
    new-instance v8, Lio/sentry/v2;

    .line 8
    .line 9
    move-object v0, v8

    .line 10
    move-object v1, v6

    .line 11
    move-wide v2, p1

    .line 12
    move-object v4, p0

    .line 13
    move-object v5, p3

    .line 14
    invoke-direct/range {v0 .. v5}, Lio/sentry/v2;-><init>(Ljava/io/File;JLio/sentry/w1;Lio/sentry/l0;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v7, v8}, Lio/sentry/h3$a;-><init>(Ljava/util/concurrent/Callable;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lio/sentry/i3;

    .line 21
    .line 22
    sget-object p1, Lio/sentry/m3;->Profile:Lio/sentry/m3;

    .line 23
    .line 24
    new-instance p2, Lio/sentry/w2;

    .line 25
    .line 26
    invoke-direct {p2, v7}, Lio/sentry/w2;-><init>(Lio/sentry/h3$a;)V

    .line 27
    .line 28
    .line 29
    const-string p3, "application-json"

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/i3;-><init>(Lio/sentry/m3;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lio/sentry/h3;

    .line 39
    .line 40
    new-instance p2, Lio/sentry/x2;

    .line 41
    .line 42
    invoke-direct {p2, v7}, Lio/sentry/x2;-><init>(Lio/sentry/h3$a;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p0, p2}, Lio/sentry/h3;-><init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V

    .line 46
    .line 47
    .line 48
    return-object p1
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
.end method

.method public static t(Lio/sentry/l0;Lio/sentry/y3;)Lio/sentry/h3;
    .locals 4

    .line 1
    const-string v0, "ISerializer is required."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Session is required."

    .line 7
    .line 8
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/sentry/h3$a;

    .line 12
    .line 13
    new-instance v1, Lio/sentry/s2;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lio/sentry/s2;-><init>(Lio/sentry/l0;Lio/sentry/y3;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lio/sentry/h3$a;-><init>(Ljava/util/concurrent/Callable;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lio/sentry/i3;

    .line 22
    .line 23
    sget-object p1, Lio/sentry/m3;->Session:Lio/sentry/m3;

    .line 24
    .line 25
    new-instance v1, Lio/sentry/y2;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lio/sentry/y2;-><init>(Lio/sentry/h3$a;)V

    .line 28
    .line 29
    .line 30
    const-string v2, "application/json"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {p0, p1, v1, v2, v3}, Lio/sentry/i3;-><init>(Lio/sentry/m3;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lio/sentry/h3;

    .line 37
    .line 38
    new-instance v1, Lio/sentry/z2;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Lio/sentry/z2;-><init>(Lio/sentry/h3$a;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p0, v1}, Lio/sentry/h3;-><init>(Lio/sentry/i3;Ljava/util/concurrent/Callable;)V

    .line 44
    .line 45
    .line 46
    return-object p1
    .line 47
    .line 48
    .line 49
.end method

.method private static synthetic x(Lio/sentry/h3$a;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic y(Lio/sentry/h3$a;)[B
    .locals 0

    invoke-virtual {p0}, Lio/sentry/h3$a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method private static synthetic z(Lio/sentry/b;J)[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/sentry/b;->c()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/b;->c()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v0, v0

    .line 14
    int-to-long v3, v0

    .line 15
    cmp-long v0, v3, p1

    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lio/sentry/b;->c()[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance v0, Lio/sentry/exception/b;

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    new-array v3, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p0}, Lio/sentry/b;->e()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v3, v1

    .line 34
    .line 35
    invoke-virtual {p0}, Lio/sentry/b;->c()[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    array-length p0, p0

    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    aput-object p0, v3, v2

    .line 45
    .line 46
    const/4 p0, 0x2

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    aput-object p1, v3, p0

    .line 52
    .line 53
    const-string p0, "Dropping attachment with filename \'%s\', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes."

    .line 54
    .line 55
    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v0, p0}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    invoke-virtual {p0}, Lio/sentry/b;->f()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Lio/sentry/b;->f()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0, p1, p2}, Lio/sentry/h3;->M(Ljava/lang/String;J)[B

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_2
    new-instance p1, Lio/sentry/exception/b;

    .line 79
    .line 80
    new-array p2, v2, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {p0}, Lio/sentry/b;->e()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    aput-object p0, p2, v1

    .line 87
    .line 88
    const-string p0, "Couldn\'t attach the attachment %s.\nPlease check that either bytes or a path is set."

    .line 89
    .line 90
    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {p1, p0}, Lio/sentry/exception/b;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
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
.end method


# virtual methods
.method public u(Lio/sentry/l0;)Lio/sentry/clientreport/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/h3;->a:Lio/sentry/i3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lio/sentry/m3;->ClientReport:Lio/sentry/m3;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    .line 15
    .line 16
    new-instance v1, Ljava/io/InputStreamReader;

    .line 17
    .line 18
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/h3;->v()[B

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 25
    .line 26
    .line 27
    sget-object v3, Lio/sentry/h3;->d:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    const-class v1, Lio/sentry/clientreport/b;

    .line 36
    .line 37
    invoke-interface {p1, v0, v1}, Lio/sentry/l0;->c(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lio/sentry/clientreport/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_1
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    throw p1

    .line 57
    :cond_1
    :goto_1
    const/4 p1, 0x0

    .line 58
    return-object p1
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
.end method

.method public v()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/h3;->c:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/h3;->b:Ljava/util/concurrent/Callable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [B

    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/h3;->c:[B

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lio/sentry/h3;->c:[B

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public w()Lio/sentry/i3;
    .locals 1

    iget-object v0, p0, Lio/sentry/h3;->a:Lio/sentry/i3;

    return-object v0
.end method
