.class public final Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageBundleHeader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;,
        Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \'2\u00020\u0001:\u0002&\'BS\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\rBG\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u001c\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\tH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JK\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001c\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u00c7\u0001R%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0008j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012\u00a8\u0006("
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;",
        "",
        "seen1",
        "",
        "channelIconURL",
        "",
        "chatIconURL",
        "avatarURLs",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "channelName",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V",
        "getAvatarURLs",
        "()Ljava/util/ArrayList;",
        "getChannelIconURL",
        "()Ljava/lang/String;",
        "getChannelName",
        "getChatIconURL",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field public static final Companion:Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;


# instance fields
.field private final avatarURLs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final channelIconURL:Ljava/lang/String;

.field private final channelName:Ljava/lang/String;

.field private final chatIconURL:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->Companion:Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x0

    if-eqz p6, :cond_0

    .line 1
    sget-object p6, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;->INSTANCE:Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;

    invoke-virtual {p6}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p6

    const/4 v0, 0x0

    invoke-static {p1, v0, p6}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_1

    iput-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    :goto_3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    .line 6
    iput-object p4, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    const/4 v0, 0x0

    .line 17
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :goto_0
    move v1, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v0

    .line 32
    :goto_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    :goto_2
    move v1, v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    move v1, v0

    .line 55
    :goto_3
    if-eqz v1, :cond_5

    .line 56
    .line 57
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {p1, p2, v2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_5
    const/4 v1, 0x2

    .line 65
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    :goto_4
    move v3, v2

    .line 72
    goto :goto_5

    .line 73
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-eqz v3, :cond_7

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_7
    move v3, v0

    .line 79
    :goto_5
    if-eqz v3, :cond_8

    .line 80
    .line 81
    new-instance v3, Lzi/f;

    .line 82
    .line 83
    sget-object v4, Lzi/a2;->a:Lzi/a2;

    .line 84
    .line 85
    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_8
    const/4 v1, 0x3

    .line 94
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_9

    .line 99
    .line 100
    :goto_6
    move v0, v2

    .line 101
    goto :goto_7

    .line 102
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v3, :cond_a

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    .line 108
    .line 109
    sget-object v0, Lzi/a2;->a:Lzi/a2;

    .line 110
    .line 111
    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_b
    return-void
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
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;"
        }
    .end annotation

    new-instance v0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAvatarURLs()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getChannelIconURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final getChatIconURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelIconURL:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->chatIconURL:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->avatarURLs:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;->channelName:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MessageBundleHeader(channelIconURL="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", chatIconURL="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", avatarURLs="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channelName="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
