.class public final Lnet/time4j/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/o;
.implements Lfj/o0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/o;",
        "Lfj/o0;"
    }
.end annotation


# instance fields
.field private final k:Lfj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/l<",
            "*>;"
        }
    .end annotation
.end field

.field private final l:Lfj/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/m<",
            "**>;"
        }
    .end annotation
.end field

.field private final m:Lnet/time4j/g0;


# direct methods
.method private constructor <init>(Lfj/l;Lfj/m;Lnet/time4j/g0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/l<",
            "*>;",
            "Lfj/m<",
            "**>;",
            "Lnet/time4j/g0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Lnet/time4j/g0;->q()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iput-object p3, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lfj/h;->c(J)Lfj/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2, p1}, Lfj/m;->U(Lfj/h;)Lfj/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0, v1}, Lfj/h;->c(J)Lfj/h;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Lfj/l;->J(Lfj/h;)Lfj/l;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 39
    .line 40
    iput-object p3, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 41
    .line 42
    :goto_0
    invoke-static {}, Lnet/time4j/g0;->I0()Lnet/time4j/g0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iput-object p1, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 50
    .line 51
    iput-object p2, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 52
    .line 53
    iput-object p3, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 54
    .line 55
    :goto_1
    return-void
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

.method public static b(Lfj/l;Lnet/time4j/g0;)Lnet/time4j/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Lfj/l<",
            "TC;>;>(TC;",
            "Lnet/time4j/g0;",
            ")",
            "Lnet/time4j/r<",
            "TC;>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/time4j/r;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1, p1}, Lnet/time4j/r;-><init>(Lfj/l;Lfj/m;Lnet/time4j/g0;)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 11
    .line 12
    const-string p1, "Missing date component."

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
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

.method public static d(Lfj/m;Lnet/time4j/g0;)Lnet/time4j/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Lfj/m<",
            "*TC;>;>(TC;",
            "Lnet/time4j/g0;",
            ")",
            "Lnet/time4j/r<",
            "TC;>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/time4j/r;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1, p0, p1}, Lnet/time4j/r;-><init>(Lfj/l;Lfj/m;Lnet/time4j/g0;)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 11
    .line 12
    const-string p1, "Missing date component."

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
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

.method private g()Lfj/o;
    .locals 1

    iget-object v0, p0, Lnet/time4j/r;->k:Lfj/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/time4j/r;->l:Lfj/m;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/tz/l;Lfj/f0;)Lnet/time4j/a0;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 2
    .line 3
    const-class v1, Lnet/time4j/f0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lfj/m;->W(Ljava/lang/Class;)Lfj/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lnet/time4j/f0;

    .line 14
    .line 15
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lnet/time4j/f0;->s0(Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0, v1}, Lfj/l;->K(Ljava/lang/Class;)Lfj/m;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lnet/time4j/f0;

    .line 27
    .line 28
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lnet/time4j/f0;->s0(Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-virtual {v0}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lnet/time4j/tz/l;->z()Lnet/time4j/tz/k;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2, v1, v2}, Lfj/f0;->b(Lfj/g;Lnet/time4j/tz/k;)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 47
    .line 48
    sget-object v2, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr v1, p2

    .line 61
    const p2, 0x15180

    .line 62
    .line 63
    .line 64
    const-wide/16 v2, 0x1

    .line 65
    .line 66
    if-lt v1, p2, :cond_1

    .line 67
    .line 68
    sget-object p2, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3, p2}, Lfj/k0;->J(JLjava/lang/Object;)Lfj/k0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    move-object v0, p2

    .line 75
    check-cast v0, Lnet/time4j/h0;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    if-gez v1, :cond_2

    .line 79
    .line 80
    sget-object p2, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 81
    .line 82
    invoke-virtual {v0, v2, v3, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    move-object v0, p2

    .line 87
    check-cast v0, Lnet/time4j/h0;

    .line 88
    .line 89
    :cond_2
    :goto_1
    invoke-virtual {v0, p1}, Lnet/time4j/h0;->b0(Lnet/time4j/tz/l;)Lnet/time4j/a0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
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

.method public c(Lfj/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/time4j/r;->g()Lfj/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/o;->c(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    invoke-virtual {v0, p1}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/r;->k:Lfj/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/time4j/r;->l:Lfj/m;

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/r;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    const-class v1, Lnet/time4j/r;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lnet/time4j/r;

    .line 17
    .line 18
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 19
    .line 20
    iget-object v3, p1, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lnet/time4j/g0;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    iget-object v1, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    iget-object v1, p1, Lnet/time4j/r;->k:Lfj/l;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 38
    .line 39
    iget-object p1, p1, Lnet/time4j/r;->l:Lfj/m;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lfj/m;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v0, v2

    .line 49
    :goto_0
    return v0

    .line 50
    :cond_3
    iget-object v3, p1, Lnet/time4j/r;->l:Lfj/m;

    .line 51
    .line 52
    if-nez v3, :cond_4

    .line 53
    .line 54
    iget-object p1, p1, Lnet/time4j/r;->k:Lfj/l;

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lfj/l;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move v0, v2

    .line 64
    :goto_1
    return v0

    .line 65
    :cond_5
    return v2
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

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 6
    .line 7
    invoke-virtual {v0}, Lfj/m;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lfj/l;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lnet/time4j/g0;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v0, v1

    .line 23
    return v0
    .line 24
.end method

.method public k(Lfj/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/time4j/r;->g()Lfj/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    invoke-virtual {v0, p1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public m(Lfj/p;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/time4j/r;->g()Lfj/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/o;->m(Lfj/p;)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    invoke-virtual {v0, p1}, Lfj/q;->m(Lfj/p;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public o(Lfj/p;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/time4j/r;->g()Lfj/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/o;->o(Lfj/p;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    invoke-virtual {v0, p1}, Lfj/q;->o(Lfj/p;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public r()Lnet/time4j/tz/k;
    .locals 3

    new-instance v0, Lfj/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Timezone not available: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lfj/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t(Lfj/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/time4j/r;->g()Lfj/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lfj/o;->t(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    invoke-virtual {v0, p1}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/time4j/r;->k:Lfj/l;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lnet/time4j/r;->l:Lfj/m;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, p0, Lnet/time4j/r;->m:Lnet/time4j/g0;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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
.end method
