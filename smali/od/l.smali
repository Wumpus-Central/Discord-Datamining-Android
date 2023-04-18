.class public final Lod/l;
.super Lod/p;
.source "SourceFile"


# instance fields
.field private final i:Lod/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lod/p;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lod/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lod/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lod/l;->i:Lod/p;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static r(Lcom/google/zxing/Result;)Lcom/google/zxing/Result;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/zxing/Result;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/16 v2, 0x30

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    new-instance v1, Lcom/google/zxing/Result;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lcom/google/zxing/Result;->e()[Lcd/o;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Lcd/a;->y:Lcd/a;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v1, v0, v4, v2, v3}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/google/zxing/Result;->d()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/google/zxing/Result;->d()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v1, p0}, Lcom/google/zxing/Result;->g(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v1

    .line 45
    :cond_1
    invoke-static {}, Lcd/f;->a()Lcd/f;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
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


# virtual methods
.method public a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    iget-object v0, p0, Lod/l;->i:Lod/p;

    invoke-virtual {v0, p1, p2}, Lod/k;->a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;

    move-result-object p1

    invoke-static {p1}, Lod/l;->r(Lcom/google/zxing/Result;)Lcom/google/zxing/Result;

    move-result-object p1

    return-object p1
.end method

.method public b(ILgd/a;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgd/a;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    iget-object v0, p0, Lod/l;->i:Lod/p;

    invoke-virtual {v0, p1, p2, p3}, Lod/p;->b(ILgd/a;Ljava/util/Map;)Lcom/google/zxing/Result;

    move-result-object p1

    invoke-static {p1}, Lod/l;->r(Lcom/google/zxing/Result;)Lcom/google/zxing/Result;

    move-result-object p1

    return-object p1
.end method

.method protected k(Lgd/a;[ILjava/lang/StringBuilder;)I
    .locals 1

    iget-object v0, p0, Lod/l;->i:Lod/p;

    invoke-virtual {v0, p1, p2, p3}, Lod/p;->k(Lgd/a;[ILjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public l(ILgd/a;[ILjava/util/Map;)Lcom/google/zxing/Result;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lgd/a;",
            "[I",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    iget-object v0, p0, Lod/l;->i:Lod/p;

    invoke-virtual {v0, p1, p2, p3, p4}, Lod/p;->l(ILgd/a;[ILjava/util/Map;)Lcom/google/zxing/Result;

    move-result-object p1

    invoke-static {p1}, Lod/l;->r(Lcom/google/zxing/Result;)Lcom/google/zxing/Result;

    move-result-object p1

    return-object p1
.end method

.method p()Lcd/a;
    .locals 1

    sget-object v0, Lcd/a;->y:Lcd/a;

    return-object v0
.end method
