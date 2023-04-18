.class final Llg/f$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/f;-><init>(Lci/n;Llg/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Llg/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Llg/f;

.field final synthetic l:Lci/n;


# direct methods
.method constructor <init>(Llg/f;Lci/n;)V
    .locals 0

    iput-object p1, p0, Llg/f$d;->k:Llg/f;

    iput-object p2, p0, Llg/f$d;->l:Lci/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Llg/i;
    .locals 5

    .line 1
    new-instance v0, Llg/i;

    .line 2
    .line 3
    iget-object v1, p0, Llg/f$d;->k:Llg/f;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljg/h;->r()Lpg/x;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "builtInsModule"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Llg/f$d;->l:Lci/n;

    .line 15
    .line 16
    new-instance v3, Llg/f$d$a;

    .line 17
    .line 18
    iget-object v4, p0, Llg/f$d;->k:Llg/f;

    .line 19
    .line 20
    invoke-direct {v3, v4}, Llg/f$d$a;-><init>(Llg/f;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3}, Llg/i;-><init>(Lmg/h0;Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    return-object v0
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

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llg/f$d;->a()Llg/i;

    move-result-object v0

    return-object v0
.end method
