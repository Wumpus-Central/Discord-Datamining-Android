.class public abstract Ldi/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/n1$b;
    }
.end annotation


# static fields
.field public static final a:Ldi/n1$b;

.field public static final b:Ldi/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldi/n1$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldi/n1$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldi/n1;->a:Ldi/n1$b;

    .line 8
    .line 9
    new-instance v0, Ldi/n1$a;

    .line 10
    .line 11
    invoke-direct {v0}, Ldi/n1$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldi/n1;->b:Ldi/n1;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Ldi/p1;
    .locals 2

    invoke-static {p0}, Ldi/p1;->g(Ldi/n1;)Ldi/p1;

    move-result-object v0

    const-string v1, "create(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lng/g;)Lng/g;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract e(Ldi/g0;)Ldi/k1;
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Ldi/g0;Ldi/w1;)Ldi/g0;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h()Ldi/n1;
    .locals 1

    new-instance v0, Ldi/n1$c;

    invoke-direct {v0, p0}, Ldi/n1$c;-><init>(Ldi/n1;)V

    return-object v0
.end method
