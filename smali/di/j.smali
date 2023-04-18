.class public final Ldi/j;
.super Ldi/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldi/a1<",
        "Ldi/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lng/g;


# direct methods
.method public constructor <init>(Lng/g;)V
    .locals 1

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldi/a1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldi/j;->a:Lng/g;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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


# virtual methods
.method public bridge synthetic a(Ldi/a1;)Ldi/a1;
    .locals 0

    check-cast p1, Ldi/j;

    invoke-virtual {p0, p1}, Ldi/j;->d(Ldi/j;)Ldi/j;

    move-result-object p1

    return-object p1
.end method

.method public b()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "+",
            "Ldi/j;",
            ">;"
        }
    .end annotation

    const-class v0, Ldi/j;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ldi/a1;)Ldi/a1;
    .locals 0

    check-cast p1, Ldi/j;

    invoke-virtual {p0, p1}, Ldi/j;->f(Ldi/j;)Ldi/j;

    move-result-object p1

    return-object p1
.end method

.method public d(Ldi/j;)Ldi/j;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ldi/j;

    iget-object v1, p0, Ldi/j;->a:Lng/g;

    iget-object p1, p1, Ldi/j;->a:Lng/g;

    invoke-static {v1, p1}, Lng/i;->a(Lng/g;Lng/g;)Lng/g;

    move-result-object p1

    invoke-direct {v0, p1}, Ldi/j;-><init>(Lng/g;)V

    return-object v0
.end method

.method public final e()Lng/g;
    .locals 1

    iget-object v0, p0, Ldi/j;->a:Lng/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ldi/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Ldi/j;

    .line 8
    .line 9
    iget-object p1, p1, Ldi/j;->a:Lng/g;

    .line 10
    .line 11
    iget-object v0, p0, Ldi/j;->a:Lng/g;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public f(Ldi/j;)Ldi/j;
    .locals 0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ldi/j;->a:Lng/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
