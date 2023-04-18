.class public final Lcf/q;
.super Lcf/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf/d<",
        "Lcf/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u00a2\u0006\u0004\u0008+\u0010,J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\u0005H\u0014J\u0008\u0010\u000b\u001a\u00020\u0005H\u0016R$\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000f\u001a\u0004\u0008\u0014\u0010\u0011R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0018R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0018R\u0014\u0010*\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006-"
    }
    d2 = {
        "Lcf/q;",
        "Lcf/d;",
        "Landroid/view/MotionEvent;",
        "event",
        "sourceEvent",
        "",
        "e0",
        "",
        "force",
        "k",
        "g0",
        "l0",
        "",
        "<set-?>",
        "L",
        "D",
        "R0",
        "()D",
        "scale",
        "M",
        "S0",
        "velocity",
        "",
        "N",
        "F",
        "P0",
        "()F",
        "focalPointX",
        "O",
        "Q0",
        "focalPointY",
        "Lcf/u;",
        "P",
        "Lcf/u;",
        "scaleGestureDetector",
        "Q",
        "startingSpan",
        "R",
        "spanSlop",
        "Lcf/u$b;",
        "S",
        "Lcf/u$b;",
        "gestureListener",
        "<init>",
        "()V",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private L:D

.field private M:D

.field private N:F

.field private O:F

.field private P:Lcf/u;

.field private Q:F

.field private R:F

.field private final S:Lcf/u$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcf/d;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, Lcf/q;->N:F

    .line 7
    .line 8
    iput v0, p0, Lcf/q;->O:F

    .line 9
    .line 10
    new-instance v0, Lcf/q$a;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcf/q$a;-><init>(Lcf/q;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcf/q;->S:Lcf/u$b;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic K0(Lcf/q;)F
    .locals 0

    iget p0, p0, Lcf/q;->R:F

    return p0
.end method

.method public static final synthetic L0(Lcf/q;)F
    .locals 0

    iget p0, p0, Lcf/q;->Q:F

    return p0
.end method

.method public static final synthetic M0(Lcf/q;D)V
    .locals 0

    iput-wide p1, p0, Lcf/q;->L:D

    return-void
.end method

.method public static final synthetic N0(Lcf/q;F)V
    .locals 0

    iput p1, p0, Lcf/q;->Q:F

    return-void
.end method

.method public static final synthetic O0(Lcf/q;D)V
    .locals 0

    iput-wide p1, p0, Lcf/q;->M:D

    return-void
.end method


# virtual methods
.method public final P0()F
    .locals 1

    iget v0, p0, Lcf/q;->N:F

    return v0
.end method

.method public final Q0()F
    .locals 1

    iget v0, p0, Lcf/q;->O:F

    return v0
.end method

.method public final R0()D
    .locals 2

    iget-wide v0, p0, Lcf/q;->L:D

    return-wide v0
.end method

.method public final S0()D
    .locals 2

    iget-wide v0, p0, Lcf/q;->M:D

    return-wide v0
.end method

.method protected e0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceEvent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcf/d;->S()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, Lcf/q;->l0()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcf/u;

    .line 32
    .line 33
    iget-object v2, p0, Lcf/q;->S:Lcf/u$b;

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lcf/u;-><init>(Landroid/content/Context;Lcf/u$b;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcf/q;->P:Lcf/u;

    .line 39
    .line 40
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    iput v0, p0, Lcf/q;->R:F

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lcf/q;->N:F

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p0, Lcf/q;->O:F

    .line 62
    .line 63
    invoke-virtual {p0}, Lcf/d;->o()V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object p1, p0, Lcf/q;->P:Lcf/u;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lcf/u;->j(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object p1, p0, Lcf/q;->P:Lcf/u;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    new-instance v0, Landroid/graphics/PointF;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcf/u;->e()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1}, Lcf/u;->f()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcf/d;->H0(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iput v0, p0, Lcf/q;->N:F

    .line 97
    .line 98
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 99
    .line 100
    iput p1, p0, Lcf/q;->O:F

    .line 101
    .line 102
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v1, 0x6

    .line 111
    if-ne v0, v1, :cond_3

    .line 112
    .line 113
    add-int/lit8 p1, p1, -0x1

    .line 114
    .line 115
    :cond_3
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    const/4 v1, 0x4

    .line 120
    if-ne v0, v1, :cond_4

    .line 121
    .line 122
    const/4 v0, 0x2

    .line 123
    if-ge p1, v0, :cond_4

    .line 124
    .line 125
    invoke-virtual {p0}, Lcf/d;->A()V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 p2, 0x1

    .line 134
    if-ne p1, p2, :cond_5

    .line 135
    .line 136
    invoke-virtual {p0}, Lcf/d;->C()V

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_0
    return-void
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

.method protected g0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcf/q;->P:Lcf/u;

    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, Lcf/q;->N:F

    .line 7
    .line 8
    iput v0, p0, Lcf/q;->O:F

    .line 9
    .line 10
    invoke-virtual {p0}, Lcf/q;->l0()V

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
.end method

.method public k(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcf/q;->l0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcf/d;->k(Z)V

    .line 12
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
.end method

.method public l0()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcf/q;->M:D

    .line 4
    .line 5
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    iput-wide v0, p0, Lcf/q;->L:D

    .line 8
    .line 9
    return-void
    .line 10
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
.end method
