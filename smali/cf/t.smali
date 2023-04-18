.class public final Lcf/t;
.super Lcf/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/t$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf/d<",
        "Lcf/t;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 )2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\u0005H\u0014J\u0008\u0010\u000b\u001a\u00020\u0005H\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0015R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001c\u001a\u0004\u0008!\u0010\u001eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006+"
    }
    d2 = {
        "Lcf/t;",
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
        "Lcf/s;",
        "L",
        "Lcf/s;",
        "rotationGestureDetector",
        "",
        "<set-?>",
        "M",
        "D",
        "O0",
        "()D",
        "rotation",
        "N",
        "P0",
        "velocity",
        "",
        "O",
        "F",
        "M0",
        "()F",
        "anchorX",
        "P",
        "N0",
        "anchorY",
        "Lcf/s$a;",
        "Q",
        "Lcf/s$a;",
        "gestureListener",
        "<init>",
        "()V",
        "R",
        "a",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final R:Lcf/t$a;


# instance fields
.field private L:Lcf/s;

.field private M:D

.field private N:D

.field private O:F

.field private P:F

.field private final Q:Lcf/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcf/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcf/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcf/t;->R:Lcf/t$a;

    return-void
.end method

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
    iput v0, p0, Lcf/t;->O:F

    .line 7
    .line 8
    iput v0, p0, Lcf/t;->P:F

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Lcf/d;->y0(Z)Lcf/d;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcf/t$b;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcf/t$b;-><init>(Lcf/t;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcf/t;->Q:Lcf/s$a;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic K0(Lcf/t;D)V
    .locals 0

    iput-wide p1, p0, Lcf/t;->M:D

    return-void
.end method

.method public static final synthetic L0(Lcf/t;D)V
    .locals 0

    iput-wide p1, p0, Lcf/t;->N:D

    return-void
.end method


# virtual methods
.method public final M0()F
    .locals 1

    iget v0, p0, Lcf/t;->O:F

    return v0
.end method

.method public final N0()F
    .locals 1

    iget v0, p0, Lcf/t;->P:F

    return v0
.end method

.method public final O0()D
    .locals 2

    iget-wide v0, p0, Lcf/t;->M:D

    return-wide v0
.end method

.method public final P0()D
    .locals 2

    iget-wide v0, p0, Lcf/t;->N:D

    return-wide v0
.end method

.method protected e0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 2

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
    invoke-virtual {p0}, Lcf/t;->l0()V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcf/s;

    .line 21
    .line 22
    iget-object v1, p0, Lcf/t;->Q:Lcf/s$a;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcf/s;-><init>(Lcf/s$a;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcf/t;->L:Lcf/s;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcf/t;->O:F

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Lcf/t;->P:F

    .line 40
    .line 41
    invoke-virtual {p0}, Lcf/d;->o()V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p1, p0, Lcf/t;->L:Lcf/s;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lcf/s;->f(Landroid/view/MotionEvent;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p1, p0, Lcf/t;->L:Lcf/s;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance v0, Landroid/graphics/PointF;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcf/s;->b()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p1}, Lcf/s;->c()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcf/d;->H0(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    iput v0, p0, Lcf/t;->O:F

    .line 75
    .line 76
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 77
    .line 78
    iput p1, p0, Lcf/t;->P:F

    .line 79
    .line 80
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const/4 p2, 0x1

    .line 85
    if-ne p1, p2, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    const/4 p2, 0x4

    .line 92
    if-ne p1, p2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, Lcf/d;->A()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {p0}, Lcf/d;->C()V

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_0
    return-void
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

.method protected g0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcf/t;->L:Lcf/s;

    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, Lcf/t;->O:F

    .line 7
    .line 8
    iput v0, p0, Lcf/t;->P:F

    .line 9
    .line 10
    invoke-virtual {p0}, Lcf/t;->l0()V

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
    invoke-virtual {p0}, Lcf/t;->l0()V

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
    iput-wide v0, p0, Lcf/t;->N:D

    .line 4
    .line 5
    iput-wide v0, p0, Lcf/t;->M:D

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
