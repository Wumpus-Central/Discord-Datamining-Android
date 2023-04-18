.class public final Ldi/u;
.super Ldi/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/u$a;
    }
.end annotation


# static fields
.field public static final e:Ldi/u$a;


# instance fields
.field private final c:Ldi/n1;

.field private final d:Ldi/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/u;->e:Ldi/u$a;

    return-void
.end method

.method private constructor <init>(Ldi/n1;Ldi/n1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldi/n1;-><init>()V

    .line 2
    iput-object p1, p0, Ldi/u;->c:Ldi/n1;

    .line 3
    iput-object p2, p0, Ldi/u;->d:Ldi/n1;

    return-void
.end method

.method public synthetic constructor <init>(Ldi/n1;Ldi/n1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldi/u;-><init>(Ldi/n1;Ldi/n1;)V

    return-void
.end method

.method public static final i(Ldi/n1;Ldi/n1;)Ldi/n1;
    .locals 1

    sget-object v0, Ldi/u;->e:Ldi/u$a;

    invoke-virtual {v0, p0, p1}, Ldi/u$a;->a(Ldi/n1;Ldi/n1;)Ldi/n1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Ldi/u;->c:Ldi/n1;

    invoke-virtual {v0}, Ldi/n1;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ldi/u;->d:Ldi/n1;

    invoke-virtual {v0}, Ldi/n1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Ldi/u;->c:Ldi/n1;

    invoke-virtual {v0}, Ldi/n1;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ldi/u;->d:Ldi/n1;

    invoke-virtual {v0}, Ldi/n1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public d(Lng/g;)Lng/g;
    .locals 2

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldi/u;->d:Ldi/n1;

    .line 7
    .line 8
    iget-object v1, p0, Ldi/u;->c:Ldi/n1;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ldi/n1;->d(Lng/g;)Lng/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ldi/n1;->d(Lng/g;)Lng/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
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
    iget-object v0, p0, Ldi/u;->c:Ldi/n1;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ldi/u;->d:Ldi/n1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ldi/n1;->e(Ldi/g0;)Ldi/k1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    return-object v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Ldi/g0;Ldi/w1;)Ldi/g0;
    .locals 2

    .line 1
    const-string v0, "topLevelType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldi/u;->d:Ldi/n1;

    .line 12
    .line 13
    iget-object v1, p0, Ldi/u;->c:Ldi/n1;

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2}, Ldi/n1;->g(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1, p2}, Ldi/n1;->g(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
