.class Lnet/time4j/a0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/v<",
        "Lnet/time4j/a0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/a0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/a0$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/time4j/a0;)Lnet/time4j/a0;
    .locals 3

    .line 1
    invoke-static {}, Lmj/d;->x()Lmj/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lmj/d;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lmj/f;->l:Lmj/f;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lnet/time4j/a0;->l(Lmj/f;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-virtual {v0, v1, v2}, Lmj/d;->y(J)Lmj/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lmj/b;->d()Lnet/time4j/base/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lnet/time4j/f0;->A0(Lnet/time4j/base/a;)Lnet/time4j/f0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/16 v1, 0x17

    .line 32
    .line 33
    const/16 v2, 0x3b

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v2}, Lnet/time4j/f0;->u0(III)Lnet/time4j/h0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lnet/time4j/h0;->U()Lnet/time4j/a0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1}, Lmj/b;->b()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    int-to-long v1, p1

    .line 48
    sget-object p1, Lnet/time4j/n0;->k:Lnet/time4j/n0;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, p1}, Lnet/time4j/a0;->q0(JLnet/time4j/n0;)Lnet/time4j/a0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    return-object p1
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

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/a0;

    invoke-virtual {p0, p1}, Lnet/time4j/a0$f;->a(Lnet/time4j/a0;)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method
