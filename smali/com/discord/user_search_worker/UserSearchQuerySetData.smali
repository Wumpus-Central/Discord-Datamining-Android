.class public final Lcom/discord/user_search_worker/UserSearchQuerySetData;
.super Lcom/discord/user_search_worker/UserSearchData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/user_search_worker/UserSearchQuerySetData$$serializer;,
        Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 !2\u00020\u0001:\u0002 !B-\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u00c7\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/discord/user_search_worker/UserSearchQuerySetData;",
        "Lcom/discord/user_search_worker/UserSearchData;",
        "seen1",
        "",
        "uuid",
        "",
        "payload",
        "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V",
        "getPayload",
        "()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
        "getUuid",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "copy",
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
        "user_search_worker_release"
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
.field public static final Companion:Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;


# instance fields
.field private final payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

.field private final uuid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->Companion:Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/discord/user_search_worker/UserSearchQuerySetData$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetData$$serializer;

    invoke-virtual {p4}, Lcom/discord/user_search_worker/UserSearchQuerySetData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lbj/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/discord/user_search_worker/UserSearchData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V
    .locals 1

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/discord/user_search_worker/UserSearchData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/user_search_worker/UserSearchQuerySetData;Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;ILjava/lang/Object;)Lcom/discord/user_search_worker/UserSearchQuerySetData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/user_search_worker/UserSearchQuerySetData;->copy(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)Lcom/discord/user_search_worker/UserSearchQuerySetData;

    move-result-object p0

    return-object p0
.end method

.method public static final write$Self(Lcom/discord/user_search_worker/UserSearchQuerySetData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 2

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
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;->INSTANCE:Lcom/discord/user_search_worker/UserSearchQuerySetPayload$$serializer;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;
    .locals 1

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)Lcom/discord/user_search_worker/UserSearchQuerySetData;
    .locals 1

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/user_search_worker/UserSearchQuerySetData;

    invoke-direct {v0, p1, p2}, Lcom/discord/user_search_worker/UserSearchQuerySetData;-><init>(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;

    iget-object v1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    iget-object p1, p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPayload()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;
    .locals 1

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    return-object v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    invoke-virtual {v1}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->uuid:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/user_search_worker/UserSearchQuerySetData;->payload:Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UserSearchQuerySetData(uuid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", payload="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
