.class public final Lcom/discord/chat/bridge/contentnode/CommandOnClick;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;,
        Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000278BX\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011BP\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008 J\u001b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010\u0014J\u0019\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008$J\u000b\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0019\u0010&\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008\'J^\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*J\u0013\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u00c7\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001e\u0010\u0008\u001a\u0004\u0018\u00010\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00069"
    }
    d2 = {
        "Lcom/discord/chat/bridge/contentnode/CommandOnClick;",
        "",
        "seen1",
        "",
        "action",
        "",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "applicationUserId",
        "messageType",
        "Lcom/discord/chat/bridge/MessageType;",
        "messageChannelId",
        "Lcom/discord/primitives/ChannelId;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAction",
        "()Ljava/lang/String;",
        "getApplicationUserId-wUX8bhU",
        "()Lcom/discord/primitives/UserId;",
        "getMessageChannelId-qMVnFVQ",
        "()Lcom/discord/primitives/ChannelId;",
        "getMessageId-N_6c4I0",
        "Ljava/lang/String;",
        "getMessageType",
        "()Lcom/discord/chat/bridge/MessageType;",
        "getUserId-wUX8bhU",
        "component1",
        "component2",
        "component2-wUX8bhU",
        "component3",
        "component3-N_6c4I0",
        "component4",
        "component4-wUX8bhU",
        "component5",
        "component6",
        "component6-qMVnFVQ",
        "copy",
        "copy-jIMHauk",
        "(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;",
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

.annotation runtime Lyi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;


# instance fields
.field private final action:Ljava/lang/String;

.field private final applicationUserId:Lcom/discord/primitives/UserId;

.field private final messageChannelId:Lcom/discord/primitives/ChannelId;

.field private final messageId:Ljava/lang/String;

.field private final messageType:Lcom/discord/chat/bridge/MessageType;

.field private final userId:Lcom/discord/primitives/UserId;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->Companion:Lcom/discord/chat/bridge/contentnode/CommandOnClick$Companion;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x0

    if-eqz p8, :cond_0

    .line 1
    sget-object p8, Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;

    invoke-virtual {p8}, Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p8

    const/4 v0, 0x0

    invoke-static {p1, v0, p8}, Lbj/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x0

    if-nez p8, :cond_1

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_6

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    goto :goto_5

    :cond_6
    iput-object p7, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    :goto_5
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;-><init>(ILjava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    .line 5
    iput-object p3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    .line 7
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    .line 8
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    move-object v4, p4

    :goto_3
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_4

    move-object v5, v1

    goto :goto_4

    :cond_4
    move-object v5, p5

    :goto_4
    and-int/lit8 v6, p7, 0x20

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, p6

    :goto_5
    const/4 v6, 0x0

    move-object p1, p0

    move-object p2, v0

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object p7, v1

    move-object p8, v6

    .line 9
    invoke-direct/range {p1 .. p8}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;-><init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;-><init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)V

    return-void
.end method

.method public static synthetic copy-jIMHauk$default(Lcom/discord/chat/bridge/contentnode/CommandOnClick;Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;ILjava/lang/Object;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->copy-jIMHauk(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

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
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

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
    sget-object v1, Lbj/a2;->a:Lbj/a2;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

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
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

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
    sget-object v1, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    .line 60
    .line 61
    invoke-interface {p1, p2, v2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_5
    const/4 v1, 0x2

    .line 65
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

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
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

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
    if-eqz v3, :cond_9

    .line 80
    .line 81
    sget-object v3, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    .line 82
    .line 83
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v4, :cond_8

    .line 86
    .line 87
    invoke-static {v4}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    goto :goto_6

    .line 92
    :cond_8
    const/4 v4, 0x0

    .line 93
    :goto_6
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_9
    const/4 v1, 0x3

    .line 97
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_a

    .line 102
    .line 103
    :goto_7
    move v3, v2

    .line 104
    goto :goto_8

    .line 105
    :cond_a
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    .line 106
    .line 107
    if-eqz v3, :cond_b

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_b
    move v3, v0

    .line 111
    :goto_8
    if-eqz v3, :cond_c

    .line 112
    .line 113
    sget-object v3, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 114
    .line 115
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    .line 116
    .line 117
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_c
    const/4 v1, 0x4

    .line 121
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_d

    .line 126
    .line 127
    :goto_9
    move v3, v2

    .line 128
    goto :goto_a

    .line 129
    :cond_d
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    .line 130
    .line 131
    if-eqz v3, :cond_e

    .line 132
    .line 133
    goto :goto_9

    .line 134
    :cond_e
    move v3, v0

    .line 135
    :goto_a
    if-eqz v3, :cond_f

    .line 136
    .line 137
    sget-object v3, Lcom/discord/chat/bridge/MessageType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Serializer;

    .line 138
    .line 139
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    .line 140
    .line 141
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_f
    const/4 v1, 0x5

    .line 145
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_10

    .line 150
    .line 151
    :goto_b
    move v0, v2

    .line 152
    goto :goto_c

    .line 153
    :cond_10
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    .line 154
    .line 155
    if-eqz v3, :cond_11

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_11
    :goto_c
    if-eqz v0, :cond_12

    .line 159
    .line 160
    sget-object v0, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 161
    .line 162
    iget-object p0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    .line 163
    .line 164
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_12
    return-void
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

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    return-object v0
.end method

.method public final component2-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component3-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/MessageType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    return-object v0
.end method

.method public final component6-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final copy-jIMHauk(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;)Lcom/discord/chat/bridge/contentnode/CommandOnClick;
    .locals 9

    new-instance v8, Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;-><init>(Ljava/lang/String;Lcom/discord/primitives/UserId;Ljava/lang/String;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/MessageType;Lcom/discord/primitives/ChannelId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    if-nez v1, :cond_4

    if-nez v3, :cond_5

    move v1, v0

    goto :goto_0

    :cond_4
    if-nez v3, :cond_6

    :cond_5
    move v1, v2

    goto :goto_0

    :cond_6
    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    iget-object p1, p1, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    return-object v0
.end method

.method public final getApplicationUserId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final getMessageChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final getMessageId-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageType()Lcom/discord/chat/bridge/MessageType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    return-object v0
.end method

.method public final getUserId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v2}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->action:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->userId:Lcom/discord/primitives/UserId;

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageId:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->applicationUserId:Lcom/discord/primitives/UserId;

    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageType:Lcom/discord/chat/bridge/MessageType;

    iget-object v5, p0, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->messageChannelId:Lcom/discord/primitives/ChannelId;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CommandOnClick(action="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", applicationUserId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageChannelId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
