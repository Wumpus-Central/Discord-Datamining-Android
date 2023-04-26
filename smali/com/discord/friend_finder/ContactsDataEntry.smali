.class public final Lcom/discord/friend_finder/ContactsDataEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/friend_finder/ContactsDataEntry$$serializer;,
        Lcom/discord/friend_finder/ContactsDataEntry$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002:;Bk\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0001\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u0010\u0008\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0002\u0010\u0011J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\u000cH\u00c6\u0003J\u0014\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003\u00a2\u0006\u0002\u0010 JV\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000c2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u00c7\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u0015R$\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001d\u0012\u0004\u0008\u001a\u0010\u0013\u001a\u0004\u0008\u001b\u0010\u001cR$\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010!\u0012\u0004\u0008\u001e\u0010\u0013\u001a\u0004\u0008\u001f\u0010 R$\u0010\u000b\u001a\u00020\u000c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006<"
    }
    d2 = {
        "Lcom/discord/friend_finder/ContactsDataEntry;",
        "",
        "seen1",
        "",
        "contactMethod",
        "",
        "contactMethodLabel",
        "contactMethodType",
        "contactNames",
        "",
        "Lcom/discord/friend_finder/ContactName;",
        "hasImageData",
        "",
        "deviceContactIds",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)V",
        "getContactMethod$annotations",
        "()V",
        "getContactMethod",
        "()Ljava/lang/String;",
        "getContactMethodLabel$annotations",
        "getContactMethodLabel",
        "getContactMethodType$annotations",
        "getContactMethodType",
        "getContactNames$annotations",
        "getContactNames",
        "()[Lcom/discord/friend_finder/ContactName;",
        "[Lcom/discord/friend_finder/ContactName;",
        "getDeviceContactIds$annotations",
        "getDeviceContactIds",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "getHasImageData$annotations",
        "getHasImageData",
        "()Z",
        "setHasImageData",
        "(Z)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)Lcom/discord/friend_finder/ContactsDataEntry;",
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
        "friend_finder_release"
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
.field public static final Companion:Lcom/discord/friend_finder/ContactsDataEntry$Companion;


# instance fields
.field private final contactMethod:Ljava/lang/String;

.field private final contactMethodLabel:Ljava/lang/String;

.field private final contactMethodType:Ljava/lang/String;

.field private final contactNames:[Lcom/discord/friend_finder/ContactName;

.field private final deviceContactIds:[Ljava/lang/String;

.field private hasImageData:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/friend_finder/ContactsDataEntry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/friend_finder/ContactsDataEntry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/friend_finder/ContactsDataEntry;->Companion:Lcom/discord/friend_finder/ContactsDataEntry$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/discord/friend_finder/ContactsDataEntry$$serializer;->INSTANCE:Lcom/discord/friend_finder/ContactsDataEntry$$serializer;

    invoke-virtual {p8}, Lcom/discord/friend_finder/ContactsDataEntry$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    iput-boolean p6, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    iput-object p7, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "contactMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactMethodLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactMethodType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactNames"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceContactIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    .line 7
    iput-boolean p5, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    .line 8
    iput-object p6, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/friend_finder/ContactsDataEntry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/friend_finder/ContactsDataEntry;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/discord/friend_finder/ContactsDataEntry;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)Lcom/discord/friend_finder/ContactsDataEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getContactMethod$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getContactMethodLabel$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getContactMethodType$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getContactNames$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDeviceContactIds$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getHasImageData$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/friend_finder/ContactsDataEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3

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
    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lzi/v1;

    .line 35
    .line 36
    const-class v1, Lcom/discord/friend_finder/ContactName;

    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Lcom/discord/friend_finder/ContactName$$serializer;->INSTANCE:Lcom/discord/friend_finder/ContactName$$serializer;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lzi/v1;-><init>(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    iget-boolean v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    .line 55
    .line 56
    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lzi/v1;

    .line 60
    .line 61
    const-class v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Lzi/v1;-><init>(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    .line 73
    .line 74
    const/4 v1, 0x5

    .line 75
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void
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
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()[Lcom/discord/friend_finder/ContactName;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    return v0
.end method

.method public final component6()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)Lcom/discord/friend_finder/ContactsDataEntry;
    .locals 8

    const-string v0, "contactMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactMethodLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactMethodType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactNames"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceContactIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/friend_finder/ContactsDataEntry;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/discord/friend_finder/ContactsDataEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lcom/discord/friend_finder/ContactName;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/friend_finder/ContactsDataEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/friend_finder/ContactsDataEntry;

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    iget-object v3, p1, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    iget-boolean v3, p1, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getContactMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    return-object v0
.end method

.method public final getContactMethodLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getContactMethodType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    return-object v0
.end method

.method public final getContactNames()[Lcom/discord/friend_finder/ContactName;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    return-object v0
.end method

.method public final getDeviceContactIds()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    return-object v0
.end method

.method public final getHasImageData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setHasImageData(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethod:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactMethodType:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/friend_finder/ContactsDataEntry;->contactNames:[Lcom/discord/friend_finder/ContactName;

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lcom/discord/friend_finder/ContactsDataEntry;->hasImageData:Z

    iget-object v5, p0, Lcom/discord/friend_finder/ContactsDataEntry;->deviceContactIds:[Ljava/lang/String;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ContactsDataEntry(contactMethod="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contactMethodLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contactMethodType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contactNames="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hasImageData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", deviceContactIds="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
