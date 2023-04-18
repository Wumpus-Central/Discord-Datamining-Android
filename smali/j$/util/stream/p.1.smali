.class final Lj$/util/stream/p;
.super Lj$/util/stream/U1;
.source "SourceFile"


# direct methods
.method constructor <init>(Lj$/util/stream/c;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/U1;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method

.method static c1(Lj$/util/stream/c;Lj$/util/Spliterator;)Lj$/util/stream/G0;
    .locals 7

    new-instance v4, Lj$/util/stream/I0;

    const/16 v0, 0xf

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v3, Lj$/util/stream/I0;

    const/16 v0, 0x10

    invoke-direct {v3, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v2, Lj$/util/stream/I0;

    const/16 v0, 0x11

    invoke-direct {v2, v0}, Lj$/util/stream/I0;-><init>(I)V

    .line 0
    new-instance v6, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    const/4 v5, 0x3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {v6, p0, p1}, Lj$/util/stream/t0;->l(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    .line 0
    new-instance p1, Lj$/util/stream/G0;

    invoke-direct {p1, p0}, Lj$/util/stream/G0;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method


# virtual methods
.method final U0(Lj$/util/Spliterator;Lj$/util/function/IntFunction;Lj$/util/stream/c;)Lj$/util/stream/C0;
    .locals 4

    sget-object v0, Lj$/util/stream/S2;->DISTINCT:Lj$/util/stream/S2;

    invoke-virtual {p3}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1, v1, p2}, Lj$/util/stream/c;->L0(Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lj$/util/stream/S2;->ORDERED:Lj$/util/stream/S2;

    invoke-virtual {p3}, Lj$/util/stream/c;->A0()I

    move-result v0

    invoke-virtual {p2, v0}, Lj$/util/stream/S2;->d(I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p3, p1}, Lj$/util/stream/p;->c1(Lj$/util/stream/c;Lj$/util/Spliterator;)Lj$/util/stream/G0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v2, Lj$/util/stream/m;

    invoke-direct {v2, v1, p2, v0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 0
    new-instance v3, Lj$/util/stream/O;

    invoke-direct {v3, v2, v1}, Lj$/util/stream/O;-><init>(Lj$/util/function/Consumer;Z)V

    .line 0
    invoke-virtual {v3, p3, p1}, Lj$/util/stream/P;->l(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object p1, p2

    .line 0
    :cond_2
    new-instance p2, Lj$/util/stream/G0;

    invoke-direct {p2, p1}, Lj$/util/stream/G0;-><init>(Ljava/util/Collection;)V

    return-object p2
.end method

.method final V0(Lj$/util/stream/c;Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 2

    sget-object v0, Lj$/util/stream/S2;->DISTINCT:Lj$/util/stream/S2;

    invoke-virtual {p1}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lj$/util/stream/c;->b1(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lj$/util/stream/S2;->ORDERED:Lj$/util/stream/S2;

    invoke-virtual {p1}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lj$/util/stream/p;->c1(Lj$/util/stream/c;Lj$/util/Spliterator;)Lj$/util/stream/G0;

    move-result-object p1

    invoke-virtual {p1}, Lj$/util/stream/G0;->spliterator()Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lj$/util/stream/b3;

    invoke-virtual {p1, p2}, Lj$/util/stream/c;->b1(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    invoke-direct {v0, p1}, Lj$/util/stream/b3;-><init>(Lj$/util/Spliterator;)V

    return-object v0
.end method

.method final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 1

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v0, Lj$/util/stream/S2;->DISTINCT:Lj$/util/stream/S2;

    invoke-virtual {v0, p1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    sget-object v0, Lj$/util/stream/S2;->SORTED:Lj$/util/stream/S2;

    invoke-virtual {v0, p1}, Lj$/util/stream/S2;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lj$/util/stream/n;

    invoke-direct {p1, p2}, Lj$/util/stream/n;-><init>(Lj$/util/stream/e2;)V

    return-object p1

    :cond_1
    new-instance p1, Lj$/util/stream/o;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/o;-><init>(Lj$/util/stream/p;Lj$/util/stream/e2;)V

    return-object p1
.end method
