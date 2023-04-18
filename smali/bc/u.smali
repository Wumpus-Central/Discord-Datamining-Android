.class public final synthetic Lbc/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc/p$c$a;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj$/util/Spliterator;Lj$/util/Spliterator;Lj$/util/function/Function;IJ)Lj$/util/Spliterator;
    .locals 8

    new-instance v7, Lbc/p$d;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lbc/p$d;-><init>(Lj$/util/Spliterator;Lj$/util/Spliterator;Lj$/util/function/Function;IJ)V

    return-object v7
.end method
