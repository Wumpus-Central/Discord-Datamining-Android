.class public final Lcom/discord/reactions/ReactionsViewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/reactions/ReactionsViewAdapter$ViewType;,
        Lcom/discord/reactions/ReactionsViewAdapter$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u001c\u001a\u00020\u0004H\u0002J\u0008\u0010\u001d\u001a\u00020\u0004H\u0002J\u0008\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0004H\u0016J\u00a0\u0001\u0010)\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0008\u0002\u0010*\u001a\u00020\u000bH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/discord/reactions/ReactionsViewAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "reactionHeight",
        "",
        "(I)V",
        "addNewBurstReactionAccessibilityLabel",
        "",
        "addNewReactionAccessibilityLabel",
        "addReactionLabel",
        "canAddNewBurstReactions",
        "",
        "canAddNewReactions",
        "messageId",
        "onAddBurstReactionClick",
        "Landroid/view/View$OnClickListener;",
        "onAddReactionClick",
        "onReactionClick",
        "Lkotlin/Function1;",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "",
        "onReactionLongPress",
        "reactions",
        "",
        "reactionsTheme",
        "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
        "theme",
        "Lcom/discord/theme/DiscordTheme;",
        "getAddBurstReactionIndex",
        "getAddReactionIndex",
        "getItemCount",
        "getItemId",
        "",
        "position",
        "getItemViewType",
        "onBindViewHolder",
        "holder",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "setReactions",
        "areChatAnimationsEnabled",
        "ViewType",
        "reactions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

.field private addNewReactionAccessibilityLabel:Ljava/lang/String;

.field private addReactionLabel:Ljava/lang/String;

.field private canAddNewBurstReactions:Z

.field private canAddNewReactions:Z

.field private messageId:Ljava/lang/String;

.field private onAddBurstReactionClick:Landroid/view/View$OnClickListener;

.field private onAddReactionClick:Landroid/view/View$OnClickListener;

.field private onReactionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onReactionLongPress:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionHeight:I

.field private reactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private reactionsTheme:Lcom/discord/reactions/ReactionView$ReactionsTheme;

.field private theme:Lcom/discord/theme/DiscordTheme;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionHeight:I

    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 14
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
.end method

