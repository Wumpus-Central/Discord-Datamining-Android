.class final Lgg/c0$d$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/c0$d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/w0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0000 \u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "V",
        "Lmg/w0;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lmg/w0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/c0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/c0$d<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgg/c0$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/c0$d<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lgg/c0$d$b;->k:Lgg/c0$d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lmg/w0;
    .locals 3

    iget-object v0, p0, Lgg/c0$d$b;->k:Lgg/c0$d;

    invoke-virtual {v0}, Lgg/c0$a;->B()Lgg/c0;

    move-result-object v0

    invoke-virtual {v0}, Lgg/c0;->D()Lmg/u0;

    move-result-object v0

    invoke-interface {v0}, Lmg/u0;->h()Lmg/w0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lgg/c0$d$b;->k:Lgg/c0$d;

    invoke-virtual {v0}, Lgg/c0$a;->B()Lgg/c0;

    move-result-object v0

    invoke-virtual {v0}, Lgg/c0;->D()Lmg/u0;

    move-result-object v0

    sget-object v1, Lng/g;->f:Lng/g$a;

    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    move-result-object v2

    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lph/d;->e(Lmg/u0;Lng/g;Lng/g;)Lpg/e0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/c0$d$b;->a()Lmg/w0;

    move-result-object v0

    return-object v0
.end method
