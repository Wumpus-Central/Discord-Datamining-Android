.class Ljg/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljg/h;-><init>(Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Collection<",
        "Lmg/q0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljg/h;


# direct methods
.method constructor <init>(Ljg/h;)V
    .locals 0

    iput-object p1, p0, Ljg/h$a;->k:Ljg/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/q0;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lmg/q0;

    .line 3
    .line 4
    iget-object v1, p0, Ljg/h$a;->k:Ljg/h;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljg/h;->r()Lpg/x;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Ljg/k;->u:Llh/c;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lpg/x;->G0(Llh/c;)Lmg/q0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    iget-object v1, p0, Ljg/h$a;->k:Ljg/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljg/h;->r()Lpg/x;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Ljg/k;->w:Llh/c;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lpg/x;->G0(Llh/c;)Lmg/q0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    iget-object v1, p0, Ljg/h$a;->k:Ljg/h;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljg/h;->r()Lpg/x;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Ljg/k;->x:Llh/c;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lpg/x;->G0(Llh/c;)Lmg/q0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x2

    .line 47
    aput-object v1, v0, v2

    .line 48
    .line 49
    iget-object v1, p0, Ljg/h$a;->k:Ljg/h;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljg/h;->r()Lpg/x;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Ljg/k;->v:Llh/c;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lpg/x;->G0(Llh/c;)Lmg/q0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v2, 0x3

    .line 62
    aput-object v1, v0, v2

    .line 63
    .line 64
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
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

    invoke-virtual {p0}, Ljg/h$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
