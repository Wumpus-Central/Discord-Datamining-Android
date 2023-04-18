.class Lnet/time4j/calendar/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/z<",
        "Lfj/q<",
        "*>;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/k$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/calendar/k$d;-><init>()V

    return-void
.end method

.method private e(Lfj/q;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)I"
        }
    .end annotation

    sget-object v0, Lnet/time4j/f0;->y:Lnet/time4j/e;

    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p1}, Lnet/time4j/f0;->i()I

    move-result p1

    add-int/lit16 p1, p1, 0x91d

    return p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/AbstractMethodError;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/AbstractMethodError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/AbstractMethodError;

    const-string v0, "Never called."

    invoke-direct {p1, v0}, Ljava/lang/AbstractMethodError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const p1, 0x3b9ad31c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public g(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const p1, -0x3b9ac0e2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public h(Lfj/q;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/calendar/k$d;->e(Lfj/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public i(Lfj/q;Ljava/lang/Integer;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/Integer;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->g(Lfj/q;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->f(Lfj/q;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lt v2, v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-gt p2, p1, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    :cond_1
    return v0
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->f(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/k$d;->i(Lfj/q;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/Integer;",
            "Z)",
            "Lfj/q<",
            "*>;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/k$d;->i(Lfj/q;Ljava/lang/Integer;)Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/time4j/calendar/k$d;->e(Lfj/q;)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    sget-object v0, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lnet/time4j/f0;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sub-int/2addr p2, p3

    .line 26
    int-to-long p2, p2

    .line 27
    sget-object v2, Lnet/time4j/f;->n:Lnet/time4j/f;

    .line 28
    .line 29
    invoke-virtual {v1, p2, p3, v2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lnet/time4j/f0;

    .line 34
    .line 35
    invoke-virtual {p1, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    new-instance p3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v0, "Invalid year of era: "

    .line 48
    .line 49
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string p2, "Missing year of era."

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
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

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/k$d;->n(Lfj/q;Ljava/lang/Integer;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->g(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/k$d;->h(Lfj/q;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