.method private final getAddBurstReactionIndex()I
    .locals 1

    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final getAddReactionIndex()I
    .locals 1

    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public static synthetic setReactions$default(Lcom/discord/reactions/ReactionsViewAdapter;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZILjava/lang/Object;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v7, v2

    goto :goto_0

    :cond_0
    move/from16 v7, p4

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, p13

    :goto_1
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_2

    move/from16 v17, v2

    goto :goto_2

    :cond_2
    move/from16 v17, p14

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    invoke-virtual/range {v3 .. v17}, Lcom/discord/reactions/ReactionsViewAdapter;->setReactions(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;Z)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean v1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->canAddNewReactions:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->canAddNewBurstReactions:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    :cond_0
    return v0
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
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public getItemId(I)J
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/discord/reactions/ReactionsViewAdapter;->getAddBurstReactionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "addReactionLabel"

    .line 6
    .line 7
    const-string v2, "messageId"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne p1, v0, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->messageId:Ljava/lang/String;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v3

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addReactionLabel:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v3, v0

    .line 29
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, "_add_burst_reactions_"

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/discord/recycler_view/ids/IdUtilsKt;->convertToId(Ljava/lang/CharSequence;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    invoke-direct {p0}, Lcom/discord/reactions/ReactionsViewAdapter;->getAddReactionIndex()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-ne p1, v0, :cond_5

    .line 59
    .line 60
    iget-object p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->messageId:Ljava/lang/String;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object p1, v3

    .line 68
    :cond_3
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addReactionLabel:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move-object v3, v0

    .line 77
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p1, "_add_reactions_"

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lcom/discord/recycler_view/ids/IdUtilsKt;->convertToId(Ljava/lang/CharSequence;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lcom/discord/reactions/ReactionView$Reaction;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->messageId:Ljava/lang/String;

    .line 111
    .line 112
    if-nez v0, :cond_6

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    move-object v3, v0

    .line 119
    :goto_2
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->getEmoji()Lcom/discord/reactions/ReactionView$Emoji;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, Lcom/discord/reactions/ReactionView$Emoji;->getEmojiId()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->isBurstReaction()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v2, "_"

    .line 140
    .line 141
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Lcom/discord/recycler_view/ids/IdUtilsKt;->convertToId(Ljava/lang/CharSequence;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v0

    .line 158
    :goto_3
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/discord/reactions/ReactionsViewAdapter;->getAddBurstReactionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/discord/reactions/ReactionsViewAdapter$ViewType;->AddBurstReaction:Lcom/discord/reactions/ReactionsViewAdapter$ViewType;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/discord/reactions/ReactionsViewAdapter;->getAddReactionIndex()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    sget-object p1, Lcom/discord/reactions/ReactionsViewAdapter$ViewType;->AddReaction:Lcom/discord/reactions/ReactionsViewAdapter$ViewType;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/discord/reactions/ReactionView$Reaction;

    .line 26
    .line 27
    invoke-interface {p1}, Lcom/discord/reactions/ReactionView$Reaction;->isBurstReaction()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    sget-object p1, Lcom/discord/reactions/ReactionsViewAdapter$ViewType;->BurstReaction:Lcom/discord/reactions/ReactionsViewAdapter$ViewType;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    sget-object p1, Lcom/discord/reactions/ReactionsViewAdapter$ViewType;->Reaction:Lcom/discord/reactions/ReactionsViewAdapter$ViewType;

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
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
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 6

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    invoke-virtual {v0}, Lcom/discord/theme/ThemeManager;->getThemeOverride()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    .line 2
    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-virtual {v0, v2}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    .line 3
    instance-of v2, p1, Lcom/discord/reactions/BurstReactionViewHolder;

    const-string v3, "onReactionLongPress"

    const-string v4, "onReactionClick"

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/discord/reactions/ReactionView$Reaction;

    .line 5
    check-cast p1, Lcom/discord/reactions/BurstReactionViewHolder;

    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionClick:Lkotlin/jvm/functions/Function1;

    if-nez v2, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object v2, v5

    :cond_0
    iget-object v4, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionLongPress:Lkotlin/jvm/functions/Function1;

    if-nez v4, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v5, v4

    :goto_0
    invoke-virtual {p1, p2, v2, v5}, Lcom/discord/reactions/BurstReactionViewHolder;->bind(Lcom/discord/reactions/ReactionView$Reaction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_4

    .line 6
    :cond_2
    instance-of v2, p1, Lcom/discord/reactions/ReactionViewHolder;

    if-eqz v2, :cond_5

    .line 7
    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/discord/reactions/ReactionView$Reaction;

    .line 8
    check-cast p1, Lcom/discord/reactions/ReactionViewHolder;

    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionClick:Lkotlin/jvm/functions/Function1;

    if-nez v2, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object v2, v5

    :cond_3
    iget-object v4, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionLongPress:Lkotlin/jvm/functions/Function1;

    if-nez v4, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v5, v4

    :goto_1
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionsTheme:Lcom/discord/reactions/ReactionView$ReactionsTheme;

    invoke-virtual {p1, p2, v2, v5, v3}, Lcom/discord/reactions/ReactionViewHolder;->bind(Lcom/discord/reactions/ReactionView$Reaction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/reactions/ReactionView$ReactionsTheme;)V

    goto :goto_4

    .line 9
    :cond_5
    instance-of p2, p1, Lcom/discord/reactions/AddReactionViewHolder;

    const-string v2, "addReactionLabel"

    if-eqz p2, :cond_9

    .line 10
    check-cast p1, Lcom/discord/reactions/AddReactionViewHolder;

    iget-object p2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addReactionLabel:Ljava/lang/String;

    if-nez p2, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object p2, v5

    :cond_6
    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, "addNewReactionAccessibilityLabel"

    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object v2, v5

    :cond_7
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onAddReactionClick:Landroid/view/View$OnClickListener;

    if-nez v3, :cond_8

    const-string v3, "onAddReactionClick"

    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-object v5, v3

    :goto_2
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionsTheme:Lcom/discord/reactions/ReactionView$ReactionsTheme;

    invoke-virtual {p1, p2, v2, v5, v3}, Lcom/discord/reactions/AddReactionViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lcom/discord/reactions/ReactionView$ReactionsTheme;)V

    goto :goto_4

    .line 11
    :cond_9
    instance-of p2, p1, Lcom/discord/reactions/AddBurstReactionViewHolder;

    if-eqz p2, :cond_d

    .line 12
    check-cast p1, Lcom/discord/reactions/AddBurstReactionViewHolder;

    iget-object p2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addReactionLabel:Ljava/lang/String;

    if-nez p2, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object p2, v5

    :cond_a
    iget-object v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    if-nez v2, :cond_b

    const-string v2, "addNewBurstReactionAccessibilityLabel"

    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    move-object v2, v5

    :cond_b
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onAddBurstReactionClick:Landroid/view/View$OnClickListener;

    if-nez v3, :cond_c

    const-string v3, "onAddBurstReactionClick"

    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    move-object v5, v3

    :goto_3
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionsTheme:Lcom/discord/reactions/ReactionView$ReactionsTheme;

    invoke-virtual {p1, p2, v2, v5, v3}, Lcom/discord/reactions/AddBurstReactionViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lcom/discord/reactions/ReactionView$ReactionsTheme;)V

    .line 13
    :goto_4
    invoke-virtual {v0, v1}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    return-void

    .line 14
    :cond_d
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid view holder type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 7

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$c;

    .line 7
    .line 8
    const/4 v1, -0x2

    .line 9
    iget v2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionHeight:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager$c;-><init>(II)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/discord/theme/ThemeManager;->getThemeOverride()Lcom/discord/theme/DiscordTheme;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->theme:Lcom/discord/theme/DiscordTheme;

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/discord/reactions/ReactionsViewAdapter$ViewType;->values()[Lcom/discord/reactions/ReactionsViewAdapter$ViewType;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    aget-object p2, v3, p2

    .line 30
    .line 31
    sget-object v3, Lcom/discord/reactions/ReactionsViewAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    aget p2, v3, p2

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const-string v4, "parent.context"

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    const/4 v6, 0x0

    .line 44
    if-eq p2, v3, :cond_3

    .line 45
    .line 46
    if-eq p2, v5, :cond_2

    .line 47
    .line 48
    const/4 v3, 0x3

    .line 49
    if-eq p2, v3, :cond_1

    .line 50
    .line 51
    const/4 v3, 0x4

    .line 52
    if-ne p2, v3, :cond_0

    .line 53
    .line 54
    new-instance p2, Lcom/discord/reactions/AddReactionView;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p2, p1, v6, v5, v6}, Lcom/discord/reactions/AddReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, Lcom/discord/reactions/AddBurstReactionViewHolder;

    .line 70
    .line 71
    invoke-direct {p1, p2}, Lcom/discord/reactions/AddBurstReactionViewHolder;-><init>(Lcom/discord/reactions/AddReactionView;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance p1, Llf/q;

    .line 76
    .line 77
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_1
    new-instance p2, Lcom/discord/reactions/AddReactionView;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p2, p1, v6, v5, v6}, Lcom/discord/reactions/AddReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, Lcom/discord/reactions/AddReactionViewHolder;

    .line 97
    .line 98
    invoke-direct {p1, p2}, Lcom/discord/reactions/AddReactionViewHolder;-><init>(Lcom/discord/reactions/AddReactionView;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance p2, Lcom/discord/reactions/ReactionView;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p2, p1, v6, v5, v6}, Lcom/discord/reactions/ReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    new-instance p1, Lcom/discord/reactions/ReactionViewHolder;

    .line 118
    .line 119
    invoke-direct {p1, p2}, Lcom/discord/reactions/ReactionViewHolder;-><init>(Lcom/discord/reactions/ReactionView;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    new-instance p2, Lcom/discord/reactions/BurstReactionView;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p2, p1, v6, v5, v6}, Lcom/discord/reactions/BurstReactionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, Lcom/discord/reactions/BurstReactionViewHolder;

    .line 139
    .line 140
    invoke-direct {p1, p2}, Lcom/discord/reactions/BurstReactionViewHolder;-><init>(Lcom/discord/reactions/BurstReactionView;)V

    .line 141
    .line 142
    .line 143
    :goto_0
    invoke-virtual {v1, v2}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    .line 144
    .line 145
    .line 146
    return-object p1
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
.end method

.method public final setReactions(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            ">;ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
            "Landroid/view/View$OnClickListener;",
            "Landroid/view/View$OnClickListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/theme/DiscordTheme;",
            "Z)V"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addReactionLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewReactionAccessibilityLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewBurstReactionAccessibilityLabel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddReactionClick"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddBurstReactionClick"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReactionClick"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReactionLongPress"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->messageId:Ljava/lang/String;

    .line 2
    iput-boolean p3, p0, Lcom/discord/reactions/ReactionsViewAdapter;->canAddNewReactions:Z

    .line 3
    iput-boolean p4, p0, Lcom/discord/reactions/ReactionsViewAdapter;->canAddNewBurstReactions:Z

    .line 4
    iput-object p5, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addReactionLabel:Ljava/lang/String;

    .line 5
    iput-object p6, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    .line 6
    iput-object p7, p0, Lcom/discord/reactions/ReactionsViewAdapter;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    .line 7
    iput-object p8, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactionsTheme:Lcom/discord/reactions/ReactionView$ReactionsTheme;

    .line 8
    iput-object p9, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onAddReactionClick:Landroid/view/View$OnClickListener;

    .line 9
    iput-object p10, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onAddBurstReactionClick:Landroid/view/View$OnClickListener;

    .line 10
    iput-object p11, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionClick:Lkotlin/jvm/functions/Function1;

    .line 11
    iput-object p12, p0, Lcom/discord/reactions/ReactionsViewAdapter;->onReactionLongPress:Lkotlin/jvm/functions/Function1;

    .line 12
    iput-object p13, p0, Lcom/discord/reactions/ReactionsViewAdapter;->theme:Lcom/discord/theme/DiscordTheme;

    if-eqz p14, :cond_0

    .line 13
    iget-object p1, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 14
    iput-object p2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 15
    new-instance p3, Lcom/discord/recycler_view/utils/ItemDiffer;

    invoke-direct {p3, p1, p2}, Lcom/discord/recycler_view/utils/ItemDiffer;-><init>(Ljava/util/List;Ljava/util/List;)V

    const/4 p1, 0x1

    .line 16
    invoke-static {p3, p1}, Landroidx/recyclerview/widget/c;->b(Landroidx/recyclerview/widget/c$b;Z)Landroidx/recyclerview/widget/c$e;

    move-result-object p1

    const-string p2, "calculateDiff(differ, true)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/c$e;->c(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_0

    .line 18
    :cond_0
    iput-object p2, p0, Lcom/discord/reactions/ReactionsViewAdapter;->reactions:Ljava/util/List;

    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :goto_0
    return-void
.end method
