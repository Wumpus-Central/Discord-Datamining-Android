.class final enum Lhj/k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lfj/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhj/k;",
        ">;",
        "Lfj/p<",
        "Ljava/math/BigDecimal;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lhj/k;

.field private static final synthetic l:[Lhj/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhj/k;

    .line 2
    .line 3
    const-string v1, "FRACTION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lhj/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhj/k;->k:Lhj/k;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lhj/k;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lhj/k;->l:[Lhj/k;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhj/k;
    .locals 1

    const-class v0, Lhj/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhj/k;

    return-object p0
.end method

.method public static values()[Lhj/k;
    .locals 1

    sget-object v0, Lhj/k;->l:[Lhj/k;

    invoke-virtual {v0}, [Lhj/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhj/k;

    return-object v0
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhj/k;->j()Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lfj/o;Lfj/o;)I
    .locals 0

    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/math/BigDecimal;

    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1
.end method

.method public b()C
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Ljava/math/BigDecimal;
    .locals 1

    sget-object v0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lhj/k;->a(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhj/k;->c()Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljava/math/BigDecimal;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/math/BigDecimal;

    return-object v0
.end method

.method public j()Ljava/math/BigDecimal;
    .locals 1

    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
