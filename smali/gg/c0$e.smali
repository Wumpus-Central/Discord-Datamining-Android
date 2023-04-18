.class final Lgg/c0$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/c0;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/u0;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/u0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\u0008\u0000\u0010\u0000 \u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "V",
        "Lmg/u0;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lmg/u0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/c0<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgg/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/c0<",
            "+TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lgg/c0$e;->k:Lgg/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lmg/u0;
    .locals 3

    iget-object v0, p0, Lgg/c0$e;->k:Lgg/c0;

    invoke-virtual {v0}, Lgg/c0;->v()Lgg/p;

    move-result-object v0

    iget-object v1, p0, Lgg/c0$e;->k:Lgg/c0;

    invoke-virtual {v1}, Lgg/c0;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgg/c0$e;->k:Lgg/c0;

    invoke-virtual {v2}, Lgg/c0;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lgg/p;->w(Ljava/lang/String;Ljava/lang/String;)Lmg/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/c0$e;->a()Lmg/u0;

    move-result-object v0

    return-object v0
.end method
