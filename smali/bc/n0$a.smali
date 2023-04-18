.class final Lbc/n0$a;
.super Lbc/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/n0<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final transient m:Lbc/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient n:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbc/l0;Lbc/i0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/l0<",
            "TK;TV;>;",
            "Lbc/i0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lbc/n0;-><init>()V

    .line 3
    iput-object p1, p0, Lbc/n0$a;->m:Lbc/l0;

    .line 4
    iput-object p2, p0, Lbc/n0$a;->n:Lbc/i0;

    return-void
.end method

.method constructor <init>(Lbc/l0;[Ljava/util/Map$Entry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/l0<",
            "TK;TV;>;[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lbc/i0;->q([Ljava/lang/Object;)Lbc/i0;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lbc/n0$a;-><init>(Lbc/l0;Lbc/i0;)V

    return-void
.end method


# virtual methods
.method B()Lbc/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/i0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lbc/t1;

    iget-object v1, p0, Lbc/n0$a;->n:Lbc/i0;

    invoke-direct {v0, p0, v1}, Lbc/t1;-><init>(Lbc/d0;Lbc/i0;)V

    return-object v0
.end method

.method C()Lbc/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/n0$a;->m:Lbc/l0;

    return-object v0
.end method

.method e([Ljava/lang/Object;I)I
    .locals 1

    iget-object v0, p0, Lbc/n0$a;->n:Lbc/i0;

    invoke-virtual {v0, p1, p2}, Lbc/i0;->e([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/n0$a;->n:Lbc/i0;

    invoke-virtual {v0, p1}, Lbc/i0;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc/n0$a;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/n0$a;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public n()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/n0$a;->n:Lbc/i0;

    invoke-virtual {v0}, Lbc/i0;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/n0$a;->n:Lbc/i0;

    invoke-virtual {v0}, Lbc/i0;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lbc/n0$a;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method
