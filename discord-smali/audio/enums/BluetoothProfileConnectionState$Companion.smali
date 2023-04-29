.class public final Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/enums/BluetoothProfileConnectionState;
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
        "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;",
        "",
        "()V",
        "from",
        "Lcom/discord/audio/enums/BluetoothProfileConnectionState;",
        "bluetoothProfileState",
        "",
        "getUpdate",
        "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;",
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

    invoke-direct {p0}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(I)Lcom/discord/audio/enums/BluetoothProfileConnectionState;
    .locals 6

    .line 1
    invoke-static {}, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->values()[Lcom/discord/audio/enums/BluetoothProfileConnectionState;

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
    invoke-virtual {v4}, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->getValue()I

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

.method public final getUpdate(Landroid/content/Intent;)Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;
    .locals 3

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
    const-string v1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

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
    const-string v0, "android.bluetooth.profile.extra.PREVIOUS_STATE"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lcom/discord/audio/utils/ExtensionsKt;->getIntExtraOrNull(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object v2, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Companion:Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {v2, v0}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;->from(I)Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v0, v1

    .line 39
    :goto_0
    const-string v2, "android.bluetooth.profile.extra.STATE"

    .line 40
    .line 41
    invoke-static {p1, v2}, Lcom/discord/audio/utils/ExtensionsKt;->getIntExtraOrNull(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    sget-object v1, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Companion:Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v1, v2}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Companion;->from(I)Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_1
    const-string v2, "android.bluetooth.device.extra.DEVICE"

    .line 58
    .line 59
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 64
    .line 65
    new-instance v2, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;

    .line 66
    .line 67
    invoke-direct {v2, v0, v1, p1}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;-><init>(Lcom/discord/audio/enums/BluetoothProfileConnectionState;Lcom/discord/audio/enums/BluetoothProfileConnectionState;Landroid/bluetooth/BluetoothDevice;)V

    .line 68
    .line 69
    .line 70
    return-object v2

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    const-string v0, "Failed requirement."

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
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
.end method
