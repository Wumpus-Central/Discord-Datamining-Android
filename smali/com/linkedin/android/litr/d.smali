.class public Lcom/linkedin/android/litr/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linkedin/android/litr/d$b;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lje/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lje/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/linkedin/android/litr/io/MediaRange;

.field public final e:Z

.field public final f:Z


# direct methods
.method private constructor <init>(ILjava/util/List;Ljava/util/List;Lcom/linkedin/android/litr/io/MediaRange;ZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lje/b;",
            ">;",
            "Ljava/util/List<",
            "Lje/a;",
            ">;",
            "Lcom/linkedin/android/litr/io/MediaRange;",
            "ZZ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/linkedin/android/litr/d;->a:I

    .line 4
    iput-object p2, p0, Lcom/linkedin/android/litr/d;->b:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/linkedin/android/litr/d;->c:Ljava/util/List;

    if-nez p4, :cond_0

    .line 6
    new-instance p4, Lcom/linkedin/android/litr/io/MediaRange;

    const-wide/16 p1, 0x0

    const-wide v0, 0x7fffffffffffffffL

    invoke-direct {p4, p1, p2, v0, v1}, Lcom/linkedin/android/litr/io/MediaRange;-><init>(JJ)V

    :cond_0
    iput-object p4, p0, Lcom/linkedin/android/litr/d;->d:Lcom/linkedin/android/litr/io/MediaRange;

    .line 7
    iput-boolean p5, p0, Lcom/linkedin/android/litr/d;->e:Z

    .line 8
    iput-boolean p6, p0, Lcom/linkedin/android/litr/d;->f:Z

    return-void
.end method

.method synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Lcom/linkedin/android/litr/io/MediaRange;ZZLcom/linkedin/android/litr/d$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/linkedin/android/litr/d;-><init>(ILjava/util/List;Ljava/util/List;Lcom/linkedin/android/litr/io/MediaRange;ZZ)V

    return-void
.end method
