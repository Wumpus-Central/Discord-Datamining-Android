.class public final Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final aboveBottomRowBarrier:Landroidx/constraintlayout/widget/Barrier;

.field public final avatars:Lcom/discord/overlapping_circles/OverlappingCirclesView;

.field public final bgGradient:Landroid/view/View;

.field public final bottomEndLabel:Landroid/widget/TextView;

.field public final button:Lcom/discord/core/DCDButton;

.field public final endImage:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final header:Landroid/widget/TextView;

.field public final heroText:Landroid/widget/TextView;

.field private final rootView:Landroid/view/View;

.field public final startImage:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final subtext:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Lcom/discord/overlapping_circles/OverlappingCirclesView;Landroid/view/View;Landroid/widget/TextView;Lcom/discord/core/DCDButton;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->rootView:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->aboveBottomRowBarrier:Landroidx/constraintlayout/widget/Barrier;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->avatars:Lcom/discord/overlapping_circles/OverlappingCirclesView;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->bgGradient:Landroid/view/View;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->bottomEndLabel:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->button:Lcom/discord/core/DCDButton;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->endImage:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->header:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->heroText:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p10, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->startImage:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 23
    .line 24
    iput-object p11, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->subtext:Landroid/widget/TextView;

    .line 25
    .line 26
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
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;
    .locals 14

    .line 1
    sget v0, Lcom/discord/activity_invites/R$id;->above_bottom_row_barrier:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v4, v1

    .line 8
    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    sget v0, Lcom/discord/activity_invites/R$id;->avatars:I

    .line 13
    .line 14
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v5, v1

    .line 19
    check-cast v5, Lcom/discord/overlapping_circles/OverlappingCirclesView;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    sget v0, Lcom/discord/activity_invites/R$id;->bg_gradient:I

    .line 24
    .line 25
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    sget v0, Lcom/discord/activity_invites/R$id;->bottom_end_label:I

    .line 32
    .line 33
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v7, v1

    .line 38
    check-cast v7, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    sget v0, Lcom/discord/activity_invites/R$id;->button:I

    .line 43
    .line 44
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v8, v1

    .line 49
    check-cast v8, Lcom/discord/core/DCDButton;

    .line 50
    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    sget v0, Lcom/discord/activity_invites/R$id;->end_image:I

    .line 54
    .line 55
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v9, v1

    .line 60
    check-cast v9, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 61
    .line 62
    if-eqz v9, :cond_0

    .line 63
    .line 64
    sget v0, Lcom/discord/activity_invites/R$id;->header:I

    .line 65
    .line 66
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v10, v1

    .line 71
    check-cast v10, Landroid/widget/TextView;

    .line 72
    .line 73
    if-eqz v10, :cond_0

    .line 74
    .line 75
    sget v0, Lcom/discord/activity_invites/R$id;->hero_text:I

    .line 76
    .line 77
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v11, v1

    .line 82
    check-cast v11, Landroid/widget/TextView;

    .line 83
    .line 84
    if-eqz v11, :cond_0

    .line 85
    .line 86
    sget v0, Lcom/discord/activity_invites/R$id;->start_image:I

    .line 87
    .line 88
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    move-object v12, v1

    .line 93
    check-cast v12, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 94
    .line 95
    if-eqz v12, :cond_0

    .line 96
    .line 97
    sget v0, Lcom/discord/activity_invites/R$id;->subtext:I

    .line 98
    .line 99
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    move-object v13, v1

    .line 104
    check-cast v13, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v13, :cond_0

    .line 107
    .line 108
    new-instance v0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;

    .line 109
    .line 110
    move-object v2, v0

    .line 111
    move-object v3, p0

    .line 112
    invoke-direct/range {v2 .. v13}, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;-><init>(Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Lcom/discord/overlapping_circles/OverlappingCirclesView;Landroid/view/View;Landroid/widget/TextView;Lcom/discord/core/DCDButton;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v0, Ljava/lang/NullPointerException;

    .line 125
    .line 126
    const-string v1, "Missing required view with ID: "

    .line 127
    .line 128
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0
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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/discord/activity_invites/R$layout;->activity_invite_embed_view:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->bind(Landroid/view/View;)Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string p1, "parent"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
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
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/discord/activity_invites/databinding/ActivityInviteEmbedViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
