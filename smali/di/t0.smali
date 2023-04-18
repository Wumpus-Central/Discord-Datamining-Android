.class public final Ldi/t0;
.super Ldi/l1;
.source "SourceFile"


# instance fields
.field private final a:Ldi/g0;


# direct methods
.method public constructor <init>(Ljg/h;)V
    .locals 1

    .line 1
    const-string v0, "kotlinBuiltIns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldi/l1;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljg/h;->I()Ldi/o0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "kotlinBuiltIns.nullableAnyType"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ldi/t0;->a:Ldi/g0;

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
.end method


# virtual methods
.method public a()Ldi/w1;
    .locals 1

    sget-object v0, Ldi/w1;->q:Ldi/w1;

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()Ldi/g0;
    .locals 1

    iget-object v0, p0, Ldi/t0;->a:Ldi/g0;

    return-object v0
.end method

.method public p(Lei/g;)Ldi/k1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
