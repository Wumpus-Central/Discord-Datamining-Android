.class final Lq/i2;
.super Lq/o0;
.source "SourceFile"


# static fields
.field static final c:Lq/i2;


# instance fields
.field private final b:Lu/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/i2;

    new-instance v1, Lu/g;

    invoke-direct {v1}, Lu/g;-><init>()V

    invoke-direct {v0, v1}, Lq/i2;-><init>(Lu/g;)V

    sput-object v0, Lq/i2;->c:Lq/i2;

    return-void
.end method

.method private constructor <init>(Lu/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq/o0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/i2;->b:Lu/g;

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


# virtual methods
.method public a(Lw/x2;Lw/n0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/x2<",
            "*>;",
            "Lw/n0$a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lq/o0;->a(Lw/x2;Lw/n0$a;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lw/f1;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lw/f1;

    .line 9
    .line 10
    new-instance v0, Lp/b$a;

    .line 11
    .line 12
    invoke-direct {v0}, Lp/b$a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lw/f1;->O()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lq/i2;->b:Lu/g;

    .line 22
    .line 23
    invoke-virtual {p1}, Lw/f1;->G()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v1, p1, v0}, Lu/g;->a(ILp/b$a;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Lp/b$a;->a()Lp/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p2, p1}, Lw/n0$a;->e(Lw/r0;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string p2, "config is not ImageCaptureConfig"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
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
.end method
