.class final Ldi/g$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/g;-><init>(Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/g$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/g;


# direct methods
.method constructor <init>(Ldi/g;)V
    .locals 0

    iput-object p1, p0, Ldi/g$c;->k:Ldi/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/g$b;
    .locals 2

    new-instance v0, Ldi/g$b;

    iget-object v1, p0, Ldi/g$c;->k:Ldi/g;

    invoke-virtual {v1}, Ldi/g;->h()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ldi/g$b;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldi/g$c;->a()Ldi/g$b;

    move-result-object v0

    return-object v0
.end method
