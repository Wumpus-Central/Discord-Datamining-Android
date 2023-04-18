.class final Ljg/i$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljg/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Llh/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljg/i;


# direct methods
.method constructor <init>(Ljg/i;)V
    .locals 0

    iput-object p1, p0, Ljg/i$c;->k:Ljg/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Llh/c;
    .locals 2

    sget-object v0, Ljg/k;->u:Llh/c;

    iget-object v1, p0, Ljg/i$c;->k:Ljg/i;

    invoke-virtual {v1}, Ljg/i;->f()Llh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Llh/c;->c(Llh/f;)Llh/c;

    move-result-object v0

    const-string v1, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljg/i$c;->a()Llh/c;

    move-result-object v0

    return-object v0
.end method
