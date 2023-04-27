.class public final Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;
.super Lkotlinx/serialization/json/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/json/d<",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;",
        "Lkotlinx/serialization/json/d;",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
        "Lkotlinx/serialization/json/JsonElement;",
        "element",
        "Lkotlinx/serialization/DeserializationStrategy;",
        "selectDeserializer",
        "<init>",
        "()V",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    invoke-direct {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;-><init>()V

    sput-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/d;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method


# virtual methods
.method protected selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlinx/serialization/json/f;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "extendedType"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/serialization/json/f;->k(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    :goto_0
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->GUILD_SCHEDULED_EVENT:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->getSerialNumber()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    sget-object p1, Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl$Companion;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->GUILD_INVITE_DISABLED:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->getSerialNumber()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    sget-object p1, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->ACTIVITY_LAUNCHER:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->getSerialNumber()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    sget-object p1, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    sget-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->EMBEDDED_ACTIVITY_INVITE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;->getSerialNumber()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    sget-object p1, Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl$Companion;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    sget-object p1, Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;->Companion:Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl$Companion;

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_1
    return-object p1
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
.end method
