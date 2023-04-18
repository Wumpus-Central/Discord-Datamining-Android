.class final Llg/i$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/i;-><init>(Lmg/h0;Lci/n;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Llg/i;

.field final synthetic l:Lci/n;


# direct methods
.method constructor <init>(Llg/i;Lci/n;)V
    .locals 0

    iput-object p1, p0, Llg/i$c;->k:Llg/i;

    iput-object p2, p0, Llg/i$c;->l:Lci/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/o0;
    .locals 5

    .line 1
    iget-object v0, p0, Llg/i$c;->k:Llg/i;

    .line 2
    .line 3
    invoke-static {v0}, Llg/i;->h(Llg/i;)Llg/f$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Llg/f$b;->a()Lmg/h0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Llg/e;->d:Llg/e$b;

    .line 12
    .line 13
    invoke-virtual {v1}, Llg/e$b;->a()Llh/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lmg/k0;

    .line 18
    .line 19
    iget-object v3, p0, Llg/i$c;->l:Lci/n;

    .line 20
    .line 21
    iget-object v4, p0, Llg/i$c;->k:Llg/i;

    .line 22
    .line 23
    invoke-static {v4}, Llg/i;->h(Llg/i;)Llg/f$b;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Llg/f$b;->a()Lmg/h0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-direct {v2, v3, v4}, Lmg/k0;-><init>(Lci/n;Lmg/h0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lmg/x;->c(Lmg/h0;Llh/b;Lmg/k0;)Lmg/e;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lmg/e;->s()Ldi/o0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llg/i$c;->a()Ldi/o0;

    move-result-object v0

    return-object v0
.end method
