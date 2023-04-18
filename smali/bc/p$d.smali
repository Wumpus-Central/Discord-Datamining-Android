.class final Lbc/p$d;
.super Lbc/p$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<InElementT:",
        "Ljava/lang/Object;",
        "OutElementT:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/p$c<",
        "TInElementT;TOutElementT;",
        "Lj$/util/Spliterator<",
        "TOutElementT;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lj$/util/Spliterator;Lj$/util/Spliterator;Lj$/util/function/Function;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/Spliterator<",
            "TOutElementT;>;",
            "Lj$/util/Spliterator<",
            "TInElementT;>;",
            "Lj$/util/function/Function<",
            "-TInElementT;",
            "Lj$/util/Spliterator<",
            "TOutElementT;>;>;IJ)V"
        }
    .end annotation

    new-instance v4, Lbc/u;

    invoke-direct {v4}, Lbc/u;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-wide v6, p5

    invoke-direct/range {v0 .. v7}, Lbc/p$c;-><init>(Lj$/util/Spliterator;Lj$/util/Spliterator;Lj$/util/function/Function;Lbc/p$c$a;IJ)V

    return-void
.end method
