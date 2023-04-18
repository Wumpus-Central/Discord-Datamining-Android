.class public Landroidx/transition/f;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/f$k;
    }
.end annotation


# static fields
.field private static final n:[Ljava/lang/String;

.field private static final o:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/graphics/drawable/Drawable;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final p:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/f$k;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final q:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/f$k;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final r:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final s:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final t:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static u:Landroidx/transition/u;


# instance fields
.field private k:[I

.field private l:Z

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:windowX"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:windowY"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:clip"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:parent"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/transition/f;->n:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Landroidx/transition/f$b;

    .line 18
    .line 19
    const-string v1, "boundsOrigin"

    .line 20
    .line 21
    const-class v2, Landroid/graphics/PointF;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Landroidx/transition/f$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/transition/f;->o:Landroid/util/Property;

    .line 27
    .line 28
    new-instance v0, Landroidx/transition/f$c;

    .line 29
    .line 30
    const-string v1, "topLeft"

    .line 31
    .line 32
    invoke-direct {v0, v2, v1}, Landroidx/transition/f$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Landroidx/transition/f;->p:Landroid/util/Property;

    .line 36
    .line 37
    new-instance v0, Landroidx/transition/f$d;

    .line 38
    .line 39
    const-string v3, "bottomRight"

    .line 40
    .line 41
    invoke-direct {v0, v2, v3}, Landroidx/transition/f$d;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Landroidx/transition/f;->q:Landroid/util/Property;

    .line 45
    .line 46
    new-instance v0, Landroidx/transition/f$e;

    .line 47
    .line 48
    invoke-direct {v0, v2, v3}, Landroidx/transition/f$e;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Landroidx/transition/f;->r:Landroid/util/Property;

    .line 52
    .line 53
    new-instance v0, Landroidx/transition/f$f;

    .line 54
    .line 55
    invoke-direct {v0, v2, v1}, Landroidx/transition/f$f;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Landroidx/transition/f;->s:Landroid/util/Property;

    .line 59
    .line 60
    new-instance v0, Landroidx/transition/f$g;

    .line 61
    .line 62
    const-string v1, "position"

    .line 63
    .line 64
    invoke-direct {v0, v2, v1}, Landroidx/transition/f$g;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Landroidx/transition/f;->t:Landroid/util/Property;

    .line 68
    .line 69
    new-instance v0, Landroidx/transition/u;

    .line 70
    .line 71
    invoke-direct {v0}, Landroidx/transition/u;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Landroidx/transition/f;->u:Landroidx/transition/u;

    .line 75
    .line 76
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/transition/f;->k:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/transition/f;->l:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Landroidx/transition/f;->m:Z

    .line 13
    .line 14
    return-void
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

.method private a(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/transition/f;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1}, Landroidx/transition/Transition;->getMatchedTransitionValues(Landroid/view/View;Z)Landroidx/transition/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p1, v0, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 19
    .line 20
    if-ne p2, p1, :cond_0

    .line 21
    .line 22
    :cond_2
    :goto_0
    return v1
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
.end method

.method private captureValues(Landroidx/transition/f0;)V
    .locals 7

    .line 1
    iget-object v0, p1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/w0;->U(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    :cond_0
    iget-object v1, p1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v2, Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 42
    .line 43
    .line 44
    const-string v3, "android:changeBounds:bounds"

    .line 45
    .line 46
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object v1, p1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 50
    .line 51
    iget-object v2, p1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "android:changeBounds:parent"

    .line 58
    .line 59
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-boolean v1, p0, Landroidx/transition/f;->m:Z

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object v1, p1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/transition/f;->k:[I

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/transition/f;->k:[I

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    aget v2, v2, v3

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "android:changeBounds:windowX"

    .line 85
    .line 86
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object v1, p1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 90
    .line 91
    iget-object v2, p0, Landroidx/transition/f;->k:[I

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    aget v2, v2, v3

    .line 95
    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v3, "android:changeBounds:windowY"

    .line 101
    .line 102
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_1
    iget-boolean v1, p0, Landroidx/transition/f;->l:Z

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    iget-object p1, p1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 110
    .line 111
    const-string v1, "android:changeBounds:clip"

    .line 112
    .line 113
    invoke-static {v0}, Landroidx/core/view/w0;->u(Landroid/view/View;)Landroid/graphics/Rect;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_2
    return-void
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
.end method


# virtual methods
.method public captureEndValues(Landroidx/transition/f0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/transition/f;->captureValues(Landroidx/transition/f0;)V

    return-void
.end method

.method public captureStartValues(Landroidx/transition/f0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/transition/f;->captureValues(Landroidx/transition/f0;)V

    return-void
.end method

.method public createAnimator(Landroid/view/ViewGroup;Landroidx/transition/f0;Landroidx/transition/f0;)Landroid/animation/Animator;
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    if-eqz v0, :cond_1b

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_c

    .line 12
    .line 13
    :cond_0
    iget-object v3, v0, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v4, v1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 16
    .line 17
    const-string v5, "android:changeBounds:parent"

    .line 18
    .line 19
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v3, :cond_1a

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    goto/16 :goto_b

    .line 36
    .line 37
    :cond_1
    iget-object v9, v1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 38
    .line 39
    invoke-direct {v8, v3, v4}, Landroidx/transition/f;->a(Landroid/view/View;Landroid/view/View;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_17

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 46
    .line 47
    const-string v5, "android:changeBounds:bounds"

    .line 48
    .line 49
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Landroid/graphics/Rect;

    .line 54
    .line 55
    iget-object v6, v1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Landroid/graphics/Rect;

    .line 62
    .line 63
    iget v6, v3, Landroid/graphics/Rect;->left:I

    .line 64
    .line 65
    iget v7, v5, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    iget v11, v3, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    iget v12, v5, Landroid/graphics/Rect;->top:I

    .line 70
    .line 71
    iget v13, v3, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    iget v14, v5, Landroid/graphics/Rect;->right:I

    .line 74
    .line 75
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 76
    .line 77
    iget v15, v5, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    sub-int v5, v13, v6

    .line 80
    .line 81
    sub-int v2, v3, v11

    .line 82
    .line 83
    sub-int v10, v14, v7

    .line 84
    .line 85
    sub-int v4, v15, v12

    .line 86
    .line 87
    iget-object v0, v0, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 88
    .line 89
    move-object/from16 v16, v9

    .line 90
    .line 91
    const-string v9, "android:changeBounds:clip"

    .line 92
    .line 93
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Landroid/graphics/Rect;

    .line 98
    .line 99
    iget-object v1, v1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 100
    .line 101
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v9, v1

    .line 106
    check-cast v9, Landroid/graphics/Rect;

    .line 107
    .line 108
    if-eqz v5, :cond_2

    .line 109
    .line 110
    if-nez v2, :cond_3

    .line 111
    .line 112
    :cond_2
    if-eqz v10, :cond_7

    .line 113
    .line 114
    if-eqz v4, :cond_7

    .line 115
    .line 116
    :cond_3
    if-ne v6, v7, :cond_5

    .line 117
    .line 118
    if-eq v11, v12, :cond_4

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    const/4 v1, 0x0

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    :goto_0
    const/4 v1, 0x1

    .line 124
    :goto_1
    if-ne v13, v14, :cond_6

    .line 125
    .line 126
    if-eq v3, v15, :cond_8

    .line 127
    .line 128
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    const/4 v1, 0x0

    .line 132
    :cond_8
    :goto_2
    if-eqz v0, :cond_9

    .line 133
    .line 134
    invoke-virtual {v0, v9}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v17

    .line 138
    if-eqz v17, :cond_a

    .line 139
    .line 140
    :cond_9
    if-nez v0, :cond_b

    .line 141
    .line 142
    if-eqz v9, :cond_b

    .line 143
    .line 144
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    :cond_b
    if-lez v1, :cond_18

    .line 147
    .line 148
    move-object/from16 p1, v9

    .line 149
    .line 150
    iget-boolean v9, v8, Landroidx/transition/f;->l:Z

    .line 151
    .line 152
    move-object/from16 p2, v0

    .line 153
    .line 154
    const/4 v0, 0x2

    .line 155
    if-nez v9, :cond_10

    .line 156
    .line 157
    move-object/from16 v9, v16

    .line 158
    .line 159
    invoke-static {v9, v6, v11, v13, v3}, Landroidx/transition/p0;->g(Landroid/view/View;IIII)V

    .line 160
    .line 161
    .line 162
    if-ne v1, v0, :cond_d

    .line 163
    .line 164
    if-ne v5, v10, :cond_c

    .line 165
    .line 166
    if-ne v2, v4, :cond_c

    .line 167
    .line 168
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    int-to-float v1, v6

    .line 173
    int-to-float v2, v11

    .line 174
    int-to-float v3, v7

    .line 175
    int-to-float v4, v12

    .line 176
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    sget-object v1, Landroidx/transition/f;->t:Landroid/util/Property;

    .line 181
    .line 182
    invoke-static {v9, v1, v0}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    goto/16 :goto_9

    .line 187
    .line 188
    :cond_c
    new-instance v1, Landroidx/transition/f$k;

    .line 189
    .line 190
    invoke-direct {v1, v9}, Landroidx/transition/f$k;-><init>(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    int-to-float v4, v6

    .line 198
    int-to-float v5, v11

    .line 199
    int-to-float v6, v7

    .line 200
    int-to-float v7, v12

    .line 201
    invoke-virtual {v2, v4, v5, v6, v7}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    sget-object v4, Landroidx/transition/f;->p:Landroid/util/Property;

    .line 206
    .line 207
    invoke-static {v1, v4, v2}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    int-to-float v5, v13

    .line 216
    int-to-float v3, v3

    .line 217
    int-to-float v6, v14

    .line 218
    int-to-float v7, v15

    .line 219
    invoke-virtual {v4, v5, v3, v6, v7}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-object v4, Landroidx/transition/f;->q:Landroid/util/Property;

    .line 224
    .line 225
    invoke-static {v1, v4, v3}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 230
    .line 231
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 232
    .line 233
    .line 234
    new-array v0, v0, [Landroid/animation/Animator;

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    aput-object v2, v0, v5

    .line 238
    .line 239
    const/4 v2, 0x1

    .line 240
    aput-object v3, v0, v2

    .line 241
    .line 242
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 243
    .line 244
    .line 245
    new-instance v0, Landroidx/transition/f$h;

    .line 246
    .line 247
    invoke-direct {v0, v8, v1}, Landroidx/transition/f$h;-><init>(Landroidx/transition/f;Landroidx/transition/f$k;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 251
    .line 252
    .line 253
    move-object v0, v4

    .line 254
    goto/16 :goto_9

    .line 255
    .line 256
    :cond_d
    if-ne v6, v7, :cond_f

    .line 257
    .line 258
    if-eq v11, v12, :cond_e

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    int-to-float v1, v13

    .line 266
    int-to-float v2, v3

    .line 267
    int-to-float v3, v14

    .line 268
    int-to-float v4, v15

    .line 269
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    sget-object v1, Landroidx/transition/f;->r:Landroid/util/Property;

    .line 274
    .line 275
    invoke-static {v9, v1, v0}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    goto/16 :goto_9

    .line 280
    .line 281
    :cond_f
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    int-to-float v1, v6

    .line 286
    int-to-float v2, v11

    .line 287
    int-to-float v3, v7

    .line 288
    int-to-float v4, v12

    .line 289
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    sget-object v1, Landroidx/transition/f;->s:Landroid/util/Property;

    .line 294
    .line 295
    invoke-static {v9, v1, v0}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    goto/16 :goto_9

    .line 300
    .line 301
    :cond_10
    move-object/from16 v9, v16

    .line 302
    .line 303
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    add-int/2addr v1, v6

    .line 312
    add-int/2addr v3, v11

    .line 313
    invoke-static {v9, v6, v11, v1, v3}, Landroidx/transition/p0;->g(Landroid/view/View;IIII)V

    .line 314
    .line 315
    .line 316
    if-ne v6, v7, :cond_12

    .line 317
    .line 318
    if-eq v11, v12, :cond_11

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_11
    const/4 v11, 0x0

    .line 322
    goto :goto_5

    .line 323
    :cond_12
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    int-to-float v3, v6

    .line 328
    int-to-float v6, v11

    .line 329
    int-to-float v11, v7

    .line 330
    int-to-float v13, v12

    .line 331
    invoke-virtual {v1, v3, v6, v11, v13}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    sget-object v3, Landroidx/transition/f;->t:Landroid/util/Property;

    .line 336
    .line 337
    invoke-static {v9, v3, v1}, Landroidx/transition/q;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    move-object v11, v1

    .line 342
    :goto_5
    if-nez p2, :cond_13

    .line 343
    .line 344
    new-instance v1, Landroid/graphics/Rect;

    .line 345
    .line 346
    const/4 v3, 0x0

    .line 347
    invoke-direct {v1, v3, v3, v5, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_13
    const/4 v3, 0x0

    .line 352
    move-object/from16 v1, p2

    .line 353
    .line 354
    :goto_6
    if-nez p1, :cond_14

    .line 355
    .line 356
    new-instance v2, Landroid/graphics/Rect;

    .line 357
    .line 358
    invoke-direct {v2, v3, v3, v10, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 359
    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_14
    move-object/from16 v2, p1

    .line 363
    .line 364
    :goto_7
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    if-nez v4, :cond_15

    .line 369
    .line 370
    invoke-static {v9, v1}, Landroidx/core/view/w0;->x0(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 371
    .line 372
    .line 373
    sget-object v4, Landroidx/transition/f;->u:Landroidx/transition/u;

    .line 374
    .line 375
    new-array v0, v0, [Ljava/lang/Object;

    .line 376
    .line 377
    aput-object v1, v0, v3

    .line 378
    .line 379
    const/4 v1, 0x1

    .line 380
    aput-object v2, v0, v1

    .line 381
    .line 382
    const-string v1, "clipBounds"

    .line 383
    .line 384
    invoke-static {v9, v1, v4, v0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 385
    .line 386
    .line 387
    move-result-object v10

    .line 388
    new-instance v13, Landroidx/transition/f$i;

    .line 389
    .line 390
    move-object v0, v13

    .line 391
    move-object/from16 v1, p0

    .line 392
    .line 393
    move-object v2, v9

    .line 394
    move-object/from16 v3, p1

    .line 395
    .line 396
    move v4, v7

    .line 397
    move v5, v12

    .line 398
    move v6, v14

    .line 399
    move v7, v15

    .line 400
    invoke-direct/range {v0 .. v7}, Landroidx/transition/f$i;-><init>(Landroidx/transition/f;Landroid/view/View;Landroid/graphics/Rect;IIII)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v10, v13}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 404
    .line 405
    .line 406
    move-object v2, v10

    .line 407
    goto :goto_8

    .line 408
    :cond_15
    const/4 v2, 0x0

    .line 409
    :goto_8
    invoke-static {v11, v2}, Landroidx/transition/e0;->c(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    :goto_9
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    instance-of v1, v1, Landroid/view/ViewGroup;

    .line 418
    .line 419
    if-eqz v1, :cond_16

    .line 420
    .line 421
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Landroid/view/ViewGroup;

    .line 426
    .line 427
    const/4 v2, 0x1

    .line 428
    invoke-static {v1, v2}, Landroidx/transition/m0;->d(Landroid/view/ViewGroup;Z)V

    .line 429
    .line 430
    .line 431
    new-instance v2, Landroidx/transition/f$j;

    .line 432
    .line 433
    invoke-direct {v2, v8, v1}, Landroidx/transition/f$j;-><init>(Landroidx/transition/f;Landroid/view/ViewGroup;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v8, v2}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$g;)Landroidx/transition/Transition;

    .line 437
    .line 438
    .line 439
    :cond_16
    return-object v0

    .line 440
    :cond_17
    iget-object v2, v0, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 441
    .line 442
    const-string v3, "android:changeBounds:windowX"

    .line 443
    .line 444
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    check-cast v2, Ljava/lang/Integer;

    .line 449
    .line 450
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    iget-object v0, v0, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 455
    .line 456
    const-string v4, "android:changeBounds:windowY"

    .line 457
    .line 458
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Ljava/lang/Integer;

    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    iget-object v5, v1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 469
    .line 470
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, Ljava/lang/Integer;

    .line 475
    .line 476
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    iget-object v1, v1, Landroidx/transition/f0;->a:Ljava/util/Map;

    .line 481
    .line 482
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    check-cast v1, Ljava/lang/Integer;

    .line 487
    .line 488
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-ne v2, v3, :cond_19

    .line 493
    .line 494
    if-eq v0, v1, :cond_18

    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_18
    const/4 v0, 0x0

    .line 498
    return-object v0

    .line 499
    :cond_19
    :goto_a
    iget-object v4, v8, Landroidx/transition/f;->k:[I

    .line 500
    .line 501
    move-object/from16 v5, p1

    .line 502
    .line 503
    invoke-virtual {v5, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 515
    .line 516
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    new-instance v6, Landroid/graphics/Canvas;

    .line 521
    .line 522
    invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v9, v6}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 526
    .line 527
    .line 528
    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    .line 529
    .line 530
    invoke-direct {v6, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 531
    .line 532
    .line 533
    invoke-static {v9}, Landroidx/transition/p0;->c(Landroid/view/View;)F

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    const/4 v4, 0x0

    .line 538
    invoke-static {v9, v4}, Landroidx/transition/p0;->h(Landroid/view/View;F)V

    .line 539
    .line 540
    .line 541
    invoke-static/range {p1 .. p1}, Landroidx/transition/p0;->b(Landroid/view/View;)Landroidx/transition/o0;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-interface {v4, v6}, Landroidx/transition/o0;->a(Landroid/graphics/drawable/Drawable;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/r;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    iget-object v10, v8, Landroidx/transition/f;->k:[I

    .line 553
    .line 554
    const/4 v11, 0x0

    .line 555
    aget v12, v10, v11

    .line 556
    .line 557
    sub-int/2addr v2, v12

    .line 558
    int-to-float v2, v2

    .line 559
    const/4 v11, 0x1

    .line 560
    aget v10, v10, v11

    .line 561
    .line 562
    sub-int/2addr v0, v10

    .line 563
    int-to-float v0, v0

    .line 564
    sub-int/2addr v3, v12

    .line 565
    int-to-float v3, v3

    .line 566
    sub-int/2addr v1, v10

    .line 567
    int-to-float v1, v1

    .line 568
    invoke-virtual {v4, v2, v0, v3, v1}, Landroidx/transition/r;->a(FFFF)Landroid/graphics/Path;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sget-object v1, Landroidx/transition/f;->o:Landroid/util/Property;

    .line 573
    .line 574
    invoke-static {v1, v0}, Landroidx/transition/s;->a(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    new-array v1, v11, [Landroid/animation/PropertyValuesHolder;

    .line 579
    .line 580
    const/4 v2, 0x0

    .line 581
    aput-object v0, v1, v2

    .line 582
    .line 583
    invoke-static {v6, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    new-instance v11, Landroidx/transition/f$a;

    .line 588
    .line 589
    move-object v0, v11

    .line 590
    move-object/from16 v1, p0

    .line 591
    .line 592
    move-object/from16 v2, p1

    .line 593
    .line 594
    move-object v3, v6

    .line 595
    move-object v4, v9

    .line 596
    move v5, v7

    .line 597
    invoke-direct/range {v0 .. v5}, Landroidx/transition/f$a;-><init>(Landroidx/transition/f;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v10, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 601
    .line 602
    .line 603
    return-object v10

    .line 604
    :cond_1a
    :goto_b
    const/4 v0, 0x0

    .line 605
    return-object v0

    .line 606
    :cond_1b
    :goto_c
    const/4 v0, 0x0

    .line 607
    return-object v0
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
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/transition/f;->n:[Ljava/lang/String;

    return-object v0
.end method
