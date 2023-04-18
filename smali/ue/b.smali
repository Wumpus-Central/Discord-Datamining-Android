.class public final Lue/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lue/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 N2\u00020\u0001:\u0001OB\'\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u00a2\u0006\u0004\u0008L\u0010MJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J,\u0010\u0012\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J,\u0010\u0015\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010/R\"\u00109\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u0010<\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u00104\u001a\u0004\u0008;\u00106\"\u0004\u0008\u001e\u00108R\"\u0010?\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u00104\u001a\u0004\u0008>\u00106\"\u0004\u0008\u001a\u00108R\"\u0010B\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u00104\u001a\u0004\u0008A\u00106\"\u0004\u0008&\u00108R\"\u0010E\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u00104\u001a\u0004\u0008D\u00106\"\u0004\u0008\"\u00108R\"\u0010I\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u00104\u001a\u0004\u0008G\u00106\"\u0004\u0008H\u00108\u00a8\u0006P"
    }
    d2 = {
        "Lue/b;",
        "Landroid/view/GestureDetector$OnGestureListener;",
        "",
        "g",
        "Landroid/view/MotionEvent;",
        "event",
        "h",
        "(Landroid/view/MotionEvent;)Z",
        "",
        "e",
        "()V",
        "f",
        "onDown",
        "e1",
        "e2",
        "",
        "velocityX",
        "velocityY",
        "onFling",
        "distanceX",
        "distanceY",
        "onScroll",
        "onShowPress",
        "onSingleTapUp",
        "onLongPress",
        "Lwe/b;",
        "k",
        "Lwe/b;",
        "panManager",
        "Lte/a;",
        "l",
        "Lte/a;",
        "stateController",
        "Lve/b;",
        "m",
        "Lve/b;",
        "matrixController",
        "Landroid/view/GestureDetector;",
        "n",
        "Landroid/view/GestureDetector;",
        "detector",
        "Landroid/widget/OverScroller;",
        "o",
        "Landroid/widget/OverScroller;",
        "flingScroller",
        "Lwe/b$b;",
        "p",
        "Lwe/b$b;",
        "panStatusX",
        "q",
        "panStatusY",
        "r",
        "Z",
        "getFlingEnabled$library_release",
        "()Z",
        "i",
        "(Z)V",
        "flingEnabled",
        "s",
        "getScrollEnabled$library_release",
        "scrollEnabled",
        "t",
        "getOneFingerScrollEnabled$library_release",
        "oneFingerScrollEnabled",
        "u",
        "getTwoFingersScrollEnabled$library_release",
        "twoFingersScrollEnabled",
        "v",
        "getThreeFingersScrollEnabled$library_release",
        "threeFingersScrollEnabled",
        "w",
        "getFlingInOverPanEnabled$library_release",
        "j",
        "flingInOverPanEnabled",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Lwe/b;Lte/a;Lve/b;)V",
        "x",
        "a",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final x:Lue/b$a;

.field private static final y:Ljava/lang/String;

.field private static final z:Lcom/otaliastudios/zoom/ZoomLogger;


# instance fields
.field private final k:Lwe/b;

.field private final l:Lte/a;

.field private final m:Lve/b;

.field private final n:Landroid/view/GestureDetector;

.field private final o:Landroid/widget/OverScroller;

.field private final p:Lwe/b$b;

