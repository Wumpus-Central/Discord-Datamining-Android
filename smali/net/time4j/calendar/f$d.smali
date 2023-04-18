.class Lnet/time4j/calendar/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lnet/time4j/calendar/f<",
        "*TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/c0<",
        "TD;>;"
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

.field private final l:I


# direct methods
.method private constructor <init>(ILfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lfj/p<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 4
    iput-object p2, p0, Lnet/time4j/calendar/f$d;->k:Lfj/p;

    return-void
.end method

.method synthetic constructor <init>(ILfj/p;Lnet/time4j/calendar/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/f$d;-><init>(ILfj/p;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->b(Lnet/time4j/calendar/f;)Lfj/p;

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

    iget-object p1, p0, Lnet/time4j/calendar/f$d;->k:Lfj/p;

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->d(Lnet/time4j/calendar/f;)Lfj/p;

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

    iget-object p1, p0, Lnet/time4j/calendar/f$d;->k:Lfj/p;

    return-object p1
.end method

.method public e(Lnet/time4j/calendar/f;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)I"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_5

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "Unknown element index: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lnet/time4j/calendar/h;->getNumber()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->e0()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    if-lt v1, v0, :cond_3

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lnet/time4j/calendar/h;->c()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    :cond_4
    return v0

    .line 73
    :cond_5
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->c0()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :cond_6
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public f(Lnet/time4j/calendar/f;)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lfj/k;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-interface {p1, v0, v1}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lnet/time4j/calendar/f;

    .line 27
    .line 28
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "Unknown element index: "

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->isLeapYear()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    const/16 p1, 0xd

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/16 p1, 0xc

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfYear()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public g(Lnet/time4j/calendar/f;)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lfj/k;->d()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-interface {p1, v0, v1}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lnet/time4j/calendar/f;

    .line 19
    .line 20
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x1

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public h(Lnet/time4j/calendar/f;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->e(Lnet/time4j/calendar/f;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public i(Lnet/time4j/calendar/f;I)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;I)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ge p2, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget v2, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 7
    .line 8
    if-nez v2, :cond_4

    .line 9
    .line 10
    const/16 v2, 0x1e

    .line 11
    .line 12
    if-le p2, v2, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    if-ne p2, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ne p1, v2, :cond_2

    .line 22
    .line 23
    move v0, v1

    .line 24
    :cond_2
    return v0

    .line 25
    :cond_3
    return v1

    .line 26
    :cond_4
    if-ne v2, v1, :cond_6

    .line 27
    .line 28
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfYear()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-gt p2, p1, :cond_5

    .line 33
    .line 34
    move v0, v1

    .line 35
    :cond_5
    return v0

    .line 36
    :cond_6
    const/4 v3, 0x2

    .line 37
    if-ne v2, v3, :cond_9

    .line 38
    .line 39
    const/16 v2, 0xc

    .line 40
    .line 41
    if-le p2, v2, :cond_7

    .line 42
    .line 43
    const/16 v2, 0xd

    .line 44
    .line 45
    if-ne p2, v2, :cond_8

    .line 46
    .line 47
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->e0()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lez p1, :cond_8

    .line 52
    .line 53
    :cond_7
    move v0, v1

    .line 54
    :cond_8
    return v0

    .line 55
    :cond_9
    const/4 v3, 0x3

    .line 56
    if-ne v2, v3, :cond_b

    .line 57
    .line 58
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lfj/k;->d()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-interface {p1, v2, v3}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lnet/time4j/calendar/f;

    .line 71
    .line 72
    invoke-virtual {v2}, Lnet/time4j/calendar/f;->Z()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-interface {p1}, Lfj/k;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    invoke-interface {p1, v3, v4}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lnet/time4j/calendar/f;

    .line 85
    .line 86
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-lt p2, v2, :cond_a

    .line 91
    .line 92
    if-gt p2, p1, :cond_a

    .line 93
    .line 94
    move v0, v1

    .line 95
    :cond_a
    return v0

    .line 96
    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 97
    .line 98
    new-instance p2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v0, "Unknown element index: "

    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v0, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->f(Lnet/time4j/calendar/f;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;IZ)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$d;->r(Lnet/time4j/calendar/f;IZ)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->e(Lnet/time4j/calendar/f;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$d;->n(Lnet/time4j/calendar/f;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lnet/time4j/calendar/f;Ljava/lang/Integer;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Integer;",
            ")Z"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$d;->i(Lnet/time4j/calendar/f;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$d;->s(Lnet/time4j/calendar/f;Ljava/lang/Integer;Z)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->g(Lnet/time4j/calendar/f;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$d;->h(Lnet/time4j/calendar/f;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lnet/time4j/calendar/f;IZ)Lnet/time4j/calendar/f;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;IZ)TD;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_a

    .line 5
    .line 6
    if-eq v0, v1, :cond_7

    .line 7
    .line 8
    const/4 p3, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, p3, :cond_2

    .line 11
    .line 12
    const/4 p3, 0x3

    .line 13
    if-ne v0, p3, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$d;->i(Lnet/time4j/calendar/f;I)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p2, p3

    .line 26
    invoke-static {v2}, Lnet/time4j/calendar/f;->i0(I)Lfj/m0;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    int-to-long v0, p2

    .line 31
    invoke-interface {p3, p1, v0, v1}, Lfj/m0;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lnet/time4j/calendar/f;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    new-instance p3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v0, "Sexagesimal cycle out of range: "

    .line 46
    .line 47
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 62
    .line 63
    new-instance p2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string p3, "Unknown element index: "

    .line 69
    .line 70
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget p3, p0, Lnet/time4j/calendar/f$d;->l:I

    .line 74
    .line 75
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$d;->i(Lnet/time4j/calendar/f;I)Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-eqz p3, :cond_6

    .line 91
    .line 92
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->e0()I

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    if-lez p3, :cond_4

    .line 97
    .line 98
    if-ge p3, p2, :cond_4

    .line 99
    .line 100
    add-int/2addr p3, v1

    .line 101
    if-ne p2, p3, :cond_3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    move v1, v2

    .line 105
    :goto_0
    add-int/lit8 p2, p2, -0x1

    .line 106
    .line 107
    move v2, v1

    .line 108
    :cond_4
    invoke-static {p2}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    invoke-virtual {p2}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    :cond_5
    invoke-static {p1, p2}, Lnet/time4j/calendar/f$e;->i(Lnet/time4j/calendar/f;Lnet/time4j/calendar/h;)Lnet/time4j/calendar/f;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    new-instance p3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v0, "Ordinal month out of range: "

    .line 131
    .line 132
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_7
    if-nez p3, :cond_9

    .line 147
    .line 148
    if-lt p2, v1, :cond_8

    .line 149
    .line 150
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfYear()I

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    if-gt p2, p3, :cond_8

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    new-instance p3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v0, "Day of year out of range: "

    .line 165
    .line 166
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_9
    :goto_1
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->b()J

    .line 181
    .line 182
    .line 183
    move-result-wide v0

    .line 184
    int-to-long p2, p2

    .line 185
    add-long/2addr v0, p2

    .line 186
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->c0()I

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    int-to-long p2, p2

    .line 191
    sub-long/2addr v0, p2

    .line 192
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1, v0, v1}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    return-object p1

    .line 201
    :cond_a
    if-eqz p3, :cond_b

    .line 202
    .line 203
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->b()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    int-to-long p2, p2

    .line 208
    add-long/2addr v0, p2

    .line 209
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    int-to-long p2, p2

    .line 214
    sub-long/2addr v0, p2

    .line 215
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1, v0, v1}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    return-object p1

    .line 224
    :cond_b
    if-lt p2, v1, :cond_d

    .line 225
    .line 226
    const/16 p3, 0x1e

    .line 227
    .line 228
    if-gt p2, p3, :cond_d

    .line 229
    .line 230
    if-ne p2, p3, :cond_c

    .line 231
    .line 232
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-lt v0, p3, :cond_d

    .line 237
    .line 238
    :cond_c
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->b()J

    .line 239
    .line 240
    .line 241
    move-result-wide v0

    .line 242
    int-to-long v2, p2

    .line 243
    add-long/2addr v0, v2

    .line 244
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    int-to-long v2, p3

    .line 249
    sub-long v9, v0, v2

    .line 250
    .line 251
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 260
    .line 261
    .line 262
    move-result-object p3

    .line 263
    invoke-virtual {p3}, Lnet/time4j/calendar/o;->getNumber()I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    move v8, p2

    .line 272
    invoke-virtual/range {v4 .. v10}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    return-object p1

    .line 277
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 278
    .line 279
    new-instance p3, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v0, "Day of month out of range: "

    .line 285
    .line 286
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p1
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

.method public s(Lnet/time4j/calendar/f;Ljava/lang/Integer;Z)Lnet/time4j/calendar/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Integer;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$d;->r(Lnet/time4j/calendar/f;IZ)Lnet/time4j/calendar/f;

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
    const-string p2, "Missing element value."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
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
