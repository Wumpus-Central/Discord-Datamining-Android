.class public Lcom/facebook/imagepipeline/memory/j;
.super Ly3/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/memory/j$a;
    }
.end annotation


# instance fields
.field private final k:Lcom/facebook/imagepipeline/memory/h;

.field private l:Lcom/facebook/common/references/CloseableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/references/CloseableReference<",
            "Lx5/s;",
            ">;"
        }
    .end annotation
.end field

.field private m:I


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/memory/h;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/memory/h;->D()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/imagepipeline/memory/j;-><init>(Lcom/facebook/imagepipeline/memory/h;I)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/imagepipeline/memory/h;I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ly3/j;-><init>()V

    const/4 v0, 0x0

    if-lez p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 3
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lv3/j;->b(Ljava/lang/Boolean;)V

    .line 4
    invoke-static {p1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/imagepipeline/memory/h;

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/j;->k:Lcom/facebook/imagepipeline/memory/h;

    .line 5
    iput v0, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/imagepipeline/memory/b;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/facebook/common/references/CloseableReference;->Z(Ljava/lang/Object;Lz3/c;)Lcom/facebook/common/references/CloseableReference;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->R(Lcom/facebook/common/references/CloseableReference;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/facebook/imagepipeline/memory/j$a;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/facebook/imagepipeline/memory/j$a;-><init>()V

    .line 13
    .line 14
    .line 15
    throw v0
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
.method public bridge synthetic b()Ly3/g;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/j;->i()Lx5/t;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->t(Lcom/facebook/common/references/CloseableReference;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    .line 11
    .line 12
    invoke-super {p0}, Ly3/j;->close()V

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

.method h(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/j;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 5
    .line 6
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/common/references/CloseableReference;->C()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lx5/s;

    .line 16
    .line 17
    invoke-interface {v0}, Lx5/s;->getSize()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-gt p1, v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->k:Lcom/facebook/imagepipeline/memory/h;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/b;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lx5/s;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 33
    .line 34
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/facebook/common/references/CloseableReference;->C()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lx5/s;

    .line 44
    .line 45
    iget v1, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-interface {v0, v2, p1, v2, v1}, Lx5/s;->l(ILx5/s;II)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/facebook/common/references/CloseableReference;->close()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->k:Lcom/facebook/imagepipeline/memory/h;

    .line 57
    .line 58
    invoke-static {p1, v0}, Lcom/facebook/common/references/CloseableReference;->Z(Ljava/lang/Object;Lz3/c;)Lcom/facebook/common/references/CloseableReference;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public i()Lx5/t;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/j;->g()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx5/t;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    .line 7
    .line 8
    invoke-static {v1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/facebook/common/references/CloseableReference;

    .line 13
    .line 14
    iget v2, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lx5/t;-><init>(Lcom/facebook/common/references/CloseableReference;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public size()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    return v0
.end method

.method public write(I)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 1
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public write([BII)V
    .locals 3

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    add-int v0, p2, p3

    .line 2
    array-length v1, p1

    if-gt v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/j;->g()V

    .line 4
    iget v0, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    add-int/2addr v0, p3

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/j;->h(I)V

    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/j;->l:Lcom/facebook/common/references/CloseableReference;

    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {v0}, Lcom/facebook/common/references/CloseableReference;->C()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx5/s;

    iget v1, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    invoke-interface {v0, v1, p1, p2, p3}, Lx5/s;->p(I[BII)I

    .line 6
    iget p1, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/facebook/imagepipeline/memory/j;->m:I

    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "length="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; regionStart="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; regionLength="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
