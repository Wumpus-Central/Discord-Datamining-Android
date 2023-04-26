.class public Lcom/facebook/imagepipeline/nativecode/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/facebook/imagepipeline/nativecode/i; = null

.field public static b:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/facebook/imagepipeline/nativecode/WebpTranscoderImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/nativecode/i;

    .line 8
    .line 9
    sput-object v0, Lcom/facebook/imagepipeline/nativecode/j;->a:Lcom/facebook/imagepipeline/nativecode/i;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    sput-boolean v0, Lcom/facebook/imagepipeline/nativecode/j;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Lcom/facebook/imagepipeline/nativecode/j;->b:Z

    .line 17
    .line 18
    :goto_0
    return-void
    .line 19
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
.end method

.method public static a()Lcom/facebook/imagepipeline/nativecode/i;
    .locals 1

    sget-object v0, Lcom/facebook/imagepipeline/nativecode/j;->a:Lcom/facebook/imagepipeline/nativecode/i;

    return-object v0
.end method
