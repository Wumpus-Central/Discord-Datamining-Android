.class public final Lcom/discord/chat/bridge/row/BlockedGroupRow;
.super Lcom/discord/chat/bridge/row/Row;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;,
        Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002<=Bo\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\t\u0010-\u001a\u00020\u000fH\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003Jk\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0001J\u0013\u00100\u001a\u00020\r2\u0008\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u00020\u000bH\u00d6\u0001J!\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%\u00a8\u0006>"
    }
    d2 = {
        "Lcom/discord/chat/bridge/row/BlockedGroupRow;",
        "Lcom/discord/chat/bridge/row/Row;",
        "seen1",
        "",
        "index",
        "changeType",
        "Lcom/discord/chat/bridge/ChangeType;",
        "color",
        "borderColor",
        "backgroundColor",
        "text",
        "",
        "revealed",
        "",
        "button",
        "Lcom/discord/chat/bridge/row/BlockedGroupButton;",
        "content",
        "",
        "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)V",
        "getBackgroundColor",
        "()I",
        "getBorderColor",
        "getButton",
        "()Lcom/discord/chat/bridge/row/BlockedGroupButton;",
        "getChangeType",
        "()Lcom/discord/chat/bridge/ChangeType;",
        "getColor",
        "getContent",
        "()Ljava/util/List;",
        "getIndex",
        "getRevealed",
        "()Z",
        "getText",
        "()Ljava/lang/String;",
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
.field public static final Companion:Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;


# instance fields
.field private final backgroundColor:I

.field private final borderColor:I

.field private final button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

.field private final changeType:Lcom/discord/chat/bridge/ChangeType;

.field private final color:I

.field private final content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
            ">;"
        }
    .end annotation
.end field

.field private final index:I

.field private final revealed:Z

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->Companion:Lcom/discord/chat/bridge/row/BlockedGroupRow$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;

    invoke-virtual {p11}, Lcom/discord/chat/bridge/row/BlockedGroupRow$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 p11, 0x0

    invoke-direct {p0, p11}, Lcom/discord/chat/bridge/row/Row;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->index:I

    iput-object p3, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    iput p4, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    iput p5, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    iput p6, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    iput-object p7, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    iput-object p9, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_1

    iput-object p11, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p10, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    :goto_0
    return-void
.end method

.method public constructor <init>(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/discord/chat/bridge/ChangeType;",
            "III",
            "Ljava/lang/String;",
            "Z",
            "Lcom/discord/chat/bridge/row/BlockedGroupButton;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "changeType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/discord/chat/bridge/row/Row;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput p1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->index:I

    .line 5
    iput-object p2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    .line 6
    iput p3, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    .line 7
    iput p4, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    .line 8
    iput p5, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    .line 9
    iput-object p6, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    .line 10
    iput-boolean p7, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    .line 11
    iput-object p8, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    .line 12
    iput-object p9, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    .line 2
    invoke-direct/range {v1 .. v10}, Lcom/discord/chat/bridge/row/BlockedGroupRow;-><init>(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/row/BlockedGroupRow;ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;ILjava/lang/Object;)Lcom/discord/chat/bridge/row/BlockedGroupRow;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move p1, v2

    move-object p2, v3

    move p3, v4

    move p4, v5

    move p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->copy(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)Lcom/discord/chat/bridge/row/BlockedGroupRow;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/row/BlockedGroupRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

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
    sget-object v0, Lcom/discord/chat/bridge/ChangeType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/ChangeType$Serializer;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-interface {p1, p2, v3, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    iget v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    .line 36
    .line 37
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    iget v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    .line 42
    .line 43
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    iget v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    .line 48
    .line 49
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x5

    .line 53
    iget-object v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x6

    .line 59
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    .line 60
    .line 61
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupButton$$serializer;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    .line 67
    .line 68
    const/4 v4, 0x7

    .line 69
    invoke-interface {p1, p2, v4, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/16 v0, 0x8

    .line 73
    .line 74
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    :goto_0
    move v1, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    iget-object v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 88
    .line 89
    new-instance v1, Lzi/f;

    .line 90
    .line 91
    sget-object v2, Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/BlockedGroupContent$$serializer;

    .line 92
    .line 93
    invoke-direct {v1, v2}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
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
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v0

    return v0
.end method

.method public final component2()Lcom/discord/chat/bridge/ChangeType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v0

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    return v0
.end method

.method public final component8()Lcom/discord/chat/bridge/row/BlockedGroupButton;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)Lcom/discord/chat/bridge/row/BlockedGroupRow;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/discord/chat/bridge/ChangeType;",
            "III",
            "Ljava/lang/String;",
            "Z",
            "Lcom/discord/chat/bridge/row/BlockedGroupButton;",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
            ">;)",
            "Lcom/discord/chat/bridge/row/BlockedGroupRow;"
        }
    .end annotation

    const-string v0, "changeType"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    move-object v1, v0

    move v2, p1

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/discord/chat/bridge/row/BlockedGroupRow;-><init>(ILcom/discord/chat/bridge/ChangeType;IIILjava/lang/String;ZLcom/discord/chat/bridge/row/BlockedGroupButton;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    iget v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    iget v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    iget v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    iget-object p1, p1, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    return v0
.end method

.method public final getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    return v0
.end method

.method public final getButton()Lcom/discord/chat/bridge/row/BlockedGroupButton;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    return-object v0
.end method

.method public getChangeType()Lcom/discord/chat/bridge/ChangeType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    return-object v0
.end method

.method public final getColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    return v0
.end method

.method public final getContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/chat/bridge/row/BlockedGroupContent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->index:I

    return v0
.end method

.method public final getRevealed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    invoke-virtual {v1}, Lcom/discord/chat/bridge/row/BlockedGroupButton;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getIndex()I

    move-result v0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/BlockedGroupRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v1

    iget v2, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->color:I

    iget v3, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->borderColor:I

    iget v4, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->backgroundColor:I

    iget-object v5, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->text:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->revealed:Z

    iget-object v7, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->button:Lcom/discord/chat/bridge/row/BlockedGroupButton;

    iget-object v8, p0, Lcom/discord/chat/bridge/row/BlockedGroupRow;->content:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "BlockedGroupRow(index="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", changeType="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", borderColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", revealed="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