.field private final q:Lwe/b$b;

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lue/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lue/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lue/b;->x:Lue/b$a;

    .line 8
    .line 9
    const-class v0, Lue/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lue/b;->y:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, Lcom/otaliastudios/zoom/ZoomLogger;->b:Lcom/otaliastudios/zoom/ZoomLogger$a;

    .line 18
    .line 19
    const-string v2, "TAG"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/otaliastudios/zoom/ZoomLogger$a;->a(Ljava/lang/String;)Lcom/otaliastudios/zoom/ZoomLogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lue/b;->z:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 29
    .line 30
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Lwe/b;Lte/a;Lve/b;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "panManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "stateController"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "matrixController"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lue/b;->k:Lwe/b;

    .line 25
    .line 26
    iput-object p3, p0, Lue/b;->l:Lte/a;

    .line 27
    .line 28
    iput-object p4, p0, Lue/b;->m:Lve/b;

    .line 29
    .line 30
    new-instance p2, Landroid/view/GestureDetector;

    .line 31
    .line 32
    invoke-direct {p2, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 33
    .line 34
    .line 35
    const/4 p3, 0x0

    .line 36
    invoke-virtual {p2, p3}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 37
    .line 38
    .line 39
    sget-object p3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    iput-object p2, p0, Lue/b;->n:Landroid/view/GestureDetector;

    .line 42
    .line 43
    new-instance p2, Landroid/widget/OverScroller;

    .line 44
    .line 45
    invoke-direct {p2, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lue/b;->o:Landroid/widget/OverScroller;

    .line 49
    .line 50
    new-instance p1, Lwe/b$b;

    .line 51
    .line 52
    invoke-direct {p1}, Lwe/b$b;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lue/b;->p:Lwe/b$b;

    .line 56
    .line 57
    new-instance p1, Lwe/b$b;

    .line 58
    .line 59
    invoke-direct {p1}, Lwe/b$b;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lue/b;->q:Lwe/b$b;

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Lue/b;->r:Z

    .line 66
    .line 67
    iput-boolean p1, p0, Lue/b;->s:Z

    .line 68
    .line 69
    iput-boolean p1, p0, Lue/b;->t:Z

    .line 70
    .line 71
    iput-boolean p1, p0, Lue/b;->u:Z

    .line 72
    .line 73
    iput-boolean p1, p0, Lue/b;->v:Z

    .line 74
    .line 75
    return-void
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
.end method

.method public static final synthetic a(Lue/b;)Landroid/view/GestureDetector;
    .locals 0

    iget-object p0, p0, Lue/b;->n:Landroid/view/GestureDetector;

    return-object p0
.end method

.method public static final synthetic b(Lue/b;)Landroid/widget/OverScroller;
    .locals 0

    iget-object p0, p0, Lue/b;->o:Landroid/widget/OverScroller;

    return-object p0
.end method

.method public static final synthetic c(Lue/b;)Lve/b;
    .locals 0

    iget-object p0, p0, Lue/b;->m:Lve/b;

    return-object p0
.end method

.method public static final synthetic d(Lue/b;)Lte/a;
    .locals 0

    iget-object p0, p0, Lue/b;->l:Lte/a;

    return-object p0
.end method

.method private final g()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lue/b;->k:Lwe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwe/b;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lue/b;->k:Lwe/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lwe/b;->f()Lcom/otaliastudios/zoom/ScaledPoint;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    cmpg-float v2, v2, v3

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    move v2, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v2, v1

    .line 29
    :goto_0
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    cmpg-float v2, v2, v3

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    move v2, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v2, v1

    .line 42
    :goto_1
    if-nez v2, :cond_3

    .line 43
    .line 44
    :cond_2
    iget-object v1, p0, Lue/b;->m:Lve/b;

    .line 45
    .line 46
    new-instance v2, Lue/b$b;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Lue/b$b;-><init>(Lcom/otaliastudios/zoom/ScaledPoint;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lve/b;->e(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    return v4

    .line 55
    :cond_3
    return v1
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
.end method


# virtual methods
.method public final e()V
    .locals 2

    iget-object v0, p0, Lue/b;->o:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lue/b;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lue/b;->l:Lte/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lte/a;->f()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public final h(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lue/b;->n:Landroid/view/GestureDetector;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->r:Z

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->w:Z

    return-void
.end method

.method public final k(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->t:Z

    return-void
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->s:Z

    return-void
.end method

.method public final m(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->v:Z

    return-void
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Lue/b;->u:Z

    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lue/b;->e()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1
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
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lue/b;->r:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 10
    .line 11
    invoke-virtual {v1}, Lwe/b;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Lwe/b;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    move/from16 v1, p3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v1, v3

    .line 31
    :goto_0
    float-to-int v7, v1

    .line 32
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 33
    .line 34
    invoke-virtual {v1}, Lwe/b;->l()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    move/from16 v1, p4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    move v1, v3

    .line 44
    :goto_1
    float-to-int v8, v1

    .line 45
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 46
    .line 47
    iget-object v4, v0, Lue/b;->p:Lwe/b$b;

    .line 48
    .line 49
    const/4 v15, 0x1

    .line 50
    invoke-virtual {v1, v15, v4}, Lwe/b;->d(ZLwe/b$b;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 54
    .line 55
    iget-object v4, v0, Lue/b;->q:Lwe/b$b;

    .line 56
    .line 57
    invoke-virtual {v1, v2, v4}, Lwe/b;->d(ZLwe/b$b;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lue/b;->p:Lwe/b$b;

    .line 61
    .line 62
    invoke-virtual {v1}, Lwe/b$b;->c()I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    iget-object v1, v0, Lue/b;->p:Lwe/b$b;

    .line 67
    .line 68
    invoke-virtual {v1}, Lwe/b$b;->a()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    iget-object v1, v0, Lue/b;->p:Lwe/b$b;

    .line 73
    .line 74
    invoke-virtual {v1}, Lwe/b$b;->b()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    iget-object v1, v0, Lue/b;->q:Lwe/b$b;

    .line 79
    .line 80
    invoke-virtual {v1}, Lwe/b$b;->c()I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    iget-object v1, v0, Lue/b;->q:Lwe/b$b;

    .line 85
    .line 86
    invoke-virtual {v1}, Lwe/b$b;->a()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    iget-object v1, v0, Lue/b;->q:Lwe/b$b;

    .line 91
    .line 92
    invoke-virtual {v1}, Lwe/b$b;->b()I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    iget-boolean v1, v0, Lue/b;->w:Z

    .line 97
    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    iget-object v1, v0, Lue/b;->p:Lwe/b$b;

    .line 101
    .line 102
    invoke-virtual {v1}, Lwe/b$b;->d()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    iget-object v1, v0, Lue/b;->q:Lwe/b$b;

    .line 109
    .line 110
    invoke-virtual {v1}, Lwe/b$b;->d()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    :cond_4
    return v2

    .line 117
    :cond_5
    if-lt v9, v10, :cond_6

    .line 118
    .line 119
    if-lt v11, v12, :cond_6

    .line 120
    .line 121
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 122
    .line 123
    invoke-virtual {v1}, Lwe/b;->n()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_6

    .line 128
    .line 129
    return v2

    .line 130
    :cond_6
    iget-object v1, v0, Lue/b;->l:Lte/a;

    .line 131
    .line 132
    invoke-virtual {v1}, Lte/a;->l()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_7

    .line 137
    .line 138
    return v2

    .line 139
    :cond_7
    iget-object v1, v0, Lue/b;->n:Landroid/view/GestureDetector;

    .line 140
    .line 141
    invoke-virtual {v1, v2}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 145
    .line 146
    invoke-virtual {v1}, Lwe/b;->g()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    iget-object v1, v0, Lue/b;->k:Lwe/b;

    .line 153
    .line 154
    invoke-virtual {v1}, Lwe/b;->i()F

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_2

    .line 159
    :cond_8
    move v1, v3

    .line 160
    :goto_2
    iget-object v4, v0, Lue/b;->k:Lwe/b;

    .line 161
    .line 162
    invoke-virtual {v4}, Lwe/b;->k()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_9

    .line 167
    .line 168
    iget-object v3, v0, Lue/b;->k:Lwe/b;

    .line 169
    .line 170
    invoke-virtual {v3}, Lwe/b;->j()F

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    :cond_9
    sget-object v4, Lue/b;->z:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 175
    .line 176
    const/4 v13, 0x5

    .line 177
    new-array v14, v13, [Ljava/lang/Object;

    .line 178
    .line 179
    const-string v16, "startFling"

    .line 180
    .line 181
    aput-object v16, v14, v2

    .line 182
    .line 183
    const-string v17, "velocityX:"

    .line 184
    .line 185
    aput-object v17, v14, v15

    .line 186
    .line 187
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v17

    .line 191
    const/16 v18, 0x2

    .line 192
    .line 193
    aput-object v17, v14, v18

    .line 194
    .line 195
    const-string v17, "velocityY:"

    .line 196
    .line 197
    const/16 v19, 0x3

    .line 198
    .line 199
    aput-object v17, v14, v19

    .line 200
    .line 201
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v17

    .line 205
    const/16 v20, 0x4

    .line 206
    .line 207
    aput-object v17, v14, v20

    .line 208
    .line 209
    invoke-virtual {v4, v14}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    const/16 v14, 0xa

    .line 213
    .line 214
    new-array v13, v14, [Ljava/lang/Object;

    .line 215
    .line 216
    aput-object v16, v13, v2

    .line 217
    .line 218
    const-string v17, "flingX:"

    .line 219
    .line 220
    aput-object v17, v13, v15

    .line 221
    .line 222
    const-string v17, "min:"

    .line 223
    .line 224
    aput-object v17, v13, v18

    .line 225
    .line 226
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v21

    .line 230
    aput-object v21, v13, v19

    .line 231
    .line 232
    const-string v21, "max:"

    .line 233
    .line 234
    aput-object v21, v13, v20

    .line 235
    .line 236
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v22

    .line 240
    const/16 v23, 0x5

    .line 241
    .line 242
    aput-object v22, v13, v23

    .line 243
    .line 244
    const/16 v22, 0x6

    .line 245
    .line 246
    const-string v23, "start:"

    .line 247
    .line 248
    aput-object v23, v13, v22

    .line 249
    .line 250
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v24

    .line 254
    const/16 v25, 0x7

    .line 255
    .line 256
    aput-object v24, v13, v25

    .line 257
    .line 258
    const/16 v24, 0x8

    .line 259
    .line 260
    const-string v26, "overScroll:"

    .line 261
    .line 262
    aput-object v26, v13, v24

    .line 263
    .line 264
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 265
    .line 266
    .line 267
    move-result-object v27

    .line 268
    const/16 v28, 0x9

    .line 269
    .line 270
    aput-object v27, v13, v28

    .line 271
    .line 272
    invoke-virtual {v4, v13}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    new-array v13, v14, [Ljava/lang/Object;

    .line 276
    .line 277
    aput-object v16, v13, v2

    .line 278
    .line 279
    const-string v2, "flingY:"

    .line 280
    .line 281
    aput-object v2, v13, v15

    .line 282
    .line 283
    aput-object v17, v13, v18

    .line 284
    .line 285
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    aput-object v2, v13, v19

    .line 290
    .line 291
    aput-object v21, v13, v20

    .line 292
    .line 293
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const/4 v14, 0x5

    .line 298
    aput-object v2, v13, v14

    .line 299
    .line 300
    aput-object v23, v13, v22

    .line 301
    .line 302
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    aput-object v2, v13, v25

    .line 307
    .line 308
    aput-object v26, v13, v24

    .line 309
    .line 310
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    aput-object v2, v13, v28

    .line 315
    .line 316
    invoke-virtual {v4, v13}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    iget-object v4, v0, Lue/b;->o:Landroid/widget/OverScroller;

    .line 320
    .line 321
    float-to-int v13, v1

    .line 322
    float-to-int v14, v3

    .line 323
    invoke-virtual/range {v4 .. v14}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 324
    .line 325
    .line 326
    iget-object v1, v0, Lue/b;->m:Lve/b;

    .line 327
    .line 328
    new-instance v2, Lue/b$c;

    .line 329
    .line 330
    invoke-direct {v2, v0}, Lue/b$c;-><init>(Lue/b;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v2}, Lve/b;->B(Ljava/lang/Runnable;)Z

    .line 334
    .line 335
    .line 336
    return v15
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
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lue/b;->s:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-nez p2, :cond_2

    .line 11
    .line 12
    :cond_1
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ne v3, v1, :cond_1

    .line 19
    .line 20
    move v3, v1

    .line 21
    :goto_0
    const/4 v4, 0x2

    .line 22
    if-nez p2, :cond_4

    .line 23
    .line 24
    :cond_3
    move v5, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_4
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ne v5, v4, :cond_3

    .line 31
    .line 32
    move v5, v1

    .line 33
    :goto_1
    const/4 v6, 0x3

    .line 34
    if-nez p2, :cond_6

    .line 35
    .line 36
    :cond_5
    move v7, v2

    .line 37
    goto :goto_2

    .line 38
    :cond_6
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-ne v7, v6, :cond_5

    .line 43
    .line 44
    move v7, v1

    .line 45
    :goto_2
    iget-boolean v8, v0, Lue/b;->t:Z

    .line 46
    .line 47
    if-nez v8, :cond_7

    .line 48
    .line 49
    if-eqz v3, :cond_7

    .line 50
    .line 51
    return v2

    .line 52
    :cond_7
    iget-boolean v3, v0, Lue/b;->u:Z

    .line 53
    .line 54
    if-nez v3, :cond_8

    .line 55
    .line 56
    if-eqz v5, :cond_8

    .line 57
    .line 58
    return v2

    .line 59
    :cond_8
    iget-boolean v3, v0, Lue/b;->v:Z

    .line 60
    .line 61
    if-nez v3, :cond_9

    .line 62
    .line 63
    if-eqz v7, :cond_9

    .line 64
    .line 65
    return v2

    .line 66
    :cond_9
    iget-object v3, v0, Lue/b;->k:Lwe/b;

    .line 67
    .line 68
    invoke-virtual {v3}, Lwe/b;->m()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_a

    .line 73
    .line 74
    return v2

    .line 75
    :cond_a
    iget-object v3, v0, Lue/b;->l:Lte/a;

    .line 76
    .line 77
    invoke-virtual {v3}, Lte/a;->n()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_b

    .line 82
    .line 83
    return v2

    .line 84
    :cond_b
    new-instance v3, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 85
    .line 86
    move/from16 v5, p3

    .line 87
    .line 88
    neg-float v5, v5

    .line 89
    move/from16 v7, p4

    .line 90
    .line 91
    neg-float v7, v7

    .line 92
    invoke-direct {v3, v5, v7}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 93
    .line 94
    .line 95
    iget-object v5, v0, Lue/b;->k:Lwe/b;

    .line 96
    .line 97
    invoke-virtual {v5}, Lwe/b;->f()Lcom/otaliastudios/zoom/ScaledPoint;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    const/4 v8, 0x0

    .line 106
    cmpg-float v7, v7, v8

    .line 107
    .line 108
    const-string v9, "onScroll"

    .line 109
    .line 110
    const-wide v10, 0x3fd999999999999aL    # 0.4

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    const/high16 v12, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const v13, 0x3f19999a    # 0.6f

    .line 118
    .line 119
    .line 120
    if-gez v7, :cond_c

    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    cmpl-float v7, v7, v8

    .line 127
    .line 128
    if-gtz v7, :cond_d

    .line 129
    .line 130
    :cond_c
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    cmpl-float v7, v7, v8

    .line 135
    .line 136
    if-lez v7, :cond_e

    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    cmpg-float v7, v7, v8

    .line 143
    .line 144
    if-gez v7, :cond_e

    .line 145
    .line 146
    :cond_d
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    iget-object v14, v0, Lue/b;->k:Lwe/b;

    .line 155
    .line 156
    invoke-virtual {v14}, Lwe/b;->i()F

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    div-float/2addr v7, v14

    .line 161
    float-to-double v14, v7

    .line 162
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->pow(DD)D

    .line 163
    .line 164
    .line 165
    move-result-wide v14

    .line 166
    double-to-float v7, v14

    .line 167
    sub-float v7, v12, v7

    .line 168
    .line 169
    mul-float/2addr v7, v13

    .line 170
    sget-object v14, Lue/b;->z:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 171
    .line 172
    new-array v15, v6, [Ljava/lang/Object;

    .line 173
    .line 174
    aput-object v9, v15, v2

    .line 175
    .line 176
    const-string v16, "applying friction X:"

    .line 177
    .line 178
    aput-object v16, v15, v1

    .line 179
    .line 180
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 181
    .line 182
    .line 183
    move-result-object v16

    .line 184
    aput-object v16, v15, v4

    .line 185
    .line 186
    invoke-virtual {v14, v15}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    mul-float/2addr v14, v7

    .line 194
    invoke-virtual {v3, v14}, Lcom/otaliastudios/zoom/ScaledPoint;->h(F)V

    .line 195
    .line 196
    .line 197
    :cond_e
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    cmpg-float v7, v7, v8

    .line 202
    .line 203
    if-gez v7, :cond_f

    .line 204
    .line 205
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    cmpl-float v7, v7, v8

    .line 210
    .line 211
    if-gtz v7, :cond_10

    .line 212
    .line 213
    :cond_f
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    cmpl-float v7, v7, v8

    .line 218
    .line 219
    if-lez v7, :cond_11

    .line 220
    .line 221
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    cmpg-float v7, v7, v8

    .line 226
    .line 227
    if-gez v7, :cond_11

    .line 228
    .line 229
    :cond_10
    invoke-virtual {v5}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    iget-object v7, v0, Lue/b;->k:Lwe/b;

    .line 238
    .line 239
    invoke-virtual {v7}, Lwe/b;->j()F

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    div-float/2addr v5, v7

    .line 244
    float-to-double v14, v5

    .line 245
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->pow(DD)D

    .line 246
    .line 247
    .line 248
    move-result-wide v10

    .line 249
    double-to-float v5, v10

    .line 250
    sub-float/2addr v12, v5

    .line 251
    mul-float/2addr v12, v13

    .line 252
    sget-object v5, Lue/b;->z:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 253
    .line 254
    new-array v6, v6, [Ljava/lang/Object;

    .line 255
    .line 256
    aput-object v9, v6, v2

    .line 257
    .line 258
    const-string v7, "applying friction Y:"

    .line 259
    .line 260
    aput-object v7, v6, v1

    .line 261
    .line 262
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    aput-object v7, v6, v4

    .line 267
    .line 268
    invoke-virtual {v5, v6}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    mul-float/2addr v4, v12

    .line 276
    invoke-virtual {v3, v4}, Lcom/otaliastudios/zoom/ScaledPoint;->i(F)V

    .line 277
    .line 278
    .line 279
    :cond_11
    iget-object v4, v0, Lue/b;->k:Lwe/b;

    .line 280
    .line 281
    invoke-virtual {v4}, Lwe/b;->h()Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_12

    .line 286
    .line 287
    invoke-virtual {v3, v8}, Lcom/otaliastudios/zoom/ScaledPoint;->h(F)V

    .line 288
    .line 289
    .line 290
    :cond_12
    iget-object v4, v0, Lue/b;->k:Lwe/b;

    .line 291
    .line 292
    invoke-virtual {v4}, Lwe/b;->l()Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_13

    .line 297
    .line 298
    invoke-virtual {v3, v8}, Lcom/otaliastudios/zoom/ScaledPoint;->i(F)V

    .line 299
    .line 300
    .line 301
    :cond_13
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->c()F

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    cmpg-float v4, v4, v8

    .line 306
    .line 307
    if-nez v4, :cond_14

    .line 308
    .line 309
    move v4, v1

    .line 310
    goto :goto_3

    .line 311
    :cond_14
    move v4, v2

    .line 312
    :goto_3
    if-eqz v4, :cond_16

    .line 313
    .line 314
    invoke-virtual {v3}, Lcom/otaliastudios/zoom/ScaledPoint;->d()F

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    cmpg-float v4, v4, v8

    .line 319
    .line 320
    if-nez v4, :cond_15

    .line 321
    .line 322
    move v2, v1

    .line 323
    :cond_15
    if-nez v2, :cond_17

    .line 324
    .line 325
    :cond_16
    iget-object v2, v0, Lue/b;->m:Lve/b;

    .line 326
    .line 327
    new-instance v4, Lue/b$d;

    .line 328
    .line 329
    invoke-direct {v4, v3}, Lue/b$d;-><init>(Lcom/otaliastudios/zoom/ScaledPoint;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v4}, Lve/b;->g(Lkotlin/jvm/functions/Function1;)V

    .line 333
    .line 334
    .line 335
    :cond_17
    return v1
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
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
