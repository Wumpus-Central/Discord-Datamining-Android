.class public final Ldi/u0;
.super Ldi/l1;
.source "SourceFile"


# instance fields
.field private final a:Lmg/f1;

.field private final b:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lmg/f1;)V
    .locals 1

    .line 1
    const-string v0, "typeParameter"

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
    iput-object p1, p0, Ldi/u0;->a:Lmg/f1;

    .line 10
    .line 11
    sget-object p1, Llf/p;->l:Llf/p;

    .line 12
    .line 13
    new-instance v0, Ldi/u0$a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ldi/u0$a;-><init>(Ldi/u0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Ldi/u0;->b:Lkotlin/Lazy;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public static final synthetic c(Ldi/u0;)Lmg/f1;
    .locals 0

    iget-object p0, p0, Ldi/u0;->a:Lmg/f1;

    return-object p0
.end method

.method private final d()Ldi/g0;
    .locals 1

    iget-object v0, p0, Ldi/u0;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/g0;

    return-object v0
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

    invoke-direct {p0}, Ldi/u0;->d()Ldi/g0;

    move-result-object v0

    return-object v0
.end method

.method public p(Lei/g;)Ldi/k1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
