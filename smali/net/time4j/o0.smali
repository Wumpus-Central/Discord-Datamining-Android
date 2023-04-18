.class Lnet/time4j/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/d0;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Lnet/time4j/w;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/d0<",
        "TU;>;",
        "Ljava/util/Comparator<",
        "Lfj/l0$a<",
        "+",
        "Lfj/w;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final k:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnet/time4j/o0;->k:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 25
    .line 26
    .line 27
.end method

.method static a()Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Lfj/l0$a<",
            "+",
            "Lfj/w;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/time4j/o0;-><init>(Z)V

    return-object v0
.end method

.method static c(Lfj/w;Lfj/w;)I
    .locals 4

    .line 1
    invoke-interface {p1}, Lfj/w;->getLength()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Lfj/w;->getLength()D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p1, "Mixing different units of same length not allowed."

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_0
    return v0
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

.method static g()Lnet/time4j/o0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/o0<",
            "Lnet/time4j/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/time4j/o0;-><init>(Z)V

    return-object v0
.end method

.method static j()Lnet/time4j/o0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/o0<",
            "Lnet/time4j/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/time4j/o0;-><init>(Z)V

    return-object v0
.end method

.method static k()Lnet/time4j/o0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/time4j/o0<",
            "Lnet/time4j/w;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/o0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lnet/time4j/o0;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/l0$a;

    check-cast p2, Lfj/l0$a;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/o0;->d(Lfj/l0$a;Lfj/l0$a;)I

    move-result p1

    return p1
.end method

.method public d(Lfj/l0$a;Lfj/l0$a;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/l0$a<",
            "+",
            "Lfj/w;",
            ">;",
            "Lfj/l0$a<",
            "+",
            "Lfj/w;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lfj/l0$a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfj/w;

    invoke-virtual {p2}, Lfj/l0$a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lfj/w;

    invoke-static {p1, p2}, Lnet/time4j/o0;->c(Lfj/w;Lfj/w;)I

    move-result p1

    return p1
.end method
