.class public final Lsd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:J

.field private j:I

.field private k:[I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lsd/c;->d:I

    .line 6
    .line 7
    const-wide/16 v1, -0x1

    .line 8
    .line 9
    iput-wide v1, p0, Lsd/c;->h:J

    .line 10
    .line 11
    iput-wide v1, p0, Lsd/c;->i:J

    .line 12
    .line 13
    iput v0, p0, Lsd/c;->j:I

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lsd/c;->c:Z

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsd/c;->f:Ljava/lang/String;

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lsd/c;->j:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsd/c;->b:Ljava/lang/String;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsd/c;->g:Ljava/lang/String;

    return-void
.end method

.method public f(J)V
    .locals 0

    iput-wide p1, p0, Lsd/c;->h:J

    return-void
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Lsd/c;->c:Z

    return-void
.end method

.method public h([I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lsd/c;->k:[I

    return-void
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, Lsd/c;->d:I

    return-void
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lsd/c;->a:I

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsd/c;->e:Ljava/lang/String;

    return-void
.end method

.method public l(J)V
    .locals 0

    iput-wide p1, p0, Lsd/c;->i:J

    return-void
.end method
