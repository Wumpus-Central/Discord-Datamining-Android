.class final Lyg/a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg/a;->c(Lyg/g;Lmg/g;Lch/z;I)Lyg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lvg/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/g;

.field final synthetic l:Lmg/g;


# direct methods
.method constructor <init>(Lyg/g;Lmg/g;)V
    .locals 0

    iput-object p1, p0, Lyg/a$a;->k:Lyg/g;

    iput-object p2, p0, Lyg/a$a;->l:Lmg/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lvg/y;
    .locals 2

    iget-object v0, p0, Lyg/a$a;->k:Lyg/g;

    iget-object v1, p0, Lyg/a$a;->l:Lmg/g;

    invoke-interface {v1}, Lng/a;->getAnnotations()Lng/g;

    move-result-object v1

    invoke-static {v0, v1}, Lyg/a;->g(Lyg/g;Lng/g;)Lvg/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyg/a$a;->a()Lvg/y;

    move-result-object v0

    return-object v0
.end method
