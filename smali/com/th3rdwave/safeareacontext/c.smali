.class Lcom/th3rdwave/safeareacontext/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/Rect;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    new-instance p0, Lcom/th3rdwave/safeareacontext/Rect;

    .line 21
    .line 22
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    int-to-float v1, v1

    .line 25
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    int-to-float v0, v0

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    int-to-float p1, p1

    .line 38
    invoke-direct {p0, v1, v0, v2, p1}, Lcom/th3rdwave/safeareacontext/Rect;-><init>(FFFF)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    return-object v1
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
.end method

.method private static b(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-float p0, p0

    .line 39
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;-><init>(FFFF)V

    .line 40
    .line 41
    .line 42
    return-object v0
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
.end method

.method static c(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/c;->b(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    new-instance v3, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 36
    .line 37
    .line 38
    iget v4, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->a:F

    .line 39
    .line 40
    iget v5, v3, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    int-to-float v5, v5

    .line 43
    sub-float/2addr v4, v5

    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iput v4, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->a:F

    .line 50
    .line 51
    iget v4, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->d:F

    .line 52
    .line 53
    iget v6, v3, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    int-to-float v6, v6

    .line 56
    sub-float/2addr v4, v6

    .line 57
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iput v4, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->d:F

    .line 62
    .line 63
    iget v4, v3, Landroid/graphics/Rect;->top:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    add-int/2addr v4, v6

    .line 70
    int-to-float v4, v4

    .line 71
    sub-float/2addr v4, v0

    .line 72
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v4, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->c:F

    .line 77
    .line 78
    add-float/2addr v0, v4

    .line 79
    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->c:F

    .line 84
    .line 85
    iget v0, v3, Landroid/graphics/Rect;->left:I

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    add-int/2addr v0, p0

    .line 92
    int-to-float p0, v0

    .line 93
    sub-float/2addr p0, v1

    .line 94
    invoke-static {p0, v5}, Ljava/lang/Math;->min(FF)F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    iget v0, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->b:F

    .line 99
    .line 100
    add-float/2addr p0, v0

    .line 101
    invoke-static {p0, v5}, Ljava/lang/Math;->max(FF)F

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    iput p0, v2, Lcom/th3rdwave/safeareacontext/EdgeInsets;->b:F

    .line 106
    .line 107
    return-object v2
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
.end method
