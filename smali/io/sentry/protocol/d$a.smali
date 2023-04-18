.class public final Lio/sentry/protocol/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/x0;Lio/sentry/g0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/d$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/d;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/protocol/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/protocol/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 15
    .line 16
    if-ne v2, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    const-string v3, "images"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    const-string v3, "sdk_info"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    new-instance v1, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1, p2, v1, v2}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v2, Lio/sentry/protocol/m$a;

    .line 53
    .line 54
    invoke-direct {v2}, Lio/sentry/protocol/m$a;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lio/sentry/protocol/m;

    .line 62
    .line 63
    invoke-static {v0, v2}, Lio/sentry/protocol/d;->a(Lio/sentry/protocol/d;Lio/sentry/protocol/m;)Lio/sentry/protocol/m;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance v2, Lio/sentry/protocol/DebugImage$a;

    .line 68
    .line 69
    invoke-direct {v2}, Lio/sentry/protocol/DebugImage$a;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v0, v2}, Lio/sentry/protocol/d;->b(Lio/sentry/protocol/d;Ljava/util/List;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lio/sentry/protocol/d;->e(Ljava/util/Map;)V

    .line 84
    .line 85
    .line 86
    return-object v0
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
