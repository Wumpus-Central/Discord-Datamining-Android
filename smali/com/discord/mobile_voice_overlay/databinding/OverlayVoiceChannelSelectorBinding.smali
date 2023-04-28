.class public final Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final channelSelect:Landroid/widget/TextView;

.field public final close:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final dialogCard:Landroidx/cardview/widget/CardView;

.field public final emptyResults:Landroid/widget/TextView;

.field public final menuContainer:Landroid/widget/LinearLayout;

.field public final overlayChannelSearch:Landroid/widget/EditText;

.field public final resultsRv:Landroidx/recyclerview/widget/RecyclerView;

.field private final rootView:Landroidx/cardview/widget/CardView;


# direct methods
.method private constructor <init>(Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->rootView:Landroidx/cardview/widget/CardView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->channelSelect:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->close:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->dialogCard:Landroidx/cardview/widget/CardView;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->emptyResults:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->menuContainer:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->overlayChannelSearch:Landroid/widget/EditText;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->resultsRv:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;
    .locals 11

    .line 1
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->channel_select:I

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
    check-cast v4, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->close:I

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
    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    move-object v6, p0

    .line 24
    check-cast v6, Landroidx/cardview/widget/CardView;

    .line 25
    .line 26
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->empty_results:I

    .line 27
    .line 28
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v7, v1

    .line 33
    check-cast v7, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->menu_container:I

    .line 38
    .line 39
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v8, v1

    .line 44
    check-cast v8, Landroid/widget/LinearLayout;

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_channel_search:I

    .line 49
    .line 50
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v9, v1

    .line 55
    check-cast v9, Landroid/widget/EditText;

    .line 56
    .line 57
    if-eqz v9, :cond_0

    .line 58
    .line 59
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->results_rv:I

    .line 60
    .line 61
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move-object v10, v1

    .line 66
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    if-eqz v10, :cond_0

    .line 69
    .line 70
    new-instance p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;

    .line 71
    .line 72
    move-object v2, p0

    .line 73
    move-object v3, v6

    .line 74
    invoke-direct/range {v2 .. v10}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;-><init>(Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v0, Ljava/lang/NullPointerException;

    .line 87
    .line 88
    const-string v1, "Missing required view with ID: "

    .line 89
    .line 90
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0
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
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;
    .locals 2

    .line 2
    sget v0, Lcom/discord/mobile_voice_overlay/R$layout;->overlay_voice_channel_selector:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->bind(Landroid/view/View;)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->getRoot()Landroidx/cardview/widget/CardView;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroidx/cardview/widget/CardView;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSelectorBinding;->rootView:Landroidx/cardview/widget/CardView;

    return-object v0
.end method
