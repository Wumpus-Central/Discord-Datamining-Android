.class public Ly5/a;
.super Lcom/facebook/imagepipeline/request/BasePostprocessor;
.source "SourceFile"


# static fields
.field private static final ENABLE_ANTI_ALIASING:Z = true


# instance fields
.field private mCacheKey:Lcom/facebook/cache/common/CacheKey;

.field private final mEnableAntiAliasing:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Ly5/a;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/imagepipeline/request/BasePostprocessor;-><init>()V

    .line 3
    iput-boolean p1, p0, Ly5/a;->mEnableAntiAliasing:Z

    return-void
.end method


# virtual methods
.method public getPostprocessorCacheKey()Lcom/facebook/cache/common/CacheKey;
    .locals 2

    .line 1
    iget-object v0, p0, Ly5/a;->mCacheKey:Lcom/facebook/cache/common/CacheKey;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Ly5/a;->mEnableAntiAliasing:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lp3/h;

    .line 10
    .line 11
    const-string v1, "RoundAsCirclePostprocessor#AntiAliased"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lp3/h;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly5/a;->mCacheKey:Lcom/facebook/cache/common/CacheKey;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lp3/h;

    .line 20
    .line 21
    const-string v1, "RoundAsCirclePostprocessor"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lp3/h;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ly5/a;->mCacheKey:Lcom/facebook/cache/common/CacheKey;

    .line 27
    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Ly5/a;->mCacheKey:Lcom/facebook/cache/common/CacheKey;

    .line 29
    .line 30
    return-object v0
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

.method public process(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-boolean v0, p0, Ly5/a;->mEnableAntiAliasing:Z

    invoke-static {p1, v0}, Lcom/facebook/imagepipeline/nativecode/NativeRoundingFilter;->toCircleFast(Landroid/graphics/Bitmap;Z)V

    return-void
.end method
