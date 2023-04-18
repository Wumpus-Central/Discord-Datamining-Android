.class public Ll5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll5/d$c;,
        Ll5/d$b;
    }
.end annotation


# instance fields
.field private final a:Lj5/a;

.field private final b:Ll5/d$b;

.field private final c:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lj5/a;Ll5/d$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/d;->a:Lj5/a;

    .line 5
    .line 6
    iput-object p2, p0, Ll5/d;->b:Ll5/d$b;

    .line 7
    .line 8
    new-instance p1, Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ll5/d;->c:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 25
    .line 26
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 27
    .line 28
    invoke-direct {p2, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 32
    .line 33
    .line 34
    return-void
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
.end method

.method private a(Landroid/graphics/Canvas;Lj5/b;)V
    .locals 7

    iget v0, p2, Lj5/b;->b:I

    int-to-float v2, v0

    iget v1, p2, Lj5/b;->c:I

    int-to-float v3, v1

    iget v4, p2, Lj5/b;->d:I

    add-int/2addr v0, v4

    int-to-float v4, v0

    iget p2, p2, Lj5/b;->e:I

    add-int/2addr v1, p2

    int-to-float v5, v1

    iget-object v6, p0, Ll5/d;->c:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private b(I)Ll5/d$c;
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/d;->a:Lj5/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lj5/a;->c(I)Lj5/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, Lj5/b;->g:Lj5/b$b;

    .line 8
    .line 9
    sget-object v1, Lj5/b$b;->k:Lj5/b$b;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p1, Ll5/d$c;->k:Ll5/d$c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object v1, Lj5/b$b;->l:Lj5/b$b;

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ll5/d;->c(Lj5/b;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    sget-object p1, Ll5/d$c;->l:Ll5/d$c;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    sget-object p1, Ll5/d$c;->k:Ll5/d$c;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    sget-object p1, Lj5/b$b;->m:Lj5/b$b;

    .line 33
    .line 34
    if-ne v0, p1, :cond_3

    .line 35
    .line 36
    sget-object p1, Ll5/d$c;->m:Ll5/d$c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_3
    sget-object p1, Ll5/d$c;->n:Ll5/d$c;

    .line 40
    .line 41
    return-object p1
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
.end method

.method private c(Lj5/b;)Z
    .locals 2

    .line 1
    iget v0, p1, Lj5/b;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p1, Lj5/b;->c:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p1, Lj5/b;->d:I

    .line 10
    .line 11
    iget-object v1, p0, Ll5/d;->a:Lj5/a;

    .line 12
    .line 13
    invoke-interface {v1}, Lj5/a;->h()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget p1, p1, Lj5/b;->e:I

    .line 20
    .line 21
    iget-object v0, p0, Ll5/d;->a:Lj5/a;

    .line 22
    .line 23
    invoke-interface {v0}, Lj5/a;->g()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ne p1, v0, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    :goto_0
    return p1
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
.end method

.method private d(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Ll5/d;->a:Lj5/a;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Lj5/a;->c(I)Lj5/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Ll5/d;->a:Lj5/a;

    .line 12
    .line 13
    sub-int/2addr p1, v0

    .line 14
    invoke-interface {v2, p1}, Lj5/a;->c(I)Lj5/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v2, v1, Lj5/b;->f:Lj5/b$a;

    .line 19
    .line 20
    sget-object v3, Lj5/b$a;->l:Lj5/b$a;

    .line 21
    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, v1}, Ll5/d;->c(Lj5/b;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    iget-object v1, p1, Lj5/b;->g:Lj5/b$b;

    .line 32
    .line 33
    sget-object v2, Lj5/b$b;->l:Lj5/b$b;

    .line 34
    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ll5/d;->c(Lj5/b;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_0
    return v0
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
.end method

.method private e(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ll5/d;->a:Lj5/a;

    .line 2
    .line 3
    invoke-interface {p1}, Lj5/a;->i()Lj5/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Lj5/e;->c()Lb6/a;

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method private f(ILandroid/graphics/Canvas;)I
    .locals 6

    .line 1
    :goto_0
    if-ltz p1, :cond_6

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ll5/d;->b(I)Ll5/d$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ll5/d$a;->a:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    return p1

    .line 26
    :cond_1
    add-int/2addr p1, v1

    .line 27
    return p1

    .line 28
    :cond_2
    iget-object v0, p0, Ll5/d;->a:Lj5/a;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Lj5/a;->c(I)Lj5/b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p0, Ll5/d;->b:Ll5/d$b;

    .line 35
    .line 36
    invoke-interface {v2, p1}, Ll5/d$b;->b(I)Lcom/facebook/common/references/CloseableReference;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v2}, Lcom/facebook/common/references/CloseableReference;->F()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/graphics/Bitmap;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-virtual {p2, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, v0, Lj5/b;->g:Lj5/b$b;

    .line 54
    .line 55
    sget-object v4, Lj5/b$b;->l:Lj5/b$b;

    .line 56
    .line 57
    if-ne v3, v4, :cond_3

    .line 58
    .line 59
    invoke-direct {p0, p2, v0}, Ll5/d;->a(Landroid/graphics/Canvas;Lj5/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_3
    add-int/2addr p1, v1

    .line 63
    invoke-virtual {v2}, Lcom/facebook/common/references/CloseableReference;->close()V

    .line 64
    .line 65
    .line 66
    return p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    invoke-virtual {v2}, Lcom/facebook/common/references/CloseableReference;->close()V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_4
    invoke-direct {p0, p1}, Ll5/d;->d(I)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    return p1

    .line 79
    :cond_5
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    const/4 p1, 0x0

    .line 83
    return p1
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
.end method


# virtual methods
.method public g(ILandroid/graphics/Bitmap;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Ll5/d;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    add-int/lit8 v1, p1, -0x1

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Ll5/d;->f(ILandroid/graphics/Canvas;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, p1

    .line 26
    :goto_0
    if-ge v1, p1, :cond_4

    .line 27
    .line 28
    iget-object v2, p0, Ll5/d;->a:Lj5/a;

    .line 29
    .line 30
    invoke-interface {v2, v1}, Lj5/a;->c(I)Lj5/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, v2, Lj5/b;->g:Lj5/b$b;

    .line 35
    .line 36
    sget-object v4, Lj5/b$b;->m:Lj5/b$b;

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v4, v2, Lj5/b;->f:Lj5/b$a;

    .line 42
    .line 43
    sget-object v5, Lj5/b$a;->l:Lj5/b$a;

    .line 44
    .line 45
    if-ne v4, v5, :cond_2

    .line 46
    .line 47
    invoke-direct {p0, v0, v2}, Ll5/d;->a(Landroid/graphics/Canvas;Lj5/b;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v4, p0, Ll5/d;->a:Lj5/a;

    .line 51
    .line 52
    invoke-interface {v4, v1, v0}, Lj5/a;->d(ILandroid/graphics/Canvas;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Ll5/d;->b:Ll5/d$b;

    .line 56
    .line 57
    invoke-interface {v4, v1, p2}, Ll5/d$b;->a(ILandroid/graphics/Bitmap;)V

    .line 58
    .line 59
    .line 60
    sget-object v4, Lj5/b$b;->l:Lj5/b$b;

    .line 61
    .line 62
    if-ne v3, v4, :cond_3

    .line 63
    .line 64
    invoke-direct {p0, v0, v2}, Ll5/d;->a(Landroid/graphics/Canvas;Lj5/b;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    iget-object v1, p0, Ll5/d;->a:Lj5/a;

    .line 71
    .line 72
    invoke-interface {v1, p1}, Lj5/a;->c(I)Lj5/b;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, v1, Lj5/b;->f:Lj5/b$a;

    .line 77
    .line 78
    sget-object v3, Lj5/b$a;->l:Lj5/b$a;

    .line 79
    .line 80
    if-ne v2, v3, :cond_5

    .line 81
    .line 82
    invoke-direct {p0, v0, v1}, Ll5/d;->a(Landroid/graphics/Canvas;Lj5/b;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    iget-object v1, p0, Ll5/d;->a:Lj5/a;

    .line 86
    .line 87
    invoke-interface {v1, p1, v0}, Lj5/a;->d(ILandroid/graphics/Canvas;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, p2}, Ll5/d;->e(Landroid/graphics/Bitmap;)V

    .line 91
    .line 92
    .line 93
    return-void
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
.end method
