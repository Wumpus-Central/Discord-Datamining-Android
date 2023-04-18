.class final Lwg/e$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/e;-><init>(Lch/a;Lyg/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Llh/f;",
        "+",
        "Lrh/v;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final k:Lwg/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwg/e$a;

    invoke-direct {v0}, Lwg/e$a;-><init>()V

    sput-object v0, Lwg/e$a;->k:Lwg/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/v;",
            ">;"
        }
    .end annotation

    sget-object v0, Lwg/c;->a:Lwg/c;

    invoke-virtual {v0}, Lwg/c;->b()Llh/f;

    move-result-object v0

    new-instance v1, Lrh/v;

    const-string v2, "Deprecated in Java"

    invoke-direct {v1, v2}, Lrh/v;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lmf/s;->e(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwg/e$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
