.class Lnet/time4j/g0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/z<",
        "Lnet/time4j/g0;",
        "Lnet/time4j/z;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/g0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/g0$g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$g;->b(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/g0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/g0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$g;->d(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/g0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/g0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    return-object p1
.end method

.method public e(Lnet/time4j/g0;)Lnet/time4j/z;
    .locals 0

    sget-object p1, Lnet/time4j/z;->l:Lnet/time4j/z;

    return-object p1
.end method

.method public f(Lnet/time4j/g0;)Lnet/time4j/z;
    .locals 0

    sget-object p1, Lnet/time4j/z;->k:Lnet/time4j/z;

    return-object p1
.end method

.method public g(Lnet/time4j/g0;)Lnet/time4j/z;
    .locals 0

    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    move-result p1

    invoke-static {p1}, Lnet/time4j/z;->c(I)Lnet/time4j/z;

    move-result-object p1

    return-object p1
.end method

.method public h(Lnet/time4j/g0;Lnet/time4j/z;)Z
    .locals 0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Lnet/time4j/g0;Lnet/time4j/z;Z)Lnet/time4j/g0;
    .locals 2

    .line 1
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-ne p3, v0, :cond_0

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    :goto_0
    if-eqz p2, :cond_3

    .line 16
    .line 17
    sget-object v0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 18
    .line 19
    const/16 v1, 0xc

    .line 20
    .line 21
    if-ne p2, v0, :cond_1

    .line 22
    .line 23
    if-lt p3, v1, :cond_2

    .line 24
    .line 25
    add-int/lit8 p3, p3, -0xc

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v0, Lnet/time4j/z;->l:Lnet/time4j/z;

    .line 29
    .line 30
    if-ne p2, v0, :cond_2

    .line 31
    .line 32
    if-ge p3, v1, :cond_2

    .line 33
    .line 34
    add-int/lit8 p3, p3, 0xc

    .line 35
    .line 36
    :cond_2
    :goto_1
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-static {p1}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p3, p2, v0, p1}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    const-string p2, "Missing am/pm-value."

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$g;->e(Lnet/time4j/g0;)Lnet/time4j/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    check-cast p2, Lnet/time4j/z;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/g0$g;->h(Lnet/time4j/g0;Lnet/time4j/z;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    check-cast p2, Lnet/time4j/z;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/g0$g;->i(Lnet/time4j/g0;Lnet/time4j/z;Z)Lnet/time4j/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$g;->f(Lnet/time4j/g0;)Lnet/time4j/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$g;->g(Lnet/time4j/g0;)Lnet/time4j/z;

    move-result-object p1

    return-object p1
.end method
