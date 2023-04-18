.class final Lgg/v$a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/v$a;-><init>(Lgg/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lrg/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lrg/f;",
        "a",
        "()Lrg/f;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/v;


# direct methods
.method constructor <init>(Lgg/v;)V
    .locals 0

    iput-object p1, p0, Lgg/v$a$a;->k:Lgg/v;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lrg/f;
    .locals 2

    sget-object v0, Lrg/f;->c:Lrg/f$a;

    iget-object v1, p0, Lgg/v$a$a;->k:Lgg/v;

    invoke-virtual {v1}, Lgg/v;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrg/f$a;->a(Ljava/lang/Class;)Lrg/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/v$a$a;->a()Lrg/f;

    move-result-object v0

    return-object v0
.end method
