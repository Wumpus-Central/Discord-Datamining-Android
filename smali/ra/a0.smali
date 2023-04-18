.class final Lra/a0;
.super Lra/b0;
.source "SourceFile"


# instance fields
.field final transient m:I

.field final transient n:I

.field final synthetic o:Lra/b0;


# direct methods
.method constructor <init>(Lra/b0;II)V
    .locals 0

    iput-object p1, p0, Lra/a0;->o:Lra/b0;

    invoke-direct {p0}, Lra/b0;-><init>()V

    iput p2, p0, Lra/a0;->m:I

    iput p3, p0, Lra/a0;->n:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lra/a0;->o:Lra/b0;

    invoke-virtual {v0}, Lra/y;->f()I

    move-result v0

    iget v1, p0, Lra/a0;->m:I

    add-int/2addr v0, v1

    iget v1, p0, Lra/a0;->n:I

    add-int/2addr v0, v1

    return v0
.end method

.method final f()I
    .locals 2

    iget-object v0, p0, Lra/a0;->o:Lra/b0;

    invoke-virtual {v0}, Lra/y;->f()I

    move-result v0

    iget v1, p0, Lra/a0;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lra/a0;->n:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lra/t;->a(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lra/a0;->o:Lra/b0;

    .line 9
    .line 10
    iget v1, p0, Lra/a0;->m:I

    .line 11
    .line 12
    add-int/2addr p1, v1

    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final n()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lra/a0;->o:Lra/b0;

    invoke-virtual {v0}, Lra/y;->n()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final q(II)Lra/b0;
    .locals 2

    .line 1
    iget v0, p0, Lra/a0;->n:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lra/t;->d(III)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lra/a0;->o:Lra/b0;

    .line 7
    .line 8
    iget v1, p0, Lra/a0;->m:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {v0, p1, p2}, Lra/b0;->q(II)Lra/b0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lra/a0;->n:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lra/b0;->q(II)Lra/b0;

    move-result-object p1

    return-object p1
.end method
