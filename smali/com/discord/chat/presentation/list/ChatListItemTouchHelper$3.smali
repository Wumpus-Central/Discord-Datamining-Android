.class Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;
.super Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

.field final synthetic val$prevSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field final synthetic val$swipeDir:I


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFFILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 9

    move-object v8, p0

    move-object v0, p1

    iput-object v0, v8, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    move/from16 v0, p9

    iput v0, v8, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$swipeDir:I

    move-object/from16 v0, p10

    iput-object v0, v8, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$prevSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;-><init>(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFF)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mOverridden:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$swipeDir:I

    .line 10
    .line 11
    if-gtz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 14
    .line 15
    iget-object v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mCallback:Lcom/discord/chat/presentation/list/ChatListCallback;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$prevSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/ItemTouchHelper$c;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mPendingCleanup:Ljava/util/List;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$prevSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mIsPendingCleanup:Z

    .line 38
    .line 39
    iget p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$swipeDir:I

    .line 40
    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 44
    .line 45
    invoke-virtual {v0, p0, p1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->postDispatchSwipe(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 49
    .line 50
    iget-object v0, p1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mOverdrawChild:Landroid/view/View;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$3;->val$prevSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 53
    .line 54
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 55
    .line 56
    if-ne v0, v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->removeChildDrawingOrderCallbackIfNecessary(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
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
.end method
