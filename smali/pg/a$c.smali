.class Lpg/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/a;-><init>(Lci/n;Llh/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/x0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/a;


# direct methods
.method constructor <init>(Lpg/a;)V
    .locals 0

    iput-object p1, p0, Lpg/a$c;->k:Lpg/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lmg/x0;
    .locals 2

    new-instance v0, Lpg/q;

    iget-object v1, p0, Lpg/a$c;->k:Lpg/a;

    invoke-direct {v0, v1}, Lpg/q;-><init>(Lmg/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpg/a$c;->a()Lmg/x0;

    move-result-object v0

    return-object v0
.end method
