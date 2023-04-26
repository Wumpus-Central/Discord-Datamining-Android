.class public final Lcom/brentvatne/exoplayer/d;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/brentvatne/exoplayer/d$b;
    }
.end annotation


# instance fields
.field private k:Landroid/view/View;

.field private final l:Landroid/view/View;

.field private final m:Lcom/google/android/exoplayer2/ui/SubtitleView;

.field private final n:Lcom/brentvatne/exoplayer/a;

.field private final o:Lcom/brentvatne/exoplayer/d$b;

.field private p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field private q:Landroid/content/Context;

.field private r:Landroid/view/ViewGroup$LayoutParams;

.field private s:Z

.field private t:Z

.field private final u:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/brentvatne/exoplayer/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/brentvatne/exoplayer/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x1

    .line 4
    iput-boolean p2, p0, Lcom/brentvatne/exoplayer/d;->s:Z

    const/4 p3, 0x0

    .line 5
    iput-boolean p3, p0, Lcom/brentvatne/exoplayer/d;->t:Z

    .line 6
    new-instance v0, Lcom/brentvatne/exoplayer/d$a;

    invoke-direct {v0, p0}, Lcom/brentvatne/exoplayer/d$a;-><init>(Lcom/brentvatne/exoplayer/d;)V

    iput-object v0, p0, Lcom/brentvatne/exoplayer/d;->u:Ljava/lang/Runnable;

    .line 7
    iput-object p1, p0, Lcom/brentvatne/exoplayer/d;->q:Landroid/content/Context;

    .line 8
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    .line 9
    new-instance v0, Lcom/brentvatne/exoplayer/d$b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/brentvatne/exoplayer/d$b;-><init>(Lcom/brentvatne/exoplayer/d;Lcom/brentvatne/exoplayer/d$a;)V

    iput-object v0, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 10
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    .line 11
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 12
    new-instance v1, Lcom/brentvatne/exoplayer/a;

    invoke-direct {v1, p1}, Lcom/brentvatne/exoplayer/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 13
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    new-instance v2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/brentvatne/exoplayer/d;->l:Landroid/view/View;

    .line 15
    iget-object v3, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v3, 0x106000c

    .line 16
    invoke-static {p1, v3}, Landroidx/core/content/a;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 17
    new-instance v3, Lcom/google/android/exoplayer2/ui/SubtitleView;

    invoke-direct {v3, p1}, Lcom/google/android/exoplayer2/ui/SubtitleView;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/brentvatne/exoplayer/d;->m:Lcom/google/android/exoplayer2/ui/SubtitleView;

    .line 18
    iget-object p1, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/ui/SubtitleView;->d()V

    .line 20
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/ui/SubtitleView;->e()V

    .line 21
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->k()V

    .line 22
    iget-object p1, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v2, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x2

    .line 23
    iget-object p2, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 24
    invoke-virtual {p0, v1, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    return-void
.end method

.method static synthetic a(Lcom/brentvatne/exoplayer/d;)Lcom/google/android/exoplayer2/ui/SubtitleView;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/d;->m:Lcom/google/android/exoplayer2/ui/SubtitleView;

    return-object p0
.end method

.method static synthetic b(Lcom/brentvatne/exoplayer/d;)Lcom/brentvatne/exoplayer/a;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    return-object p0
.end method

.method static synthetic c(Lcom/brentvatne/exoplayer/d;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/d;->u:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic d(Lcom/brentvatne/exoplayer/d;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/brentvatne/exoplayer/d;->l:Landroid/view/View;

    return-object p0
.end method

.method static synthetic e(Lcom/brentvatne/exoplayer/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->i()V

    return-void
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->k:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/view/TextureView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 8
    .line 9
    check-cast v0, Landroid/view/TextureView;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H(Landroid/view/TextureView;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, v0, Landroid/view/SurfaceView;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 20
    .line 21
    check-cast v0, Landroid/view/SurfaceView;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U(Landroid/view/SurfaceView;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
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

.method private h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->k:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/view/TextureView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 8
    .line 9
    check-cast v0, Landroid/view/TextureView;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->z(Landroid/view/TextureView;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, v0, Landroid/view/SurfaceView;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 20
    .line 21
    check-cast v0, Landroid/view/SurfaceView;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k(Landroid/view/SurfaceView;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
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

.method private i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->A()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget v3, v0, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;->a:I

    .line 13
    .line 14
    if-ge v2, v3, :cond_2

    .line 15
    .line 16
    iget-object v3, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->B(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x2

    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;->a(I)La9/k;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->l:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private j()V
    .locals 2

    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->l:Landroid/view/View;

    iget-boolean v1, p0, Lcom/brentvatne/exoplayer/d;->t:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private k()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/d;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/view/TextureView;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->q:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Landroid/view/SurfaceView;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->q:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/brentvatne/exoplayer/d;->k:Landroid/view/View;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/brentvatne/exoplayer/d;->k:Landroid/view/View;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/brentvatne/exoplayer/d;->r:Landroid/view/ViewGroup$LayoutParams;

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->h()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
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


# virtual methods
.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/a;->a()V

    return-void
.end method

.method public getVideoSurfaceView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->k:Landroid/view/View;

    return-object v0
.end method

.method public setHideShutterView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/d;->t:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->j()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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

.method public setPlayer(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N(Lq8/l;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->j(Lg9/q;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->l(Lcom/google/android/exoplayer2/Player$a;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->f()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/d;->p:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->l:Landroid/view/View;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->h()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->R(Lg9/q;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->I(Lcom/google/android/exoplayer2/Player$a;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->o:Lcom/brentvatne/exoplayer/d$b;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->v(Lq8/l;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
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

.method public setResizeMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/brentvatne/exoplayer/a;->getResizeMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d;->n:Lcom/brentvatne/exoplayer/a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/a;->setResizeMode(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/brentvatne/exoplayer/d;->u:Ljava/lang/Runnable;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method public setUseTextureView(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/brentvatne/exoplayer/d;->s:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/brentvatne/exoplayer/d;->s:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/brentvatne/exoplayer/d;->k()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
