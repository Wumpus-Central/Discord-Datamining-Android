.class final Lq7/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lq7/e;


# direct methods
.method private constructor <init>(Lq7/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq7/e$b;->a:Lq7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lq7/e;Lq7/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lq7/e$b;-><init>(Lq7/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1}, Lq7/e;->o(I)V

    return-void
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1}, Lq7/e;->u(I)I

    move-result p1

    return p1
.end method

.method public c(I)Z
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1}, Lq7/e;->z(I)Z

    move-result p1

    return p1
.end method

.method public d(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1, p2}, Lq7/e;->H(ILjava/lang/String;)V

    return-void
.end method

.method public e(IILl7/j;)V
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1, p2, p3}, Lq7/e;->l(IILl7/j;)V

    return-void
.end method

.method public f(ID)V
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1, p2, p3}, Lq7/e;->r(ID)V

    return-void
.end method

.method public g(IJJ)V
    .locals 6

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lq7/e;->G(IJJ)V

    return-void
.end method

.method public h(IJ)V
    .locals 1

    iget-object v0, p0, Lq7/e$b;->a:Lq7/e;

    invoke-virtual {v0, p1, p2, p3}, Lq7/e;->x(IJ)V

    return-void
.end method
