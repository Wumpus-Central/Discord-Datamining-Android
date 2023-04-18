.class public final Landroidx/core/text/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/text/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Landroidx/core/text/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Landroidx/core/text/a;->e(Ljava/util/Locale;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Landroidx/core/text/a$a;->c(Z)V

    .line 13
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
.end method

.method private static b(Z)Landroidx/core/text/a;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Landroidx/core/text/a;->h:Landroidx/core/text/a;

    goto :goto_0

    :cond_0
    sget-object p0, Landroidx/core/text/a;->g:Landroidx/core/text/a;

    :goto_0
    return-object p0
.end method

.method private c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/core/text/a$a;->a:Z

    .line 2
    .line 3
    sget-object p1, Landroidx/core/text/a;->d:Landroidx/core/text/o;

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/core/text/a$a;->c:Landroidx/core/text/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    iput p1, p0, Landroidx/core/text/a$a;->b:I

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method


# virtual methods
.method public a()Landroidx/core/text/a;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/core/text/a$a;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/core/text/a$a;->c:Landroidx/core/text/o;

    .line 7
    .line 8
    sget-object v1, Landroidx/core/text/a;->d:Landroidx/core/text/o;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Landroidx/core/text/a$a;->a:Z

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/core/text/a$a;->b(Z)Landroidx/core/text/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Landroidx/core/text/a;

    .line 20
    .line 21
    iget-boolean v1, p0, Landroidx/core/text/a$a;->a:Z

    .line 22
    .line 23
    iget v2, p0, Landroidx/core/text/a$a;->b:I

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/core/text/a$a;->c:Landroidx/core/text/o;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3}, Landroidx/core/text/a;-><init>(ZILandroidx/core/text/o;)V

    .line 28
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
.end method
