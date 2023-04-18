.class public final Lv7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/h0$b;,
        Lv7/h0$a;
    }
.end annotation


# static fields
.field public static final t:Ll7/o;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf9/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lf9/y;

.field private final e:Landroid/util/SparseIntArray;

.field private final f:Lv7/i0$c;

.field private final g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lv7/i0;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroid/util/SparseBooleanArray;

.field private final i:Landroid/util/SparseBooleanArray;

.field private final j:Lv7/f0;

.field private k:Lv7/e0;

.field private l:Ll7/k;

.field private m:I

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lv7/i0;

.field private r:I

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv7/g0;

    invoke-direct {v0}, Lv7/g0;-><init>()V

    sput-object v0, Lv7/h0;->t:Ll7/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lv7/h0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    const v1, 0x1b8a0

    .line 2
    invoke-direct {p0, v0, p1, v1}, Lv7/h0;-><init>(III)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 3

    .line 3
    new-instance v0, Lf9/l0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lf9/l0;-><init>(J)V

    new-instance v1, Lv7/j;

    invoke-direct {v1, p2}, Lv7/j;-><init>(I)V

    invoke-direct {p0, p1, v0, v1, p3}, Lv7/h0;-><init>(ILf9/l0;Lv7/i0$c;I)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;Lv7/i0$c;)V
    .locals 1

    const v0, 0x1b8a0

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Lv7/h0;-><init>(ILf9/l0;Lv7/i0$c;I)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;Lv7/i0$c;I)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {p3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lv7/i0$c;

    iput-object p3, p0, Lv7/h0;->f:Lv7/i0$c;

    .line 7
    iput p4, p0, Lv7/h0;->b:I

    .line 8
    iput p1, p0, Lv7/h0;->a:I

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv7/h0;->c:Ljava/util/List;

    .line 10
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv7/h0;->c:Ljava/util/List;

    .line 12
    :goto_1
    new-instance p1, Lf9/y;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lf9/y;-><init>([BI)V

    iput-object p1, p0, Lv7/h0;->d:Lf9/y;

    .line 13
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lv7/h0;->h:Landroid/util/SparseBooleanArray;

    .line 14
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lv7/h0;->i:Landroid/util/SparseBooleanArray;

    .line 15
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 16
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lv7/h0;->e:Landroid/util/SparseIntArray;

    .line 17
    new-instance p1, Lv7/f0;

    invoke-direct {p1, p4}, Lv7/f0;-><init>(I)V

    iput-object p1, p0, Lv7/h0;->j:Lv7/f0;

    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lv7/h0;->s:I

    .line 19
    invoke-direct {p0}, Lv7/h0;->y()V

    return-void
.end method

.method public static synthetic a()[Ll7/i;
    .locals 1

    invoke-static {}, Lv7/h0;->w()[Ll7/i;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lv7/h0;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    return-object p0
.end method

.method static synthetic e(Lv7/h0;)I
    .locals 0

    iget p0, p0, Lv7/h0;->m:I

    return p0
.end method

.method static synthetic g(Lv7/h0;)Z
    .locals 0

    iget-boolean p0, p0, Lv7/h0;->n:Z

    return p0
.end method

.method static synthetic h(Lv7/h0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lv7/h0;->n:Z

    return p1
.end method

.method static synthetic j(Lv7/h0;I)I
    .locals 0

    iput p1, p0, Lv7/h0;->m:I

    return p1
.end method

.method static synthetic k(Lv7/h0;)I
    .locals 2

    iget v0, p0, Lv7/h0;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lv7/h0;->m:I

    return v0
.end method

.method static synthetic l(Lv7/h0;)I
    .locals 0

    iget p0, p0, Lv7/h0;->a:I

    return p0
.end method

.method static synthetic m(Lv7/h0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lv7/h0;->c:Ljava/util/List;

    return-object p0
.end method

.method static synthetic n(Lv7/h0;I)I
    .locals 0

    iput p1, p0, Lv7/h0;->s:I

    return p1
.end method

.method static synthetic o(Lv7/h0;)Lv7/i0;
    .locals 0

    iget-object p0, p0, Lv7/h0;->q:Lv7/i0;

    return-object p0
.end method

.method static synthetic p(Lv7/h0;Lv7/i0;)Lv7/i0;
    .locals 0

    iput-object p1, p0, Lv7/h0;->q:Lv7/i0;

    return-object p1
.end method

.method static synthetic q(Lv7/h0;)Lv7/i0$c;
    .locals 0

    iget-object p0, p0, Lv7/h0;->f:Lv7/i0$c;

    return-object p0
.end method

.method static synthetic r(Lv7/h0;)Ll7/k;
    .locals 0

    iget-object p0, p0, Lv7/h0;->l:Ll7/k;

    return-object p0
.end method

.method static synthetic s(Lv7/h0;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lv7/h0;->h:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method static synthetic t(Lv7/h0;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lv7/h0;->i:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method private u(Ll7/j;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lv7/h0;->d:Lf9/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lv7/h0;->d:Lf9/y;

    .line 8
    .line 9
    invoke-virtual {v1}, Lf9/y;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    rsub-int v1, v1, 0x24b8

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/16 v3, 0xbc

    .line 17
    .line 18
    if-ge v1, v3, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lv7/h0;->d:Lf9/y;

    .line 21
    .line 22
    invoke-virtual {v1}, Lf9/y;->a()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    iget-object v4, p0, Lv7/h0;->d:Lf9/y;

    .line 29
    .line 30
    invoke-virtual {v4}, Lf9/y;->e()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-static {v0, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v4, p0, Lv7/h0;->d:Lf9/y;

    .line 38
    .line 39
    invoke-virtual {v4, v0, v1}, Lf9/y;->N([BI)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object v1, p0, Lv7/h0;->d:Lf9/y;

    .line 43
    .line 44
    invoke-virtual {v1}, Lf9/y;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ge v1, v3, :cond_3

    .line 49
    .line 50
    iget-object v1, p0, Lv7/h0;->d:Lf9/y;

    .line 51
    .line 52
    invoke-virtual {v1}, Lf9/y;->f()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    rsub-int v4, v1, 0x24b8

    .line 57
    .line 58
    invoke-interface {p1, v0, v1, v4}, Ll7/j;->read([BII)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, -0x1

    .line 63
    if-ne v4, v5, :cond_2

    .line 64
    .line 65
    return v2

    .line 66
    :cond_2
    iget-object v5, p0, Lv7/h0;->d:Lf9/y;

    .line 67
    .line 68
    add-int/2addr v1, v4

    .line 69
    invoke-virtual {v5, v1}, Lf9/y;->O(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 p1, 0x1

    .line 74
    return p1
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
.end method

.method private v()I
    .locals 4

    .line 1
    iget-object v0, p0, Lv7/h0;->d:Lf9/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/y;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv7/h0;->d:Lf9/y;

    .line 8
    .line 9
    invoke-virtual {v1}, Lf9/y;->f()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lv7/h0;->d:Lf9/y;

    .line 14
    .line 15
    invoke-virtual {v2}, Lf9/y;->d()[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2, v0, v1}, Lv7/j0;->a([BII)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, p0, Lv7/h0;->d:Lf9/y;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lf9/y;->P(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit16 v3, v2, 0xbc

    .line 29
    .line 30
    if-le v3, v1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Lv7/h0;->r:I

    .line 33
    .line 34
    sub-int/2addr v2, v0

    .line 35
    add-int/2addr v1, v2

    .line 36
    iput v1, p0, Lv7/h0;->r:I

    .line 37
    .line 38
    iget v0, p0, Lv7/h0;->a:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-ne v0, v2, :cond_2

    .line 42
    .line 43
    const/16 v0, 0x178

    .line 44
    .line 45
    if-gt v1, v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Ld7/o;

    .line 49
    .line 50
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lv7/h0;->r:I

    .line 58
    .line 59
    :cond_2
    :goto_0
    return v3
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method private static synthetic w()[Ll7/i;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ll7/i;

    .line 3
    .line 4
    new-instance v1, Lv7/h0;

    .line 5
    .line 6
    invoke-direct {v1}, Lv7/h0;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    return-object v0
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method private x(J)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lv7/h0;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lv7/h0;->o:Z

    .line 7
    .line 8
    iget-object v0, p0, Lv7/h0;->j:Lv7/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lv7/f0;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lv7/e0;

    .line 24
    .line 25
    iget-object v1, p0, Lv7/h0;->j:Lv7/f0;

    .line 26
    .line 27
    invoke-virtual {v1}, Lv7/f0;->c()Lf9/l0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v1, p0, Lv7/h0;->j:Lv7/f0;

    .line 32
    .line 33
    invoke-virtual {v1}, Lv7/f0;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iget v7, p0, Lv7/h0;->s:I

    .line 38
    .line 39
    iget v8, p0, Lv7/h0;->b:I

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    move-wide v5, p1

    .line 43
    invoke-direct/range {v1 .. v8}, Lv7/e0;-><init>(Lf9/l0;JJII)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lv7/h0;->k:Lv7/e0;

    .line 47
    .line 48
    iget-object p1, p0, Lv7/h0;->l:Ll7/k;

    .line 49
    .line 50
    invoke-virtual {v0}, Ll7/a;->b()Ll7/y;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-interface {p1, p2}, Ll7/k;->i(Ll7/y;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object p1, p0, Lv7/h0;->l:Ll7/k;

    .line 59
    .line 60
    new-instance p2, Ll7/y$b;

    .line 61
    .line 62
    iget-object v0, p0, Lv7/h0;->j:Lv7/f0;

    .line 63
    .line 64
    invoke-virtual {v0}, Lv7/f0;->b()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-direct {p2, v0, v1}, Ll7/y$b;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2}, Ll7/k;->i(Ll7/y;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    return-void
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
.end method

.method private y()V
    .locals 7

    .line 1
    iget-object v0, p0, Lv7/h0;->h:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv7/h0;->f:Lv7/i0$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lv7/i0$c;->a()Landroid/util/SparseArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_0

    .line 24
    .line 25
    iget-object v4, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Lv7/i0;

    .line 36
    .line 37
    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 44
    .line 45
    new-instance v1, Lv7/c0;

    .line 46
    .line 47
    new-instance v3, Lv7/h0$a;

    .line 48
    .line 49
    invoke-direct {v3, p0}, Lv7/h0$a;-><init>(Lv7/h0;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v3}, Lv7/c0;-><init>(Lv7/b0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lv7/h0;->q:Lv7/i0;

    .line 60
    .line 61
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method

.method private z(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lv7/h0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lv7/h0;->n:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lv7/h0;->i:Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :cond_1
    return v1
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
.end method


# virtual methods
.method public b(Ll7/k;)V
    .locals 0

    iput-object p1, p0, Lv7/h0;->l:Ll7/k;

    return-void
.end method

.method public c(JJ)V
    .locals 9

    .line 1
    iget p1, p0, Lv7/h0;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    invoke-static {p1}, Lf9/a;->f(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lv7/h0;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    move p2, v1

    .line 21
    :goto_1
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    if-ge p2, p1, :cond_4

    .line 24
    .line 25
    iget-object v4, p0, Lv7/h0;->c:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lf9/l0;

    .line 32
    .line 33
    invoke-virtual {v4}, Lf9/l0;->e()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v5, v5, v7

    .line 43
    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    move v5, v0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move v5, v1

    .line 49
    :goto_2
    if-nez v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Lf9/l0;->e()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    cmp-long v2, v5, v2

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {v4}, Lf9/l0;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    cmp-long v2, v2, p3

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    :cond_2
    invoke-virtual {v4, p3, p4}, Lf9/l0;->g(J)V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    cmp-long p1, p3, v2

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    iget-object p1, p0, Lv7/h0;->k:Lv7/e0;

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1, p3, p4}, Ll7/a;->h(J)V

    .line 82
    .line 83
    .line 84
    :cond_5
    iget-object p1, p0, Lv7/h0;->d:Lf9/y;

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lf9/y;->L(I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lv7/h0;->e:Landroid/util/SparseIntArray;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 92
    .line 93
    .line 94
    move p1, v1

    .line 95
    :goto_3
    iget-object p2, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 96
    .line 97
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-ge p1, p2, :cond_6

    .line 102
    .line 103
    iget-object p2, p0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Lv7/i0;

    .line 110
    .line 111
    invoke-interface {p2}, Lv7/i0;->c()V

    .line 112
    .line 113
    .line 114
    add-int/lit8 p1, p1, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    iput v1, p0, Lv7/h0;->r:I

    .line 118
    .line 119
    return-void
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
.end method

.method public f(Ll7/j;Ll7/x;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Ll7/j;->getLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-boolean v5, v0, Lv7/h0;->n:Z

    .line 12
    .line 13
    const-wide/16 v6, -0x1

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    if-eqz v5, :cond_3

    .line 19
    .line 20
    cmp-long v5, v3, v6

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    iget v5, v0, Lv7/h0;->a:I

    .line 25
    .line 26
    if-eq v5, v8, :cond_0

    .line 27
    .line 28
    move v5, v9

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v5, v10

    .line 31
    :goto_0
    if-eqz v5, :cond_1

    .line 32
    .line 33
    iget-object v5, v0, Lv7/h0;->j:Lv7/f0;

    .line 34
    .line 35
    invoke-virtual {v5}, Lv7/f0;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    iget-object v3, v0, Lv7/h0;->j:Lv7/f0;

    .line 42
    .line 43
    iget v4, v0, Lv7/h0;->s:I

    .line 44
    .line 45
    invoke-virtual {v3, v1, v2, v4}, Lv7/f0;->e(Ll7/j;Ll7/x;I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    return v1

    .line 50
    :cond_1
    invoke-direct {v0, v3, v4}, Lv7/h0;->x(J)V

    .line 51
    .line 52
    .line 53
    iget-boolean v5, v0, Lv7/h0;->p:Z

    .line 54
    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    iput-boolean v10, v0, Lv7/h0;->p:Z

    .line 58
    .line 59
    const-wide/16 v11, 0x0

    .line 60
    .line 61
    invoke-virtual {v0, v11, v12, v11, v12}, Lv7/h0;->c(JJ)V

    .line 62
    .line 63
    .line 64
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 65
    .line 66
    .line 67
    move-result-wide v13

    .line 68
    cmp-long v5, v13, v11

    .line 69
    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    iput-wide v11, v2, Ll7/x;->a:J

    .line 73
    .line 74
    return v9

    .line 75
    :cond_2
    iget-object v5, v0, Lv7/h0;->k:Lv7/e0;

    .line 76
    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-virtual {v5}, Ll7/a;->d()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    iget-object v3, v0, Lv7/h0;->k:Lv7/e0;

    .line 86
    .line 87
    invoke-virtual {v3, v1, v2}, Ll7/a;->c(Ll7/j;Ll7/x;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    return v1

    .line 92
    :cond_3
    invoke-direct/range {p0 .. p1}, Lv7/h0;->u(Ll7/j;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_4

    .line 97
    .line 98
    const/4 v1, -0x1

    .line 99
    return v1

    .line 100
    :cond_4
    invoke-direct/range {p0 .. p0}, Lv7/h0;->v()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iget-object v2, v0, Lv7/h0;->d:Lf9/y;

    .line 105
    .line 106
    invoke-virtual {v2}, Lf9/y;->f()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-le v1, v2, :cond_5

    .line 111
    .line 112
    return v10

    .line 113
    :cond_5
    iget-object v5, v0, Lv7/h0;->d:Lf9/y;

    .line 114
    .line 115
    invoke-virtual {v5}, Lf9/y;->n()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/high16 v11, 0x800000

    .line 120
    .line 121
    and-int/2addr v11, v5

    .line 122
    if-eqz v11, :cond_6

    .line 123
    .line 124
    iget-object v2, v0, Lv7/h0;->d:Lf9/y;

    .line 125
    .line 126
    invoke-virtual {v2, v1}, Lf9/y;->P(I)V

    .line 127
    .line 128
    .line 129
    return v10

    .line 130
    :cond_6
    const/high16 v11, 0x400000

    .line 131
    .line 132
    and-int/2addr v11, v5

    .line 133
    if-eqz v11, :cond_7

    .line 134
    .line 135
    move v11, v9

    .line 136
    goto :goto_1

    .line 137
    :cond_7
    move v11, v10

    .line 138
    :goto_1
    or-int/2addr v11, v10

    .line 139
    const v12, 0x1fff00

    .line 140
    .line 141
    .line 142
    and-int/2addr v12, v5

    .line 143
    shr-int/lit8 v12, v12, 0x8

    .line 144
    .line 145
    and-int/lit8 v13, v5, 0x20

    .line 146
    .line 147
    if-eqz v13, :cond_8

    .line 148
    .line 149
    move v13, v9

    .line 150
    goto :goto_2

    .line 151
    :cond_8
    move v13, v10

    .line 152
    :goto_2
    and-int/lit8 v14, v5, 0x10

    .line 153
    .line 154
    if-eqz v14, :cond_9

    .line 155
    .line 156
    move v14, v9

    .line 157
    goto :goto_3

    .line 158
    :cond_9
    move v14, v10

    .line 159
    :goto_3
    if-eqz v14, :cond_a

    .line 160
    .line 161
    iget-object v14, v0, Lv7/h0;->g:Landroid/util/SparseArray;

    .line 162
    .line 163
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    check-cast v14, Lv7/i0;

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    const/4 v14, 0x0

    .line 171
    :goto_4
    if-nez v14, :cond_b

    .line 172
    .line 173
    iget-object v2, v0, Lv7/h0;->d:Lf9/y;

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Lf9/y;->P(I)V

    .line 176
    .line 177
    .line 178
    return v10

    .line 179
    :cond_b
    iget v15, v0, Lv7/h0;->a:I

    .line 180
    .line 181
    if-eq v15, v8, :cond_d

    .line 182
    .line 183
    and-int/lit8 v5, v5, 0xf

    .line 184
    .line 185
    iget-object v15, v0, Lv7/h0;->e:Landroid/util/SparseIntArray;

    .line 186
    .line 187
    add-int/lit8 v6, v5, -0x1

    .line 188
    .line 189
    invoke-virtual {v15, v12, v6}, Landroid/util/SparseIntArray;->get(II)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    iget-object v7, v0, Lv7/h0;->e:Landroid/util/SparseIntArray;

    .line 194
    .line 195
    invoke-virtual {v7, v12, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 196
    .line 197
    .line 198
    if-ne v6, v5, :cond_c

    .line 199
    .line 200
    iget-object v2, v0, Lv7/h0;->d:Lf9/y;

    .line 201
    .line 202
    invoke-virtual {v2, v1}, Lf9/y;->P(I)V

    .line 203
    .line 204
    .line 205
    return v10

    .line 206
    :cond_c
    add-int/2addr v6, v9

    .line 207
    and-int/lit8 v6, v6, 0xf

    .line 208
    .line 209
    if-eq v5, v6, :cond_d

    .line 210
    .line 211
    invoke-interface {v14}, Lv7/i0;->c()V

    .line 212
    .line 213
    .line 214
    :cond_d
    if-eqz v13, :cond_f

    .line 215
    .line 216
    iget-object v5, v0, Lv7/h0;->d:Lf9/y;

    .line 217
    .line 218
    invoke-virtual {v5}, Lf9/y;->D()I

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    iget-object v6, v0, Lv7/h0;->d:Lf9/y;

    .line 223
    .line 224
    invoke-virtual {v6}, Lf9/y;->D()I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    and-int/lit8 v6, v6, 0x40

    .line 229
    .line 230
    if-eqz v6, :cond_e

    .line 231
    .line 232
    move v6, v8

    .line 233
    goto :goto_5

    .line 234
    :cond_e
    move v6, v10

    .line 235
    :goto_5
    or-int/2addr v11, v6

    .line 236
    iget-object v6, v0, Lv7/h0;->d:Lf9/y;

    .line 237
    .line 238
    sub-int/2addr v5, v9

    .line 239
    invoke-virtual {v6, v5}, Lf9/y;->Q(I)V

    .line 240
    .line 241
    .line 242
    :cond_f
    iget-boolean v5, v0, Lv7/h0;->n:Z

    .line 243
    .line 244
    invoke-direct {v0, v12}, Lv7/h0;->z(I)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-eqz v6, :cond_10

    .line 249
    .line 250
    iget-object v6, v0, Lv7/h0;->d:Lf9/y;

    .line 251
    .line 252
    invoke-virtual {v6, v1}, Lf9/y;->O(I)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, Lv7/h0;->d:Lf9/y;

    .line 256
    .line 257
    invoke-interface {v14, v6, v11}, Lv7/i0;->b(Lf9/y;I)V

    .line 258
    .line 259
    .line 260
    iget-object v6, v0, Lv7/h0;->d:Lf9/y;

    .line 261
    .line 262
    invoke-virtual {v6, v2}, Lf9/y;->O(I)V

    .line 263
    .line 264
    .line 265
    :cond_10
    iget v2, v0, Lv7/h0;->a:I

    .line 266
    .line 267
    if-eq v2, v8, :cond_11

    .line 268
    .line 269
    if-nez v5, :cond_11

    .line 270
    .line 271
    iget-boolean v2, v0, Lv7/h0;->n:Z

    .line 272
    .line 273
    if-eqz v2, :cond_11

    .line 274
    .line 275
    const-wide/16 v5, -0x1

    .line 276
    .line 277
    cmp-long v2, v3, v5

    .line 278
    .line 279
    if-eqz v2, :cond_11

    .line 280
    .line 281
    iput-boolean v9, v0, Lv7/h0;->p:Z

    .line 282
    .line 283
    :cond_11
    iget-object v2, v0, Lv7/h0;->d:Lf9/y;

    .line 284
    .line 285
    invoke-virtual {v2, v1}, Lf9/y;->P(I)V

    .line 286
    .line 287
    .line 288
    return v10
.end method

.method public i(Ll7/j;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lv7/h0;->d:Lf9/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3ac

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {p1, v0, v2, v1}, Ll7/j;->n([BII)V

    .line 11
    .line 12
    .line 13
    move v1, v2

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v1, v3, :cond_3

    .line 17
    .line 18
    move v3, v2

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    const/4 v5, 0x1

    .line 21
    if-ge v3, v4, :cond_1

    .line 22
    .line 23
    mul-int/lit16 v4, v3, 0xbc

    .line 24
    .line 25
    add-int/2addr v4, v1

    .line 26
    aget-byte v4, v0, v4

    .line 27
    .line 28
    const/16 v6, 0x47

    .line 29
    .line 30
    if-eq v4, v6, :cond_0

    .line 31
    .line 32
    move v3, v2

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v5

    .line 38
    :goto_2
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-interface {p1, v1}, Ll7/j;->k(I)V

    .line 41
    .line 42
    .line 43
    return v5

    .line 44
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    return v2
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
.end method

.method public release()V
    .locals 0

    return-void
.end method
