.class final Lng/j$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng/j;-><init>(Ljg/h;Llh/c;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lng/j;


# direct methods
.method constructor <init>(Lng/j;)V
    .locals 0

    iput-object p1, p0, Lng/j$a;->k:Lng/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/o0;
    .locals 2

    iget-object v0, p0, Lng/j$a;->k:Lng/j;

    invoke-static {v0}, Lng/j;->b(Lng/j;)Ljg/h;

    move-result-object v0

    iget-object v1, p0, Lng/j$a;->k:Lng/j;

    invoke-virtual {v1}, Lng/j;->d()Llh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljg/h;->o(Llh/c;)Lmg/e;

    move-result-object v0

    invoke-interface {v0}, Lmg/e;->s()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lng/j$a;->a()Ldi/o0;

    move-result-object v0

    return-object v0
.end method
