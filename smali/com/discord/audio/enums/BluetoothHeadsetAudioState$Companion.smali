.class public final Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;",
        "",
        "()V",
        "from",
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState;",
        "value",
        "",
        "getUpdate",
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;",
        "intent",
        "Landroid/content/Intent;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(I)Lcom/discord/audio/enums/BluetoothHeadsetAudioState;
    .locals 6

    .line 1
    invoke-static {}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->values()[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_2

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->getValue()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-ne v5, p1, :cond_0

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v5, v2

    .line 21
    :goto_1
    if-eqz v5, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const/4 v4, 0x0

    .line 28
    :goto_2
    return-object v4
    .line 29
    .line 30
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
.end method

.method public final getUpdate(Landroid/content/Intent;)Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;
    .locals 4

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-static {p1}, Lcom/discord/audio/utils/ExtensionsKt;->getBluetoothDeviceExtra(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "android.bluetooth.profile.extra.PREVIOUS_STATE"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/discord/audio/utils/ExtensionsKt;->getIntExtraOrNull(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    sget-object v3, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Companion:Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v3, v1}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;->from(I)Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    :goto_0
    const-string v3, "android.bluetooth.profile.extra.STATE"

    .line 44
    .line 45
    invoke-static {p1, v3}, Lcom/discord/audio/utils/ExtensionsKt;->getIntExtraOrNull(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    sget-object v2, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Companion:Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v2, p1}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;->from(I)Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_1
    new-instance p1, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;

    .line 62
    .line 63
    invoke-direct {p1, v2, v1, v0}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;-><init>(Lcom/discord/audio/enums/BluetoothHeadsetAudioState;Lcom/discord/audio/enums/BluetoothHeadsetAudioState;Landroid/bluetooth/BluetoothDevice;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string v0, "Failed requirement."

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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
.end method
