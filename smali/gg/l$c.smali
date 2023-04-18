.class final Lgg/l$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/l;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lgg/e0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\u0008\u0000\u0010\u0000 \u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "R",
        "Lgg/e0;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lgg/e0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/l<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgg/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/l<",
            "+TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lgg/l$c;->k:Lgg/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lgg/e0;
    .locals 4

    new-instance v0, Lgg/e0;

    iget-object v1, p0, Lgg/l$c;->k:Lgg/l;

    invoke-virtual {v1}, Lgg/l;->x()Lmg/b;

    move-result-object v1

    invoke-interface {v1}, Lmg/a;->getReturnType()Ldi/g0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    new-instance v2, Lgg/l$c$a;

    iget-object v3, p0, Lgg/l$c;->k:Lgg/l;

    invoke-direct {v2, v3}, Lgg/l$c$a;-><init>(Lgg/l;)V

    invoke-direct {v0, v1, v2}, Lgg/e0;-><init>(Ldi/g0;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/l$c;->a()Lgg/e0;

    move-result-object v0

    return-object v0
.end method
