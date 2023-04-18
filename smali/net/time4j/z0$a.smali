.class Lnet/time4j/z0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/time4j/z0;-><init>(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/n<",
        "Lnet/time4j/base/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lnet/time4j/x0;

.field final synthetic l:Lnet/time4j/x0;

.field final synthetic m:Lnet/time4j/z0;


# direct methods
.method constructor <init>(Lnet/time4j/z0;Lnet/time4j/x0;Lnet/time4j/x0;)V
    .locals 0

    iput-object p1, p0, Lnet/time4j/z0$a;->m:Lnet/time4j/z0;

    iput-object p2, p0, Lnet/time4j/z0$a;->k:Lnet/time4j/x0;

    iput-object p3, p0, Lnet/time4j/z0$a;->l:Lnet/time4j/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/time4j/base/a;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/time4j/base/a;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lnet/time4j/base/a;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Lnet/time4j/base/a;->p()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, p1}, Lnet/time4j/base/b;->c(III)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lnet/time4j/z0$a;->k:Lnet/time4j/x0;

    .line 22
    .line 23
    if-eq p1, v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lnet/time4j/z0$a;->l:Lnet/time4j/x0;

    .line 26
    .line 27
    if-ne p1, v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    :goto_1
    return p1
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
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/base/a;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$a;->a(Lnet/time4j/base/a;)Z

    move-result p1

    return p1
.end method
