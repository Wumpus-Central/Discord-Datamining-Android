.class public final Llg/a;
.super Lwh/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/a$a;
    }
.end annotation


# static fields
.field public static final e:Llg/a$a;

.field private static final f:Llh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llg/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Llg/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llg/a;->e:Llg/a$a;

    .line 8
    .line 9
    const-string v0, "clone"

    .line 10
    .line 11
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "identifier(\"clone\")"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Llg/a;->f:Llh/f;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public constructor <init>(Lci/n;Lmg/e;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lwh/e;-><init>(Lci/n;Lmg/e;)V

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

.method public static final synthetic m()Llh/f;
    .locals 1

    sget-object v0, Llg/a;->f:Llh/f;

    return-object v0
.end method


# virtual methods
.method protected i()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/y;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lwh/e;->l()Lmg/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lng/g;->f:Lng/g$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Llg/a;->f:Llh/f;

    .line 12
    .line 13
    sget-object v3, Lmg/b$a;->k:Lmg/b$a;

    .line 14
    .line 15
    sget-object v4, Lmg/a1;->a:Lmg/a1;

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3, v4}, Lpg/g0;->l1(Lmg/m;Lng/g;Llh/f;Lmg/b$a;Lmg/a1;)Lpg/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-virtual {p0}, Lwh/e;->l()Lmg/e;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Lmg/e;->J0()Lmg/x0;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    invoke-virtual {p0}, Lwh/e;->l()Lmg/e;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Lth/c;->j(Lmg/m;)Ljg/h;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljg/h;->i()Ldi/o0;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    sget-object v12, Lmg/e0;->n:Lmg/e0;

    .line 55
    .line 56
    sget-object v13, Lmg/t;->c:Lmg/u;

    .line 57
    .line 58
    move-object v5, v0

    .line 59
    invoke-virtual/range {v5 .. v13}, Lpg/g0;->n1(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;)Lpg/g0;

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
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
