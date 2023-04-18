.class final Lvg/l$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg/l;->b(Lmg/a;Lmg/a;Lmg/e;)Lph/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/j1;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lvg/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvg/l$b;

    invoke-direct {v0}, Lvg/l$b;-><init>()V

    sput-object v0, Lvg/l$b;->k:Lvg/l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/j1;)Ldi/g0;
    .locals 0

    invoke-interface {p1}, Lmg/i1;->getType()Ldi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/j1;

    invoke-virtual {p0, p1}, Lvg/l$b;->a(Lmg/j1;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
