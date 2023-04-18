.class Lnet/time4j/calendar/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lnet/time4j/calendar/f<",
        "*TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TD;",
        "Lnet/time4j/calendar/h;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/calendar/f$e;->k:Lfj/p;

    return-void
.end method

.method synthetic constructor <init>(Lfj/p;Lnet/time4j/calendar/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/f$e;-><init>(Lfj/p;)V

    return-void
.end method

.method static i(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Lnet/time4j/calendar/f;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lnet/time4j/calendar/f<",
            "*TD;>;>(TD;",
            "Lnet/time4j/calendar/h;",
            ")TD;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->p()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lnet/time4j/calendar/o;->getNumber()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v1, 0x1d

    .line 18
    .line 19
    if-gt v4, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Z()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1, v2, p1, v4}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Z()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    move-object v3, p1

    .line 34
    invoke-virtual/range {v0 .. v6}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Z()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-virtual {v0, v1, v2, p1, v3}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    invoke-virtual {v0, v5, v6}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {p0}, Lnet/time4j/calendar/f;->Z()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    int-to-long v7, v4

    .line 65
    add-long/2addr v5, v7

    .line 66
    const-wide/16 v7, 0x1

    .line 67
    .line 68
    sub-long/2addr v5, v7

    .line 69
    move-object v3, p1

    .line 70
    invoke-virtual/range {v0 .. v6}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$e;->b(Lnet/time4j/calendar/f;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/calendar/f;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    iget-object p1, p0, Lnet/time4j/calendar/f$e;->k:Lfj/p;

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$e;->d(Lnet/time4j/calendar/f;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/calendar/f;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    iget-object p1, p0, Lnet/time4j/calendar/f$e;->k:Lfj/p;

    return-object p1
.end method

.method public e(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/h;"
        }
    .end annotation

    const/16 p1, 0xc

    invoke-static {p1}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public f(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/h;"
        }
    .end annotation

    const/4 p1, 0x1

    invoke-static {p1}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public g(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/h;"
        }
    .end annotation

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/calendar/h;",
            ")Z"
        }
    .end annotation

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lnet/time4j/calendar/h;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lnet/time4j/calendar/h;->getNumber()I

    move-result p2

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->e0()I

    move-result p1

    if-ne p2, p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$e;->e(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Lnet/time4j/calendar/h;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$e;->h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Z

    move-result p1

    return p1
.end method

.method public n(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;Z)Lnet/time4j/calendar/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/calendar/h;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$e;->h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lnet/time4j/calendar/f$e;->i(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Lnet/time4j/calendar/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance p3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v0, "Invalid month: "

    .line 20
    .line 21
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
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

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Lnet/time4j/calendar/h;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$e;->n(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;Z)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$e;->f(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$e;->g(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/h;

    move-result-object p1

    return-object p1
.end method
