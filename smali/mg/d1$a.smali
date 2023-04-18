.class public final Lmg/d1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/d1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmg/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lmg/d1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/d1$a;

    invoke-direct {v0}, Lmg/d1$a;-><init>()V

    sput-object v0, Lmg/d1$a;->a:Lmg/d1$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldi/g1;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g1;",
            "Ljava/util/Collection<",
            "+",
            "Ldi/g0;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ldi/g1;",
            "+",
            "Ljava/lang/Iterable<",
            "+",
            "Ldi/g0;",
            ">;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ldi/g0;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    const-string v0, "currentTypeConstructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superTypes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "neighbors"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reportLoop"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
