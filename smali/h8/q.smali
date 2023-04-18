.class public final Lh8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ld7/k;

.field public final d:I

.field public final e:Ljava/lang/Object;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(I)V
    .locals 10

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move v1, p1

    .line 1
    invoke-direct/range {v0 .. v9}, Lh8/q;-><init>(IILd7/k;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public constructor <init>(IILd7/k;ILjava/lang/Object;JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lh8/q;->a:I

    .line 4
    iput p2, p0, Lh8/q;->b:I

    .line 5
    iput-object p3, p0, Lh8/q;->c:Ld7/k;

    .line 6
    iput p4, p0, Lh8/q;->d:I

    .line 7
    iput-object p5, p0, Lh8/q;->e:Ljava/lang/Object;

    .line 8
    iput-wide p6, p0, Lh8/q;->f:J

    .line 9
    iput-wide p8, p0, Lh8/q;->g:J

    return-void
.end method
