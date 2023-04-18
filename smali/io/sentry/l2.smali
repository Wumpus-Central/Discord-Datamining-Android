.class public abstract Lio/sentry/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/l2$a;,
        Lio/sentry/l2$b;
    }
.end annotation


# instance fields
.field private k:Lio/sentry/protocol/p;

.field private final l:Lio/sentry/protocol/c;

.field private m:Lio/sentry/protocol/n;

.field private n:Lio/sentry/protocol/k;

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Lio/sentry/protocol/z;

.field protected transient t:Ljava/lang/Throwable;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/d;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, Lio/sentry/protocol/p;

    invoke-direct {v0}, Lio/sentry/protocol/p;-><init>()V

    invoke-direct {p0, v0}, Lio/sentry/l2;-><init>(Lio/sentry/protocol/p;)V

    return-void
.end method

.method protected constructor <init>(Lio/sentry/protocol/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/l2;->l:Lio/sentry/protocol/c;

    .line 3
    iput-object p1, p0, Lio/sentry/l2;->k:Lio/sentry/protocol/p;

    return-void
.end method

.method static synthetic a(Lio/sentry/l2;)Lio/sentry/protocol/p;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->k:Lio/sentry/protocol/p;

    return-object p0
.end method

.method static synthetic b(Lio/sentry/l2;Lio/sentry/protocol/p;)Lio/sentry/protocol/p;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->k:Lio/sentry/protocol/p;

    return-object p1
.end method

.method static synthetic c(Lio/sentry/l2;)Lio/sentry/protocol/c;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->l:Lio/sentry/protocol/c;

    return-object p0
.end method

.method static synthetic d(Lio/sentry/l2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->v:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->v:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic f(Lio/sentry/l2;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->w:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g(Lio/sentry/l2;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->w:Ljava/util/List;

    return-object p1
.end method

.method static synthetic h(Lio/sentry/l2;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic i(Lio/sentry/l2;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic j(Lio/sentry/l2;)Lio/sentry/protocol/n;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->m:Lio/sentry/protocol/n;

    return-object p0
.end method

.method static synthetic k(Lio/sentry/l2;Lio/sentry/protocol/n;)Lio/sentry/protocol/n;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->m:Lio/sentry/protocol/n;

    return-object p1
.end method

.method static synthetic l(Lio/sentry/l2;)Lio/sentry/protocol/k;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->n:Lio/sentry/protocol/k;

    return-object p0
.end method

.method static synthetic m(Lio/sentry/l2;Lio/sentry/protocol/k;)Lio/sentry/protocol/k;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->n:Lio/sentry/protocol/k;

    return-object p1
.end method

.method static synthetic n(Lio/sentry/l2;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic o(Lio/sentry/l2;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic p(Lio/sentry/l2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->p:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic q(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->p:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic r(Lio/sentry/l2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->q:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic s(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->q:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic t(Lio/sentry/l2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->r:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic u(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->r:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic v(Lio/sentry/l2;)Lio/sentry/protocol/z;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->s:Lio/sentry/protocol/z;

    return-object p0
.end method

.method static synthetic w(Lio/sentry/l2;Lio/sentry/protocol/z;)Lio/sentry/protocol/z;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->s:Lio/sentry/protocol/z;

    return-object p1
.end method

.method static synthetic x(Lio/sentry/l2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/sentry/l2;->u:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic y(Lio/sentry/l2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->u:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/l2;->w:Ljava/util/List;

    return-object v0
.end method

.method public B()Lio/sentry/protocol/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->l:Lio/sentry/protocol/c;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->v:Ljava/lang/String;

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->q:Ljava/lang/String;

    return-object v0
.end method

.method public E()Lio/sentry/protocol/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->k:Lio/sentry/protocol/p;

    return-object v0
.end method

.method F()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    return-object v0
.end method

.method public G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->r:Ljava/lang/String;

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->p:Ljava/lang/String;

    return-object v0
.end method

.method public I()Lio/sentry/protocol/k;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->n:Lio/sentry/protocol/k;

    return-object v0
.end method

.method public J()Lio/sentry/protocol/n;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->m:Lio/sentry/protocol/n;

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->u:Ljava/lang/String;

    return-object v0
.end method

.method public L()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    return-object v0
.end method

.method public M()Ljava/lang/Throwable;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/l2;->t:Ljava/lang/Throwable;

    .line 2
    .line 3
    instance-of v1, v0, Lio/sentry/exception/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lio/sentry/exception/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/exception/a;->c()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0
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
.end method

.method N()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->t:Ljava/lang/Throwable;

    return-object v0
.end method

.method public O()Lio/sentry/protocol/z;
    .locals 1

    iget-object v0, p0, Lio/sentry/l2;->s:Lio/sentry/protocol/z;

    return-object v0
.end method

.method public P(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/d;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/sentry/util/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/l2;->w:Ljava/util/List;

    return-void
.end method

.method public Q(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->v:Ljava/lang/String;

    return-void
.end method

.method public R(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->q:Ljava/lang/String;

    return-void
.end method

.method public S(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
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

.method public T(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/sentry/util/a;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/l2;->x:Ljava/util/Map;

    return-void
.end method

.method public U(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->r:Ljava/lang/String;

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->p:Ljava/lang/String;

    return-void
.end method

.method public W(Lio/sentry/protocol/k;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->n:Lio/sentry/protocol/k;

    return-void
.end method

.method public X(Lio/sentry/protocol/n;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->m:Lio/sentry/protocol/n;

    return-void
.end method

.method public Y(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->u:Ljava/lang/String;

    return-void
.end method

.method public Z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
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

.method public a0(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lio/sentry/util/a;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/l2;->o:Ljava/util/Map;

    return-void
.end method

.method public b0(Lio/sentry/protocol/z;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/l2;->s:Lio/sentry/protocol/z;

    return-void
.end method

.method public z(Lio/sentry/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l2;->w:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/l2;->w:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l2;->w:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
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
