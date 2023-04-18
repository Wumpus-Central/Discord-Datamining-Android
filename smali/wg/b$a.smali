.class final Lwg/b$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/b;-><init>(Lyg/g;Lch/a;Llh/c;)V
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
.field final synthetic k:Lyg/g;

.field final synthetic l:Lwg/b;


# direct methods
.method constructor <init>(Lyg/g;Lwg/b;)V
    .locals 0

    iput-object p1, p0, Lwg/b$a;->k:Lyg/g;

    iput-object p2, p0, Lwg/b$a;->l:Lwg/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/o0;
    .locals 2

    iget-object v0, p0, Lwg/b$a;->k:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->d()Lmg/h0;

    move-result-object v0

    invoke-interface {v0}, Lmg/h0;->o()Ljg/h;

    move-result-object v0

    iget-object v1, p0, Lwg/b$a;->l:Lwg/b;

    invoke-virtual {v1}, Lwg/b;->d()Llh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljg/h;->o(Llh/c;)Lmg/e;

    move-result-object v0

    invoke-interface {v0}, Lmg/e;->s()Ldi/o0;

    move-result-object v0

    const-string v1, "c.module.builtIns.getBui\u2026qName(fqName).defaultType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwg/b$a;->a()Ldi/o0;

    move-result-object v0

    return-object v0
.end method
