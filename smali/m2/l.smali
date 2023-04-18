.class public Lm2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/c;


# instance fields
.field private final a:Lm2/e;

.field private final b:Lm2/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm2/m<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lm2/g;

.field private final d:Lm2/b;

.field private final e:Lm2/d;

.field private final f:Lm2/b;

.field private final g:Lm2/b;

.field private final h:Lm2/b;

.field private final i:Lm2/b;


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v9}, Lm2/l;-><init>(Lm2/e;Lm2/m;Lm2/g;Lm2/b;Lm2/d;Lm2/b;Lm2/b;Lm2/b;Lm2/b;)V

    return-void
.end method

.method public constructor <init>(Lm2/e;Lm2/m;Lm2/g;Lm2/b;Lm2/d;Lm2/b;Lm2/b;Lm2/b;Lm2/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm2/e;",
            "Lm2/m<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lm2/g;",
            "Lm2/b;",
            "Lm2/d;",
            "Lm2/b;",
            "Lm2/b;",
            "Lm2/b;",
            "Lm2/b;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lm2/l;->a:Lm2/e;

    .line 4
    iput-object p2, p0, Lm2/l;->b:Lm2/m;

    .line 5
    iput-object p3, p0, Lm2/l;->c:Lm2/g;

    .line 6
    iput-object p4, p0, Lm2/l;->d:Lm2/b;

    .line 7
    iput-object p5, p0, Lm2/l;->e:Lm2/d;

    .line 8
    iput-object p6, p0, Lm2/l;->h:Lm2/b;

    .line 9
    iput-object p7, p0, Lm2/l;->i:Lm2/b;

    .line 10
    iput-object p8, p0, Lm2/l;->f:Lm2/b;

    .line 11
    iput-object p9, p0, Lm2/l;->g:Lm2/b;

    return-void
.end method


# virtual methods
.method public a(Lg2/e0;Lo2/b;)Li2/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lj2/p;
    .locals 1

    new-instance v0, Lj2/p;

    invoke-direct {v0, p0}, Lj2/p;-><init>(Lm2/l;)V

    return-object v0
.end method

.method public c()Lm2/e;
    .locals 1

    iget-object v0, p0, Lm2/l;->a:Lm2/e;

    return-object v0
.end method

.method public d()Lm2/b;
    .locals 1

    iget-object v0, p0, Lm2/l;->i:Lm2/b;

    return-object v0
.end method

.method public e()Lm2/d;
    .locals 1

    iget-object v0, p0, Lm2/l;->e:Lm2/d;

    return-object v0
.end method

.method public f()Lm2/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm2/m<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm2/l;->b:Lm2/m;

    return-object v0
.end method

.method public g()Lm2/b;
    .locals 1

    iget-object v0, p0, Lm2/l;->d:Lm2/b;

    return-object v0
.end method

.method public h()Lm2/g;
    .locals 1

    iget-object v0, p0, Lm2/l;->c:Lm2/g;

    return-object v0
.end method

.method public i()Lm2/b;
    .locals 1

    iget-object v0, p0, Lm2/l;->f:Lm2/b;

    return-object v0
.end method

.method public j()Lm2/b;
    .locals 1

    iget-object v0, p0, Lm2/l;->g:Lm2/b;

    return-object v0
.end method

.method public k()Lm2/b;
    .locals 1

    iget-object v0, p0, Lm2/l;->h:Lm2/b;

    return-object v0
.end method
