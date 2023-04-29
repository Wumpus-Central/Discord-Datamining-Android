.class public final enum Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;,
        Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "Disconnected",
        "Connecting",
        "Connected",
        "Companion",
        "Update",
        "audio_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

.field public static final Companion:Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;

.field public static final enum Connected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

.field public static final enum Connecting:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

.field public static final enum Disconnected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Disconnected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connecting:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const-string v3, "Disconnected"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Disconnected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 12
    .line 13
    new-instance v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    const-string v3, "Connecting"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connecting:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 24
    .line 25
    new-instance v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const/16 v2, 0xc

    .line 29
    .line 30
    const-string v3, "Connected"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 36
    .line 37
    invoke-static {}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->$values()[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->$VALUES:[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 42
    .line 43
    new-instance v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, v1}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Companion:Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;

    .line 50
    .line 51
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
    .locals 1

    const-class v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    return-object p0
.end method

.method public static values()[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
    .locals 1

    sget-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->$VALUES:[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->value:I

    return v0
.end method
