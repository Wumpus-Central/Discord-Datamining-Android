.class Lnet/time4j/f0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/c0<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "*>;"
        }
    .end annotation
.end field

.field private final l:Ljava/lang/String;

.field private final m:I


# direct methods
.method constructor <init>(ILfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lfj/p<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lnet/time4j/f0$d;->k:Lfj/p;

    .line 4
    invoke-interface {p2}, Lfj/p;->name()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 5
    iput p1, p0, Lnet/time4j/f0$d;->m:I

    return-void
.end method

.method constructor <init>(Lfj/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Lnet/time4j/s;

    invoke-virtual {v0}, Lnet/time4j/s;->C()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lnet/time4j/f0$d;-><init>(ILfj/p;)V

    return-void
.end method

.method private b()Lfj/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/time4j/f0$d;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    iget-object v1, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    :pswitch_1
    sget-object v0, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_2
    sget-object v0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 24
.end method

.method private static h(Lnet/time4j/f0;)I
    .locals 3

    .line 1
    invoke-static {p0}, Lnet/time4j/f0;->q0(Lnet/time4j/f0;)B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    div-int/lit8 v0, v0, 0x3

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    const/16 v2, 0x5b

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Lnet/time4j/base/b;->e(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v2, 0x5a

    .line 26
    .line 27
    :goto_0
    return v2

    .line 28
    :cond_1
    const/4 p0, 0x2

    .line 29
    if-ne v0, p0, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    const/16 p0, 0x5c

    .line 33
    .line 34
    return p0
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private i(Lnet/time4j/f0;)I
    .locals 4

    .line 1
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Lnet/time4j/f0;->q0(Lnet/time4j/f0;)B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Lnet/time4j/base/b;->d(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, Lnet/time4j/f0;->Y(Lnet/time4j/f0;)B

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x7

    .line 21
    .line 22
    add-int/2addr v3, p1

    .line 23
    if-gt v3, v0, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    mul-int/lit8 v1, v1, 0x7

    .line 28
    .line 29
    add-int/2addr p1, v1

    .line 30
    add-int/lit8 p1, p1, -0x1

    .line 31
    .line 32
    div-int/lit8 p1, p1, 0x7

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    return p1
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->d(Lnet/time4j/f0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->e(Lnet/time4j/f0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/f0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/f0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0}, Lnet/time4j/f0$d;->b()Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lnet/time4j/f0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/f0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0}, Lnet/time4j/f0$d;->b()Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lnet/time4j/f0;)I
    .locals 1

    .line 1
    iget v0, p0, Lnet/time4j/f0$d;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    iget-object v0, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-static {p1}, Lnet/time4j/f0;->Y(Lnet/time4j/f0;)B

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    div-int/lit8 p1, p1, 0x7

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    return p1

    .line 25
    :pswitch_1
    invoke-static {p1}, Lnet/time4j/f0;->Z(Lnet/time4j/f0;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :pswitch_2
    invoke-virtual {p1}, Lnet/time4j/f0;->F0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :pswitch_3
    invoke-static {p1}, Lnet/time4j/f0;->Y(Lnet/time4j/f0;)B

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :pswitch_4
    invoke-static {p1}, Lnet/time4j/f0;->q0(Lnet/time4j/f0;)B

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :pswitch_5
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public g(Lnet/time4j/f0;)Ljava/lang/Integer;
    .locals 1

    .line 1
    iget v0, p0, Lnet/time4j/f0$d;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    iget-object v0, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-direct {p0, p1}, Lnet/time4j/f0$d;->i(Lnet/time4j/f0;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_1
    invoke-static {p1}, Lnet/time4j/f0$d;->h(Lnet/time4j/f0;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_2
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p1}, Lnet/time4j/base/b;->e(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-static {}, Lnet/time4j/f0;->h0()Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lnet/time4j/f0;->i0()Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    return-object p1

    .line 52
    :pswitch_3
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {p1}, Lnet/time4j/f0;->q0(Lnet/time4j/f0;)B

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-static {v0, p1}, Lnet/time4j/base/b;->d(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_4
    invoke-static {}, Lnet/time4j/f0;->g0()Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_5
    sget-object p1, Lnet/time4j/f0;->q:Ljava/lang/Integer;

    .line 75
    .line 76
    return-object p1

    .line 77
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->g(Lnet/time4j/f0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;IZ)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/f0$d;->u(Lnet/time4j/f0;IZ)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->f(Lnet/time4j/f0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/f0$d;->t(Lnet/time4j/f0;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lnet/time4j/f0;)Ljava/lang/Integer;
    .locals 1

    .line 1
    iget p1, p0, Lnet/time4j/f0$d;->m:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    iget-object v0, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-static {}, Lnet/time4j/f0;->f0()Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_1
    sget-object p1, Lnet/time4j/f0;->p:Ljava/lang/Integer;

    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/f0$d;->v(Lnet/time4j/f0;Ljava/lang/Integer;Z)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->n(Lnet/time4j/f0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->r(Lnet/time4j/f0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lnet/time4j/f0;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->f(Lnet/time4j/f0;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public s(Lnet/time4j/f0;I)Z
    .locals 3

    .line 1
    iget v0, p0, Lnet/time4j/f0$d;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    iget-object p2, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1

    .line 16
    :pswitch_0
    if-lt p2, v2, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lnet/time4j/f0$d;->i(Lnet/time4j/f0;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-gt p2, p1, :cond_0

    .line 23
    .line 24
    move v1, v2

    .line 25
    :cond_0
    return v1

    .line 26
    :pswitch_1
    if-lt p2, v2, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Lnet/time4j/f0$d;->h(Lnet/time4j/f0;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-gt p2, p1, :cond_1

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_1
    return v1

    .line 36
    :pswitch_2
    if-lt p2, v2, :cond_3

    .line 37
    .line 38
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Lnet/time4j/base/b;->e(I)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const/16 p1, 0x16e

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/16 p1, 0x16d

    .line 52
    .line 53
    :goto_0
    if-gt p2, p1, :cond_3

    .line 54
    .line 55
    move v1, v2

    .line 56
    :cond_3
    return v1

    .line 57
    :pswitch_3
    if-lt p2, v2, :cond_4

    .line 58
    .line 59
    invoke-static {p1}, Lnet/time4j/f0;->p0(Lnet/time4j/f0;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {p1}, Lnet/time4j/f0;->q0(Lnet/time4j/f0;)B

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {v0, p1}, Lnet/time4j/base/b;->d(II)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-gt p2, p1, :cond_4

    .line 72
    .line 73
    move v1, v2

    .line 74
    :cond_4
    return v1

    .line 75
    :pswitch_4
    if-lt p2, v2, :cond_5

    .line 76
    .line 77
    const/16 p1, 0xc

    .line 78
    .line 79
    if-gt p2, p1, :cond_5

    .line 80
    .line 81
    move v1, v2

    .line 82
    :cond_5
    return v1

    .line 83
    :pswitch_5
    const p1, -0x3b9ac9ff

    .line 84
    .line 85
    .line 86
    if-lt p2, p1, :cond_6

    .line 87
    .line 88
    const p1, 0x3b9ac9ff

    .line 89
    .line 90
    .line 91
    if-gt p2, p1, :cond_6

    .line 92
    .line 93
    move v1, v2

    .line 94
    :cond_6
    return v1

    .line 95
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public t(Lnet/time4j/f0;Ljava/lang/Integer;)Z
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lnet/time4j/f0$d;->s(Lnet/time4j/f0;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public u(Lnet/time4j/f0;IZ)Lnet/time4j/f0;
    .locals 3

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lnet/time4j/f0;->a0()Lfj/h0;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object v0, p0, Lnet/time4j/f0$d;->k:Lfj/p;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lfj/h0;->L(Lfj/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Lnet/time4j/u;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lnet/time4j/f0$d;->f(Lnet/time4j/f0;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-long v0, p2

    .line 24
    invoke-virtual {p1, v0, v1, p3}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lnet/time4j/f0;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    iget v0, p0, Lnet/time4j/f0$d;->m:I

    .line 32
    .line 33
    const-string v1, "Out of range: "

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    packed-switch v0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 40
    .line 41
    iget-object p2, p0, Lnet/time4j/f0$d;->l:Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :pswitch_0
    if-nez p3, :cond_2

    .line 48
    .line 49
    if-lt p2, v2, :cond_1

    .line 50
    .line 51
    invoke-direct {p0, p1}, Lnet/time4j/f0$d;->i(Lnet/time4j/f0;)I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-gt p2, p3, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    new-instance p3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_2
    :goto_0
    invoke-static {p1}, Lnet/time4j/f0;->Y(Lnet/time4j/f0;)B

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    sub-int/2addr p3, v2

    .line 84
    div-int/lit8 p3, p3, 0x7

    .line 85
    .line 86
    add-int/2addr p3, v2

    .line 87
    sub-int/2addr p2, p3

    .line 88
    int-to-long p2, p2

    .line 89
    sget-object v0, Lnet/time4j/f;->q:Lnet/time4j/f;

    .line 90
    .line 91
    invoke-virtual {p1, p2, p3, v0}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lnet/time4j/f0;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_1
    if-lt p2, v2, :cond_3

    .line 99
    .line 100
    invoke-static {p1}, Lnet/time4j/f0$d;->h(Lnet/time4j/f0;)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-gt p2, p3, :cond_3

    .line 105
    .line 106
    invoke-static {p1}, Lnet/time4j/f0;->Z(Lnet/time4j/f0;)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p2, p3

    .line 111
    int-to-long p2, p2

    .line 112
    sget-object v0, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 113
    .line 114
    invoke-virtual {p1, p2, p3, v0}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lnet/time4j/f0;

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    new-instance p3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1

    .line 142
    :pswitch_2
    invoke-static {p1, p2}, Lnet/time4j/f0;->e0(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :pswitch_3
    invoke-static {p1, p2}, Lnet/time4j/f0;->d0(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_4
    invoke-static {p1, p2}, Lnet/time4j/f0;->c0(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1

    .line 157
    :pswitch_5
    invoke-static {p1, p2}, Lnet/time4j/f0;->b0(Lnet/time4j/f0;I)Lnet/time4j/f0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public v(Lnet/time4j/f0;Ljava/lang/Integer;Z)Lnet/time4j/f0;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/f0$d;->u(Lnet/time4j/f0;IZ)Lnet/time4j/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p2, "Missing element value."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method
