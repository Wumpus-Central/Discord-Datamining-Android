.class public final Lio/sentry/protocol/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/l;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/l$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/l;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/protocol/l;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/sentry/protocol/l;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :cond_0
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
    if-ne v2, v3, :cond_6

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
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x1

    .line 30
    sparse-switch v3, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :sswitch_0
    const-string v3, "body_size"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v4, 0x3

    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    const-string v3, "cookies"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 v4, 0x2

    .line 55
    goto :goto_1

    .line 56
    :sswitch_2
    const-string v3, "headers"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 v4, 0x1

    .line 66
    goto :goto_1

    .line 67
    :sswitch_3
    const-string v3, "status_code"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    const/4 v4, 0x0

    .line 77
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 83
    .line 84
    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p1, p2, v1, v2}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v0, v2}, Lio/sentry/protocol/l;->d(Lio/sentry/protocol/l;Ljava/lang/Long;)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_1
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v0, v2}, Lio/sentry/protocol/l;->a(Lio/sentry/protocol/l;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/util/Map;

    .line 112
    .line 113
    if-eqz v2, :cond_0

    .line 114
    .line 115
    invoke-static {v2}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v0, v2}, Lio/sentry/protocol/l;->b(Lio/sentry/protocol/l;Ljava/util/Map;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/x0;->T0()Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-static {v0, v2}, Lio/sentry/protocol/l;->c(Lio/sentry/protocol/l;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_6
    invoke-virtual {v0, v1}, Lio/sentry/protocol/l;->e(Ljava/util/Map;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    nop

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x352641e6 -> :sswitch_3
        0x2f676f86 -> :sswitch_2
        0x38c1428f -> :sswitch_1
        0x4aaf147e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
