.class final Lrh/h$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrh/h;->b(Ljava/util/List;Ljg/i;)Lrh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/h0;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljg/i;


# direct methods
.method constructor <init>(Ljg/i;)V
    .locals 0

    iput-object p1, p0, Lrh/h$b;->k:Ljg/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/h0;)Ldi/g0;
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lmg/h0;->o()Ljg/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lrh/h$b;->k:Ljg/i;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljg/h;->O(Ljg/i;)Ldi/o0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "module.builtIns.getPrimi\u2026KotlinType(componentType)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/h0;

    invoke-virtual {p0, p1}, Lrh/h$b;->a(Lmg/h0;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
