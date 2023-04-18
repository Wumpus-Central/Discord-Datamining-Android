.class final Lnet/time4j/i;
.super Lnet/time4j/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/o<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field private final m:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lfj/p;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/i;-><init>(Lfj/p;ILjava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Lfj/p;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "*>;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/time4j/o;-><init>(Lfj/p;I)V

    packed-switch p2, :pswitch_data_0

    .line 3
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lnet/time4j/o;->a()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 4
    :pswitch_0
    invoke-static {p1, p3}, Lnet/time4j/i;->c(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 5
    :pswitch_1
    invoke-static {p1}, Lfj/g0;->c(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 6
    :pswitch_2
    invoke-static {p1}, Lfj/g0;->d(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 7
    :pswitch_3
    invoke-static {p1}, Lfj/g0;->h(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 8
    :pswitch_4
    invoke-static {p1}, Lfj/g0;->f(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 9
    :pswitch_5
    invoke-static {p1}, Lfj/g0;->j(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 10
    :pswitch_6
    invoke-static {p1}, Lfj/g0;->l(Lfj/p;)Lfj/v;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    goto :goto_0

    .line 11
    :pswitch_7
    invoke-static {p1, p3}, Lnet/time4j/i;->d(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static c(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/p;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lfj/g0;->o(Ljava/lang/Object;Lfj/p;)Lfj/v;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1}, Lnet/time4j/t0;->a(Lfj/v;Ljava/lang/Object;)Lnet/time4j/t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static d(Lfj/p;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lfj/p;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lfj/g0;->n(Ljava/lang/Object;Lfj/p;)Lfj/v;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0, p1}, Lnet/time4j/t0;->a(Lfj/v;Ljava/lang/Object;)Lnet/time4j/t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/i;->b(Lnet/time4j/f0;)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/f0;)Lnet/time4j/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/i;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj/v;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lfj/v;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lnet/time4j/f0;

    .line 10
    .line 11
    return-object p1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
