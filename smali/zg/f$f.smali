.class final Lzg/f$f;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lei/g;",
        "Lzg/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/f;


# direct methods
.method constructor <init>(Lzg/f;)V
    .locals 0

    iput-object p1, p0, Lzg/f$f;->k:Lzg/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lei/g;)Lzg/g;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lzg/g;

    .line 7
    .line 8
    iget-object v0, p0, Lzg/f$f;->k:Lzg/f;

    .line 9
    .line 10
    invoke-static {v0}, Lzg/f;->L0(Lzg/f;)Lyg/g;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, Lzg/f$f;->k:Lzg/f;

    .line 15
    .line 16
    invoke-virtual {v3}, Lzg/f;->P0()Lch/g;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v0, p0, Lzg/f$f;->k:Lzg/f;

    .line 21
    .line 22
    invoke-static {v0}, Lzg/f;->K0(Lzg/f;)Lmg/e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    move v5, v0

    .line 32
    iget-object v0, p0, Lzg/f$f;->k:Lzg/f;

    .line 33
    .line 34
    invoke-static {v0}, Lzg/f;->M0(Lzg/f;)Lzg/g;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    move-object v1, p1

    .line 39
    invoke-direct/range {v1 .. v6}, Lzg/g;-><init>(Lyg/g;Lmg/e;Lch/g;ZLzg/g;)V

    .line 40
    .line 41
    .line 42
    return-object p1
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lei/g;

    invoke-virtual {p0, p1}, Lzg/f$f;->a(Lei/g;)Lzg/g;

    move-result-object p1

    return-object p1
.end method
