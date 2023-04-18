.class final Lgg/r$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/r;-><init>(Lgg/p;Lmg/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lgg/r$a<",
        "TV;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0004\u0008\u0000\u0010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "V",
        "Lgg/r$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lgg/r$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/r<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgg/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/r<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lgg/r$b;->k:Lgg/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lgg/r$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/r$a<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lgg/r$a;

    iget-object v1, p0, Lgg/r$b;->k:Lgg/r;

    invoke-direct {v0, v1}, Lgg/r$a;-><init>(Lgg/r;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/r$b;->a()Lgg/r$a;

    move-result-object v0

    return-object v0
.end method
