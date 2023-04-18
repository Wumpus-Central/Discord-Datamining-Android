.class final Ldi/j1$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Lfi/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/j1;


# direct methods
.method constructor <init>(Ldi/j1;)V
    .locals 0

    iput-object p1, p0, Ldi/j1$c;->k:Ldi/j1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lfi/h;
    .locals 4

    sget-object v0, Lfi/j;->G0:Lfi/j;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Ldi/j1$c;->k:Ldi/j1;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldi/j1$c;->a()Lfi/h;

    move-result-object v0

    return-object v0
.end method
