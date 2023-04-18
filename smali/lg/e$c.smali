.class final Llg/e$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/e;-><init>(Lci/n;Lmg/h0;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lpg/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Llg/e;

.field final synthetic l:Lci/n;


# direct methods
.method constructor <init>(Llg/e;Lci/n;)V
    .locals 0

    iput-object p1, p0, Llg/e$c;->k:Llg/e;

    iput-object p2, p0, Llg/e$c;->l:Lci/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lpg/h;
    .locals 10

    .line 1
    new-instance v9, Lpg/h;

    .line 2
    .line 3
    iget-object v0, p0, Llg/e$c;->k:Llg/e;

    .line 4
    .line 5
    invoke-static {v0}, Llg/e;->f(Llg/e;)Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Llg/e$c;->k:Llg/e;

    .line 10
    .line 11
    invoke-static {v1}, Llg/e;->h(Llg/e;)Lmg/h0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lmg/m;

    .line 21
    .line 22
    invoke-static {}, Llg/e;->e()Llh/f;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v3, Lmg/e0;->o:Lmg/e0;

    .line 27
    .line 28
    sget-object v4, Lmg/f;->m:Lmg/f;

    .line 29
    .line 30
    iget-object v0, p0, Llg/e$c;->k:Llg/e;

    .line 31
    .line 32
    invoke-static {v0}, Llg/e;->h(Llg/e;)Lmg/h0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Lmg/h0;->o()Ljg/h;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljg/h;->i()Ldi/o0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v6, Lmg/a1;->a:Lmg/a1;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    iget-object v8, p0, Llg/e$c;->l:Lci/n;

    .line 52
    .line 53
    move-object v0, v9

    .line 54
    invoke-direct/range {v0 .. v8}, Lpg/h;-><init>(Lmg/m;Llh/f;Lmg/e0;Lmg/f;Ljava/util/Collection;Lmg/a1;ZLci/n;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Llg/e$c;->l:Lci/n;

    .line 58
    .line 59
    new-instance v1, Llg/a;

    .line 60
    .line 61
    invoke-direct {v1, v0, v9}, Llg/a;-><init>(Lci/n;Lmg/e;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v9, v1, v0, v2}, Lpg/h;->K0(Lwh/h;Ljava/util/Set;Lmg/d;)V

    .line 70
    .line 71
    .line 72
    return-object v9
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

    invoke-virtual {p0}, Llg/e$c;->a()Lpg/h;

    move-result-object v0

    return-object v0
.end method
