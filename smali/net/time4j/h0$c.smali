.class Lnet/time4j/h0$c;
.super Lnet/time4j/h0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/h0$d<",
        "Ljava/math/BigDecimal;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lfj/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/math/BigDecimal;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/time4j/h0$d;-><init>(Lfj/p;Lnet/time4j/h0$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lnet/time4j/h0;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/h0$c;->t(Lnet/time4j/h0;Ljava/math/BigDecimal;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/h0$c;->t(Lnet/time4j/h0;Ljava/math/BigDecimal;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/h0;

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/h0$c;->u(Lnet/time4j/h0;Ljava/math/BigDecimal;Z)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Lnet/time4j/h0;Ljava/lang/Object;Z)Lnet/time4j/h0;
    .locals 0

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/h0$c;->u(Lnet/time4j/h0;Ljava/math/BigDecimal;Z)Lnet/time4j/h0;

    move-result-object p1

    return-object p1
.end method

.method public t(Lnet/time4j/h0;Ljava/math/BigDecimal;)Z
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-static {p0}, Lnet/time4j/h0$d;->b(Lnet/time4j/h0$d;)Lfj/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lfj/p;->S()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/math/BigDecimal;

    .line 14
    .line 15
    invoke-static {p0}, Lnet/time4j/h0$d;->b(Lnet/time4j/h0$d;)Lfj/p;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Lfj/p;->f()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/math/BigDecimal;

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-gtz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-gtz p2, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    :cond_1
    return p1
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

.method public u(Lnet/time4j/h0;Ljava/math/BigDecimal;Z)Lnet/time4j/h0;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/time4j/h0$c;->t(Lnet/time4j/h0;Ljava/math/BigDecimal;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lnet/time4j/h0;->Q(Lnet/time4j/h0;)Lnet/time4j/g0;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-static {p0}, Lnet/time4j/h0$d;->b(Lnet/time4j/h0$d;)Lfj/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p3, v0, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lnet/time4j/g0;

    .line 20
    .line 21
    invoke-static {p1}, Lnet/time4j/h0;->O(Lnet/time4j/h0;)Lnet/time4j/f0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, p2}, Lnet/time4j/h0;->e0(Lnet/time4j/f0;Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance p3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v0, "Out of range: "

    .line 38
    .line 39
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
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
