.class final Lah/d$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lah/d;->d(Lch/j;Ljava/util/List;Ldi/g1;Lah/a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lah/d;

.field final synthetic l:Lmg/f1;

.field final synthetic m:Lah/a;

.field final synthetic n:Ldi/g1;

.field final synthetic o:Lch/j;


# direct methods
.method constructor <init>(Lah/d;Lmg/f1;Lah/a;Ldi/g1;Lch/j;)V
    .locals 0

    iput-object p1, p0, Lah/d$a;->k:Lah/d;

    iput-object p2, p0, Lah/d$a;->l:Lmg/f1;

    iput-object p3, p0, Lah/d$a;->m:Lah/a;

    iput-object p4, p0, Lah/d$a;->n:Ldi/g1;

    iput-object p5, p0, Lah/d$a;->o:Lch/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/g0;
    .locals 4

    .line 1
    iget-object v0, p0, Lah/d$a;->k:Lah/d;

    .line 2
    .line 3
    invoke-static {v0}, Lah/d;->a(Lah/d;)Ldi/j1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lah/d$a;->l:Lmg/f1;

    .line 8
    .line 9
    iget-object v2, p0, Lah/d$a;->m:Lah/a;

    .line 10
    .line 11
    iget-object v3, p0, Lah/d$a;->n:Ldi/g1;

    .line 12
    .line 13
    invoke-interface {v3}, Ldi/g1;->q()Lmg/h;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v3}, Lmg/h;->s()Ldi/o0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :goto_0
    invoke-virtual {v2, v3}, Lah/a;->k(Ldi/o0;)Lah/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, p0, Lah/d$a;->o:Lch/j;

    .line 30
    .line 31
    invoke-interface {v3}, Lch/j;->w()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2, v3}, Lah/a;->j(Z)Lah/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v1, v2}, Ldi/j1;->c(Lmg/f1;Ldi/y;)Ldi/g0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
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

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lah/d$a;->a()Ldi/g0;

    move-result-object v0

    return-object v0
.end method
