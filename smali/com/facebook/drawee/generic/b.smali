.class public Lcom/facebook/drawee/generic/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    sput-object v0, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private static a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/drawee/drawable/j;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p2, v1, p0}, Lcom/facebook/drawee/drawable/j;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Landroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    instance-of p2, p0, Landroid/graphics/drawable/NinePatchDrawable;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    check-cast p0, Landroid/graphics/drawable/NinePatchDrawable;

    .line 29
    .line 30
    new-instance p2, Lcom/facebook/drawee/drawable/m;

    .line 31
    .line 32
    invoke-direct {p2, p0}, Lcom/facebook/drawee/drawable/m;-><init>(Landroid/graphics/drawable/NinePatchDrawable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_1
    instance-of p2, p0, Landroid/graphics/drawable/ColorDrawable;

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    .line 44
    .line 45
    invoke-static {p0}, Lcom/facebook/drawee/drawable/RoundedColorDrawable;->f(Landroid/graphics/drawable/ColorDrawable;)Lcom/facebook/drawee/drawable/RoundedColorDrawable;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    const/4 p1, 0x1

    .line 54
    new-array p1, p1, [Ljava/lang/Object;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    aput-object p0, p1, p2

    .line 58
    .line 59
    const-string p2, "WrappingUtils"

    .line 60
    .line 61
    const-string v0, "Don\'t know how to round that drawable: %s"

    .line 62
    .line 63
    invoke-static {p2, v0, p1}, Lw3/a;->J(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object p0
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
.end method

.method static b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->a(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->d()[F

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->g([F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->b()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->c()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-interface {p0, v0, v1}, Lcom/facebook/drawee/drawable/i;->setBorder(IF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->g()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->b(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->k()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->e(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->h()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/i;->d(Z)V

    .line 45
    .line 46
    .line 47
    return-void
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
.end method

.method static c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;
    .locals 2

    .line 1
    :goto_0
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_1

    .line 6
    .line 7
    instance-of v1, v0, Lcom/facebook/drawee/drawable/c;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move-object p0, v0

    .line 13
    check-cast p0, Lcom/facebook/drawee/drawable/c;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-object p0
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
.end method

.method static d(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "WrappingUtils#maybeApplyLeafRounding"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p0, :cond_5

    .line 13
    .line 14
    if-eqz p1, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->j()Lcom/facebook/drawee/generic/a$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lcom/facebook/drawee/generic/a$a;->l:Lcom/facebook/drawee/generic/a$a;

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    instance-of v0, p0, Lcom/facebook/drawee/drawable/f;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Lcom/facebook/drawee/drawable/f;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/facebook/drawee/generic/b;->c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, p1, p2}, Lcom/facebook/drawee/generic/b;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lz5/b;->d()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-static {}, Lz5/b;->b()V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-object p0

    .line 59
    :cond_3
    :try_start_1
    invoke-static {p0, p1, p2}, Lcom/facebook/drawee/generic/b;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    invoke-static {}, Lz5/b;->d()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-static {}, Lz5/b;->b()V

    .line 70
    .line 71
    .line 72
    :cond_4
    return-object p0

    .line 73
    :cond_5
    :goto_0
    invoke-static {}, Lz5/b;->d()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    invoke-static {}, Lz5/b;->b()V

    .line 80
    .line 81
    .line 82
    :cond_6
    return-object p0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-static {}, Lz5/b;->d()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    invoke-static {}, Lz5/b;->b()V

    .line 91
    .line 92
    .line 93
    :cond_7
    throw p0
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
.end method

.method static e(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "WrappingUtils#maybeWrapWithRoundedOverlayColor"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p0, :cond_3

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->j()Lcom/facebook/drawee/generic/a$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lcom/facebook/drawee/generic/a$a;->k:Lcom/facebook/drawee/generic/a$a;

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Lcom/facebook/drawee/drawable/k;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/facebook/drawee/drawable/k;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->f()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {v0, p0}, Lcom/facebook/drawee/drawable/k;->i(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lz5/b;->d()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-static {}, Lz5/b;->b()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-object v0

    .line 50
    :cond_3
    :goto_0
    invoke-static {}, Lz5/b;->d()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    invoke-static {}, Lz5/b;->b()V

    .line 57
    .line 58
    .line 59
    :cond_4
    return-object p0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    invoke-static {}, Lz5/b;->d()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    invoke-static {}, Lz5/b;->b()V

    .line 68
    .line 69
    .line 70
    :cond_5
    throw p0
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
.end method

.method static f(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/facebook/drawee/generic/b;->g(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;Landroid/graphics/PointF;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method static g(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;Landroid/graphics/PointF;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "WrappingUtils#maybeWrapWithScaleType"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-eqz p0, :cond_4

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v0, Lcom/facebook/drawee/drawable/n;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Lcom/facebook/drawee/drawable/n;-><init>(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)V

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Lcom/facebook/drawee/drawable/n;->l(Landroid/graphics/PointF;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-static {}, Lz5/b;->d()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-static {}, Lz5/b;->b()V

    .line 34
    .line 35
    .line 36
    :cond_3
    return-object v0

    .line 37
    :cond_4
    :goto_0
    invoke-static {}, Lz5/b;->d()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    invoke-static {}, Lz5/b;->b()V

    .line 44
    .line 45
    .line 46
    :cond_5
    return-object p0
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
.end method

.method static h(Lcom/facebook/drawee/drawable/i;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->a(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/i;->c(F)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, Lcom/facebook/drawee/drawable/i;->setBorder(IF)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/i;->b(F)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->e(Z)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/i;->d(Z)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method static i(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/facebook/drawee/generic/b;->c(Lcom/facebook/drawee/drawable/c;)Lcom/facebook/drawee/drawable/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->j()Lcom/facebook/drawee/generic/a$a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lcom/facebook/drawee/generic/a$a;->l:Lcom/facebook/drawee/generic/a$a;

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    instance-of v1, v0, Lcom/facebook/drawee/drawable/i;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Lcom/facebook/drawee/drawable/i;

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object v1, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    invoke-interface {p0, v1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1, p2}, Lcom/facebook/drawee/generic/b;->a(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    instance-of p0, v0, Lcom/facebook/drawee/drawable/i;

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    check-cast v0, Lcom/facebook/drawee/drawable/i;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/facebook/drawee/generic/b;->h(Lcom/facebook/drawee/drawable/i;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
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
.end method

.method static j(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/generic/a;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->j()Lcom/facebook/drawee/generic/a$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/facebook/drawee/generic/a$a;->k:Lcom/facebook/drawee/generic/a$a;

    .line 12
    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Lcom/facebook/drawee/drawable/k;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Lcom/facebook/drawee/drawable/k;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->b(Lcom/facebook/drawee/drawable/i;Lcom/facebook/drawee/generic/a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/drawee/generic/a;->f()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0, p0}, Lcom/facebook/drawee/drawable/k;->i(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->e(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/generic/a;)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    instance-of p1, v0, Lcom/facebook/drawee/drawable/k;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    check-cast v0, Lcom/facebook/drawee/drawable/k;

    .line 51
    .line 52
    sget-object p1, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/drawable/f;->setCurrent(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
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
.end method

.method static k(Lcom/facebook/drawee/drawable/c;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/drawable/n;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/drawee/generic/b;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lcom/facebook/drawee/generic/b;->f(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/drawee/drawable/c;->setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    const-string p0, "Parent has no child drawable!"

    .line 15
    .line 16
    invoke-static {p1, p0}, Lv3/j;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    check-cast p1, Lcom/facebook/drawee/drawable/n;

    .line 20
    .line 21
    return-object p1
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
.end method
