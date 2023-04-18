.class final Lgg/v$a$b;
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
        "Ljava/util/Collection<",
        "+",
        "Lgg/l<",
        "*>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u001e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0001 \u0002*\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "Lgg/l;",
        "kotlin.jvm.PlatformType",
        "a",
        "()Ljava/util/Collection;"
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

.field final synthetic l:Lgg/v$a;


# direct methods
.method constructor <init>(Lgg/v;Lgg/v$a;)V
    .locals 0

    iput-object p1, p0, Lgg/v$a$b;->k:Lgg/v;

    iput-object p2, p0, Lgg/v$a$b;->l:Lgg/v$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lgg/l<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/v$a$b;->k:Lgg/v;

    iget-object v1, p0, Lgg/v$a$b;->l:Lgg/v$a;

    invoke-virtual {v1}, Lgg/v$a;->f()Lwh/h;

    move-result-object v1

    sget-object v2, Lgg/p$c;->k:Lgg/p$c;

    invoke-virtual {v0, v1, v2}, Lgg/p;->B(Lwh/h;Lgg/p$c;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgg/v$a$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
