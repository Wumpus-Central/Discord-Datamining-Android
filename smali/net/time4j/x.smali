.class final Lnet/time4j/x;
.super Lnet/time4j/b;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/k0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/b<",
        "Ljava/lang/Long;",
        ">;",
        "Lnet/time4j/k0<",
        "Ljava/lang/Long;",
        "Lnet/time4j/g0;",
        ">;"
    }
.end annotation


# static fields
.field static final q:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x524f1cda692a50bdL


# instance fields
.field private final transient n:Ljava/lang/Long;

.field private final transient o:Ljava/lang/Long;

.field private final transient p:Lfj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/t<",
            "Lfj/q<",
            "*>;",
            "Ljava/math/BigDecimal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnet/time4j/x;

    invoke-direct {v0}, Lnet/time4j/x;-><init>()V

    sput-object v0, Lnet/time4j/x;->q:Lfj/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    const-string v1, "DAY_OVERFLOW"

    const-wide/high16 v2, -0x8000000000000000L

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Lnet/time4j/x;-><init>(Ljava/lang/String;JJ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lnet/time4j/b;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/x;->n:Ljava/lang/Long;

    .line 4
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/x;->o:Ljava/lang/Long;

    .line 5
    new-instance p1, Lnet/time4j/l0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lnet/time4j/l0;-><init>(Lfj/p;Z)V

    iput-object p1, p0, Lnet/time4j/x;->p:Lfj/t;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lfj/e;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/time4j/g0;->G0(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lfj/e;->name()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "DAY_OVERFLOW"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Lnet/time4j/x;->q:Lfj/p;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ljava/io/InvalidObjectException;

    .line 27
    .line 28
    invoke-virtual {p0}, Lfj/e;->name()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    return-object v0
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

.method static y(Ljava/lang/String;JJ)Lnet/time4j/x;
    .locals 7

    new-instance v6, Lnet/time4j/x;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lnet/time4j/x;-><init>(Ljava/lang/String;JJ)V

    return-object v6
.end method


# virtual methods
.method public A()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lnet/time4j/x;->o:Ljava/lang/Long;

    return-object v0
.end method

.method public B()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lnet/time4j/x;->n:Ljava/lang/Long;

    return-object v0
.end method

.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/x;->B()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/x;->A()Ljava/lang/Long;

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

.method public bridge synthetic h(Ljava/lang/Number;)Lnet/time4j/o;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-super {p0, p1}, Lnet/time4j/b;->x(Ljava/lang/Comparable;)Lnet/time4j/o;

    move-result-object p1

    return-object p1
.end method
