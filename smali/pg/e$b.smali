.class Lpg/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/e;-><init>(Lci/n;Lmg/m;Lng/g;Llh/f;Ldi/w1;ZILmg/a1;Lmg/d1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Llh/f;

.field final synthetic l:Lpg/e;


# direct methods
.method constructor <init>(Lpg/e;Llh/f;)V
    .locals 0

    iput-object p1, p0, Lpg/e$b;->l:Lpg/e;

    iput-object p2, p0, Lpg/e$b;->k:Llh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldi/o0;
    .locals 5

    .line 1
    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lpg/e$b;->l:Lpg/e;

    .line 8
    .line 9
    invoke-virtual {v1}, Lpg/e;->k()Ldi/g1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lwh/g;

    .line 18
    .line 19
    new-instance v4, Lpg/e$b$a;

    .line 20
    .line 21
    invoke-direct {v4, p0}, Lpg/e$b$a;-><init>(Lpg/e$b;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v3, v4}, Lwh/g;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static {v0, v1, v2, v4, v3}, Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
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

    invoke-virtual {p0}, Lpg/e$b;->a()Ldi/o0;

    move-result-object v0

    return-object v0
.end method
