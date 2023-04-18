.class final Lbi/d$j;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d;-><init>(Lzh/m;Lgh/c;Lih/c;Lih/a;Lmg/a1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/h1<",
        "Ldi/o0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d;


# direct methods
.method constructor <init>(Lbi/d;)V
    .locals 0

    iput-object p1, p0, Lbi/d$j;->k:Lbi/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lmg/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d$j;->k:Lbi/d;

    invoke-static {v0}, Lbi/d;->O0(Lbi/d;)Lmg/h1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/d$j;->a()Lmg/h1;

    move-result-object v0

    return-object v0
.end method
