.class public final Lpg/l0$b;
.super Lpg/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final w:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/a;",
            "Lmg/j1;",
            "I",
            "Lng/g;",
            "Llh/f;",
            "Ldi/g0;",
            "ZZZ",
            "Ldi/g0;",
            "Lmg/a1;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lmg/k1;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "containingDeclaration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotations"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "outType"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "source"

    .line 22
    .line 23
    invoke-static {p11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "destructuringVariables"

    .line 27
    .line 28
    invoke-static {p12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct/range {p0 .. p11}, Lpg/l0;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p12}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lpg/l0$b;->w:Lkotlin/Lazy;

    .line 39
    .line 40
    return-void
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


# virtual methods
.method public final N0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/k1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpg/l0$b;->w:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public Z(Lmg/a;Llh/f;I)Lmg/j1;
    .locals 15

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "newName"

    .line 9
    .line 10
    move-object/from16 v6, p2

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lpg/l0$b;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {p0}, Lng/b;->getAnnotations()Lng/g;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-string v1, "annotations"

    .line 23
    .line 24
    invoke-static {v5, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lpg/m0;->getType()Ldi/g0;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    const-string v1, "type"

    .line 32
    .line 33
    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lpg/l0;->s0()Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-virtual {p0}, Lpg/l0;->b0()Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    invoke-virtual {p0}, Lpg/l0;->Y()Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    invoke-virtual {p0}, Lpg/l0;->j0()Ldi/g0;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    sget-object v12, Lmg/a1;->a:Lmg/a1;

    .line 53
    .line 54
    const-string v1, "NO_SOURCE"

    .line 55
    .line 56
    invoke-static {v12, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v13, Lpg/l0$b$a;

    .line 60
    .line 61
    move-object v14, p0

    .line 62
    invoke-direct {v13, p0}, Lpg/l0$b$a;-><init>(Lpg/l0$b;)V

    .line 63
    .line 64
    .line 65
    move-object v1, v0

    .line 66
    move/from16 v4, p3

    .line 67
    .line 68
    invoke-direct/range {v1 .. v13}, Lpg/l0$b;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    return-object v0
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
