.class final Ldi/j1$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/j1;-><init>(Ldi/x;Ldi/i1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/j1$b;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/j1;


# direct methods
.method constructor <init>(Ldi/j1;)V
    .locals 0

    iput-object p1, p0, Ldi/j1$d;->k:Ldi/j1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/j1$b;)Ldi/g0;
    .locals 2

    iget-object v0, p0, Ldi/j1$d;->k:Ldi/j1;

    invoke-virtual {p1}, Ldi/j1$b;->b()Lmg/f1;

    move-result-object v1

    invoke-virtual {p1}, Ldi/j1$b;->a()Ldi/y;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ldi/j1;->a(Ldi/j1;Lmg/f1;Ldi/y;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/j1$b;

    invoke-virtual {p0, p1}, Ldi/j1$d;->a(Ldi/j1$b;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
