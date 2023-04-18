.class final Leh/h$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/h;->b(Lmg/l0;Leh/r;)Lwh/h;
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
        "Llh/f;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final k:Leh/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leh/h$b;

    invoke-direct {v0}, Leh/h$b;-><init>()V

    sput-object v0, Leh/h$b;->k:Leh/h$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leh/h$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
