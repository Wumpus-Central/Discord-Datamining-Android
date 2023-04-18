.class final Ldh/a$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldh/a;->b(Lhi/i;Ljava/lang/Iterable;Ldh/q;Z)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Ldh/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldh/q;

.field final synthetic l:[Ldh/e;


# direct methods
.method constructor <init>(Ldh/q;[Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ldh/a$b;->k:Ldh/q;

    iput-object p2, p0, Ldh/a$b;->l:[Ldh/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ldh/e;
    .locals 2

    iget-object v0, p0, Ldh/a$b;->k:Ldh/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ldh/q;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldh/e;

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ldh/a$b;->l:[Ldh/e;

    if-ltz p1, :cond_1

    invoke-static {v0}, Lkotlin/collections/b;->I([Ljava/lang/Object;)I

    move-result v1

    if-gt p1, v1, :cond_1

    aget-object v0, v0, p1

    goto :goto_0

    :cond_1
    sget-object p1, Ldh/e;->e:Ldh/e$a;

    invoke-virtual {p1}, Ldh/e$a;->a()Ldh/e;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ldh/a$b;->a(I)Ldh/e;

    move-result-object p1

    return-object p1
.end method
