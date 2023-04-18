.class public Lp5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lp5/b;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Landroid/graphics/Bitmap$Config;

.field private h:Landroid/graphics/Bitmap$Config;

.field private i:Ls5/c;

.field private j:Landroid/graphics/ColorSpace;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x64

    .line 5
    .line 6
    iput v0, p0, Lp5/b;->a:I

    .line 7
    .line 8
    const v0, 0x7fffffff

    .line 9
    .line 10
    .line 11
    iput v0, p0, Lp5/b;->b:I

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    iput-object v0, p0, Lp5/b;->g:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    iput-object v0, p0, Lp5/b;->h:Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    return-void
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method


# virtual methods
.method public a()Lcom/facebook/imagepipeline/common/ImageDecodeOptions;
    .locals 1

    new-instance v0, Lcom/facebook/imagepipeline/common/ImageDecodeOptions;

    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/common/ImageDecodeOptions;-><init>(Lp5/b;)V

    return-object v0
.end method

.method public b()Landroid/graphics/Bitmap$Config;
    .locals 1

    iget-object v0, p0, Lp5/b;->h:Landroid/graphics/Bitmap$Config;

    return-object v0
.end method

.method public c()Landroid/graphics/Bitmap$Config;
    .locals 1

    iget-object v0, p0, Lp5/b;->g:Landroid/graphics/Bitmap$Config;

    return-object v0
.end method

.method public d()Lb6/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Landroid/graphics/ColorSpace;
    .locals 1

    iget-object v0, p0, Lp5/b;->j:Landroid/graphics/ColorSpace;

    return-object v0
.end method

.method public f()Ls5/c;
    .locals 1

    iget-object v0, p0, Lp5/b;->i:Ls5/c;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lp5/b;->e:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lp5/b;->c:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lp5/b;->k:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lp5/b;->f:Z

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lp5/b;->b:I

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lp5/b;->a:I

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lp5/b;->d:Z

    return v0
.end method
