.class final Lmg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/f1;


# instance fields
.field private final k:Lmg/f1;

.field private final l:Lmg/m;

.field private final m:I


# direct methods
.method public constructor <init>(Lmg/f1;Lmg/m;I)V
    .locals 1

    .line 1
    const-string v0, "originalDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "declarationDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lmg/c;->k:Lmg/f1;

    .line 15
    .line 16
    iput-object p2, p0, Lmg/c;->l:Lmg/m;

    .line 17
    .line 18
    iput p3, p0, Lmg/c;->m:I

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method


# virtual methods
.method public E()Z
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->E()Z

    move-result v0

    return v0
.end method

.method public a()Lmg/f1;
    .locals 2

    .line 3
    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->a()Lmg/f1;

    move-result-object v0

    const-string v1, "originalDescriptor.original"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()Lmg/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lmg/c;->a()Lmg/f1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lmg/c;->a()Lmg/f1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lmg/m;
    .locals 1

    iget-object v0, p0, Lmg/c;->l:Lmg/m;

    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lng/a;->getAnnotations()Lng/g;

    move-result-object v0

    return-object v0
.end method

.method public getIndex()I
    .locals 2

    iget v0, p0, Lmg/c;->m:I

    iget-object v1, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v1}, Lmg/f1;->getIndex()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getName()Llh/f;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/j0;->getName()Llh/f;

    move-result-object v0

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h0()Lci/n;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->h0()Lci/n;

    move-result-object v0

    return-object v0
.end method

.method public j()Lmg/a1;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/p;->j()Lmg/a1;

    move-result-object v0

    return-object v0
.end method

.method public k()Ldi/g1;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->k()Ldi/g1;

    move-result-object v0

    return-object v0
.end method

.method public m0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n()Ldi/w1;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/f1;->n()Ldi/w1;

    move-result-object v0

    return-object v0
.end method

.method public s()Ldi/o0;
    .locals 1

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0}, Lmg/h;->s()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/o<",
            "TR;TD;>;TD;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lmg/c;->k:Lmg/f1;

    invoke-interface {v0, p1, p2}, Lmg/m;->t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lmg/c;->k:Lmg/f1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[inner-copy]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
