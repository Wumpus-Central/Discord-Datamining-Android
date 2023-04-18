.class final Ldi/f$b$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/f$b;->a(Ldi/f1$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/f1;

.field final synthetic l:Lhi/p;

.field final synthetic m:Lhi/k;

.field final synthetic n:Lhi/k;


# direct methods
.method constructor <init>(Ldi/f1;Lhi/p;Lhi/k;Lhi/k;)V
    .locals 0

    iput-object p1, p0, Ldi/f$b$a;->k:Ldi/f1;

    iput-object p2, p0, Ldi/f$b$a;->l:Lhi/p;

    iput-object p3, p0, Ldi/f$b$a;->m:Lhi/k;

    iput-object p4, p0, Ldi/f$b$a;->n:Lhi/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 4

    .line 1
    sget-object v0, Ldi/f;->a:Ldi/f;

    iget-object v1, p0, Ldi/f$b$a;->k:Ldi/f1;

    iget-object v2, p0, Ldi/f$b$a;->l:Lhi/p;

    iget-object v3, p0, Ldi/f$b$a;->m:Lhi/k;

    invoke-interface {v2, v3}, Lhi/p;->B0(Lhi/k;)Lhi/l;

    move-result-object v2

    iget-object v3, p0, Ldi/f$b$a;->n:Lhi/k;

    invoke-virtual {v0, v1, v2, v3}, Ldi/f;->q(Ldi/f1;Lhi/l;Lhi/k;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Ldi/f$b$a;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
