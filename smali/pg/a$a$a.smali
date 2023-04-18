.class Lpg/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/a$a;->a()Ldi/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lei/g;",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/a$a;


# direct methods
.method constructor <init>(Lpg/a$a;)V
    .locals 0

    iput-object p1, p0, Lpg/a$a$a;->k:Lpg/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/g;)Ldi/o0;
    .locals 2

    .line 1
    iget-object v0, p0, Lpg/a$a$a;->k:Lpg/a$a;

    .line 2
    .line 3
    iget-object v0, v0, Lpg/a$a;->k:Lpg/a;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lei/g;->f(Lmg/m;)Lmg/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lpg/a$a$a;->k:Lpg/a$a;

    .line 12
    .line 13
    iget-object p1, p1, Lpg/a$a;->k:Lpg/a;

    .line 14
    .line 15
    iget-object p1, p1, Lpg/a;->m:Lci/i;

    .line 16
    .line 17
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ldi/o0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    instance-of v1, v0, Lmg/e1;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object p1, v0

    .line 29
    check-cast p1, Lmg/e1;

    .line 30
    .line 31
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Ldi/s1;->g(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p1, v0}, Ldi/h0;->b(Lmg/e1;Ljava/util/List;)Ldi/o0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    instance-of v1, v0, Lpg/t;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1, p1}, Ldi/g1;->p(Lei/g;)Ldi/g1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v0, Lpg/t;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lpg/t;->c0(Lei/g;)Lwh/h;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v1, p1, p0}, Ldi/s1;->u(Ldi/g1;Lwh/h;Lkotlin/jvm/functions/Function1;)Ldi/o0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_2
    invoke-interface {v0}, Lmg/h;->s()Ldi/o0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
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

    invoke-virtual {p0, p1}, Lpg/a$a$a;->a(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method
