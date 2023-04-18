.class public final Lio/sentry/protocol/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/protocol/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/r0<",
        "Lio/sentry/protocol/n;",
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

    invoke-virtual {p0, p1, p2}, Lio/sentry/protocol/n$a;->b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/n;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/x0;Lio/sentry/g0;)Lio/sentry/protocol/n;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->f()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move-object v3, v2

    .line 16
    move-object v4, v3

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->z0()Lio/sentry/vendor/gson/stream/b;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 22
    .line 23
    if-ne v5, v6, :cond_6

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->g0()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, -0x1

    .line 37
    sparse-switch v6, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :sswitch_0
    const-string v6, "integrations"

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v7, 0x3

    .line 51
    goto :goto_1

    .line 52
    :sswitch_1
    const-string v6, "packages"

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v7, 0x2

    .line 62
    goto :goto_1

    .line 63
    :sswitch_2
    const-string v6, "version"

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 v7, 0x1

    .line 73
    goto :goto_1

    .line 74
    :sswitch_3
    const-string v6, "name"

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const/4 v7, 0x0

    .line 84
    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    new-instance v4, Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-virtual {p1, p2, v4, v5}, Lio/sentry/x0;->b1(Lio/sentry/g0;Ljava/util/Map;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_0
    invoke-virtual {p1}, Lio/sentry/x0;->X0()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Ljava/util/List;

    .line 103
    .line 104
    if-eqz v5, :cond_0

    .line 105
    .line 106
    invoke-interface {v1, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_1
    new-instance v5, Lio/sentry/protocol/q$a;

    .line 111
    .line 112
    invoke-direct {v5}, Lio/sentry/protocol/q$a;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2, v5}, Lio/sentry/x0;->U0(Lio/sentry/g0;Lio/sentry/r0;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_0

    .line 120
    .line 121
    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :pswitch_2
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_0

    .line 130
    :pswitch_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->t0()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto :goto_0

    .line 135
    :cond_6
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->s()V

    .line 136
    .line 137
    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    new-instance p1, Lio/sentry/protocol/n;

    .line 143
    .line 144
    invoke-direct {p1, v2, v3}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v0}, Lio/sentry/protocol/n;->a(Lio/sentry/protocol/n;Ljava/util/List;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v1}, Lio/sentry/protocol/n;->b(Lio/sentry/protocol/n;Ljava/util/List;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v4}, Lio/sentry/protocol/n;->j(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v0, "Missing required field \"version\""

    .line 160
    .line 161
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 165
    .line 166
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    const-string v0, "Missing required field \"name\""

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object v1, Lio/sentry/n3;->ERROR:Lio/sentry/n3;

    .line 178
    .line 179
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/g0;->b(Lio/sentry/n3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :sswitch_data_0
    .sparse-switch
        0x337a8b -> :sswitch_3
        0x14f51cd8 -> :sswitch_2
        0x2cc154ed -> :sswitch_1
        0x58a2451f -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
