.class public final Lq8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/b$b;
    }
.end annotation


# static fields
.field public static final q:Lq8/b;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/Layout$Alignment;

.field public final c:Landroid/graphics/Bitmap;

.field public final d:F

.field public final e:I

.field public final f:I

.field public final g:F

.field public final h:I

.field public final i:F

.field public final j:F

.field public final k:Z

.field public final l:I

.field public final m:I

.field public final n:F

.field public final o:I

.field public final p:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq8/b$b;

    invoke-direct {v0}, Lq8/b$b;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lq8/b$b;->n(Ljava/lang/CharSequence;)Lq8/b$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/b$b;->a()Lq8/b;

    move-result-object v0

    sput-object v0, Lq8/b;->q:Lq8/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez v1, :cond_0

    .line 3
    invoke-static {p3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 4
    :goto_0
    invoke-static {v3}, Lf9/a;->a(Z)V

    .line 5
    :goto_1
    iput-object v1, v0, Lq8/b;->a:Ljava/lang/CharSequence;

    move-object v1, p2

    .line 6
    iput-object v1, v0, Lq8/b;->b:Landroid/text/Layout$Alignment;

    .line 7
    iput-object v2, v0, Lq8/b;->c:Landroid/graphics/Bitmap;

    move v1, p4

    .line 8
    iput v1, v0, Lq8/b;->d:F

    move v1, p5

    .line 9
    iput v1, v0, Lq8/b;->e:I

    move v1, p6

    .line 10
    iput v1, v0, Lq8/b;->f:I

    move v1, p7

    .line 11
    iput v1, v0, Lq8/b;->g:F

    move v1, p8

    .line 12
    iput v1, v0, Lq8/b;->h:I

    move v1, p11

    .line 13
    iput v1, v0, Lq8/b;->i:F

    move/from16 v1, p12

    .line 14
    iput v1, v0, Lq8/b;->j:F

    move/from16 v1, p13

    .line 15
    iput-boolean v1, v0, Lq8/b;->k:Z

    move/from16 v1, p14

    .line 16
    iput v1, v0, Lq8/b;->l:I

    move v1, p9

    .line 17
    iput v1, v0, Lq8/b;->m:I

    move v1, p10

    .line 18
    iput v1, v0, Lq8/b;->n:F

    move/from16 v1, p15

    .line 19
    iput v1, v0, Lq8/b;->o:I

    move/from16 v1, p16

    .line 20
    iput v1, v0, Lq8/b;->p:F

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLq8/b$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p16}, Lq8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    return-void
.end method


# virtual methods
.method public a()Lq8/b$b;
    .locals 2

    new-instance v0, Lq8/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lq8/b$b;-><init>(Lq8/b;Lq8/b$a;)V

    return-object v0
.end method
