.class public Lx5/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lx5/z;

.field private b:Lx5/a0;

.field private c:Lx5/z;

.field private d:Ly3/c;

.field private e:Lx5/z;

.field private f:Lx5/a0;

.field private g:Lx5/z;

.field private h:Lx5/a0;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Z

.field public m:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx5/x$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx5/x$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lx5/x$b;)Lx5/z;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->a:Lx5/z;

    return-object p0
.end method

.method static synthetic b(Lx5/x$b;)Lx5/a0;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->b:Lx5/a0;

    return-object p0
.end method

.method static synthetic c(Lx5/x$b;)I
    .locals 0

    iget p0, p0, Lx5/x$b;->k:I

    return p0
.end method

.method static synthetic d(Lx5/x$b;)Z
    .locals 0

    iget-boolean p0, p0, Lx5/x$b;->l:Z

    return p0
.end method

.method static synthetic e(Lx5/x$b;)Lx5/z;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->c:Lx5/z;

    return-object p0
.end method

.method static synthetic f(Lx5/x$b;)Ly3/c;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->d:Ly3/c;

    return-object p0
.end method

.method static synthetic g(Lx5/x$b;)Lx5/z;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->e:Lx5/z;

    return-object p0
.end method

.method static synthetic h(Lx5/x$b;)Lx5/a0;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->f:Lx5/a0;

    return-object p0
.end method

.method static synthetic i(Lx5/x$b;)Lx5/z;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->g:Lx5/z;

    return-object p0
.end method

.method static synthetic j(Lx5/x$b;)Lx5/a0;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->h:Lx5/a0;

    return-object p0
.end method

.method static synthetic k(Lx5/x$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx5/x$b;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l(Lx5/x$b;)I
    .locals 0

    iget p0, p0, Lx5/x$b;->j:I

    return p0
.end method


# virtual methods
.method public m()Lx5/x;
    .locals 2

    new-instance v0, Lx5/x;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx5/x;-><init>(Lx5/x$b;Lx5/x$a;)V

    return-object v0
.end method

.method public n(Lx5/z;)Lx5/x$b;
    .locals 0

    invoke-static {p1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/z;

    iput-object p1, p0, Lx5/x$b;->g:Lx5/z;

    return-object p0
.end method
