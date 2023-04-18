.class public abstract Ldi/e;
.super Ldi/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/e$a;
    }
.end annotation


# static fields
.field public static final o:Ldi/e$a;


# instance fields
.field private final l:Lei/n;

.field private final m:Z

.field private final n:Lwh/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/e;->o:Ldi/e$a;

    return-void
.end method

.method public constructor <init>(Lei/n;Z)V
    .locals 2

    .line 1
    const-string v0, "originalTypeVariable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldi/o0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldi/e;->l:Lei/n;

    .line 10
    .line 11
    iput-boolean p2, p0, Ldi/e;->m:Z

    .line 12
    .line 13
    sget-object p2, Lfi/g;->p:Lfi/g;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    new-array v0, v0, [Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    aput-object p1, v0, v1

    .line 24
    .line 25
    invoke-static {p2, v0}, Lfi/k;->b(Lfi/g;[Ljava/lang/String;)Lfi/f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ldi/e;->n:Lwh/h;

    .line 30
    .line 31
    return-void
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


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Ldi/c1;
    .locals 1

    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Ldi/e;->m:Z

    return v0
.end method

.method public bridge synthetic P0(Lei/g;)Ldi/g0;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/e;->Y0(Lei/g;)Ldi/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/e;->U0(Z)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lei/g;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/e;->Y0(Lei/g;)Ldi/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Ldi/c1;)Ldi/v1;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/e;->V0(Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Ldi/o0;
    .locals 1

    invoke-virtual {p0}, Ldi/e;->O0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ldi/e;->X0(Z)Ldi/e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public V0(Ldi/c1;)Ldi/o0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final W0()Lei/n;
    .locals 1

    iget-object v0, p0, Ldi/e;->l:Lei/n;

    return-object v0
.end method

.method public abstract X0(Z)Ldi/e;
.end method

.method public Y0(Lei/g;)Ldi/e;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public p()Lwh/h;
    .locals 1

    iget-object v0, p0, Ldi/e;->n:Lwh/h;

    return-object v0
.end method
