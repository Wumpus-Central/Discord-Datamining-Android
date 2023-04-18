.class final enum Lnet/time4j/a0$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/p;
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/a0$d;",
        ">;",
        "Lfj/p<",
        "Ljava/lang/Long;",
        ">;",
        "Lfj/z<",
        "Lnet/time4j/a0;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/a0$d;

.field private static final synthetic l:[Lnet/time4j/a0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/time4j/a0$d;

    .line 2
    .line 3
    const-string v1, "POSIX_TIME"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/a0$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/a0$d;->k:Lnet/time4j/a0$d;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lnet/time4j/a0$d;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lnet/time4j/a0$d;->l:[Lnet/time4j/a0$d;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/a0$d;
    .locals 1

    const-class v0, Lnet/time4j/a0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/a0$d;

    return-object p0
.end method

.method public static values()[Lnet/time4j/a0$d;
    .locals 1

    sget-object v0, Lnet/time4j/a0$d;->l:[Lnet/time4j/a0$d;

    invoke-virtual {v0}, [Lnet/time4j/a0$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/a0$d;

    return-object v0
.end method


# virtual methods
.method public A(Lnet/time4j/a0;)Ljava/lang/Long;
    .locals 2

    invoke-virtual {p1}, Lnet/time4j/a0;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public B(Lnet/time4j/a0;Ljava/lang/Long;)Z
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {}, Lnet/time4j/a0;->O()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long p2, v0, v2

    .line 14
    .line 15
    if-ltz p2, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lnet/time4j/a0;->Q()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmp-long p2, v0, v2

    .line 22
    .line 23
    if-gtz p2, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    :cond_1
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

.method public D(Lnet/time4j/a0;Ljava/lang/Long;Z)Lnet/time4j/a0;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    invoke-virtual {p1}, Lnet/time4j/a0;->a()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sget-object v0, Lmj/f;->k:Lmj/f;

    .line 12
    .line 13
    invoke-static {p2, p3, p1, v0}, Lnet/time4j/a0;->o0(JILmj/f;)Lnet/time4j/a0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p2, "Missing elapsed seconds."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
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

.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a0$d;->w()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$d;->s(Lnet/time4j/a0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b()C
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$d;->t(Lnet/time4j/a0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a0$d;->r(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/a0$d;->u()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/Long;

    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$d;->x(Lnet/time4j/a0;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/a0$d;->B(Lnet/time4j/a0;Ljava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/a0$d;->D(Lnet/time4j/a0;Ljava/lang/Long;Z)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$d;->y(Lnet/time4j/a0;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$d;->A(Lnet/time4j/a0;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public r(Lfj/o;Lfj/o;)I
    .locals 0

    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public s(Lnet/time4j/a0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/a0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/a0$c;->k:Lnet/time4j/a0$c;

    return-object p1
.end method

.method public t(Lnet/time4j/a0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/a0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object p1, Lnet/time4j/a0$c;->k:Lnet/time4j/a0$c;

    return-object p1
.end method

.method public u()Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lnet/time4j/a0;->Q()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lnet/time4j/a0;->O()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public x(Lnet/time4j/a0;)Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lnet/time4j/a0;->Q()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public y(Lnet/time4j/a0;)Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lnet/time4j/a0;->O()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
