.class public final Lcom/discord/notifications/api/Sticker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/api/Sticker$$serializer;,
        Lcom/discord/notifications/api/Sticker$Companion;,
        Lcom/discord/notifications/api/Sticker$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u00080\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0088\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016Bf\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u00105\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u0010(J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0019\u00109\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008:J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0011H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJv\u0010@\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008A\u0010BJ\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010D\u001a\u00020\u00132\u0008\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\u0006\u0010G\u001a\u00020\u0007J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010I\u001a\u00020\u0013J\t\u0010J\u001a\u00020\u0007H\u00d6\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u00c7\u0001J\u0019\u0010R\u001a\u00020L2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u000c\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u0019\u001a\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u0019\u001a\u0004\u0008!\u0010\"R\'\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u0019\u001a\u0004\u0008$\u0010%R\'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0010\n\u0002\u0010)\u0012\u0004\u0008&\u0010\u0019\u001a\u0004\u0008\'\u0010(R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008*\u0010\u0019\u001a\u0004\u0008+\u0010\u001fR \u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010/\u0012\u0004\u0008,\u0010\u0019\u001a\u0004\u0008-\u0010.R\u001c\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00080\u0010\u0019\u001a\u0004\u00081\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00082\u0010\u0019\u001a\u0004\u00083\u00104\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006X"
    }
    d2 = {
        "Lcom/discord/notifications/api/Sticker;",
        "Landroid/os/Parcelable;",
        "seen1",
        "",
        "id",
        "Lcom/discord/primitives/StickerId;",
        "name",
        "",
        "packId",
        "",
        "guildId",
        "Lcom/discord/primitives/GuildId;",
        "description",
        "formatType",
        "Lcom/discord/notifications/api/StickerFormatType;",
        "tags",
        "type",
        "Lcom/discord/notifications/api/StickerType;",
        "available",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getAvailable$annotations",
        "()V",
        "getAvailable",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getDescription$annotations",
        "getDescription",
        "()Ljava/lang/String;",
        "getFormatType$annotations",
        "getFormatType",
        "()Lcom/discord/notifications/api/StickerFormatType;",
        "getGuildId-qOKuAAo$annotations",
        "getGuildId-qOKuAAo",
        "()Lcom/discord/primitives/GuildId;",
        "getId-e_wqtJY$annotations",
        "getId-e_wqtJY",
        "()J",
        "J",
        "getName$annotations",
        "getName",
        "getPackId$annotations",
        "getPackId",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getTags$annotations",
        "getTags",
        "getType$annotations",
        "getType",
        "()Lcom/discord/notifications/api/StickerType;",
        "component1",
        "component1-e_wqtJY",
        "component2",
        "component3",
        "component4",
        "component4-qOKuAAo",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-fJhvhH4",
        "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)Lcom/discord/notifications/api/Sticker;",
        "describeContents",
        "equals",
        "other",
        "",
        "getExtension",
        "hashCode",
        "isAnimated",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "writeToParcel",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "$serializer",
        "Companion",
        "notification_api_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/discord/notifications/api/Sticker;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/discord/notifications/api/Sticker$Companion;


# instance fields
.field private final available:Ljava/lang/Boolean;

.field private final description:Ljava/lang/String;

.field private final formatType:Lcom/discord/notifications/api/StickerFormatType;

.field private final guildId:Lcom/discord/primitives/GuildId;

.field private final id:J

.field private final name:Ljava/lang/String;

.field private final packId:Ljava/lang/Long;

.field private final tags:Ljava/lang/String;

.field private final type:Lcom/discord/notifications/api/StickerType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/notifications/api/Sticker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/notifications/api/Sticker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/notifications/api/Sticker;->Companion:Lcom/discord/notifications/api/Sticker$Companion;

    new-instance v0, Lcom/discord/notifications/api/Sticker$Creator;

    invoke-direct {v0}, Lcom/discord/notifications/api/Sticker$Creator;-><init>()V

    sput-object v0, Lcom/discord/notifications/api/Sticker;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p1, 0x2

    const/4 v0, 0x2

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/discord/notifications/api/Sticker$$serializer;->INSTANCE:Lcom/discord/notifications/api/Sticker$$serializer;

    invoke-virtual {p11}, Lcom/discord/notifications/api/Sticker$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lbj/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p11, p1, 0x1

    if-nez p11, :cond_1

    const-wide/16 v0, 0x0

    .line 2
    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->constructor-impl(J)J

    move-result-wide v0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p2}, Lcom/discord/primitives/StickerId;->unbox-impl()J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    iput-object p3, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const-string p4, ""

    if-nez p2, :cond_4

    iput-object p4, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    const/4 p5, 0x0

    if-nez p2, :cond_5

    .line 4
    sget-object p2, Lcom/discord/notifications/api/StickerFormatType;->Companion:Lcom/discord/notifications/api/StickerFormatType$Companion;

    invoke-virtual {p2, p5}, Lcom/discord/notifications/api/StickerFormatType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerFormatType;

    move-result-object p2

    .line 5
    iput-object p2, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p4, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    .line 6
    sget-object p2, Lcom/discord/notifications/api/StickerType;->Companion:Lcom/discord/notifications/api/StickerType$Companion;

    invoke-virtual {p2, p5}, Lcom/discord/notifications/api/StickerType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerType;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    :goto_7
    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lcom/discord/notifications/api/Sticker;-><init>(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-wide p1, p0, Lcom/discord/notifications/api/Sticker;->id:J

    .line 10
    iput-object p3, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    .line 12
    iput-object p5, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    .line 13
    iput-object p6, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    .line 14
    iput-object p7, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    .line 15
    iput-object p8, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    .line 16
    iput-object p9, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    .line 17
    iput-object p10, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    .line 18
    invoke-static {v1, v2}, Lcom/discord/primitives/StickerId;->constructor-impl(J)J

    move-result-wide v1

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x10

    const-string v3, ""

    if-eqz v1, :cond_3

    move-object v9, v3

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x20

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    .line 19
    sget-object v1, Lcom/discord/notifications/api/StickerFormatType;->Companion:Lcom/discord/notifications/api/StickerFormatType$Companion;

    invoke-virtual {v1, v6}, Lcom/discord/notifications/api/StickerFormatType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerFormatType;

    move-result-object v1

    move-object v10, v1

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v11, v3

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    .line 20
    sget-object v1, Lcom/discord/notifications/api/StickerType;->Companion:Lcom/discord/notifications/api/StickerType$Companion;

    invoke-virtual {v1, v6}, Lcom/discord/notifications/api/StickerType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerType;

    move-result-object v1

    move-object v12, v1

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    const/4 v14, 0x0

    move-object v3, p0

    move-object/from16 v6, p3

    .line 21
    invoke-direct/range {v3 .. v14}, Lcom/discord/notifications/api/Sticker;-><init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/discord/notifications/api/Sticker;-><init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy-fJhvhH4$default(Lcom/discord/notifications/api/Sticker;JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/discord/notifications/api/Sticker;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/discord/notifications/api/Sticker;->id:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p10

    :goto_8
    move-wide p1, v2

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/notifications/api/Sticker;->copy-fJhvhH4(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)Lcom/discord/notifications/api/Sticker;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAvailable$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getFormatType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGuildId-qOKuAAo$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getId-e_wqtJY$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPackId$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTags$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/notifications/api/Sticker;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 7

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
    iget-wide v3, p0, Lcom/discord/notifications/api/Sticker;->id:J

    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-static {v5, v6}, Lcom/discord/primitives/StickerId;->constructor-impl(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/StickerId;->equals-impl0(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v1, v0

    .line 42
    :goto_1
    if-eqz v1, :cond_2

    .line 43
    .line 44
    sget-object v1, Lcom/discord/primitives/StickerId$$serializer;->INSTANCE:Lcom/discord/primitives/StickerId$$serializer;

    .line 45
    .line 46
    iget-wide v3, p0, Lcom/discord/notifications/api/Sticker;->id:J

    .line 47
    .line 48
    invoke-static {v3, v4}, Lcom/discord/primitives/StickerId;->box-impl(J)Lcom/discord/primitives/StickerId;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, p2, v2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    :goto_2
    move v3, v2

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move v3, v0

    .line 75
    :goto_3
    if-eqz v3, :cond_5

    .line 76
    .line 77
    sget-object v3, Lbj/w0;->a:Lbj/w0;

    .line 78
    .line 79
    iget-object v4, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    .line 80
    .line 81
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    const/4 v1, 0x3

    .line 85
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_6

    .line 90
    .line 91
    :goto_4
    move v3, v2

    .line 92
    goto :goto_5

    .line 93
    :cond_6
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    .line 94
    .line 95
    if-eqz v3, :cond_7

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_7
    move v3, v0

    .line 99
    :goto_5
    if-eqz v3, :cond_8

    .line 100
    .line 101
    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 102
    .line 103
    iget-object v4, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    .line 104
    .line 105
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    const/4 v1, 0x4

    .line 109
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    if-eqz v3, :cond_9

    .line 116
    .line 117
    :goto_6
    move v3, v2

    .line 118
    goto :goto_7

    .line 119
    :cond_9
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_a

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    move v3, v0

    .line 129
    :goto_7
    if-eqz v3, :cond_b

    .line 130
    .line 131
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    .line 132
    .line 133
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    const/4 v1, 0x5

    .line 137
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_c

    .line 142
    .line 143
    :goto_8
    move v3, v2

    .line 144
    goto :goto_9

    .line 145
    :cond_c
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    .line 146
    .line 147
    sget-object v5, Lcom/discord/notifications/api/StickerFormatType;->Companion:Lcom/discord/notifications/api/StickerFormatType$Companion;

    .line 148
    .line 149
    invoke-virtual {v5, v0}, Lcom/discord/notifications/api/StickerFormatType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerFormatType;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-eq v3, v5, :cond_d

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_d
    move v3, v0

    .line 157
    :goto_9
    if-eqz v3, :cond_e

    .line 158
    .line 159
    sget-object v3, Lcom/discord/notifications/api/StickerFormatType$Serializer;->INSTANCE:Lcom/discord/notifications/api/StickerFormatType$Serializer;

    .line 160
    .line 161
    iget-object v5, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    .line 162
    .line 163
    invoke-interface {p1, p2, v1, v3, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_e
    const/4 v1, 0x6

    .line 167
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_f

    .line 172
    .line 173
    :goto_a
    move v3, v2

    .line 174
    goto :goto_b

    .line 175
    :cond_f
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_10

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_10
    move v3, v0

    .line 185
    :goto_b
    if-eqz v3, :cond_11

    .line 186
    .line 187
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    .line 188
    .line 189
    invoke-interface {p1, p2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_11
    const/4 v1, 0x7

    .line 193
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_12

    .line 198
    .line 199
    :goto_c
    move v3, v2

    .line 200
    goto :goto_d

    .line 201
    :cond_12
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    .line 202
    .line 203
    sget-object v4, Lcom/discord/notifications/api/StickerType;->Companion:Lcom/discord/notifications/api/StickerType$Companion;

    .line 204
    .line 205
    invoke-virtual {v4, v0}, Lcom/discord/notifications/api/StickerType$Companion;->fromInt(I)Lcom/discord/notifications/api/StickerType;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-eq v3, v4, :cond_13

    .line 210
    .line 211
    goto :goto_c

    .line 212
    :cond_13
    move v3, v0

    .line 213
    :goto_d
    if-eqz v3, :cond_14

    .line 214
    .line 215
    sget-object v3, Lcom/discord/notifications/api/StickerType$Serializer;->INSTANCE:Lcom/discord/notifications/api/StickerType$Serializer;

    .line 216
    .line 217
    iget-object v4, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    .line 218
    .line 219
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_14
    const/16 v1, 0x8

    .line 223
    .line 224
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_15

    .line 229
    .line 230
    :goto_e
    move v0, v2

    .line 231
    goto :goto_f

    .line 232
    :cond_15
    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    .line 233
    .line 234
    if-eqz v3, :cond_16

    .line 235
    .line 236
    goto :goto_e

    .line 237
    :cond_16
    :goto_f
    if-eqz v0, :cond_17

    .line 238
    .line 239
    sget-object v0, Lbj/h;->a:Lbj/h;

    .line 240
    .line 241
    iget-object p0, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_17
    return-void
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
.end method


# virtual methods
.method public final component1-e_wqtJY()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/discord/notifications/api/StickerFormatType;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/discord/notifications/api/StickerType;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy-fJhvhH4(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)Lcom/discord/notifications/api/Sticker;
    .locals 13

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/notifications/api/Sticker;

    const/4 v12, 0x0

    move-object v1, v0

    move-wide v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/discord/notifications/api/Sticker;-><init>(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/notifications/api/Sticker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/notifications/api/Sticker;

    iget-wide v3, p0, Lcom/discord/notifications/api/Sticker;->id:J

    iget-wide v5, p1, Lcom/discord/notifications/api/Sticker;->id:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/StickerId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    iget-object v3, p1, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAvailable()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getExtension()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    .line 2
    .line 3
    sget-object v1, Lcom/discord/notifications/api/Sticker$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const-string v0, ".json"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Lnf/q;

    .line 27
    .line 28
    invoke-direct {v0}, Lnf/q;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    const-string v0, ".png"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-string v0, ""

    .line 36
    .line 37
    :goto_0
    return-object v0
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
.end method

.method public final getFormatType()Lcom/discord/notifications/api/StickerFormatType;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    return-object v0
.end method

.method public final getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    return-object v0
.end method

.method public final getId-e_wqtJY()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getTags()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/discord/notifications/api/StickerType;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->hashCode-impl(J)I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final isAnimated()Z
    .locals 2

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    sget-object v1, Lcom/discord/notifications/api/StickerFormatType;->APNG:Lcom/discord/notifications/api/StickerFormatType;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/discord/notifications/api/StickerFormatType;->LOTTIE:Lcom/discord/notifications/api/StickerFormatType;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    iget-object v3, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    iget-object v4, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    iget-object v6, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    iget-object v7, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    iget-object v8, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Sticker(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", packId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", guildId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", formatType="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tags="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", available="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/discord/notifications/api/Sticker;->id:J

    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->box-impl(J)Lcom/discord/primitives/StickerId;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->packId:Ljava/lang/Long;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-object v0, p0, Lcom/discord/notifications/api/Sticker;->guildId:Lcom/discord/primitives/GuildId;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/discord/notifications/api/Sticker;->description:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/discord/notifications/api/Sticker;->formatType:Lcom/discord/notifications/api/StickerFormatType;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/discord/notifications/api/Sticker;->tags:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/discord/notifications/api/Sticker;->type:Lcom/discord/notifications/api/StickerType;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/discord/notifications/api/Sticker;->available:Ljava/lang/Boolean;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    return-void
.end method
