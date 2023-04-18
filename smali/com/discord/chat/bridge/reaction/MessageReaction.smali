.class public final Lcom/discord/chat/bridge/reaction/MessageReaction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactions/ReactionView$Reaction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;,
        Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000223BY\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JG\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00062\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u00c7\u0001R\u001c\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001a\u0010\u0013\u001a\u0004\u0008\u0007\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u00064"
    }
    d2 = {
        "Lcom/discord/chat/bridge/reaction/MessageReaction;",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "seen1",
        "",
        "count",
        "me",
        "",
        "isMeBurst",
        "emoji",
        "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;",
        "burstCount",
        "themedBurstColors",
        "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;",
        "isMe",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V",
        "getBurstCount$annotations",
        "()V",
        "getBurstCount",
        "()I",
        "getCount",
        "getEmoji",
        "()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;",
        "()Z",
        "isMeBurst$annotations",
        "getMe",
        "getThemedBurstColors",
        "()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
.field public static final Companion:Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;


# instance fields
.field private final burstCount:I

.field private final count:I

.field private final emoji:Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

.field private final isMe:Z

.field private final isMeBurst:Z

.field private final me:Z

.field private final themedBurstColors:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/reaction/MessageReaction;->Companion:Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IIZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0xb

    const/16 v0, 0xb

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;

    invoke-virtual {p9}, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->count:I

    iput-boolean p3, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    and-int/lit8 p2, p1, 0x4

    const/4 p9, 0x0

    if-nez p2, :cond_1

    iput-boolean p9, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst:Z

    goto :goto_0

    :cond_1
    iput-boolean p4, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst:Z

    :goto_0
    iput-object p5, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->emoji:Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput p9, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->burstCount:I

    goto :goto_1

    :cond_2
    iput p6, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->burstCount:I

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->themedBurstColors:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->themedBurstColors:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-boolean p3, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe:Z

    goto :goto_3

    :cond_4
    iput-boolean p8, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe:Z

    :goto_3
    return-void
.end method

.method public constructor <init>(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V
    .locals 1

    const-string v0, "emoji"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->count:I

    .line 4
    iput-boolean p2, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst:Z

    .line 6
    iput-object p4, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->emoji:Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    .line 7
    iput p5, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->burstCount:I

    .line 8
    iput-object p6, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->themedBurstColors:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    .line 9
    iput-boolean p2, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    move v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v6, p4

    .line 10
    invoke-direct/range {v2 .. v8}, Lcom/discord/chat/bridge/reaction/MessageReaction;-><init>(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/reaction/MessageReaction;IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ILjava/lang/Object;)Lcom/discord/chat/bridge/reaction/MessageReaction;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result p3

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object p4

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result p5

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object p6

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/chat/bridge/reaction/MessageReaction;->copy(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)Lcom/discord/chat/bridge/reaction/MessageReaction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBurstCount$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isMeBurst$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/reaction/MessageReaction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

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
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    :goto_0
    move v3, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v3, v1

    .line 47
    :goto_1
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 54
    .line 55
    .line 56
    :cond_2
    sget-object v0, Lcom/discord/chat/bridge/reaction/MessageReactionEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReactionEmoji$$serializer;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v4, 0x3

    .line 63
    invoke-interface {p1, p2, v4, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    :goto_2
    move v3, v2

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move v3, v1

    .line 83
    :goto_3
    if-eqz v3, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 90
    .line 91
    .line 92
    :cond_5
    const/4 v0, 0x5

    .line 93
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    :goto_4
    move v3, v2

    .line 100
    goto :goto_5

    .line 101
    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_7

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    move v3, v1

    .line 109
    :goto_5
    if-eqz v3, :cond_8

    .line 110
    .line 111
    sget-object v3, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    const/4 v0, 0x6

    .line 121
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_9

    .line 126
    .line 127
    :goto_6
    move v1, v2

    .line 128
    goto :goto_7

    .line 129
    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    iget-boolean v4, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    .line 134
    .line 135
    if-eq v3, v4, :cond_a

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 145
    .line 146
    .line 147
    :cond_b
    return-void
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
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result v0

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result v0

    return v0
.end method

.method public final component4()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v0

    return-object v0
.end method

.method public final component5()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result v0

    return v0
.end method

.method public final component6()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public final copy(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)Lcom/discord/chat/bridge/reaction/MessageReaction;
    .locals 8

    const-string v0, "emoji"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/reaction/MessageReaction;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/discord/chat/bridge/reaction/MessageReaction;-><init>(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/reaction/MessageReaction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/reaction/MessageReaction;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getBurstCount()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->burstCount:I

    return v0
.end method

.method public getCount()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->count:I

    return v0
.end method

.method public getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->emoji:Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    return-object v0
.end method

.method public bridge synthetic getEmoji()Lcom/discord/reactions/ReactionView$Emoji;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()Ljava/lang/Long;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;->getItemId(Lcom/discord/reactions/ReactionView$Reaction;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getItemId()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getItemId()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final getMe()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    return v0
.end method

.method public getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->themedBurstColors:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    return-object v0
.end method

.method public bridge synthetic getThemedBurstColors()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public isBurstReaction()Z
    .locals 1

    invoke-static {p0}, Lcom/discord/reactions/ReactionView$Reaction$DefaultImpls;->isBurstReaction(Lcom/discord/reactions/ReactionView$Reaction;)Z

    move-result v0

    return v0
.end method

.method public isMe()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMe:Z

    return v0
.end method

.method public isMeBurst()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getCount()I

    move-result v0

    iget-boolean v1, p0, Lcom/discord/chat/bridge/reaction/MessageReaction;->me:Z

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->isMeBurst()Z

    move-result v2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getEmoji()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;

    move-result-object v3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getBurstCount()I

    move-result v4

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/MessageReaction;->getThemedBurstColors()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MessageReaction(count="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", me="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isMeBurst="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", emoji="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", burstCount="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", themedBurstColors="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
