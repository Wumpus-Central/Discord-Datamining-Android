.class public final Lcf/m;
.super Lcf/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/m$b;,
        Lcf/m$c;,
        Lcf/m$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf/d<",
        "Lcf/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0003 !\"B\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016J\u0008\u0010\u000c\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014J\u0008\u0010\u0011\u001a\u00020\u0002H\u0014J\u0008\u0010\u0012\u001a\u00020\u0002H\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "Lcf/m;",
        "Lcf/d;",
        "",
        "k0",
        "",
        "shouldActivateOnStart",
        "M0",
        "disallowInterruption",
        "L0",
        "handler",
        "C0",
        "B0",
        "f0",
        "Landroid/view/MotionEvent;",
        "event",
        "sourceEvent",
        "e0",
        "d0",
        "g0",
        "L",
        "Z",
        "<set-?>",
        "M",
        "K0",
        "()Z",
        "Lcf/m$d;",
        "N",
        "Lcf/m$d;",
        "hook",
        "<init>",
        "()V",
        "O",
        "b",
        "c",
        "d",
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
.field public static final O:Lcf/m$b;

.field private static final P:Lcf/m$a;


# instance fields
.field private L:Z

.field private M:Z

.field private N:Lcf/m$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcf/m$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcf/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcf/m;->O:Lcf/m$b;

    .line 8
    .line 9
    new-instance v0, Lcf/m$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lcf/m$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcf/m;->P:Lcf/m$a;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcf/d;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcf/m;->P:Lcf/m$a;

    .line 5
    .line 6
    iput-object v0, p0, Lcf/m;->N:Lcf/m$d;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, Lcf/d;->y0(Z)Lcf/d;

    .line 10
    .line 11
    .line 12
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


# virtual methods
.method public B0(Lcf/d;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/d<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcf/m;->M:Z

    .line 7
    .line 8
    xor-int/lit8 p1, p1, 0x1

    .line 9
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

.method public C0(Lcf/d;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/d<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcf/d;->C0(Lcf/d;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcf/m;->N:Lcf/m$d;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lcf/m$d;->d(Lcf/d;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v0, p1, Lcf/m;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x4

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ne v0, v3, :cond_1

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, Lcf/m;

    .line 36
    .line 37
    iget-boolean v0, v0, Lcf/m;->M:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    iget-boolean v0, p0, Lcf/m;->M:Z

    .line 43
    .line 44
    xor-int/2addr v0, v1

    .line 45
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ne v5, v3, :cond_2

    .line 54
    .line 55
    if-ne v4, v3, :cond_2

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-ne v4, v3, :cond_3

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcf/m;->N:Lcf/m$d;

    .line 69
    .line 70
    invoke-interface {v0}, Lcf/m$d;->a()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Lcf/d;->P()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-lez p1, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_0
    move v1, v2

    .line 84
    :cond_4
    :goto_1
    return v1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final K0()Z
    .locals 1

    iget-boolean v0, p0, Lcf/m;->M:Z

    return v0
.end method

.method public final L0(Z)Lcf/m;
    .locals 0

    iput-boolean p1, p0, Lcf/m;->M:Z

    return-object p0
.end method

.method public final M0(Z)Lcf/m;
    .locals 0

    iput-boolean p1, p0, Lcf/m;->L:Z

    return-object p0
.end method

.method protected d0()V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v2

    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    move-wide v0, v2

    .line 10
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcf/d;->S()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    return-void
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
    invoke-virtual {p0}, Lcf/d;->S()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x2

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ne v0, v2, :cond_1

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->isPressed()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lcf/d;->j()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Lcf/d;->A()V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcf/m;->N:Lcf/m$d;

    .line 54
    .line 55
    invoke-interface {p2, p1}, Lcf/m$d;->f(Landroid/view/MotionEvent;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-ne v0, v2, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x4

    .line 77
    if-ne v0, v1, :cond_9

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    :goto_0
    iget-boolean v0, p0, Lcf/m;->L:Z

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    sget-object v0, Lcf/m;->O:Lcf/m$b;

    .line 88
    .line 89
    invoke-static {v0, p2, p1}, Lcf/m$b;->a(Lcf/m$b;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcf/d;->j()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object v0, Lcf/m;->O:Lcf/m$b;

    .line 100
    .line 101
    invoke-static {v0, p2, p1}, Lcf/m$b;->a(Lcf/m$b;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcf/d;->j()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    iget-object p2, p0, Lcf/m;->N:Lcf/m$d;

    .line 115
    .line 116
    invoke-interface {p2}, Lcf/m$d;->c()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    iget-object p2, p0, Lcf/m;->N:Lcf/m$d;

    .line 123
    .line 124
    invoke-interface {p2, p1}, Lcf/m$d;->e(Landroid/view/MotionEvent;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    invoke-virtual {p0}, Lcf/d;->O()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eq p1, v2, :cond_9

    .line 133
    .line 134
    iget-object p1, p0, Lcf/m;->N:Lcf/m$d;

    .line 135
    .line 136
    invoke-interface {p1}, Lcf/m$d;->b()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    invoke-virtual {p0}, Lcf/d;->o()V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    invoke-virtual {p0}, Lcf/d;->p()V

    .line 147
    .line 148
    .line 149
    :cond_9
    :goto_1
    return-void
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

.method protected f0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcf/d;->S()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcf/m$d;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcf/m$d;

    .line 10
    .line 11
    iput-object v0, p0, Lcf/m;->N:Lcf/m$d;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/views/textinput/ReactEditText;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Lcf/m$c;

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/views/textinput/ReactEditText;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, Lcf/m$c;-><init>(Lcf/m;Lcom/facebook/react/views/textinput/ReactEditText;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcf/m;->N:Lcf/m$d;

    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
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
.end method

.method protected g0()V
    .locals 1

    sget-object v0, Lcf/m;->P:Lcf/m$a;

    iput-object v0, p0, Lcf/m;->N:Lcf/m$d;

    return-void
.end method

.method public k0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcf/d;->k0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcf/m;->L:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcf/m;->M:Z

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
