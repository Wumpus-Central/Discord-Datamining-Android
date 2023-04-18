.class public final Ldi/p;
.super Ldi/r;
.source "SourceFile"

# interfaces
.implements Ldi/n;
.implements Lhi/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/p$a;
    }
.end annotation


# static fields
.field public static final n:Ldi/p$a;


# instance fields
.field private final l:Ldi/o0;

.field private final m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/p;->n:Ldi/p$a;

    return-void
.end method

.method private constructor <init>(Ldi/o0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldi/r;-><init>()V

    .line 2
    iput-object p1, p0, Ldi/p;->l:Ldi/o0;

    .line 3
    iput-boolean p2, p0, Ldi/p;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(Ldi/o0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldi/p;-><init>(Ldi/o0;Z)V

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldi/p;->W0()Ldi/o0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, Lei/n;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldi/p;->W0()Ldi/o0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ldi/g1;->q()Lmg/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v0, v0, Lmg/f1;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 33
    :goto_1
    return v0
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

.method public O0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/p;->U0(Z)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/p;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Ldi/o0;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ldi/p;->W0()Ldi/o0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldi/o0;->U0(Z)Ldi/o0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/p;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/p;->W0()Ldi/o0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Ldi/o0;->V0(Ldi/c1;)Ldi/o0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v1, p0, Ldi/p;->m:Z

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Ldi/p;-><init>(Ldi/o0;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method protected W0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/p;->l:Ldi/o0;

    return-object v0
.end method

.method public bridge synthetic Y0(Ldi/o0;)Ldi/r;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/p;->a1(Ldi/o0;)Ldi/p;

    move-result-object p1

    return-object p1
.end method

.method public final Z0()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/p;->l:Ldi/o0;

    return-object v0
.end method

.method public a1(Ldi/o0;)Ldi/p;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/p;

    .line 7
    .line 8
    iget-boolean v1, p0, Ldi/p;->m:Z

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ldi/p;-><init>(Ldi/o0;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
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
.end method

.method public c0(Ldi/g0;)Ldi/g0;
    .locals 1

    .line 1
    const-string v0, "replacement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldi/g0;->Q0()Ldi/v1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-boolean v0, p0, Ldi/p;->m:Z

    .line 11
    .line 12
    invoke-static {p1, v0}, Ldi/s0;->e(Ldi/v1;Z)Ldi/v1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ldi/p;->W0()Ldi/o0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " & Any"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
