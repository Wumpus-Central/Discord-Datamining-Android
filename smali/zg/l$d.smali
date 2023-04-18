.class final Lzg/l$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/l;->O(Lmg/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/g0;",
        "Lmg/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lzg/l$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzg/l$d;

    invoke-direct {v0}, Lzg/l$d;-><init>()V

    sput-object v0, Lzg/l$d;->k:Lzg/l$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/g0;)Lmg/e;
    .locals 1

    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    move-result-object p1

    invoke-interface {p1}, Ldi/g1;->q()Lmg/h;

    move-result-object p1

    instance-of v0, p1, Lmg/e;

    if-eqz v0, :cond_0

    check-cast p1, Lmg/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/g0;

    invoke-virtual {p0, p1}, Lzg/l$d;->a(Ldi/g0;)Lmg/e;

    move-result-object p1

    return-object p1
.end method
