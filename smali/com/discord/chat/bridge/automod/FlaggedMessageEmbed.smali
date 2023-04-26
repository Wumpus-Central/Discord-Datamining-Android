.class public final Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$$serializer;,
        Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00083\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002RSB\u0090\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019B\u0088\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u00104\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u0010\u001cJ\t\u00106\u001a\u00020\u0014H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0019\u00109\u001a\u00020\u0007H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010\u001eJ\u0019\u0010;\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008<J\u0019\u0010=\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008>J\u000b\u0010?\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u009e\u0001\u0010D\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010FJ\u0013\u0010G\u001a\u00020\u00142\u0008\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001J\t\u0010J\u001a\u00020\u000fH\u00d6\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u00c7\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001cR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\u0008!\u0010\"R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008(\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006T"
    }
    d2 = {
        "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;",
        "",
        "seen1",
        "",
        "id",
        "Lcom/discord/primitives/MessageId;",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "content",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "channelName",
        "",
        "username",
        "usernameColor",
        "roleColor",
        "shouldShowRoleDot",
        "",
        "avatarURL",
        "communicationDisabled",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAvatarURL",
        "()Ljava/lang/String;",
        "getChannelId-o4g7jtM",
        "()J",
        "J",
        "getChannelName",
        "getCommunicationDisabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getContent",
        "()Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "getGuildId-qOKuAAo",
        "()Lcom/discord/primitives/GuildId;",
        "getId-3Eiw7ao",
        "Ljava/lang/String;",
        "getRoleColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getShouldShowRoleDot",
        "()Z",
        "getUserId-wUX8bhU",
        "()Lcom/discord/primitives/UserId;",
        "getUsername",
        "getUsernameColor",
        "()I",
        "component1",
        "component1-3Eiw7ao",
        "component10",
        "component11",
        "component12",
        "component2",
        "component2-o4g7jtM",
        "component3",
        "component3-qOKuAAo",
        "component4",
        "component4-wUX8bhU",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-Yv-vreA",
        "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;",
        "equals",
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
.field public static final Companion:Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;


# instance fields
.field private final avatarURL:Ljava/lang/String;

.field private final channelId:J

.field private final channelName:Ljava/lang/String;

.field private final communicationDisabled:Ljava/lang/Boolean;

.field private final content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

.field private final guildId:Lcom/discord/primitives/GuildId;

.field private final id:Ljava/lang/String;

.field private final roleColor:Ljava/lang/Integer;

.field private final shouldShowRoleDot:Z

.field private final userId:Lcom/discord/primitives/UserId;

.field private final username:Ljava/lang/String;

.field private final usernameColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->Companion:Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$Companion;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0x283

    const/16 v0, 0x283

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$$serializer;

    invoke-virtual {p14}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    :goto_4
    iput p9, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    :goto_5
    iput-boolean p11, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p12, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    :goto_6
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_8

    .line 2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    iput-object p1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    goto :goto_7

    :cond_8
    iput-object p13, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    :goto_7
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p14}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;-><init>(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    .line 6
    iput-wide p2, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    .line 7
    iput-object p4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    .line 8
    iput-object p5, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    .line 9
    iput-object p6, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 10
    iput-object p7, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    .line 11
    iput-object p8, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    .line 12
    iput p9, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    .line 13
    iput-object p10, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    .line 14
    iput-boolean p11, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    .line 15
    iput-object p12, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    .line 16
    iput-object p13, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_6

    :cond_6
    move-object/from16 v15, p12

    :goto_6
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_7

    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v16, v0

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    const/16 v17, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-wide/from16 v5, p2

    move/from16 v12, p9

    move/from16 v14, p11

    .line 18
    invoke-direct/range {v3 .. v17}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;-><init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;-><init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy-Yv-vreA$default(Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p13

    :goto_b
    move-object p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->copy-Yv-vreA(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    sget-object v0, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 29
    .line 30
    iget-wide v3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-interface {p1, p2, v3, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    :goto_0
    move v1, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v1, v2

    .line 55
    :goto_1
    if-eqz v1, :cond_2

    .line 56
    .line 57
    sget-object v1, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 58
    .line 59
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    .line 60
    .line 61
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    const/4 v0, 0x3

    .line 65
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    :goto_2
    move v1, v3

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move v1, v2

    .line 79
    :goto_3
    if-eqz v1, :cond_5

    .line 80
    .line 81
    sget-object v1, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 82
    .line 83
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    .line 84
    .line 85
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    const/4 v0, 0x4

    .line 89
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    :goto_4
    move v1, v3

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 98
    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    move v1, v2

    .line 103
    :goto_5
    if-eqz v1, :cond_8

    .line 104
    .line 105
    sget-object v1, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    .line 106
    .line 107
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 108
    .line 109
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_8
    const/4 v0, 0x5

    .line 113
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_9

    .line 118
    .line 119
    :goto_6
    move v1, v3

    .line 120
    goto :goto_7

    .line 121
    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v1, :cond_a

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_a
    move v1, v2

    .line 127
    :goto_7
    if-eqz v1, :cond_b

    .line 128
    .line 129
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 130
    .line 131
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    .line 132
    .line 133
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    const/4 v0, 0x6

    .line 137
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_c

    .line 142
    .line 143
    :goto_8
    move v1, v3

    .line 144
    goto :goto_9

    .line 145
    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v1, :cond_d

    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_d
    move v1, v2

    .line 151
    :goto_9
    if-eqz v1, :cond_e

    .line 152
    .line 153
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 154
    .line 155
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    .line 156
    .line 157
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_e
    const/4 v0, 0x7

    .line 161
    iget v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    .line 162
    .line 163
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 164
    .line 165
    .line 166
    const/16 v0, 0x8

    .line 167
    .line 168
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_f

    .line 173
    .line 174
    :goto_a
    move v1, v3

    .line 175
    goto :goto_b

    .line 176
    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    .line 177
    .line 178
    if-eqz v1, :cond_10

    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_10
    move v1, v2

    .line 182
    :goto_b
    if-eqz v1, :cond_11

    .line 183
    .line 184
    sget-object v1, Lzi/m0;->a:Lzi/m0;

    .line 185
    .line 186
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_11
    const/16 v0, 0x9

    .line 192
    .line 193
    iget-boolean v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    .line 194
    .line 195
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 196
    .line 197
    .line 198
    const/16 v0, 0xa

    .line 199
    .line 200
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_12

    .line 205
    .line 206
    :goto_c
    move v1, v3

    .line 207
    goto :goto_d

    .line 208
    :cond_12
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v1, :cond_13

    .line 211
    .line 212
    goto :goto_c

    .line 213
    :cond_13
    move v1, v2

    .line 214
    :goto_d
    if-eqz v1, :cond_14

    .line 215
    .line 216
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 217
    .line 218
    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    .line 219
    .line 220
    invoke-interface {p1, p2, v0, v1, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_14
    const/16 v0, 0xb

    .line 224
    .line 225
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_15

    .line 230
    .line 231
    :goto_e
    move v2, v3

    .line 232
    goto :goto_f

    .line 233
    :cond_15
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    .line 234
    .line 235
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_16

    .line 242
    .line 243
    goto :goto_e

    .line 244
    :cond_16
    :goto_f
    if-eqz v2, :cond_17

    .line 245
    .line 246
    sget-object v1, Lzi/h;->a:Lzi/h;

    .line 247
    .line 248
    iget-object p0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_17
    return-void
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
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    return-wide v0
.end method

.method public final component3-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final component4-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    return v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy-Yv-vreA(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;
    .locals 16

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    const/4 v15, 0x0

    move-object v1, v0

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;-><init>(Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ChannelId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    iget v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAvatarURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelId-o4g7jtM()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    return-wide v0
.end method

.method public final getChannelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommunicationDisabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    return-object v0
.end method

.method public final getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final getId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoleColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShouldShowRoleDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    return v0
.end method

.method public final getUserId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsernameColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->id:Ljava/lang/String;

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->userId:Lcom/discord/primitives/UserId;

    iget-object v4, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->content:Lcom/discord/chat/bridge/structurabletext/StructurableText;

    iget-object v5, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->channelName:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->username:Ljava/lang/String;

    iget v7, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->usernameColor:I

    iget-object v8, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->roleColor:Ljava/lang/Integer;

    iget-boolean v9, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->shouldShowRoleDot:Z

    iget-object v10, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->avatarURL:Ljava/lang/String;

    iget-object v11, p0, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->communicationDisabled:Ljava/lang/Boolean;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "FlaggedMessageEmbed(id="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channelId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", guildId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channelName="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", username="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", usernameColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", roleColor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowRoleDot="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", avatarURL="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", communicationDisabled="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
