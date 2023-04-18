.class Lhj/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/o;
.implements Lfj/o0;
.implements Lnet/time4j/base/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field private final k:Lnet/time4j/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/r<",
            "*>;"
        }
    .end annotation
.end field

.field private final l:Ljava/lang/String;

.field private final m:Lnet/time4j/tz/k;


# direct methods
.method private constructor <init>(Lnet/time4j/r;Ljava/lang/String;Lnet/time4j/tz/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/r<",
            "*>;",
            "Ljava/lang/String;",
            "Lnet/time4j/tz/k;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lhj/c$f;->k:Lnet/time4j/r;

    .line 4
    iput-object p2, p0, Lhj/c$f;->l:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lhj/c$f;->m:Lnet/time4j/tz/k;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/r;Ljava/lang/String;Lnet/time4j/tz/k;Lhj/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lhj/c$f;-><init>(Lnet/time4j/r;Ljava/lang/String;Lnet/time4j/tz/k;)V

    return-void
.end method

.method private b()Lnet/time4j/base/f;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/r;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lfj/x;->A(Ljava/lang/Class;)Lfj/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lfj/x;->a()Lfj/f0;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    sget-object v0, Lfj/f0;->a:Lfj/f0;

    .line 21
    .line 22
    :goto_0
    iget-object v1, p0, Lhj/c$f;->k:Lnet/time4j/r;

    .line 23
    .line 24
    iget-object v2, p0, Lhj/c$f;->m:Lnet/time4j/tz/k;

    .line 25
    .line 26
    invoke-static {v2}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2, v0}, Lnet/time4j/r;->a(Lnet/time4j/tz/l;Lfj/f0;)Lnet/time4j/a0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
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


# virtual methods
.method public a()I
    .locals 1

    invoke-direct {p0}, Lhj/c$f;->b()Lnet/time4j/base/f;

    move-result-object v0

    invoke-interface {v0}, Lnet/time4j/base/f;->a()I

    move-result v0

    return v0
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

    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    invoke-virtual {v0, p1}, Lnet/time4j/r;->c(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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

    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    invoke-virtual {v0, p1}, Lnet/time4j/r;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

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

    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    invoke-virtual {v0, p1}, Lnet/time4j/r;->m(Lfj/p;)I

    move-result p1

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

    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    invoke-virtual {v0, p1}, Lnet/time4j/r;->o(Lfj/p;)Z

    move-result p1

    return p1
.end method

.method public r()Lnet/time4j/tz/k;
    .locals 1

    iget-object v0, p0, Lhj/c$f;->m:Lnet/time4j/tz/k;

    return-object v0
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

    iget-object v0, p0, Lhj/c$f;->k:Lnet/time4j/r;

    invoke-virtual {v0, p1}, Lnet/time4j/r;->t(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u()J
    .locals 2

    invoke-direct {p0}, Lhj/c$f;->b()Lnet/time4j/base/f;

    move-result-object v0

    invoke-interface {v0}, Lnet/time4j/base/f;->u()J

    move-result-wide v0

    return-wide v0
.end method
