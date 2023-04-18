.class Lq2/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr2/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    const-string v1, "e"

    .line 4
    .line 5
    const-string v2, "o"

    .line 6
    .line 7
    const-string v3, "nm"

    .line 8
    .line 9
    const-string v4, "m"

    .line 10
    .line 11
    const-string v5, "hd"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lr2/c$a;->a([Ljava/lang/String;)Lr2/c$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lq2/m0;->a:Lr2/c$a;

    .line 22
    .line 23
    return-void
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
.end method

.method static a(Lr2/c;Lg2/i;)Ln2/s;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v3, v0

    .line 4
    move-object v4, v3

    .line 5
    move-object v5, v4

    .line 6
    move-object v6, v5

    .line 7
    move-object v7, v6

    .line 8
    move v8, v1

    .line 9
    :goto_0
    invoke-virtual {p0}, Lr2/c;->s()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    sget-object v0, Lq2/m0;->a:Lr2/c$a;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lr2/c;->g0(Lr2/c$a;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq v0, v2, :cond_4

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq v0, v2, :cond_3

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    if-eq v0, v2, :cond_2

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    if-eq v0, v2, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x5

    .line 36
    if-eq v0, v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Lr2/c;->i0()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Lr2/c;->v()Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lr2/c;->x()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Ln2/s$a;->a(I)Ln2/s$a;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p0}, Lr2/c;->F()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {p0, p1, v1}, Lq2/d;->f(Lr2/c;Lg2/i;Z)Lm2/b;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-static {p0, p1, v1}, Lq2/d;->f(Lr2/c;Lg2/i;Z)Lm2/b;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-static {p0, p1, v1}, Lq2/d;->f(Lr2/c;Lg2/i;Z)Lm2/b;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    goto :goto_0

    .line 76
    :cond_6
    new-instance p0, Ln2/s;

    .line 77
    .line 78
    move-object v2, p0

    .line 79
    invoke-direct/range {v2 .. v8}, Ln2/s;-><init>(Ljava/lang/String;Ln2/s$a;Lm2/b;Lm2/b;Lm2/b;Z)V

    .line 80
    .line 81
    .line 82
    return-object p0
    .line 83
.end method
