.class final Lgg/q$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/y;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lmg/y;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Lmg/y;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/q;

.field final synthetic l:Ljava/lang/String;


# direct methods
.method constructor <init>(Lgg/q;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lgg/q$c;->k:Lgg/q;

    iput-object p2, p0, Lgg/q$c;->l:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lmg/y;
    .locals 3

    iget-object v0, p0, Lgg/q$c;->k:Lgg/q;

    invoke-virtual {v0}, Lgg/q;->v()Lgg/p;

    move-result-object v0

    iget-object v1, p0, Lgg/q$c;->l:Ljava/lang/String;

    iget-object v2, p0, Lgg/q$c;->k:Lgg/q;

    invoke-static {v2}, Lgg/q;->E(Lgg/q;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lgg/p;->u(Ljava/lang/String;Ljava/lang/String;)Lmg/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/q$c;->a()Lmg/y;

    move-result-object v0

    return-object v0
.end method
