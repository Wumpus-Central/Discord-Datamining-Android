.class public final Lcom/discord/chat/reactevents/ChatScrollPositionEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/reactevents/ChatScrollPositionEvent$$serializer;,
        Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 12\u00020\u0001:\u000201Ba\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00052\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013\u00a8\u00062"
    }
    d2 = {
        "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;",
        "Lcom/discord/reactevents/ReactEvent;",
        "seen1",
        "",
        "isAtBottom",
        "",
        "isNearBottom",
        "isNearTop",
        "dragging",
        "decelerating",
        "shouldShowJumpToPresent",
        "isFirstMessageVisible",
        "firstVisibleMessageIndex",
        "lastVisibleMessageIndex",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IZZZZZZZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(ZZZZZZZII)V",
        "getDecelerating",
        "()Z",
        "getDragging",
        "getFirstVisibleMessageIndex",
        "()I",
        "getLastVisibleMessageIndex",
        "getShouldShowJumpToPresent",
        "component1",
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
        "",
        "hashCode",
        "toString",
        "",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
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

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;


# instance fields
.field private final decelerating:Z

.field private final dragging:Z

.field private final firstVisibleMessageIndex:I

.field private final isAtBottom:Z

.field private final isFirstMessageVisible:Z

.field private final isNearBottom:Z

.field private final isNearTop:Z

.field private final lastVisibleMessageIndex:I

.field private final shouldShowJumpToPresent:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->Companion:Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZZZZZZZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/discord/chat/reactevents/ChatScrollPositionEvent$$serializer;->INSTANCE:Lcom/discord/chat/reactevents/ChatScrollPositionEvent$$serializer;

    invoke-virtual {p11}, Lcom/discord/chat/reactevents/ChatScrollPositionEvent$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    iput-boolean p3, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    iput-boolean p4, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    iput-boolean p5, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    iput-boolean p6, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    iput-boolean p7, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    iput-boolean p8, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    iput p9, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    iput p10, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    return-void
.end method

.method public constructor <init>(ZZZZZZZII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    .line 4
    iput-boolean p2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    .line 6
    iput-boolean p4, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    .line 7
    iput-boolean p5, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    .line 8
    iput-boolean p6, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    .line 9
    iput-boolean p7, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    .line 10
    iput p8, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    .line 11
    iput p9, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/reactevents/ChatScrollPositionEvent;ZZZZZZZIIILjava/lang/Object;)Lcom/discord/chat/reactevents/ChatScrollPositionEvent;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget v1, v0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    goto :goto_8

    :cond_8
    move/from16 v1, p9

    :goto_8
    move p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->copy(ZZZZZZZII)Lcom/discord/chat/reactevents/ChatScrollPositionEvent;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/reactevents/ChatScrollPositionEvent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 2

    .line 1
    const-string v0, "self"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "output"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serialDesc"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    .line 24
    .line 25
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    .line 30
    .line 31
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    .line 36
    .line 37
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    .line 42
    .line 43
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    .line 48
    .line 49
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x6

    .line 53
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    .line 54
    .line 55
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x7

    .line 59
    iget v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    .line 60
    .line 61
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x8

    .line 65
    .line 66
    iget p0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    .line 67
    .line 68
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 69
    .line 70
    .line 71
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
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
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    return v0
.end method

.method public final copy(ZZZZZZZII)Lcom/discord/chat/reactevents/ChatScrollPositionEvent;
    .locals 11

    new-instance v10, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;

    move-object v0, v10

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;-><init>(ZZZZZZZII)V

    return-object v10
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;

    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    iget-boolean v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    iget v3, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    iget p1, p1, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDecelerating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    return v0
.end method

.method public final getDragging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    return v0
.end method

.method public final getFirstVisibleMessageIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    return v0
.end method

.method public final getLastVisibleMessageIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    return v0
.end method

.method public final getShouldShowJumpToPresent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAtBottom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    return v0
.end method

.method public final isFirstMessageVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    return v0
.end method

.method public final isNearBottom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    return v0
.end method

.method public final isNearTop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    return v0
.end method

.method public serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    invoke-static {p0}, Lcom/discord/reactevents/ReactEvent$DefaultImpls;->serialize(Lcom/discord/reactevents/ReactEvent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isAtBottom:Z

    iget-boolean v1, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearBottom:Z

    iget-boolean v2, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isNearTop:Z

    iget-boolean v3, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->dragging:Z

    iget-boolean v4, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->decelerating:Z

    iget-boolean v5, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->shouldShowJumpToPresent:Z

    iget-boolean v6, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->isFirstMessageVisible:Z

    iget v7, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->firstVisibleMessageIndex:I

    iget v8, p0, Lcom/discord/chat/reactevents/ChatScrollPositionEvent;->lastVisibleMessageIndex:I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "ChatScrollPositionEvent(isAtBottom="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isNearBottom="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isNearTop="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", dragging="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", decelerating="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowJumpToPresent="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isFirstMessageVisible="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", firstVisibleMessageIndex="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lastVisibleMessageIndex="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
