.class public abstract Ldi/h1;
.super Ldi/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/h1$a;
    }
.end annotation


# static fields
.field public static final c:Ldi/h1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/h1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/h1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/h1;->c:Ldi/h1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldi/n1;-><init>()V

    return-void
.end method

.method public static final i(Ldi/g1;Ljava/util/List;)Ldi/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g1;",
            "Ljava/util/List<",
            "+",
            "Ldi/k1;",
            ">;)",
            "Ldi/n1;"
        }
    .end annotation

    sget-object v0, Ldi/h1;->c:Ldi/h1$a;

    invoke-virtual {v0, p0, p1}, Ldi/h1$a;->b(Ldi/g1;Ljava/util/List;)Ldi/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/Map;)Ldi/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ldi/g1;",
            "+",
            "Ldi/k1;",
            ">;)",
            "Ldi/h1;"
        }
    .end annotation

    sget-object v0, Ldi/h1;->c:Ldi/h1$a;

    invoke-virtual {v0, p0}, Ldi/h1$a;->c(Ljava/util/Map;)Ldi/h1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(Ldi/g0;)Ldi/k1;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Ldi/h1;->k(Ldi/g1;)Ldi/k1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public abstract k(Ldi/g1;)Ldi/k1;
.end method
