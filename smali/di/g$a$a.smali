.class final Ldi/g$a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/g$a;-><init>(Ldi/g;Lei/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "Ldi/g0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/g$a;

.field final synthetic l:Ldi/g;


# direct methods
.method constructor <init>(Ldi/g$a;Ldi/g;)V
    .locals 0

    iput-object p1, p0, Ldi/g$a$a;->k:Ldi/g$a;

    iput-object p2, p0, Ldi/g$a$a;->l:Ldi/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldi/g$a$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Ldi/g$a$a;->k:Ldi/g$a;

    invoke-static {v0}, Ldi/g$a;->c(Ldi/g$a;)Lei/g;

    move-result-object v0

    iget-object v1, p0, Ldi/g$a$a;->l:Ldi/g;

    invoke-virtual {v1}, Ldi/g;->m()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lei/h;->b(Lei/g;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
