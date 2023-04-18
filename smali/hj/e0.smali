.class final Lhj/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhj/h<",
        "Lnet/time4j/tz/k;",
        ">;"
    }
.end annotation


# static fields
.field static final p:Lhj/e0;


# instance fields
.field private final k:Lgj/e;

.field private final l:Z

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Z

.field private final o:Lgj/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj/e0;

    invoke-direct {v0}, Lhj/e0;-><init>()V

    sput-object v0, Lhj/e0;->p:Lhj/e0;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    sget-object v0, Lgj/e;->m:Lgj/e;

    iput-object v0, p0, Lhj/e0;->k:Lgj/e;

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lhj/e0;->l:Z

    .line 17
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lhj/e0;->m:Ljava/util/List;

    .line 18
    iput-boolean v0, p0, Lhj/e0;->n:Z

    .line 19
    sget-object v0, Lgj/g;->l:Lgj/g;

    iput-object v0, p0, Lhj/e0;->o:Lgj/g;

    return-void
.end method

.method constructor <init>(Lgj/e;ZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/e;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    .line 2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Zero offset must not be white-space-only."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    iput-object p1, p0, Lhj/e0;->k:Lgj/e;

    .line 8
    iput-boolean p2, p0, Lhj/e0;->l:Z

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lhj/e0;->m:Ljava/util/List;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lhj/e0;->n:Z

    .line 11
    sget-object p1, Lgj/g;->l:Lgj/g;

    iput-object p1, p0, Lhj/e0;->o:Lgj/g;

    return-void

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing zero offsets."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing display mode."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lgj/e;ZLjava/util/List;ZLgj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/e;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lgj/g;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lhj/e0;->k:Lgj/e;

    .line 22
    iput-boolean p2, p0, Lhj/e0;->l:Z

    .line 23
    iput-object p3, p0, Lhj/e0;->m:Ljava/util/List;

    .line 24
    iput-boolean p4, p0, Lhj/e0;->n:Z

    .line 25
    iput-object p5, p0, Lhj/e0;->o:Lgj/g;

    return-void
.end method

.method private static a(Lfj/o;Lfj/d;)Lnet/time4j/tz/p;
    .locals 3

    .line 1
    sget-object v0, Lgj/a;->d:Lfj/c;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lfj/d;->b(Lfj/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/time4j/tz/k;

    .line 14
    .line 15
    instance-of v0, p1, Lnet/time4j/tz/p;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lnet/time4j/tz/p;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Use a timezone offset instead of ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, "] when formatting ["

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, "]."

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v1, "Cannot extract timezone offset from format attributes for: "

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
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

.method private static b(Ljava/lang/CharSequence;ILgj/g;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, 0x2

    .line 5
    if-ge v1, v3, :cond_4

    .line 6
    .line 7
    add-int v3, p1, v1

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-lt v3, v4, :cond_0

    .line 14
    .line 15
    move v3, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_1
    const/16 v4, 0x30

    .line 22
    .line 23
    if-lt v3, v4, :cond_1

    .line 24
    .line 25
    const/16 v4, 0x39

    .line 26
    .line 27
    if-gt v3, v4, :cond_1

    .line 28
    .line 29
    mul-int/lit8 v2, v2, 0xa

    .line 30
    .line 31
    add-int/lit8 v3, v3, -0x30

    .line 32
    .line 33
    add-int/2addr v2, v3

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p2}, Lgj/g;->c()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    not-int p0, v2

    .line 47
    return p0

    .line 48
    :cond_3
    :goto_2
    const/16 p0, -0x3e8

    .line 49
    .line 50
    return p0

    .line 51
    :cond_4
    return v2
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


# virtual methods
.method public c()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    sget-object v0, Lhj/b0;->l:Lhj/b0;

    return-object v0
.end method

.method public e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;Z)I"
        }
    .end annotation

    .line 1
    instance-of p5, p2, Ljava/lang/CharSequence;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p5, p2

    .line 7
    check-cast p5, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result p5

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p5, v0

    .line 15
    :goto_0
    invoke-interface {p1}, Lfj/o;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lfj/o;->r()Lnet/time4j/tz/k;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_1
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-static {p1, p3}, Lhj/e0;->a(Lfj/o;Lfj/d;)Lnet/time4j/tz/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    instance-of p3, v1, Lnet/time4j/tz/p;

    .line 35
    .line 36
    if-eqz p3, :cond_3

    .line 37
    .line 38
    move-object p1, v1

    .line 39
    check-cast p1, Lnet/time4j/tz/p;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    instance-of p3, p1, Lnet/time4j/base/f;

    .line 43
    .line 44
    if-eqz p3, :cond_13

    .line 45
    .line 46
    invoke-static {v1}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    check-cast p1, Lnet/time4j/base/f;

    .line 51
    .line 52
    invoke-virtual {p3, p1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_2
    invoke-virtual {p1}, Lnet/time4j/tz/p;->l()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-virtual {p1}, Lnet/time4j/tz/p;->k()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    or-int v1, p3, p1

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    iget-object p1, p0, Lhj/e0;->m:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_4
    const/4 v1, 0x1

    .line 87
    if-ltz p3, :cond_6

    .line 88
    .line 89
    if-gez p1, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    move v3, v2

    .line 93
    goto :goto_4

    .line 94
    :cond_6
    :goto_3
    move v3, v1

    .line 95
    :goto_4
    if-eqz v3, :cond_7

    .line 96
    .line 97
    const/16 v3, 0x2d

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    const/16 v3, 0x2b

    .line 101
    .line 102
    :goto_5
    invoke-interface {p2, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 103
    .line 104
    .line 105
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    div-int/lit16 v3, p3, 0xe10

    .line 110
    .line 111
    div-int/lit8 v4, p3, 0x3c

    .line 112
    .line 113
    rem-int/lit8 v4, v4, 0x3c

    .line 114
    .line 115
    rem-int/lit8 p3, p3, 0x3c

    .line 116
    .line 117
    const/16 v5, 0xa

    .line 118
    .line 119
    const/16 v6, 0x30

    .line 120
    .line 121
    if-ge v3, v5, :cond_8

    .line 122
    .line 123
    invoke-interface {p2, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 124
    .line 125
    .line 126
    const/4 v1, 0x2

    .line 127
    :cond_8
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-interface {p2, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    add-int/2addr v1, v3

    .line 139
    iget-object v3, p0, Lhj/e0;->k:Lgj/e;

    .line 140
    .line 141
    sget-object v7, Lgj/e;->o:Lgj/e;

    .line 142
    .line 143
    if-ne v3, v7, :cond_a

    .line 144
    .line 145
    if-eqz v4, :cond_9

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_9
    move p1, v1

    .line 149
    goto/16 :goto_8

    .line 150
    .line 151
    :cond_a
    :goto_6
    iget-boolean v3, p0, Lhj/e0;->l:Z

    .line 152
    .line 153
    const/16 v8, 0x3a

    .line 154
    .line 155
    if-eqz v3, :cond_b

    .line 156
    .line 157
    invoke-interface {p2, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 158
    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    :cond_b
    if-ge v4, v5, :cond_c

    .line 163
    .line 164
    invoke-interface {p2, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 165
    .line 166
    .line 167
    add-int/lit8 v1, v1, 0x1

    .line 168
    .line 169
    :cond_c
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {p2, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    add-int/2addr v1, v3

    .line 181
    iget-object v3, p0, Lhj/e0;->k:Lgj/e;

    .line 182
    .line 183
    if-eq v3, v7, :cond_9

    .line 184
    .line 185
    sget-object v4, Lgj/e;->n:Lgj/e;

    .line 186
    .line 187
    if-eq v3, v4, :cond_9

    .line 188
    .line 189
    sget-object v4, Lgj/e;->l:Lgj/e;

    .line 190
    .line 191
    if-eq v3, v4, :cond_d

    .line 192
    .line 193
    or-int v3, p3, p1

    .line 194
    .line 195
    if-eqz v3, :cond_9

    .line 196
    .line 197
    :cond_d
    iget-boolean v3, p0, Lhj/e0;->l:Z

    .line 198
    .line 199
    if-eqz v3, :cond_e

    .line 200
    .line 201
    invoke-interface {p2, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 202
    .line 203
    .line 204
    add-int/lit8 v1, v1, 0x1

    .line 205
    .line 206
    :cond_e
    if-ge p3, v5, :cond_f

    .line 207
    .line 208
    invoke-interface {p2, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 209
    .line 210
    .line 211
    add-int/lit8 v1, v1, 0x1

    .line 212
    .line 213
    :cond_f
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p3

    .line 217
    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result p3

    .line 224
    add-int/2addr p3, v1

    .line 225
    if-eqz p1, :cond_11

    .line 226
    .line 227
    const/16 v1, 0x2e

    .line 228
    .line 229
    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 230
    .line 231
    .line 232
    add-int/lit8 p3, p3, 0x1

    .line 233
    .line 234
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    rsub-int/lit8 v1, v1, 0x9

    .line 247
    .line 248
    :goto_7
    if-ge v2, v1, :cond_10

    .line 249
    .line 250
    invoke-interface {p2, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 251
    .line 252
    .line 253
    add-int/lit8 p3, p3, 0x1

    .line 254
    .line 255
    add-int/lit8 v2, v2, 0x1

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_10
    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    add-int/2addr p1, p3

    .line 266
    goto :goto_8

    .line 267
    :cond_11
    move p1, p3

    .line 268
    :goto_8
    if-eq p5, v0, :cond_12

    .line 269
    .line 270
    if-lez p1, :cond_12

    .line 271
    .line 272
    if-eqz p4, :cond_12

    .line 273
    .line 274
    new-instance p2, Lhj/g;

    .line 275
    .line 276
    sget-object p3, Lhj/b0;->k:Lhj/b0;

    .line 277
    .line 278
    add-int v0, p5, p1

    .line 279
    .line 280
    invoke-direct {p2, p3, p5, v0}, Lhj/g;-><init>(Lfj/p;II)V

    .line 281
    .line 282
    .line 283
    invoke-interface {p4, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    :cond_12
    return p1

    .line 287
    :cond_13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 288
    .line 289
    new-instance p3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string p4, "Cannot extract timezone offset from: "

    .line 295
    .line 296
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p2
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
    instance-of v1, p1, Lhj/e0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/e0;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/e0;->k:Lgj/e;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/e0;->k:Lgj/e;

    .line 15
    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget-boolean v1, p0, Lhj/e0;->l:Z

    .line 19
    .line 20
    iget-boolean v3, p1, Lhj/e0;->l:Z

    .line 21
    .line 22
    if-ne v1, v3, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lhj/e0;->m:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p1, Lhj/e0;->m:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v2

    .line 36
    :goto_0
    return v0

    .line 37
    :cond_2
    return v2
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

.method public f(Lfj/p;)Lhj/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Lnet/time4j/tz/k;",
            ">;)",
            "Lhj/h<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhj/e0;->k:Lgj/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lhj/e0;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lhj/e0;->l:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-lt v6, v5, :cond_0

    .line 20
    .line 21
    const-string v1, "Missing timezone offset."

    .line 22
    .line 23
    invoke-virtual {v2, v6, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v7, v0, Lhj/e0;->m:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_5

    .line 38
    .line 39
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    check-cast v8, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    sub-int v10, v5, v6

    .line 50
    .line 51
    if-lt v10, v9, :cond_1

    .line 52
    .line 53
    add-int/2addr v9, v6

    .line 54
    invoke-interface {v1, v6, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    if-eqz p5, :cond_2

    .line 63
    .line 64
    iget-boolean v11, v0, Lhj/e0;->n:Z

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object v11, Lgj/a;->i:Lfj/c;

    .line 68
    .line 69
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-interface {v3, v11, v12}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    check-cast v11, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    :goto_0
    if-eqz v11, :cond_3

    .line 82
    .line 83
    invoke-virtual {v10, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-nez v12, :cond_4

    .line 88
    .line 89
    :cond_3
    if-nez v11, :cond_1

    .line 90
    .line 91
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    :cond_4
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 98
    .line 99
    sget-object v3, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 100
    .line 101
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v9}, Lhj/s;->l(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    if-eqz p5, :cond_6

    .line 109
    .line 110
    iget-object v3, v0, Lhj/e0;->o:Lgj/g;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    sget-object v7, Lgj/a;->f:Lfj/c;

    .line 114
    .line 115
    sget-object v8, Lgj/g;->l:Lgj/g;

    .line 116
    .line 117
    invoke-interface {v3, v7, v8}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Lgj/g;

    .line 122
    .line 123
    :goto_1
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    const/16 v8, 0x2b

    .line 128
    .line 129
    if-ne v7, v8, :cond_7

    .line 130
    .line 131
    sget-object v7, Lnet/time4j/tz/f;->l:Lnet/time4j/tz/f;

    .line 132
    .line 133
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    const/16 v8, 0x2d

    .line 137
    .line 138
    if-ne v7, v8, :cond_8

    .line 139
    .line 140
    sget-object v7, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_8
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_1d

    .line 148
    .line 149
    invoke-virtual {v3}, Lgj/g;->a()Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-eqz v7, :cond_1d

    .line 154
    .line 155
    sget-object v7, Lnet/time4j/tz/f;->l:Lnet/time4j/tz/f;

    .line 156
    .line 157
    :goto_3
    invoke-static {v1, v6, v3}, Lhj/e0;->b(Ljava/lang/CharSequence;ILgj/g;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    const/16 v8, -0x3e8

    .line 162
    .line 163
    if-ne v3, v8, :cond_9

    .line 164
    .line 165
    const-string v1, "Hour part in timezone offset does not match expected pattern HH."

    .line 166
    .line 167
    invoke-virtual {v2, v6, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_9
    const/4 v9, 0x1

    .line 172
    if-gez v3, :cond_a

    .line 173
    .line 174
    not-int v3, v3

    .line 175
    add-int/2addr v6, v9

    .line 176
    goto :goto_4

    .line 177
    :cond_a
    add-int/lit8 v6, v6, 0x2

    .line 178
    .line 179
    :goto_4
    if-lt v6, v5, :cond_c

    .line 180
    .line 181
    iget-object v1, v0, Lhj/e0;->k:Lgj/e;

    .line 182
    .line 183
    sget-object v5, Lgj/e;->o:Lgj/e;

    .line 184
    .line 185
    if-ne v1, v5, :cond_b

    .line 186
    .line 187
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 188
    .line 189
    invoke-static {v7, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_b
    const-string v1, "Missing minute part in timezone offset."

    .line 201
    .line 202
    invoke-virtual {v2, v6, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_5
    return-void

    .line 206
    :cond_c
    iget-boolean v10, v0, Lhj/e0;->l:Z

    .line 207
    .line 208
    const-string v11, "Colon expected in timezone offset."

    .line 209
    .line 210
    const/16 v12, 0x3a

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    if-eqz v10, :cond_f

    .line 214
    .line 215
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-ne v10, v12, :cond_d

    .line 220
    .line 221
    move v10, v9

    .line 222
    goto :goto_6

    .line 223
    :cond_d
    iget-object v1, v0, Lhj/e0;->k:Lgj/e;

    .line 224
    .line 225
    sget-object v5, Lgj/e;->o:Lgj/e;

    .line 226
    .line 227
    if-ne v1, v5, :cond_e

    .line 228
    .line 229
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 230
    .line 231
    invoke-static {v7, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_e
    invoke-virtual {v2, v6, v11}, Lhj/s;->k(ILjava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_f
    move v10, v13

    .line 247
    :goto_6
    add-int/2addr v10, v6

    .line 248
    sget-object v14, Lgj/g;->k:Lgj/g;

    .line 249
    .line 250
    invoke-static {v1, v10, v14}, Lhj/e0;->b(Ljava/lang/CharSequence;ILgj/g;)I

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    if-ne v15, v8, :cond_11

    .line 255
    .line 256
    iget-object v1, v0, Lhj/e0;->k:Lgj/e;

    .line 257
    .line 258
    sget-object v5, Lgj/e;->o:Lgj/e;

    .line 259
    .line 260
    if-ne v1, v5, :cond_10

    .line 261
    .line 262
    sget-object v1, Lhj/b0;->l:Lhj/b0;

    .line 263
    .line 264
    invoke-static {v7, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v4, v1, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_10
    const-string v1, "Minute part in timezone offset does not match expected pattern mm."

    .line 276
    .line 277
    invoke-virtual {v2, v10, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_7
    return-void

    .line 281
    :cond_11
    add-int/lit8 v10, v10, 0x2

    .line 282
    .line 283
    if-ge v10, v5, :cond_1a

    .line 284
    .line 285
    iget-object v6, v0, Lhj/e0;->k:Lgj/e;

    .line 286
    .line 287
    sget-object v9, Lgj/e;->m:Lgj/e;

    .line 288
    .line 289
    if-eq v6, v9, :cond_12

    .line 290
    .line 291
    sget-object v9, Lgj/e;->l:Lgj/e;

    .line 292
    .line 293
    if-ne v6, v9, :cond_1a

    .line 294
    .line 295
    :cond_12
    iget-boolean v6, v0, Lhj/e0;->l:Z

    .line 296
    .line 297
    if-eqz v6, :cond_15

    .line 298
    .line 299
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-ne v6, v12, :cond_13

    .line 304
    .line 305
    add-int/lit8 v6, v10, 0x1

    .line 306
    .line 307
    invoke-static {v1, v6, v14}, Lhj/e0;->b(Ljava/lang/CharSequence;ILgj/g;)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    const/4 v9, 0x1

    .line 312
    goto :goto_9

    .line 313
    :cond_13
    iget-object v6, v0, Lhj/e0;->k:Lgj/e;

    .line 314
    .line 315
    sget-object v9, Lgj/e;->l:Lgj/e;

    .line 316
    .line 317
    if-ne v6, v9, :cond_14

    .line 318
    .line 319
    invoke-virtual {v2, v10, v11}, Lhj/s;->k(ILjava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :cond_14
    move v6, v8

    .line 324
    goto :goto_8

    .line 325
    :cond_15
    invoke-static {v1, v10, v14}, Lhj/e0;->b(Ljava/lang/CharSequence;ILgj/g;)I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    :goto_8
    move v9, v13

    .line 330
    :goto_9
    if-ne v6, v8, :cond_16

    .line 331
    .line 332
    iget-object v1, v0, Lhj/e0;->k:Lgj/e;

    .line 333
    .line 334
    sget-object v5, Lgj/e;->l:Lgj/e;

    .line 335
    .line 336
    if-ne v1, v5, :cond_1a

    .line 337
    .line 338
    const-string v1, "Second part in timezone offset does not match expected pattern ss."

    .line 339
    .line 340
    invoke-virtual {v2, v10, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_16
    add-int/2addr v10, v9

    .line 345
    add-int/lit8 v10, v10, 0x2

    .line 346
    .line 347
    add-int/lit8 v8, v10, 0xa

    .line 348
    .line 349
    if-gt v8, v5, :cond_19

    .line 350
    .line 351
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    const/16 v8, 0x2e

    .line 356
    .line 357
    if-ne v5, v8, :cond_19

    .line 358
    .line 359
    add-int/lit8 v10, v10, 0x1

    .line 360
    .line 361
    add-int/lit8 v5, v10, 0x9

    .line 362
    .line 363
    move v8, v10

    .line 364
    :goto_a
    if-ge v10, v5, :cond_18

    .line 365
    .line 366
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    const/16 v11, 0x30

    .line 371
    .line 372
    if-lt v9, v11, :cond_17

    .line 373
    .line 374
    const/16 v11, 0x39

    .line 375
    .line 376
    if-gt v9, v11, :cond_17

    .line 377
    .line 378
    mul-int/lit8 v13, v13, 0xa

    .line 379
    .line 380
    add-int/lit8 v9, v9, -0x30

    .line 381
    .line 382
    add-int/2addr v13, v9

    .line 383
    add-int/lit8 v8, v8, 0x1

    .line 384
    .line 385
    add-int/lit8 v10, v10, 0x1

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_17
    const-string v1, "9 digits in fractional part of timezone offset expected."

    .line 389
    .line 390
    invoke-virtual {v2, v8, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_18
    move v10, v8

    .line 395
    :cond_19
    move v1, v13

    .line 396
    move v13, v6

    .line 397
    goto :goto_b

    .line 398
    :cond_1a
    move v1, v13

    .line 399
    :goto_b
    if-nez v13, :cond_1b

    .line 400
    .line 401
    if-nez v1, :cond_1b

    .line 402
    .line 403
    invoke-static {v7, v3, v15}, Lnet/time4j/tz/p;->q(Lnet/time4j/tz/f;II)Lnet/time4j/tz/p;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    goto :goto_c

    .line 408
    :cond_1b
    mul-int/lit16 v3, v3, 0xe10

    .line 409
    .line 410
    mul-int/lit8 v15, v15, 0x3c

    .line 411
    .line 412
    add-int/2addr v3, v15

    .line 413
    add-int/2addr v3, v13

    .line 414
    sget-object v5, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 415
    .line 416
    if-ne v7, v5, :cond_1c

    .line 417
    .line 418
    neg-int v3, v3

    .line 419
    neg-int v1, v1

    .line 420
    :cond_1c
    invoke-static {v3, v1}, Lnet/time4j/tz/p;->s(II)Lnet/time4j/tz/p;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    :goto_c
    sget-object v3, Lhj/b0;->l:Lhj/b0;

    .line 425
    .line 426
    invoke-virtual {v4, v3, v1}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v10}, Lhj/s;->l(I)V

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_1d
    const-string v1, "Missing sign of timezone offset."

    .line 434
    .line 435
    invoke-virtual {v2, v6, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-void
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
.end method

.method public j(Lhj/c;Lfj/d;I)Lhj/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "*>;",
            "Lfj/d;",
            "I)",
            "Lhj/h<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lhj/e0;

    .line 2
    .line 3
    iget-object v1, p0, Lhj/e0;->k:Lgj/e;

    .line 4
    .line 5
    iget-boolean v2, p0, Lhj/e0;->l:Z

    .line 6
    .line 7
    iget-object v3, p0, Lhj/e0;->m:Ljava/util/List;

    .line 8
    .line 9
    sget-object p3, Lgj/a;->i:Lfj/c;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    check-cast p3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    sget-object p3, Lgj/a;->f:Lfj/c;

    .line 24
    .line 25
    sget-object v0, Lgj/g;->l:Lgj/g;

    .line 26
    .line 27
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    move-object v5, p2

    .line 32
    check-cast v5, Lgj/g;

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    invoke-direct/range {v0 .. v5}, Lhj/e0;-><init>(Lgj/e;ZLjava/util/List;ZLgj/g;)V

    .line 36
    .line 37
    .line 38
    return-object p1
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lhj/e0;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[precision="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lhj/e0;->k:Lgj/e;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", extended="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-boolean v1, p0, Lhj/e0;->l:Z

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", zero-offsets="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lhj/e0;->m:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v1, 0x5d

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
