.class final Lj$/util/stream/n3;
.super Lj$/util/stream/o3;
.source "SourceFile"

# interfaces
.implements Lj$/util/B;


# direct methods
.method constructor <init>(Lj$/util/B;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/o3;-><init>(Lj$/util/D;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/B;JJJJ)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lj$/util/stream/o3;-><init>(Lj$/util/D;JJJJ)V

    return-void
.end method


# virtual methods
.method protected final c(Lj$/util/Spliterator;JJJJ)Lj$/util/Spliterator;
    .locals 11

    move-object v1, p1

    check-cast v1, Lj$/util/B;

    .line 0
    new-instance v10, Lj$/util/stream/n3;

    move-object v0, v10

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lj$/util/stream/n3;-><init>(Lj$/util/B;JJJJ)V

    return-object v10
.end method

.method protected final d()Ljava/lang/Object;
    .locals 2

    .line 0
    new-instance v0, Lj$/util/stream/m3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj$/util/stream/m3;-><init>(I)V

    return-object v0
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->e(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->j(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
