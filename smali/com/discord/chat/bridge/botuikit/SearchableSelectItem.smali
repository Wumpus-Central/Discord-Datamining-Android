.class public final Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;
.super Lcom/discord/chat/bridge/botuikit/SelectItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$$serializer;,
        Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000201BS\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eBA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013JP\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u00c7\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016\u00a8\u00062"
    }
    d2 = {
        "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;",
        "Lcom/discord/chat/bridge/botuikit/SelectItem;",
        "seen1",
        "",
        "label",
        "",
        "value",
        "emoji",
        "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
        "type",
        "iconSrc",
        "iconColor",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V",
        "getEmoji",
        "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;",
        "getIconColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getIconSrc",
        "()Ljava/lang/String;",
        "getLabel",
        "getType",
        "()I",
        "getValue",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;",
        "equals",
        "",
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
.field public static final Companion:Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;


# instance fields
.field private final emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

.field private final iconColor:Ljava/lang/Integer;

.field private final iconSrc:Ljava/lang/String;

.field private final label:Ljava/lang/String;

.field private final type:I

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->Companion:Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0xb

    const/16 v1, 0xb

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$$serializer;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0, p1, p8}, Lcom/discord/chat/bridge/botuikit/SelectItem;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput-object p2, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->label:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->value:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    :goto_0
    iput p5, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    :goto_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/discord/chat/bridge/botuikit/SelectItem;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->label:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->value:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 7
    iput p4, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    .line 8
    iput-object p5, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p4

    .line 2
    invoke-direct/range {v2 .. v8}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object p2

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object p3

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
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
    invoke-static {p0, p1, p2}, Lcom/discord/chat/bridge/botuikit/SelectItem;->write$Self(Lcom/discord/chat/bridge/botuikit/SelectItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-interface {p1, p2, v2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    :goto_0
    move v3, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v3, v1

    .line 52
    :goto_1
    if-eqz v3, :cond_2

    .line 53
    .line 54
    sget-object v3, Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentEmoji$$serializer;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 v0, 0x3

    .line 64
    iget v3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    .line 65
    .line 66
    invoke-interface {p1, p2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->p(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x4

    .line 70
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    :goto_2
    move v3, v2

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    iget-object v3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move v3, v1

    .line 84
    :goto_3
    if-eqz v3, :cond_5

    .line 85
    .line 86
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    .line 87
    .line 88
    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    .line 89
    .line 90
    invoke-interface {p1, p2, v0, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    const/4 v0, 0x5

    .line 94
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    :goto_4
    move v1, v2

    .line 101
    goto :goto_5

    .line 102
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v3, :cond_7

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 108
    .line 109
    sget-object v1, Lzi/m0;->a:Lzi/m0;

    .line 110
    .line 111
    iget-object p0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_8
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

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v0

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;
    .locals 8

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    iget v3, p1, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->emoji:Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    return-object v0
.end method

.method public final getIconColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIconSrc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/botuikit/ComponentEmoji;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->getEmoji()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;

    move-result-object v2

    iget v3, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->type:I

    iget-object v4, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconSrc:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;->iconColor:Ljava/lang/Integer;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SearchableSelectItem(label="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", emoji="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", iconSrc="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
