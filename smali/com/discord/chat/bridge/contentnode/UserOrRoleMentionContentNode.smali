.class public final Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;
.super Lcom/discord/chat/bridge/contentnode/MentionContentNode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;,
        Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002:;B\\\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012BP\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008#J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008&J\u0019\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008(J\u000f\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J^\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008+J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u00c7\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\n\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006<"
    }
    d2 = {
        "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;",
        "Lcom/discord/chat/bridge/contentnode/MentionContentNode;",
        "seen1",
        "",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "userId",
        "Lcom/discord/primitives/UserId;",
        "roleColor",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "roleId",
        "Lcom/discord/primitives/RoleId;",
        "content",
        "",
        "Lcom/discord/chat/bridge/contentnode/ContentNode;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getChannelId-qMVnFVQ",
        "()Lcom/discord/primitives/ChannelId;",
        "getContent",
        "()Ljava/util/List;",
        "getGuildId-qOKuAAo",
        "()Lcom/discord/primitives/GuildId;",
        "getRoleColor",
        "()I",
        "getRoleId-fYaclRY",
        "()Lcom/discord/primitives/RoleId;",
        "getUserId-wUX8bhU",
        "()Lcom/discord/primitives/UserId;",
        "component1",
        "component1-qMVnFVQ",
        "component2",
        "component2-wUX8bhU",
        "component3",
        "component4",
        "component4-qOKuAAo",
        "component5",
        "component5-fYaclRY",
        "component6",
        "copy",
        "copy-DZRaReU",
        "equals",
        "",
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
.field public static final Companion:Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;


# instance fields
.field private final channelId:Lcom/discord/primitives/ChannelId;

.field private final content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;"
        }
    .end annotation
.end field

.field private final guildId:Lcom/discord/primitives/GuildId;

.field private final roleColor:I

.field private final roleId:Lcom/discord/primitives/RoleId;

.field private final userId:Lcom/discord/primitives/UserId;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;

    return-void
.end method

.method private constructor <init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/discord/primitives/ChannelId;",
            "Lcom/discord/primitives/UserId;",
            "I",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/primitives/RoleId;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;",
            "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
            ")V"
        }
    .end annotation

    and-int/lit8 v0, p1, 0x20

    const/16 v1, 0x20

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0, p1, p8}, Lcom/discord/chat/bridge/contentnode/MentionContentNode;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x0

    if-nez p8, :cond_1

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput p2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    goto :goto_2

    :cond_3
    iput p4, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_5

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    :goto_4
    iput-object p7, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->content:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;-><init>(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/primitives/ChannelId;",
            "Lcom/discord/primitives/UserId;",
            "I",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/primitives/RoleId;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/discord/chat/bridge/contentnode/MentionContentNode;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    .line 5
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    .line 6
    iput p3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    .line 7
    iput-object p4, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    .line 8
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    .line 9
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->content:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p2

    :goto_1
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, p3

    :goto_2
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object v6, p4

    :goto_3
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_4

    move-object v7, v1

    goto :goto_4

    :cond_4
    move-object v7, p5

    :goto_4
    const/4 v9, 0x0

    move-object v2, p0

    move-object/from16 v8, p6

    .line 2
    invoke-direct/range {v2 .. v9}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;-><init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;-><init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy-DZRaReU$default(Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;ILjava/lang/Object;)Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object p6

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->copy-DZRaReU(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;)Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    invoke-static {p0, p1, p2}, Lcom/discord/chat/bridge/contentnode/MentionContentNode;->write$Self(Lcom/discord/chat/bridge/contentnode/MentionContentNode;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    :goto_0
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v0

    .line 35
    :goto_1
    if-eqz v1, :cond_2

    .line 36
    .line 37
    sget-object v1, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    .line 40
    .line 41
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    :goto_2
    move v1, v2

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    move v1, v0

    .line 58
    :goto_3
    if-eqz v1, :cond_5

    .line 59
    .line 60
    sget-object v1, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    .line 63
    .line 64
    invoke-interface {p1, p2, v2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    const/4 v1, 0x2

    .line 68
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_6

    .line 73
    .line 74
    :goto_4
    move v3, v2

    .line 75
    goto :goto_5

    .line 76
    :cond_6
    iget v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    .line 77
    .line 78
    if-eqz v3, :cond_7

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_7
    move v3, v0

    .line 82
    :goto_5
    if-eqz v3, :cond_8

    .line 83
    .line 84
    iget v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    .line 85
    .line 86
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 87
    .line 88
    .line 89
    :cond_8
    const/4 v1, 0x3

    .line 90
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_9

    .line 95
    .line 96
    :goto_6
    move v3, v2

    .line 97
    goto :goto_7

    .line 98
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    .line 99
    .line 100
    if-eqz v3, :cond_a

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_a
    move v3, v0

    .line 104
    :goto_7
    if-eqz v3, :cond_b

    .line 105
    .line 106
    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 107
    .line 108
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    .line 109
    .line 110
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_b
    const/4 v1, 0x4

    .line 114
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_c

    .line 119
    .line 120
    :goto_8
    move v0, v2

    .line 121
    goto :goto_9

    .line 122
    :cond_c
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    .line 123
    .line 124
    if-eqz v3, :cond_d

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_d
    :goto_9
    if-eqz v0, :cond_e

    .line 128
    .line 129
    sget-object v0, Lcom/discord/primitives/RoleId$$serializer;->INSTANCE:Lcom/discord/primitives/RoleId$$serializer;

    .line 130
    .line 131
    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    .line 132
    .line 133
    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_e
    new-instance v0, Lzi/f;

    .line 137
    .line 138
    sget-object v1, Lcom/discord/chat/bridge/contentnode/ContentNodeSerializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/ContentNodeSerializer;

    .line 139
    .line 140
    invoke-direct {v0, v1}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const/4 v1, 0x5

    .line 148
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void
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
.method public final component1-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public final component2-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    return v0
.end method

.method public final component4-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final component5-fYaclRY()Lcom/discord/primitives/RoleId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final copy-DZRaReU(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;)Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/primitives/ChannelId;",
            "Lcom/discord/primitives/UserId;",
            "I",
            "Lcom/discord/primitives/GuildId;",
            "Lcom/discord/primitives/RoleId;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;)",
            "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;-><init>(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    iget v3, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    return-object v0
.end method

.method public getContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->content:Ljava/util/List;

    return-object v0
.end method

.method public final getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final getRoleColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    return v0
.end method

.method public final getRoleId-fYaclRY()Lcom/discord/primitives/RoleId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    return-object v0
.end method

.method public final getUserId-wUX8bhU()Lcom/discord/primitives/UserId;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/discord/primitives/ChannelId;->hashCode-impl(J)I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

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

    iget v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/discord/primitives/RoleId;->unbox-impl()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/discord/primitives/RoleId;->hashCode-impl(J)I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->channelId:Lcom/discord/primitives/ChannelId;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->userId:Lcom/discord/primitives/UserId;

    iget v2, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleColor:I

    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->roleId:Lcom/discord/primitives/RoleId;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "UserOrRoleMentionContentNode(channelId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", roleColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", guildId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", roleId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
