.class public final Lio/sentry/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/g2;


# instance fields
.field private final a:Lio/sentry/d2;


# direct methods
.method public constructor <init>(Lio/sentry/d2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SendFireAndForgetDirPath is required"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lio/sentry/d2;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/h2;->a:Lio/sentry/d2;

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
.end method


# virtual methods
.method public a(Lio/sentry/f0;Lio/sentry/o3;)Lio/sentry/c2;
    .locals 8

    .line 1
    const-string v0, "Hub is required"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "SentryOptions is required"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/h2;->a:Lio/sentry/d2;

    .line 12
    .line 13
    invoke-interface {v0}, Lio/sentry/d2;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0, v0, v1}, Lio/sentry/h2;->b(Ljava/lang/String;Lio/sentry/g0;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Lio/sentry/r;

    .line 31
    .line 32
    invoke-virtual {p2}, Lio/sentry/o3;->getSerializer()Lio/sentry/l0;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {p2}, Lio/sentry/o3;->getFlushTimeoutMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    move-object v2, v1

    .line 45
    move-object v3, p1

    .line 46
    invoke-direct/range {v2 .. v7}, Lio/sentry/r;-><init>(Lio/sentry/f0;Lio/sentry/l0;Lio/sentry/g0;J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, v1, v0, p1}, Lio/sentry/h2;->c(Lio/sentry/k;Ljava/lang/String;Lio/sentry/g0;)Lio/sentry/c2;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p2, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    new-array v0, v0, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v1, "No cache dir path is defined in options."

    .line 68
    .line 69
    invoke-interface {p1, p2, v1, v0}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    return-object p1
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

.method public synthetic b(Ljava/lang/String;Lio/sentry/g0;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/sentry/f2;->a(Lio/sentry/g2;Ljava/lang/String;Lio/sentry/g0;)Z

    move-result p1

    return p1
.end method

.method public synthetic c(Lio/sentry/k;Ljava/lang/String;Lio/sentry/g0;)Lio/sentry/c2;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/sentry/f2;->b(Lio/sentry/g2;Lio/sentry/k;Ljava/lang/String;Lio/sentry/g0;)Lio/sentry/c2;

    move-result-object p1

    return-object p1
.end method
