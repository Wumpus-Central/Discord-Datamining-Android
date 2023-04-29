.class public final Lcom/discord/chat/bridge/botuikit/ButtonComponent;
.super Lcom/discord/chat/bridge/botuikit/Component;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;,
        Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002FGB\u0082\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017Bp\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0014H\u00c6\u0003J\u000f\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u0019\u0010/\u001a\u00020\u0008H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0088\u0001\u00107\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109J\u0013\u0010:\u001a\u00020\u000f2\u0008\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\nH\u00d6\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u00c7\u0001R\u001c\u0010\u0007\u001a\u00020\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u001d\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006H"
    }
    d2 = {
        "Lcom/discord/chat/bridge/botuikit/ButtonComponent;",
        "Lcom/discord/chat/bridge/botuikit/Component;",
        "seen1",
        "",
        "type",
        "indices",
        "",
        "applicationId",
        "Lcom/discord/primitives/ApplicationId;",
        "customId",
        "",
        "label",
        "style",
        "Lcom/discord/chat/bridge/botuikit/ButtonStyle;",
        "disabled",
        "",
        "emoji",
        "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
        "url",
        "state",
        "Lcom/discord/chat/bridge/botuikit/ActionComponentState;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getApplicationId-VavddsQ",
        "()J",
        "J",
        "getCustomId",
        "()Ljava/lang/String;",
        "getDisabled",
        "()Z",
        "getEmoji",
        "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
        "getIndices",
        "()Ljava/util/List;",
        "getLabel",
        "getState",
        "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;",
        "getStyle",
        "()Lcom/discord/chat/bridge/botuikit/ButtonStyle;",
        "getType",
        "()I",
        "getUrl",
        "component1",
        "component10",
        "component2",
        "component3",
        "component3-VavddsQ",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "copy-onMGE3A",
        "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;",
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

.annotation runtime Lyi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;


# instance fields
.field private final applicationId:J

.field private final customId:Ljava/lang/String;

.field private final disabled:Z

.field private final emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

.field private final indices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/String;

.field private final state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

.field private final style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

.field private final type:I

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->Companion:Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;

    return-void
.end method

.method private constructor <init>(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/discord/primitives/ApplicationId;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ButtonStyle;",
            "Z",
            "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ActionComponentState;",
            "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
            ")V"
        }
    .end annotation

    and-int/lit16 p12, p1, 0x227

    const/16 v0, 0x227

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;

    invoke-virtual {p12}, Lcom/discord/chat/bridge/botuikit/ButtonComponent$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lbj/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 p12, 0x0

    invoke-direct {p0, p12}, Lcom/discord/chat/bridge/botuikit/Component;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->type:I

    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->indices:Ljava/util/List;

    invoke-virtual {p4}, Lcom/discord/primitives/ApplicationId;->unbox-impl()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    iput-object p12, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p12, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    :goto_1
    iput-object p7, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    goto :goto_2

    :cond_3
    iput-boolean p8, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object p12, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    :goto_3
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_5

    iput-object p12, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    :goto_4
    iput-object p11, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;-><init>(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ButtonStyle;",
            "Z",
            "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ActionComponentState;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/discord/chat/bridge/botuikit/Component;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput p1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->type:I

    .line 5
    iput-object p2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->indices:Ljava/util/List;

    .line 6
    iput-wide p3, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    .line 7
    iput-object p5, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    .line 10
    iput-boolean p8, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    .line 11
    iput-object p9, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 12
    iput-object p10, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v11, v1

    goto :goto_2

    :cond_2
    move/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    const/4 v15, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v6, p3

    move-object/from16 v10, p7

    move-object/from16 v14, p11

    .line 2
    invoke-direct/range {v3 .. v15}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;-><init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;-><init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)V

    return-void
.end method

.method public static synthetic copy-onMGE3A$default(Lcom/discord/chat/bridge/botuikit/ButtonComponent;ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;ILjava/lang/Object;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    goto :goto_2

    :cond_2
    move-wide v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p11

    :goto_9
    move p1, v2

    move-object p2, v3

    move-wide p3, v4

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->copy-onMGE3A(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/botuikit/ButtonComponent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 6

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
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lbj/f;

    .line 25
    .line 26
    sget-object v2, Lbj/m0;->a:Lbj/m0;

    .line 27
    .line 28
    invoke-direct {v0, v2}, Lbj/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-interface {p1, p2, v3, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    .line 40
    .line 41
    iget-wide v4, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    .line 42
    .line 43
    invoke-static {v4, v5}, Lcom/discord/primitives/ApplicationId;->box-impl(J)Lcom/discord/primitives/ApplicationId;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-interface {p1, p2, v4, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    :goto_0
    move v2, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v2, v1

    .line 66
    :goto_1
    if-eqz v2, :cond_2

    .line 67
    .line 68
    sget-object v2, Lbj/a2;->a:Lbj/a2;

    .line 69
    .line 70
    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    const/4 v0, 0x4

    .line 76
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    :goto_2
    move v2, v3

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v2, v1

    .line 90
    :goto_3
    if-eqz v2, :cond_5

    .line 91
    .line 92
    sget-object v2, Lbj/a2;->a:Lbj/a2;

    .line 93
    .line 94
    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    sget-object v0, Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;

    .line 100
    .line 101
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    .line 102
    .line 103
    const/4 v4, 0x5

    .line 104
    invoke-interface {p1, p2, v4, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x6

    .line 108
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_6

    .line 113
    .line 114
    :goto_4
    move v2, v3

    .line 115
    goto :goto_5

    .line 116
    :cond_6
    iget-boolean v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    .line 117
    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    move v2, v1

    .line 122
    :goto_5
    if-eqz v2, :cond_8

    .line 123
    .line 124
    iget-boolean v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    .line 125
    .line 126
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 127
    .line 128
    .line 129
    :cond_8
    const/4 v0, 0x7

    .line 130
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_9

    .line 135
    .line 136
    :goto_6
    move v2, v3

    .line 137
    goto :goto_7

    .line 138
    :cond_9
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 139
    .line 140
    if-eqz v2, :cond_a

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_a
    move v2, v1

    .line 144
    :goto_7
    if-eqz v2, :cond_b

    .line 145
    .line 146
    sget-object v2, Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;

    .line 147
    .line 148
    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 149
    .line 150
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_b
    const/16 v0, 0x8

    .line 154
    .line 155
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_c

    .line 160
    .line 161
    :goto_8
    move v1, v3

    .line 162
    goto :goto_9

    .line 163
    :cond_c
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    .line 164
    .line 165
    if-eqz v2, :cond_d

    .line 166
    .line 167
    goto :goto_8

    .line 168
    :cond_d
    :goto_9
    if-eqz v1, :cond_e

    .line 169
    .line 170
    sget-object v1, Lbj/a2;->a:Lbj/a2;

    .line 171
    .line 172
    iget-object v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_e
    sget-object v0, Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ActionComponentState$Serializer;

    .line 178
    .line 179
    iget-object p0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    .line 180
    .line 181
    const/16 v1, 0x9

    .line 182
    .line 183
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-void
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

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v0

    return v0
.end method

.method public final component10()Lcom/discord/chat/bridge/botuikit/ActionComponentState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final component3-VavddsQ()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/discord/chat/bridge/botuikit/ButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    return v0
.end method

.method public final component8()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-onMGE3A(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ButtonStyle;",
            "Z",
            "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/botuikit/ActionComponentState;",
            ")",
            "Lcom/discord/chat/bridge/botuikit/ButtonComponent;"
        }
    .end annotation

    const-string v0, "indices"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    const/4 v13, 0x0

    move-object v1, v0

    move v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v13}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;-><init>(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    iget-wide v5, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    invoke-static {v3, v4, v5, v6}, Lcom/discord/primitives/ApplicationId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    iget-object p1, p1, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getApplicationId-VavddsQ()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    return-wide v0
.end method

.method public final getCustomId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    return v0
.end method

.method public final getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    return-object v0
.end method

.method public getIndices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->indices:Ljava/util/List;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Lcom/discord/chat/bridge/botuikit/ActionComponentState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    return-object v0
.end method

.method public final getStyle()Lcom/discord/chat/bridge/botuikit/ButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->type:I

    return v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    invoke-static {v1, v2}, Lcom/discord/primitives/ApplicationId;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/discord/chat/bridge/botuikit/ComponentEmoji;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getType()I

    move-result v0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->getIndices()Ljava/util/List;

    move-result-object v1

    iget-wide v2, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->applicationId:J

    invoke-static {v2, v3}, Lcom/discord/primitives/ApplicationId;->toString-impl(J)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->customId:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->label:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->style:Lcom/discord/chat/bridge/botuikit/ButtonStyle;

    iget-boolean v6, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->disabled:Z

    iget-object v7, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    iget-object v8, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->url:Ljava/lang/String;

    iget-object v9, p0, Lcom/discord/chat/bridge/botuikit/ButtonComponent;->state:Lcom/discord/chat/bridge/botuikit/ActionComponentState;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ButtonComponent(type="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", indices="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", applicationId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", customId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disabled="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", emoji="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
