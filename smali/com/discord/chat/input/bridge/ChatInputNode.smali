.class public final Lcom/discord/chat/input/bridge/ChatInputNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/input/bridge/ChatInputNode$$serializer;,
        Lcom/discord/chat/input/bridge/ChatInputNode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000212BU\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003JS\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020\n2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J!\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u00c7\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016\u00a8\u00063"
    }
    d2 = {
        "Lcom/discord/chat/input/bridge/ChatInputNode;",
        "",
        "seen1",
        "",
        "type",
        "location",
        "length",
        "style",
        "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;",
        "deleteNodeOnBackspace",
        "",
        "tapAction",
        "Lcom/discord/chat/input/bridge/TapAction;",
        "editDisabled",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IIIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V",
        "getDeleteNodeOnBackspace",
        "()Z",
        "getEditDisabled",
        "getLength",
        "()I",
        "getLocation",
        "getStyle",
        "()Lcom/discord/chat/input/bridge/ChatInputNodeStyle;",
        "getTapAction",
        "()Lcom/discord/chat/input/bridge/TapAction;",
        "getType",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
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
        "chat_input_release"
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
.field public static final Companion:Lcom/discord/chat/input/bridge/ChatInputNode$Companion;


# instance fields
.field private final deleteNodeOnBackspace:Z

.field private final editDisabled:Z

.field private final length:I

.field private final location:I

.field private final style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

.field private final tapAction:Lcom/discord/chat/input/bridge/TapAction;

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/input/bridge/ChatInputNode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/input/bridge/ChatInputNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/input/bridge/ChatInputNode;->Companion:Lcom/discord/chat/input/bridge/ChatInputNode$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IIIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/discord/chat/input/bridge/ChatInputNode$$serializer;->INSTANCE:Lcom/discord/chat/input/bridge/ChatInputNode$$serializer;

    invoke-virtual {p9}, Lcom/discord/chat/input/bridge/ChatInputNode$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    iput p3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    iput p4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    const/4 p4, 0x0

    if-nez p2, :cond_2

    iput-boolean p4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    goto :goto_1

    :cond_2
    iput-boolean p6, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-boolean p4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    goto :goto_3

    :cond_4
    iput-boolean p8, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    :goto_3
    return-void
.end method

.method public constructor <init>(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    .line 4
    iput p2, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    .line 5
    iput p3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    .line 6
    iput-object p4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    .line 7
    iput-boolean p5, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    .line 8
    iput-object p6, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    .line 9
    iput-boolean p7, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p8, 0x10

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move v7, v2

    goto :goto_1

    :cond_1
    move v7, p5

    :goto_1
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_3

    move v9, v2

    goto :goto_3

    :cond_3
    move/from16 v9, p7

    :goto_3
    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    .line 10
    invoke-direct/range {v2 .. v9}, Lcom/discord/chat/input/bridge/ChatInputNode;-><init>(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/input/bridge/ChatInputNode;IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZILjava/lang/Object;)Lcom/discord/chat/input/bridge/ChatInputNode;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    :cond_1
    move p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-boolean p7, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    :cond_6
    move v4, p7

    move-object p2, p0

    move p3, p1

    move p4, p9

    move p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    move p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/discord/chat/input/bridge/ChatInputNode;->copy(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)Lcom/discord/chat/input/bridge/ChatInputNode;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/input/bridge/ChatInputNode;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iget v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    .line 30
    .line 31
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    :goto_0
    move v3, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v3, v1

    .line 49
    :goto_1
    if-eqz v3, :cond_2

    .line 50
    .line 51
    sget-object v3, Lcom/discord/chat/input/bridge/ChatInputNodeStyle$$serializer;->INSTANCE:Lcom/discord/chat/input/bridge/ChatInputNodeStyle$$serializer;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    .line 54
    .line 55
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    const/4 v0, 0x4

    .line 59
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    :goto_2
    move v3, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget-boolean v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v3, v1

    .line 73
    :goto_3
    if-eqz v3, :cond_5

    .line 74
    .line 75
    iget-boolean v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    .line 76
    .line 77
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 78
    .line 79
    .line 80
    :cond_5
    const/4 v0, 0x5

    .line 81
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    :goto_4
    move v3, v2

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    .line 90
    .line 91
    if-eqz v3, :cond_7

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    move v3, v1

    .line 95
    :goto_5
    if-eqz v3, :cond_8

    .line 96
    .line 97
    sget-object v3, Lcom/discord/chat/input/bridge/TapAction$$serializer;->INSTANCE:Lcom/discord/chat/input/bridge/TapAction$$serializer;

    .line 98
    .line 99
    iget-object v4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    .line 100
    .line 101
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    const/4 v0, 0x6

    .line 105
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_9

    .line 110
    .line 111
    :goto_6
    move v1, v2

    .line 112
    goto :goto_7

    .line 113
    :cond_9
    iget-boolean v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    .line 114
    .line 115
    if-eqz v3, :cond_a

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    .line 119
    .line 120
    iget-boolean p0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    .line 121
    .line 122
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 123
    .line 124
    .line 125
    :cond_b
    return-void
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

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    return v0
.end method

.method public final component4()Lcom/discord/chat/input/bridge/ChatInputNodeStyle;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    return v0
.end method

.method public final component6()Lcom/discord/chat/input/bridge/TapAction;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    return v0
.end method

.method public final copy(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)Lcom/discord/chat/input/bridge/ChatInputNode;
    .locals 9

    new-instance v8, Lcom/discord/chat/input/bridge/ChatInputNode;

    move-object v0, v8

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/input/bridge/ChatInputNode;-><init>(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V

    return-object v8
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/input/bridge/ChatInputNode;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/input/bridge/ChatInputNode;

    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    iget v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    iget v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    iget v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    iget-object v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    iget-boolean v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    iget-object v3, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    iget-boolean p1, p1, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDeleteNodeOnBackspace()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    return v0
.end method

.method public final getEditDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    return v0
.end method

.method public final getLength()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    return v0
.end method

.method public final getLocation()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    return v0
.end method

.method public final getStyle()Lcom/discord/chat/input/bridge/ChatInputNodeStyle;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    return-object v0
.end method

.method public final getTapAction()Lcom/discord/chat/input/bridge/TapAction;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/discord/chat/input/bridge/ChatInputNodeStyle;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/discord/chat/input/bridge/TapAction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v3, v1

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->type:I

    iget v1, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->location:I

    iget v2, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->length:I

    iget-object v3, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->style:Lcom/discord/chat/input/bridge/ChatInputNodeStyle;

    iget-boolean v4, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->deleteNodeOnBackspace:Z

    iget-object v5, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->tapAction:Lcom/discord/chat/input/bridge/TapAction;

    iget-boolean v6, p0, Lcom/discord/chat/input/bridge/ChatInputNode;->editDisabled:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ChatInputNode(type="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", length="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteNodeOnBackspace="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", tapAction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", editDisabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
