.class final Lgg/e0$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/e0;-><init>(Ldi/g0;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldg/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ldg/c;",
        "a",
        "()Ldg/c;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/e0;


# direct methods
.method constructor <init>(Lgg/e0;)V
    .locals 0

    iput-object p1, p0, Lgg/e0$b;->k:Lgg/e0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldg/c;
    .locals 2

    iget-object v0, p0, Lgg/e0$b;->k:Lgg/e0;

    invoke-virtual {v0}, Lgg/e0;->o()Ldi/g0;

    move-result-object v1

    invoke-static {v0, v1}, Lgg/e0;->c(Lgg/e0;Ldi/g0;)Ldg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/e0$b;->a()Ldg/c;

    move-result-object v0

    return-object v0
.end method
