.class final Lcom/facebook/soloader/j$c$a;
.super Lcom/facebook/soloader/r$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/j$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private k:I

.field final synthetic l:Lcom/facebook/soloader/j$c;


# direct methods
.method private constructor <init>(Lcom/facebook/soloader/j$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    invoke-direct {p0}, Lcom/facebook/soloader/r$e;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/soloader/j$c;Lcom/facebook/soloader/j$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/soloader/j$c$a;-><init>(Lcom/facebook/soloader/j$c;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/soloader/j$c;->l()[Lcom/facebook/soloader/j$b;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/soloader/j$c$a;->k:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/facebook/soloader/j$c;->h(Lcom/facebook/soloader/j$c;)[Lcom/facebook/soloader/j$b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    array-length v1, v1

    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
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

.method public g()Lcom/facebook/soloader/r$d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/soloader/j$c;->l()[Lcom/facebook/soloader/j$b;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/soloader/j$c;->h(Lcom/facebook/soloader/j$c;)[Lcom/facebook/soloader/j$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lcom/facebook/soloader/j$c$a;->k:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Lcom/facebook/soloader/j$c$a;->k:I

    .line 17
    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/soloader/j$c$a;->l:Lcom/facebook/soloader/j$c;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/facebook/soloader/j$c;->i(Lcom/facebook/soloader/j$c;)Ljava/util/zip/ZipFile;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, Lcom/facebook/soloader/j$b;->m:Ljava/util/zip/ZipEntry;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :try_start_0
    new-instance v2, Lcom/facebook/soloader/r$f;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1}, Lcom/facebook/soloader/r$f;-><init>(Lcom/facebook/soloader/r$b;Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 42
    .line 43
    .line 44
    :cond_0
    throw v0
.end method
