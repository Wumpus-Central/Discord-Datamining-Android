.class public final Lio/sentry/r2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/r2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/r2;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/r2$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/r2;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/r2;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move-object v1, v0

    .line 6
    move-object v2, v1

    .line 7
    move-object v3, v2

    .line 8
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 13
    .line 14
    if-ne v4, v5, :cond_4

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, -0x1

    .line 28
    sparse-switch v5, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :sswitch_0
    const-string v5, "event_id"

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v6, 0x2

    .line 42
    goto :goto_1

    .line 43
    :sswitch_1
    const-string v5, "trace"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v6, 0x1

    .line 53
    goto :goto_1

    .line 54
    :sswitch_2
    const-string v5, "sdk"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v6, 0x0

    .line 64
    :goto_1
    packed-switch v6, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    new-instance v3, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {p1, p2, v3, v4}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_0
    new-instance v0, Lio/sentry/protocol/p$a;

    .line 79
    .line 80
    invoke-direct {v0}, Lio/sentry/protocol/p$a;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2, v0}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lio/sentry/protocol/p;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_1
    new-instance v2, Lio/sentry/k4$b;

    .line 91
    .line 92
    invoke-direct {v2}, Lio/sentry/k4$b;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lio/sentry/k4;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_2
    new-instance v1, Lio/sentry/protocol/n$a;

    .line 103
    .line 104
    invoke-direct {v1}, Lio/sentry/protocol/n$a;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2, v1}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lio/sentry/protocol/n;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    new-instance p2, Lio/sentry/r2;

    .line 115
    .line 116
    invoke-direct {p2, v0, v1, v2}, Lio/sentry/r2;-><init>(Lio/sentry/protocol/p;Lio/sentry/protocol/n;Lio/sentry/k4;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v3}, Lio/sentry/r2;->d(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 123
    .line 124
    .line 125
    return-object p2

    .line 126
    nop

    .line 127
    :sswitch_data_0
    .sparse-switch
        0x1bc3a -> :sswitch_2
        0x697f145 -> :sswitch_1
        0x1093c0e0 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
