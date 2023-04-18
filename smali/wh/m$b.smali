.class final Lwh/m$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/m;-><init>(Lwh/h;Ldi/p1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/p1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/p1;


# direct methods
.method constructor <init>(Ldi/p1;)V
    .locals 0

    iput-object p1, p0, Lwh/m$b;->k:Ldi/p1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/p1;
    .locals 1

    iget-object v0, p0, Lwh/m$b;->k:Ldi/p1;

    invoke-virtual {v0}, Ldi/p1;->j()Ldi/n1;

    move-result-object v0

    invoke-virtual {v0}, Ldi/n1;->c()Ldi/p1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwh/m$b;->a()Ldi/p1;

    move-result-object v0

    return-object v0
.end method
