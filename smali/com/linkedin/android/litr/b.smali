.class public Lcom/linkedin/android/litr/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linkedin/android/litr/b$b;
    }
.end annotation


# instance fields
.field private final a:Loe/c;

.field private final b:Lie/a;

.field private final c:Lpe/i;

.field private final d:Lie/b;

.field private final e:Loe/d;

.field private final f:Landroid/media/MediaFormat;

.field private final g:I

.field private final h:I


# direct methods
.method private constructor <init>(Loe/c;Lie/a;Lpe/i;Lie/b;Loe/d;Landroid/media/MediaFormat;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/linkedin/android/litr/b;->a:Loe/c;

    .line 4
    iput-object p2, p0, Lcom/linkedin/android/litr/b;->b:Lie/a;

    .line 5
    iput-object p3, p0, Lcom/linkedin/android/litr/b;->c:Lpe/i;

    .line 6
    iput-object p4, p0, Lcom/linkedin/android/litr/b;->d:Lie/b;

    .line 7
    iput-object p5, p0, Lcom/linkedin/android/litr/b;->e:Loe/d;

    .line 8
    iput-object p6, p0, Lcom/linkedin/android/litr/b;->f:Landroid/media/MediaFormat;

    .line 9
    iput p7, p0, Lcom/linkedin/android/litr/b;->g:I

    .line 10
    iput p8, p0, Lcom/linkedin/android/litr/b;->h:I

    return-void
.end method

.method synthetic constructor <init>(Loe/c;Lie/a;Lpe/i;Lie/b;Loe/d;Landroid/media/MediaFormat;IILcom/linkedin/android/litr/b$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/linkedin/android/litr/b;-><init>(Loe/c;Lie/a;Lpe/i;Lie/b;Loe/d;Landroid/media/MediaFormat;II)V

    return-void
.end method


# virtual methods
.method public a()Lie/a;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->b:Lie/a;

    return-object v0
.end method

.method public b()Lie/b;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->d:Lie/b;

    return-object v0
.end method

.method public c()Loe/c;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->a:Loe/c;

    return-object v0
.end method

.method public d()Loe/d;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->e:Loe/d;

    return-object v0
.end method

.method public e()Lpe/i;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->c:Lpe/i;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/linkedin/android/litr/b;->g:I

    return v0
.end method

.method public g()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lcom/linkedin/android/litr/b;->f:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/linkedin/android/litr/b;->h:I

    return v0
.end method
