.class Lnet/time4j/calendar/f$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lnet/time4j/calendar/f<",
        "*TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TD;",
        "Lnet/time4j/calendar/c;",
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

.field private final l:Z


# direct methods
.method private constructor <init>(Lfj/p;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/calendar/f$b;->k:Lfj/p;

    .line 4
    iput-boolean p2, p0, Lnet/time4j/calendar/f$b;->l:Z

    return-void
.end method

.method synthetic constructor <init>(Lfj/p;ZLnet/time4j/calendar/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/calendar/f$b;-><init>(Lfj/p;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->b(Lnet/time4j/calendar/f;)Lfj/p;

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

    iget-object p1, p0, Lnet/time4j/calendar/f$b;->k:Lfj/p;

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->d(Lnet/time4j/calendar/f;)Lfj/p;

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

    iget-object p1, p0, Lnet/time4j/calendar/f$b;->k:Lfj/p;

    return-object p1
.end method

.method public e(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/c;"
        }
    .end annotation

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    move-result p1

    const/16 v0, 0x5e

    if-ne p1, v0, :cond_0

    const/16 p1, 0x38

    goto :goto_0

    :cond_0
    const/16 p1, 0x3c

    :goto_0
    invoke-static {p1}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method

.method public f(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/c;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lnet/time4j/calendar/f$b;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/16 v0, 0x4b

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    const/16 p1, 0xa

    .line 15
    .line 16
    invoke-static {p1}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v1}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/16 v0, 0x48

    .line 31
    .line 32
    if-ne p1, v0, :cond_2

    .line 33
    .line 34
    const/16 p1, 0x16

    .line 35
    .line 36
    invoke-static {p1}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {v1}, Lnet/time4j/calendar/c;->p(I)Lnet/time4j/calendar/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    return-object p1
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

.method public g(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lnet/time4j/calendar/c;"
        }
    .end annotation

    invoke-virtual {p1}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method

.method public h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/calendar/c;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->f(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->e(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lnet/time4j/calendar/o;->f(Lnet/time4j/calendar/o;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lnet/time4j/calendar/o;->f(Lnet/time4j/calendar/o;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ltz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1
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

.method public i(Lnet/time4j/calendar/f;Lnet/time4j/calendar/c;Z)Lnet/time4j/calendar/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Lnet/time4j/calendar/c;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$b;->h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Y()Lnet/time4j/calendar/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->p()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p2}, Lnet/time4j/calendar/o;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p1}, Lnet/time4j/calendar/f;->Z()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->c()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->getNumber()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {v0, v1, v2}, Lnet/time4j/calendar/d;->g(II)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eq p1, p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p3}, Lnet/time4j/calendar/h;->getNumber()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v3, p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v3, p3

    .line 54
    :goto_0
    const/16 p1, 0x1d

    .line 55
    .line 56
    if-gt v4, p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2, v3, v4}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-virtual/range {v0 .. v6}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_1
    const/4 p1, 0x1

    .line 68
    invoke-virtual {v0, v1, v2, v3, p1}, Lnet/time4j/calendar/d;->t(IILnet/time4j/calendar/h;I)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    invoke-virtual {v0, p1, p2}, Lnet/time4j/calendar/d;->v(J)Lnet/time4j/calendar/f;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p3}, Lnet/time4j/calendar/f;->lengthOfMonth()I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    invoke-static {v4, p3}, Ljava/lang/Math;->min(II)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    int-to-long v5, v4

    .line 85
    add-long/2addr p1, v5

    .line 86
    const-wide/16 v5, 0x1

    .line 87
    .line 88
    sub-long v5, p1, v5

    .line 89
    .line 90
    invoke-virtual/range {v0 .. v6}, Lnet/time4j/calendar/d;->e(IILnet/time4j/calendar/h;IJ)Lnet/time4j/calendar/f;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    new-instance p3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v0, "Invalid cyclic year: "

    .line 103
    .line 104
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->e(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Lnet/time4j/calendar/c;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/f$b;->h(Lnet/time4j/calendar/f;Lnet/time4j/calendar/c;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    check-cast p2, Lnet/time4j/calendar/c;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/f$b;->i(Lnet/time4j/calendar/f;Lnet/time4j/calendar/c;Z)Lnet/time4j/calendar/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->f(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/calendar/f;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/f$b;->g(Lnet/time4j/calendar/f;)Lnet/time4j/calendar/c;

    move-result-object p1

    return-object p1
.end method
