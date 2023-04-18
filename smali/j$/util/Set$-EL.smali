.class public final synthetic Lj$/util/Set$-EL;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static spliterator(Ljava/util/Set;)Lj$/util/Spliterator;
    .locals 1

    instance-of v0, p0, Lj$/util/Set;

    if-eqz v0, :cond_0

    check-cast p0, Lj$/util/Set;

    invoke-interface {p0}, Lj$/util/Set;->spliterator()Lj$/util/Spliterator;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/LinkedHashSet;

    const/16 v0, 0x11

    .line 0
    invoke-static {p0, v0}, Lj$/util/Spliterators;->spliterator(Ljava/util/Collection;I)Lj$/util/Spliterator;

    move-result-object p0

    return-object p0

    .line 0
    :cond_1
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/SortedSet;

    .line 0
    new-instance v0, Lj$/util/w;

    invoke-direct {v0, p0, p0}, Lj$/util/w;-><init>(Ljava/util/SortedSet;Ljava/util/Collection;)V

    return-object v0

    .line 0
    :cond_2
    invoke-static {p0}, Lj$/util/Set$-CC;->$default$spliterator(Ljava/util/Set;)Lj$/util/Spliterator;

    move-result-object p0

    return-object p0
.end method
