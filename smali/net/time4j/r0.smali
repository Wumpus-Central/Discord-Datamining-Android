.class final Lnet/time4j/r0;
.super Lnet/time4j/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/o<",
        "Lnet/time4j/g0;",
        ">;"
    }
.end annotation


# instance fields
.field private final m:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lfj/p;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/r0;-><init>(Lfj/p;ILjava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Lfj/p;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/time4j/o;-><init>(Lfj/p;I)V

    packed-switch p2, :pswitch_data_0

    .line 3
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lnet/time4j/o;->a()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 4
    :pswitch_0
    invoke-static {p1, p3}, Lnet/time4j/r0;->d(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    const/4 p2, 0x1

    .line 5
    invoke-static {p1, p2}, Lnet/time4j/r0;->c(Lfj/p;Z)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    :pswitch_2
    const/4 p2, 0x0

    .line 6
    invoke-static {p1, p2}, Lnet/time4j/r0;->c(Lfj/p;Z)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    .line 7
    :pswitch_3
    invoke-static {p1}, Lfj/g0;->h(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    .line 8
    :pswitch_4
    invoke-static {p1}, Lfj/g0;->f(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    .line 9
    :pswitch_5
    invoke-static {p1}, Lfj/g0;->j(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    .line 10
    :pswitch_6
    invoke-static {p1}, Lfj/g0;->l(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    goto :goto_0

    .line 11
    :pswitch_7
    invoke-static {p1, p3}, Lnet/time4j/r0;->e(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static c(Lfj/p;Z)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "TV;>;Z)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/p;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "MILLI_OF_SECOND"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_6

    .line 12
    .line 13
    const-string v1, "MILLI_OF_DAY"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    const-string v1, "MICRO_OF_SECOND"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_5

    .line 29
    .line 30
    const-string v1, "MICRO_OF_DAY"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v1, "NANO_OF_SECOND"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    const-string v1, "NANO_OF_DAY"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    if-eqz p1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, Lfj/g0;->c(Lfj/p;)Lfj/v;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_3
    invoke-static {p0}, Lfj/g0;->d(Lfj/p;)Lfj/v;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_4
    :goto_0
    new-instance p0, Lnet/time4j/q;

    .line 69
    .line 70
    const/16 v0, 0x39

    .line 71
    .line 72
    invoke-direct {p0, v0, p1}, Lnet/time4j/q;-><init>(CZ)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_5
    :goto_1
    new-instance p0, Lnet/time4j/q;

    .line 77
    .line 78
    const/16 v0, 0x36

    .line 79
    .line 80
    invoke-direct {p0, v0, p1}, Lnet/time4j/q;-><init>(CZ)V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_6
    :goto_2
    new-instance p0, Lnet/time4j/q;

    .line 85
    .line 86
    const/16 v0, 0x33

    .line 87
    .line 88
    invoke-direct {p0, v0, p1}, Lnet/time4j/q;-><init>(CZ)V

    .line 89
    .line 90
    .line 91
    return-object p0
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

.method private static d(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/p;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lfj/g0;->o(Ljava/lang/Object;Lfj/p;)Lfj/v;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1}, Lnet/time4j/t0;->a(Lfj/v;Ljava/lang/Object;)Lnet/time4j/t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method private static e(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/p;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lfj/g0;->n(Ljava/lang/Object;Lfj/p;)Lfj/v;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1}, Lnet/time4j/t0;->a(Lfj/v;Ljava/lang/Object;)Lnet/time4j/t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/r0;->b(Lnet/time4j/g0;)Lnet/time4j/g0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/g0;)Lnet/time4j/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/r0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj/v;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lfj/v;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lnet/time4j/g0;

    .line 10
    .line 11
    return-object p1
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
    .line 25
    .line 26
    .line 27
.end method
