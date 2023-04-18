.class abstract Leh/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh/r$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Leh/d;


# direct methods
.method public constructor <init>(Leh/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Leh/d$a;->a:Leh/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Llh/f;Llh/b;)Leh/r$a;
    .locals 4

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Leh/d$a;->a:Leh/d;

    .line 12
    .line 13
    sget-object v2, Lmg/a1;->a:Lmg/a1;

    .line 14
    .line 15
    const-string v3, "NO_SOURCE"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2, v2, v0}, Leh/d;->v(Llh/b;Lmg/a1;Ljava/util/List;)Leh/r$a;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Leh/d$a$a;

    .line 28
    .line 29
    invoke-direct {v1, p2, p0, p1, v0}, Leh/d$a$a;-><init>(Leh/r$a;Leh/d$a;Llh/f;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-object v1
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
.end method

.method public c(Llh/f;)Leh/r$b;
    .locals 2

    new-instance v0, Leh/d$a$b;

    iget-object v1, p0, Leh/d$a;->a:Leh/d;

    invoke-direct {v0, v1, p1, p0}, Leh/d$a$b;-><init>(Leh/d;Llh/f;Leh/d$a;)V

    return-object v0
.end method

.method public d(Llh/f;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Leh/d$a;->a:Leh/d;

    invoke-static {v0, p1, p2}, Leh/d;->H(Leh/d;Llh/f;Ljava/lang/Object;)Lrh/g;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Leh/d$a;->h(Llh/f;Lrh/g;)V

    return-void
.end method

.method public e(Llh/f;Lrh/f;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lrh/q;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Lrh/q;-><init>(Lrh/f;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Leh/d$a;->h(Llh/f;Lrh/g;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
.end method

.method public f(Llh/f;Llh/b;Llh/f;)V
    .locals 1

    .line 1
    const-string v0, "enumClassId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enumEntryName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lrh/j;

    .line 12
    .line 13
    invoke-direct {v0, p2, p3}, Lrh/j;-><init>(Llh/b;Llh/f;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Leh/d$a;->h(Llh/f;Lrh/g;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
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

.method public abstract g(Llh/f;Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Ljava/util/ArrayList<",
            "Lrh/g<",
            "*>;>;)V"
        }
    .end annotation
.end method

.method public abstract h(Llh/f;Lrh/g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Lrh/g<",
            "*>;)V"
        }
    .end annotation
.end method
