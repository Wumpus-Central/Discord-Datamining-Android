.class public final Ld7/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lj7/b0;",
            ">;"
        }
    .end annotation
.end field

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ly7/a;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private n:Lj7/l;

.field private o:J

.field private p:I

.field private q:I

.field private r:F

.field private s:I

.field private t:F

.field private u:[B

.field private v:I

.field private w:Lg9/b;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ld7/k$b;->f:I

    .line 4
    iput v0, p0, Ld7/k$b;->g:I

    .line 5
    iput v0, p0, Ld7/k$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    .line 6
    iput-wide v1, p0, Ld7/k$b;->o:J

    .line 7
    iput v0, p0, Ld7/k$b;->p:I

    .line 8
    iput v0, p0, Ld7/k$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 9
    iput v1, p0, Ld7/k$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    iput v1, p0, Ld7/k$b;->t:F

    .line 11
    iput v0, p0, Ld7/k$b;->v:I

    .line 12
    iput v0, p0, Ld7/k$b;->x:I

    .line 13
    iput v0, p0, Ld7/k$b;->y:I

    .line 14
    iput v0, p0, Ld7/k$b;->z:I

    .line 15
    iput v0, p0, Ld7/k$b;->C:I

    return-void
.end method

.method private constructor <init>(Ld7/k;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iget-object v0, p1, Ld7/k;->k:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->a:Ljava/lang/String;

    .line 18
    iget-object v0, p1, Ld7/k;->l:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->b:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Ld7/k;->m:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->c:Ljava/lang/String;

    .line 20
    iget v0, p1, Ld7/k;->n:I

    iput v0, p0, Ld7/k$b;->d:I

    .line 21
    iget v0, p1, Ld7/k;->o:I

    iput v0, p0, Ld7/k$b;->e:I

    .line 22
    iget v0, p1, Ld7/k;->p:I

    iput v0, p0, Ld7/k$b;->f:I

    .line 23
    iget v0, p1, Ld7/k;->q:I

    iput v0, p0, Ld7/k$b;->g:I

    .line 24
    iget-object v0, p1, Ld7/k;->s:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->h:Ljava/lang/String;

    .line 25
    iget-object v0, p1, Ld7/k;->t:Ly7/a;

    iput-object v0, p0, Ld7/k$b;->i:Ly7/a;

    .line 26
    iget-object v0, p1, Ld7/k;->u:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->j:Ljava/lang/String;

    .line 27
    iget-object v0, p1, Ld7/k;->v:Ljava/lang/String;

    iput-object v0, p0, Ld7/k$b;->k:Ljava/lang/String;

    .line 28
    iget v0, p1, Ld7/k;->w:I

    iput v0, p0, Ld7/k$b;->l:I

    .line 29
    iget-object v0, p1, Ld7/k;->x:Ljava/util/List;

    iput-object v0, p0, Ld7/k$b;->m:Ljava/util/List;

    .line 30
    iget-object v0, p1, Ld7/k;->y:Lj7/l;

    iput-object v0, p0, Ld7/k$b;->n:Lj7/l;

    .line 31
    iget-wide v0, p1, Ld7/k;->z:J

    iput-wide v0, p0, Ld7/k$b;->o:J

    .line 32
    iget v0, p1, Ld7/k;->A:I

    iput v0, p0, Ld7/k$b;->p:I

    .line 33
    iget v0, p1, Ld7/k;->B:I

    iput v0, p0, Ld7/k$b;->q:I

    .line 34
    iget v0, p1, Ld7/k;->C:F

    iput v0, p0, Ld7/k$b;->r:F

    .line 35
    iget v0, p1, Ld7/k;->D:I

    iput v0, p0, Ld7/k$b;->s:I

    .line 36
    iget v0, p1, Ld7/k;->E:F

    iput v0, p0, Ld7/k$b;->t:F

    .line 37
    iget-object v0, p1, Ld7/k;->F:[B

    iput-object v0, p0, Ld7/k$b;->u:[B

    .line 38
    iget v0, p1, Ld7/k;->G:I

    iput v0, p0, Ld7/k$b;->v:I

    .line 39
    iget-object v0, p1, Ld7/k;->H:Lg9/b;

    iput-object v0, p0, Ld7/k$b;->w:Lg9/b;

    .line 40
    iget v0, p1, Ld7/k;->I:I

    iput v0, p0, Ld7/k$b;->x:I

    .line 41
    iget v0, p1, Ld7/k;->J:I

    iput v0, p0, Ld7/k$b;->y:I

    .line 42
    iget v0, p1, Ld7/k;->K:I

    iput v0, p0, Ld7/k$b;->z:I

    .line 43
    iget v0, p1, Ld7/k;->L:I

    iput v0, p0, Ld7/k$b;->A:I

    .line 44
    iget v0, p1, Ld7/k;->M:I

    iput v0, p0, Ld7/k$b;->B:I

    .line 45
    iget v0, p1, Ld7/k;->N:I

    iput v0, p0, Ld7/k$b;->C:I

    .line 46
    iget-object p1, p1, Ld7/k;->O:Ljava/lang/Class;

    iput-object p1, p0, Ld7/k$b;->D:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Ld7/k;Ld7/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ld7/k$b;-><init>(Ld7/k;)V

    return-void
.end method

.method static synthetic A(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->f:I

    return p0
.end method

.method static synthetic B(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->g:I

    return p0
.end method

.method static synthetic C(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic D(Ld7/k$b;)Ly7/a;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->i:Ly7/a;

    return-object p0
.end method

.method static synthetic a(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->l:I

    return p0
.end method

.method static synthetic e(Ld7/k$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f(Ld7/k$b;)Lj7/l;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->n:Lj7/l;

    return-object p0
.end method

.method static synthetic g(Ld7/k$b;)J
    .locals 2

    iget-wide v0, p0, Ld7/k$b;->o:J

    return-wide v0
.end method

.method static synthetic h(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->p:I

    return p0
.end method

.method static synthetic i(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->q:I

    return p0
.end method

.method static synthetic j(Ld7/k$b;)F
    .locals 0

    iget p0, p0, Ld7/k$b;->r:F

    return p0
.end method

.method static synthetic k(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->s:I

    return p0
.end method

.method static synthetic l(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Ld7/k$b;)F
    .locals 0

    iget p0, p0, Ld7/k$b;->t:F

    return p0
.end method

.method static synthetic n(Ld7/k$b;)[B
    .locals 0

    iget-object p0, p0, Ld7/k$b;->u:[B

    return-object p0
.end method

.method static synthetic o(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->v:I

    return p0
.end method

.method static synthetic p(Ld7/k$b;)Lg9/b;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->w:Lg9/b;

    return-object p0
.end method

.method static synthetic q(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->x:I

    return p0
.end method

.method static synthetic r(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->y:I

    return p0
.end method

.method static synthetic s(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->z:I

    return p0
.end method

.method static synthetic t(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->A:I

    return p0
.end method

.method static synthetic u(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->B:I

    return p0
.end method

.method static synthetic v(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->C:I

    return p0
.end method

.method static synthetic w(Ld7/k$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Ld7/k$b;)Ljava/lang/Class;
    .locals 0

    iget-object p0, p0, Ld7/k$b;->D:Ljava/lang/Class;

    return-object p0
.end method

.method static synthetic y(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->d:I

    return p0
.end method

.method static synthetic z(Ld7/k$b;)I
    .locals 0

    iget p0, p0, Ld7/k$b;->e:I

    return p0
.end method


# virtual methods
.method public E()Ld7/k;
    .locals 2

    new-instance v0, Ld7/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ld7/k;-><init>(Ld7/k$b;Ld7/k$a;)V

    return-object v0
.end method

.method public F(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->C:I

    return-object p0
.end method

.method public G(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->f:I

    return-object p0
.end method

.method public H(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->x:I

    return-object p0
.end method

.method public I(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public J(Lg9/b;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->w:Lg9/b;

    return-object p0
.end method

.method public K(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public L(Lj7/l;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->n:Lj7/l;

    return-object p0
.end method

.method public M(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->A:I

    return-object p0
.end method

.method public N(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->B:I

    return-object p0
.end method

.method public O(Ljava/lang/Class;)Ld7/k$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lj7/b0;",
            ">;)",
            "Ld7/k$b;"
        }
    .end annotation

    iput-object p1, p0, Ld7/k$b;->D:Ljava/lang/Class;

    return-object p0
.end method

.method public P(F)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->r:F

    return-object p0
.end method

.method public Q(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->q:I

    return-object p0
.end method

.method public R(I)Ld7/k$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ld7/k$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public S(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public T(Ljava/util/List;)Ld7/k$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Ld7/k$b;"
        }
    .end annotation

    iput-object p1, p0, Ld7/k$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public W(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->l:I

    return-object p0
.end method

.method public X(Ly7/a;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->i:Ly7/a;

    return-object p0
.end method

.method public Y(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->z:I

    return-object p0
.end method

.method public Z(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->g:I

    return-object p0
.end method

.method public a0(F)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->t:F

    return-object p0
.end method

.method public b0([B)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->u:[B

    return-object p0
.end method

.method public c0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->e:I

    return-object p0
.end method

.method public d0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->s:I

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Ld7/k$b;
    .locals 0

    iput-object p1, p0, Ld7/k$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public f0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->y:I

    return-object p0
.end method

.method public g0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->d:I

    return-object p0
.end method

.method public h0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->v:I

    return-object p0
.end method

.method public i0(J)Ld7/k$b;
    .locals 0

    iput-wide p1, p0, Ld7/k$b;->o:J

    return-object p0
.end method

.method public j0(I)Ld7/k$b;
    .locals 0

    iput p1, p0, Ld7/k$b;->p:I

    return-object p0
.end method
