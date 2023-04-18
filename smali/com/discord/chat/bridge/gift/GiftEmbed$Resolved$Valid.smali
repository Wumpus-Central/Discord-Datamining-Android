.class public final Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Valid"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$$serializer;,
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008-\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002RSB\u00b9\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bB\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0015H\u00c6\u0003J\t\u0010;\u001a\u00020\u0017H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u00c9\u0001\u0010E\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010F\u001a\u00020\u00172\u0008\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001J\t\u0010J\u001a\u00020\u0005H\u00d6\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u00c7\u0001R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010!R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010!R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010!R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010!R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001eR\u0014\u0010\u0008\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010!R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010!\u00a8\u0006T"
    }
    d2 = {
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;",
        "seen1",
        "",
        "headerText",
        "",
        "headerColor",
        "backgroundColor",
        "thumbnailCornerRadius",
        "thumbnailUrl",
        "titleText",
        "titleColor",
        "subtitle",
        "subtitleColor",
        "bodyText",
        "bodyTextColor",
        "acceptLabelText",
        "acceptLabelColor",
        "acceptLabelBackgroundColor",
        "splashUrl",
        "splashOpacity",
        "",
        "canBeAccepted",
        "",
        "giftCode",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V",
        "getAcceptLabelBackgroundColor",
        "()I",
        "getAcceptLabelColor",
        "getAcceptLabelText",
        "()Ljava/lang/String;",
        "getBackgroundColor",
        "getBodyText",
        "getBodyTextColor",
        "getCanBeAccepted",
        "()Z",
        "getGiftCode",
        "getHeaderColor",
        "getHeaderText",
        "getSplashOpacity",
        "()F",
        "getSplashUrl",
        "getSubtitle",
        "getSubtitleColor",
        "getThumbnailCornerRadius",
        "getThumbnailUrl",
        "getTitleColor",
        "getTitleText",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
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
.field public static final Companion:Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;


# instance fields
.field private final acceptLabelBackgroundColor:I

.field private final acceptLabelColor:I

.field private final acceptLabelText:Ljava/lang/String;

.field private final backgroundColor:I

.field private final bodyText:Ljava/lang/String;

.field private final bodyTextColor:I

.field private final canBeAccepted:Z

.field private final giftCode:Ljava/lang/String;

.field private final headerColor:I

.field private final headerText:Ljava/lang/String;

.field private final splashOpacity:F

.field private final splashUrl:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleColor:I

.field private final thumbnailCornerRadius:I

.field private final thumbnailUrl:Ljava/lang/String;

.field private final titleColor:I

.field private final titleText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->Companion:Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 4

    move-object v0, p0

    move v1, p1

    const v2, 0x3b54f

    and-int v3, v1, v2

    if-eq v2, v3, :cond_0

    .line 1
    sget-object v3, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$$serializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$$serializer;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v3

    invoke-static {p1, v2, v3}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p2

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerText:Ljava/lang/String;

    move v2, p3

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerColor:I

    move v2, p4

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->backgroundColor:I

    move v2, p5

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailCornerRadius:I

    and-int/lit8 v2, v1, 0x10

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v2, p6

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailUrl:Ljava/lang/String;

    :goto_0
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_2

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleText:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p7

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleText:Ljava/lang/String;

    :goto_1
    move v2, p8

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleColor:I

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_3

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitle:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v2, p9

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitle:Ljava/lang/String;

    :goto_2
    move v2, p10

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitleColor:I

    and-int/lit16 v2, v1, 0x200

    if-nez v2, :cond_4

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object v2, p11

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    :goto_3
    move/from16 v2, p12

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    and-int/lit16 v2, v1, 0x800

    if-nez v2, :cond_5

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    :goto_4
    move/from16 v2, p14

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    move/from16 v2, p15

    iput v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    and-int/lit16 v1, v1, 0x4000

    if-nez v1, :cond_6

    iput-object v3, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    :goto_5
    move/from16 v1, p17

    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    move/from16 v1, p18

    iput-boolean v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p18

    const-string v3, "headerText"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "giftCode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerText:Ljava/lang/String;

    move v1, p2

    .line 4
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerColor:I

    move v1, p3

    .line 5
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->backgroundColor:I

    move v1, p4

    .line 6
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailCornerRadius:I

    move-object v1, p5

    .line 7
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailUrl:Ljava/lang/String;

    move-object v1, p6

    .line 8
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleText:Ljava/lang/String;

    move v1, p7

    .line 9
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleColor:I

    move-object v1, p8

    .line 10
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitle:Ljava/lang/String;

    move v1, p9

    .line 11
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitleColor:I

    move-object v1, p10

    .line 12
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    move v1, p11

    .line 13
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    move-object/from16 v1, p12

    .line 14
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    move/from16 v1, p13

    .line 15
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    move/from16 v1, p14

    .line 16
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    move/from16 v1, p16

    .line 18
    iput v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    move/from16 v1, p17

    .line 19
    iput-boolean v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    .line 20
    iput-object v2, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_4

    move-object v15, v2

    goto :goto_4

    :cond_4
    move-object/from16 v15, p12

    :goto_4
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_5

    move-object/from16 v18, v2

    goto :goto_5

    :cond_5
    move-object/from16 v18, p15

    :goto_5
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v10, p7

    move/from16 v12, p9

    move/from16 v14, p11

    move/from16 v16, p13

    move/from16 v17, p14

    move/from16 v19, p16

    move/from16 v20, p17

    move-object/from16 v21, p18

    .line 21
    invoke-direct/range {v3 .. v21}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;-><init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v4

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v5

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v8

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v10

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p16, v15

    if-eqz v16, :cond_10

    iget-boolean v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    goto :goto_10

    :cond_10
    move/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v1, v1, v16

    if-eqz v1, :cond_11

    iget-object v1, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    move-object/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move/from16 p13, v14

    move/from16 p17, v15

    move-object/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->copy(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    :goto_0
    move v3, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move v3, v1

    .line 65
    :goto_1
    if-eqz v3, :cond_2

    .line 66
    .line 67
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    const/4 v0, 0x5

    .line 77
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    :goto_2
    move v3, v2

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move v3, v1

    .line 93
    :goto_3
    if-eqz v3, :cond_5

    .line 94
    .line 95
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    const/4 v0, 0x6

    .line 105
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 110
    .line 111
    .line 112
    const/4 v0, 0x7

    .line 113
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    :goto_4
    move v3, v2

    .line 120
    goto :goto_5

    .line 121
    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-eqz v3, :cond_7

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    move v3, v1

    .line 129
    :goto_5
    if-eqz v3, :cond_8

    .line 130
    .line 131
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    const/16 v0, 0x8

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 147
    .line 148
    .line 149
    const/16 v0, 0x9

    .line 150
    .line 151
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_9

    .line 156
    .line 157
    :goto_6
    move v3, v2

    .line 158
    goto :goto_7

    .line 159
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v3, :cond_a

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_a
    move v3, v1

    .line 165
    :goto_7
    if-eqz v3, :cond_b

    .line 166
    .line 167
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 168
    .line 169
    iget-object v4, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_b
    const/16 v0, 0xa

    .line 175
    .line 176
    iget v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    .line 177
    .line 178
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 179
    .line 180
    .line 181
    const/16 v0, 0xb

    .line 182
    .line 183
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_c

    .line 188
    .line 189
    :goto_8
    move v3, v2

    .line 190
    goto :goto_9

    .line 191
    :cond_c
    iget-object v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v3, :cond_d

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_d
    move v3, v1

    .line 197
    :goto_9
    if-eqz v3, :cond_e

    .line 198
    .line 199
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 200
    .line 201
    iget-object v4, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    .line 202
    .line 203
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_e
    const/16 v0, 0xc

    .line 207
    .line 208
    iget v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    .line 209
    .line 210
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 211
    .line 212
    .line 213
    const/16 v0, 0xd

    .line 214
    .line 215
    iget v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    .line 216
    .line 217
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 218
    .line 219
    .line 220
    const/16 v0, 0xe

    .line 221
    .line 222
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_f

    .line 227
    .line 228
    :goto_a
    move v1, v2

    .line 229
    goto :goto_b

    .line 230
    :cond_f
    iget-object v3, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v3, :cond_10

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_10
    :goto_b
    if-eqz v1, :cond_11

    .line 236
    .line 237
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 238
    .line 239
    iget-object v2, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    .line 240
    .line 241
    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_11
    const/16 v0, 0xf

    .line 245
    .line 246
    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    .line 247
    .line 248
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->l(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V

    .line 249
    .line 250
    .line 251
    const/16 v0, 0x10

    .line 252
    .line 253
    iget-boolean v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    .line 254
    .line 255
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 256
    .line 257
    .line 258
    const/16 v0, 0x11

    .line 259
    .line 260
    iget-object p0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    .line 261
    .line 262
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-void
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

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    return v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()F
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v0

    return v0
.end method

.method public final component3()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v0

    return v0
.end method

.method public final component4()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v0

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component7()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v0

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component9()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v0

    return v0
.end method

.method public final copy(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;
    .locals 21

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v18, p18

    const-string v0, "headerText"

    move-object/from16 v19, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "giftCode"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v20, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-direct/range {v0 .. v18}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;-><init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V

    return-object v20
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v3

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v3

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v3

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    iget v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    iget v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    iget v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    iget v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAcceptLabelBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    return v0
.end method

.method public final getAcceptLabelColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    return v0
.end method

.method public final getAcceptLabelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    return-object v0
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->backgroundColor:I

    return v0
.end method

.method public final getBodyText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public final getBodyTextColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    return v0
.end method

.method public final getCanBeAccepted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    return v0
.end method

.method public final getGiftCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerColor:I

    return v0
.end method

.method public getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSplashOpacity()F
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    return v0
.end method

.method public final getSplashUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitleColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->subtitleColor:I

    return v0
.end method

.method public getThumbnailCornerRadius()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailCornerRadius:I

    return v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->thumbnailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleColor:I

    return v0
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->titleText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getHeaderColor()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getBackgroundColor()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailCornerRadius()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getTitleColor()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->getSubtitleColor()I

    move-result v9

    iget-object v10, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyText:Ljava/lang/String;

    iget v11, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->bodyTextColor:I

    iget-object v12, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelText:Ljava/lang/String;

    iget v13, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelColor:I

    iget v14, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->acceptLabelBackgroundColor:I

    iget-object v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashUrl:Ljava/lang/String;

    move-object/from16 v16, v15

    iget v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->splashOpacity:F

    move/from16 v17, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->canBeAccepted:Z

    move/from16 v18, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;->giftCode:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v15

    const-string v15, "Valid(headerText="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", headerColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", thumbnailCornerRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", thumbnailUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bodyText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bodyTextColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", acceptLabelText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", acceptLabelColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", acceptLabelBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", splashUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", splashOpacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", canBeAccepted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", giftCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
