.class public final Lio/sentry/protocol/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/o;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/o$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/o;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/o;
    .locals 5

    .line 1
    new-instance v0, Lio/sentry/protocol/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/protocol/o;-><init>()V

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
    if-ne v2, v3, :cond_7

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
    const-string v3, "stacktrace"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    const/4 v4, 0x5

    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    const-string v3, "mechanism"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v4, 0x4

    .line 55
    goto :goto_1

    .line 56
    :sswitch_2
    const-string v3, "value"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v4, 0x3

    .line 66
    goto :goto_1

    .line 67
    :sswitch_3
    const-string v3, "type"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 v4, 0x2

    .line 77
    goto :goto_1

    .line 78
    :sswitch_4
    const-string v3, "module"

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/4 v4, 0x1

    .line 88
    goto :goto_1

    .line 89
    :sswitch_5
    const-string v3, "thread_id"

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    const/4 v4, 0x0

    .line 99
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    new-instance v1, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {p1, p2, v1, v2}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_0
    new-instance v2, Lio/sentry/protocol/u$a;

    .line 114
    .line 115
    invoke-direct {v2}, Lio/sentry/protocol/u$a;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lio/sentry/protocol/u;

    .line 123
    .line 124
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->e(Lio/sentry/protocol/o;Lio/sentry/protocol/u;)Lio/sentry/protocol/u;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_1
    new-instance v2, Lio/sentry/protocol/h$a;

    .line 129
    .line 130
    invoke-direct {v2}, Lio/sentry/protocol/h$a;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2, v2}, Lio/sentry/x0;->Y0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lio/sentry/protocol/h;

    .line 138
    .line 139
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->f(Lio/sentry/protocol/o;Lio/sentry/protocol/h;)Lio/sentry/protocol/h;

    .line 140
    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->b(Lio/sentry/protocol/o;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->a(Lio/sentry/protocol/o;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :pswitch_4
    invoke-virtual {p1}, Lio/sentry/x0;->Z0()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->c(Lio/sentry/protocol/o;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_5
    invoke-virtual {p1}, Lio/sentry/x0;->V0()Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v0, v2}, Lio/sentry/protocol/o;->d(Lio/sentry/protocol/o;Ljava/lang/Long;)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_7
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Lio/sentry/protocol/o;->o(Ljava/util/Map;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :sswitch_data_0
    .sparse-switch
        -0x5d1dd090 -> :sswitch_5
        -0x3fb45994 -> :sswitch_4
        0x368f3a -> :sswitch_3
        0x6ac9171 -> :sswitch_2
        0x49056359 -> :sswitch_1
        0x7a8983bd -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
