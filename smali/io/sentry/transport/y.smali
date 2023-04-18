.class public final Lio/sentry/transport/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lio/sentry/transport/o;

.field private final b:Lio/sentry/o3;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lio/sentry/g;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/o3;)V
    .locals 1

    .line 5
    invoke-static {}, Lio/sentry/transport/m;->b()Lio/sentry/transport/o;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lio/sentry/transport/y;-><init>(Lio/sentry/transport/o;Lio/sentry/o3;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/transport/o;Lio/sentry/o3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/transport/y;->c:Ljava/util/Map;

    .line 3
    iput-object p1, p0, Lio/sentry/transport/y;->a:Lio/sentry/transport/o;

    .line 4
    iput-object p2, p0, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    return-void
.end method

.method public static synthetic a(ZLio/sentry/hints/f;)V
    .locals 0

    invoke-static {p0, p1}, Lio/sentry/transport/y;->h(ZLio/sentry/hints/f;)V

    return-void
.end method

.method public static synthetic b(Lio/sentry/hints/k;)V
    .locals 0

    invoke-static {p0}, Lio/sentry/transport/y;->g(Lio/sentry/hints/k;)V

    return-void
.end method

.method private c(Lio/sentry/g;Ljava/util/Date;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/transport/y;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Date;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lio/sentry/transport/y;->c:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_1
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
.end method

.method private e(Ljava/lang/String;)Lio/sentry/g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "transaction"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x3

    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string v0, "session"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v0, "event"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :sswitch_3
    const-string v0, "attachment"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    sget-object p1, Lio/sentry/g;->Unknown:Lio/sentry/g;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    sget-object p1, Lio/sentry/g;->Transaction:Lio/sentry/g;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    sget-object p1, Lio/sentry/g;->Session:Lio/sentry/g;

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_2
    sget-object p1, Lio/sentry/g;->Error:Lio/sentry/g;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_3
    sget-object p1, Lio/sentry/g;->Attachment:Lio/sentry/g;

    .line 72
    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :sswitch_data_0
    .sparse-switch
        -0x7508a6dd -> :sswitch_3
        0x5c6729a -> :sswitch_2
        0x76508296 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private f(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/transport/y;->e(Ljava/lang/String;)Lio/sentry/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/Date;

    .line 6
    .line 7
    iget-object v1, p0, Lio/sentry/transport/y;->a:Lio/sentry/transport/o;

    .line 8
    .line 9
    invoke-interface {v1}, Lio/sentry/transport/o;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/transport/y;->c:Ljava/util/Map;

    .line 17
    .line 18
    sget-object v2, Lio/sentry/g;->All:Lio/sentry/g;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Date;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    return v2

    .line 36
    :cond_0
    sget-object v1, Lio/sentry/g;->Unknown:Lio/sentry/g;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    return v3

    .line 46
    :cond_1
    iget-object v1, p0, Lio/sentry/transport/y;->c:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/util/Date;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    xor-int/2addr p1, v2

    .line 61
    return p1

    .line 62
    :cond_2
    return v3
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

.method private static synthetic g(Lio/sentry/hints/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lio/sentry/hints/k;->b(Z)V

    return-void
.end method

.method private static synthetic h(ZLio/sentry/hints/f;)V
    .locals 0

    invoke-interface {p1, p0}, Lio/sentry/hints/f;->c(Z)V

    return-void
.end method

.method private static i(Lio/sentry/v;Z)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/transport/w;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/transport/w;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lio/sentry/hints/k;

    .line 7
    .line 8
    invoke-static {p0, v1, v0}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lio/sentry/transport/x;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lio/sentry/transport/x;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    const-class p1, Lio/sentry/hints/f;

    .line 17
    .line 18
    invoke-static {p0, p1, v0}, Lio/sentry/util/h;->n(Lio/sentry/v;Ljava/lang/Class;Lio/sentry/util/h$a;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method private j(Ljava/lang/String;)J
    .locals 4

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    goto :goto_0

    :catch_0
    :cond_0
    const-wide/32 v0, 0xea60

    :goto_0
    return-wide v0
.end method


# virtual methods
.method public d(Lio/sentry/q2;Lio/sentry/v;)Lio/sentry/q2;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lio/sentry/q2;->d()Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object v2, v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lio/sentry/h3;

    .line 22
    .line 23
    invoke-virtual {v3}, Lio/sentry/h3;->w()Lio/sentry/i3;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Lio/sentry/i3;->b()Lio/sentry/m3;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lio/sentry/m3;->getItemType()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-direct {p0, v4}, Lio/sentry/transport/y;->f(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v2, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object v4, p0, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    .line 52
    .line 53
    invoke-virtual {v4}, Lio/sentry/o3;->getClientReportRecorder()Lio/sentry/clientreport/g;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    sget-object v5, Lio/sentry/clientreport/e;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/e;

    .line 58
    .line 59
    invoke-interface {v4, v5, v3}, Lio/sentry/clientreport/g;->d(Lio/sentry/clientreport/e;Lio/sentry/h3;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    if-eqz v2, :cond_6

    .line 64
    .line 65
    iget-object v0, p0, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    .line 66
    .line 67
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v3, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    new-array v4, v4, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const/4 v6, 0x0

    .line 85
    aput-object v5, v4, v6

    .line 86
    .line 87
    const-string v5, "%d items will be dropped due rate limiting."

    .line 88
    .line 89
    invoke-interface {v0, v3, v5, v4}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lio/sentry/q2;->d()Ljava/lang/Iterable;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lio/sentry/h3;

    .line 116
    .line 117
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_3

    .line 122
    .line 123
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    iget-object p1, p0, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    .line 134
    .line 135
    invoke-virtual {p1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget-object v0, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 140
    .line 141
    const-string v2, "Envelope discarded due all items rate limited."

    .line 142
    .line 143
    new-array v3, v6, [Ljava/lang/Object;

    .line 144
    .line 145
    invoke-interface {p1, v0, v2, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p2, v6}, Lio/sentry/transport/y;->i(Lio/sentry/v;Z)V

    .line 149
    .line 150
    .line 151
    return-object v1

    .line 152
    :cond_5
    new-instance p2, Lio/sentry/q2;

    .line 153
    .line 154
    invoke-virtual {p1}, Lio/sentry/q2;->c()Lio/sentry/r2;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {p2, p1, v0}, Lio/sentry/q2;-><init>(Lio/sentry/r2;Ljava/lang/Iterable;)V

    .line 159
    .line 160
    .line 161
    return-object p2

    .line 162
    :cond_6
    return-object p1
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

.method public k(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const-string v2, ","

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    array-length v4, v2

    .line 15
    const/4 v5, 0x0

    .line 16
    move v6, v5

    .line 17
    :goto_0
    if-ge v6, v4, :cond_5

    .line 18
    .line 19
    aget-object v0, v2, v6

    .line 20
    .line 21
    const-string v7, " "

    .line 22
    .line 23
    const-string v8, ""

    .line 24
    .line 25
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v7, ":"

    .line 30
    .line 31
    invoke-virtual {v0, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    array-length v7, v0

    .line 36
    if-lez v7, :cond_3

    .line 37
    .line 38
    aget-object v7, v0, v5

    .line 39
    .line 40
    invoke-direct {v1, v7}, Lio/sentry/transport/y;->j(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    array-length v9, v0

    .line 45
    const/4 v10, 0x1

    .line 46
    if-le v9, v10, :cond_3

    .line 47
    .line 48
    aget-object v0, v0, v10

    .line 49
    .line 50
    new-instance v9, Ljava/util/Date;

    .line 51
    .line 52
    iget-object v11, v1, Lio/sentry/transport/y;->a:Lio/sentry/transport/o;

    .line 53
    .line 54
    invoke-interface {v11}, Lio/sentry/transport/o;->a()J

    .line 55
    .line 56
    .line 57
    move-result-wide v11

    .line 58
    add-long/2addr v11, v7

    .line 59
    invoke-direct {v9, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 60
    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_2

    .line 69
    .line 70
    const-string v7, ";"

    .line 71
    .line 72
    invoke-virtual {v0, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    array-length v8, v7

    .line 77
    move v11, v5

    .line 78
    :goto_1
    if-ge v11, v8, :cond_3

    .line 79
    .line 80
    aget-object v12, v7, v11

    .line 81
    .line 82
    sget-object v13, Lio/sentry/g;->Unknown:Lio/sentry/g;

    .line 83
    .line 84
    :try_start_0
    invoke-static {v12}, Lio/sentry/util/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_0

    .line 89
    .line 90
    invoke-static {v0}, Lio/sentry/g;->valueOf(Ljava/lang/String;)Lio/sentry/g;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v13, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_0
    iget-object v0, v1, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    .line 97
    .line 98
    invoke-virtual {v0}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v14, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 103
    .line 104
    const-string v15, "Couldn\'t capitalize: %s"

    .line 105
    .line 106
    new-array v3, v10, [Ljava/lang/Object;

    .line 107
    .line 108
    aput-object v12, v3, v5

    .line 109
    .line 110
    invoke-interface {v0, v14, v15, v3}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catch_0
    move-exception v0

    .line 115
    iget-object v3, v1, Lio/sentry/transport/y;->b:Lio/sentry/o3;

    .line 116
    .line 117
    invoke-virtual {v3}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    sget-object v14, Lio/sentry/n3;->INFO:Lio/sentry/n3;

    .line 122
    .line 123
    new-array v15, v10, [Ljava/lang/Object;

    .line 124
    .line 125
    aput-object v12, v15, v5

    .line 126
    .line 127
    const-string v12, "Unknown category: %s"

    .line 128
    .line 129
    invoke-interface {v3, v14, v0, v12, v15}, Lio/sentry/g0;->a(Lio/sentry/n3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :goto_2
    sget-object v0, Lio/sentry/g;->Unknown:Lio/sentry/g;

    .line 133
    .line 134
    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_1

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_1
    invoke-direct {v1, v13, v9}, Lio/sentry/transport/y;->c(Lio/sentry/g;Ljava/util/Date;)V

    .line 142
    .line 143
    .line 144
    :goto_3
    add-int/lit8 v11, v11, 0x1

    .line 145
    .line 146
    const/4 v3, -0x1

    .line 147
    goto :goto_1

    .line 148
    :cond_2
    sget-object v0, Lio/sentry/g;->All:Lio/sentry/g;

    .line 149
    .line 150
    invoke-direct {v1, v0, v9}, Lio/sentry/transport/y;->c(Lio/sentry/g;Ljava/util/Date;)V

    .line 151
    .line 152
    .line 153
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    const/4 v3, -0x1

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_4
    const/16 v0, 0x1ad

    .line 159
    .line 160
    move/from16 v2, p3

    .line 161
    .line 162
    if-ne v2, v0, :cond_5

    .line 163
    .line 164
    move-object/from16 v0, p2

    .line 165
    .line 166
    invoke-direct {v1, v0}, Lio/sentry/transport/y;->j(Ljava/lang/String;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v2

    .line 170
    new-instance v0, Ljava/util/Date;

    .line 171
    .line 172
    iget-object v4, v1, Lio/sentry/transport/y;->a:Lio/sentry/transport/o;

    .line 173
    .line 174
    invoke-interface {v4}, Lio/sentry/transport/o;->a()J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    add-long/2addr v4, v2

    .line 179
    invoke-direct {v0, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 180
    .line 181
    .line 182
    sget-object v2, Lio/sentry/g;->All:Lio/sentry/g;

    .line 183
    .line 184
    invoke-direct {v1, v2, v0}, Lio/sentry/transport/y;->c(Lio/sentry/g;Ljava/util/Date;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method
