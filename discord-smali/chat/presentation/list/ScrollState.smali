.class public final Lcom/discord/chat/presentation/list/ScrollState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00c6\u0003Jo\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00032\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\rH\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006&"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/ScrollState;",
        "",
        "isDragging",
        "",
        "isSettling",
        "isNearBottom",
        "isAtBottom",
        "isNearTop",
        "isAtTop",
        "scrollDirection",
        "Lcom/discord/chat/presentation/list/ScrollDirection;",
        "isFirstMessageVisible",
        "firstVisibleMessageIndex",
        "",
        "lastVisibleMessageIndex",
        "(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZII)V",
        "getFirstVisibleMessageIndex",
        "()I",
        "()Z",
        "getLastVisibleMessageIndex",
        "getScrollDirection",
        "()Lcom/discord/chat/presentation/list/ScrollDirection;",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "chat_release"
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
.field private final firstVisibleMessageIndex:I

.field private final isAtBottom:Z

.field private final isAtTop:Z

.field private final isDragging:Z

.field private final isFirstMessageVisible:Z

.field private final isNearBottom:Z

.field private final isNearTop:Z

.field private final isSettling:Z

.field private final lastVisibleMessageIndex:I

.field private final scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;


# direct methods
.method public constructor <init>(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    .line 15
    .line 16
    iput-object p7, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    .line 17
    .line 18
    iput-boolean p8, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    .line 19
    .line 20
    iput p9, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    .line 21
    .line 22
    iput p10, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    .line 23
    .line 24
    return-void
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
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/list/ScrollState;ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZIIILjava/lang/Object;)Lcom/discord/chat/presentation/list/ScrollState;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget v1, v0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    goto :goto_9

    :cond_9
    move/from16 v1, p10

    :goto_9
    move p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/chat/presentation/list/ScrollState;->copy(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZII)Lcom/discord/chat/presentation/list/ScrollState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    return v0
.end method

.method public final component7()Lcom/discord/chat/presentation/list/ScrollDirection;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    return v0
.end method

.method public final copy(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZII)Lcom/discord/chat/presentation/list/ScrollState;
    .locals 12

    new-instance v11, Lcom/discord/chat/presentation/list/ScrollState;

    move-object v0, v11

    move v1, p1

    move v2, p2

    move v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/discord/chat/presentation/list/ScrollState;-><init>(ZZZZZZLcom/discord/chat/presentation/list/ScrollDirection;ZII)V

    return-object v11
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/list/ScrollState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/list/ScrollState;

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    iget v3, p1, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    iget p1, p1, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getFirstVisibleMessageIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    return v0
.end method

.method public final getLastVisibleMessageIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    return v0
.end method

.method public final getScrollDirection()Lcom/discord/chat/presentation/list/ScrollDirection;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAtBottom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    return v0
.end method

.method public final isAtTop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    return v0
.end method

.method public final isDragging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    return v0
.end method

.method public final isFirstMessageVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    return v0
.end method

.method public final isNearBottom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    return v0
.end method

.method public final isNearTop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    return v0
.end method

.method public final isSettling()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ScrollState;->isDragging:Z

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ScrollState;->isSettling:Z

    iget-boolean v2, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearBottom:Z

    iget-boolean v3, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom:Z

    iget-boolean v4, p0, Lcom/discord/chat/presentation/list/ScrollState;->isNearTop:Z

    iget-boolean v5, p0, Lcom/discord/chat/presentation/list/ScrollState;->isAtTop:Z

    iget-object v6, p0, Lcom/discord/chat/presentation/list/ScrollState;->scrollDirection:Lcom/discord/chat/presentation/list/ScrollDirection;

    iget-boolean v7, p0, Lcom/discord/chat/presentation/list/ScrollState;->isFirstMessageVisible:Z

    iget v8, p0, Lcom/discord/chat/presentation/list/ScrollState;->firstVisibleMessageIndex:I

    iget v9, p0, Lcom/discord/chat/presentation/list/ScrollState;->lastVisibleMessageIndex:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ScrollState(isDragging="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSettling="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isNearBottom="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isAtBottom="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isNearTop="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isAtTop="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", scrollDirection="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isFirstMessageVisible="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", firstVisibleMessageIndex="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lastVisibleMessageIndex="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
