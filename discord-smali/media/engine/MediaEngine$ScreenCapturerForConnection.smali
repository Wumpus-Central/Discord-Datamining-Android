.class final Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media/engine/MediaEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ScreenCapturerForConnection"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;",
        "",
        "screenCapturer",
        "Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;",
        "connectionId",
        "",
        "(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)V",
        "getConnectionId",
        "()I",
        "getScreenCapturer",
        "()Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "release",
        "",
        "toString",
        "",
        "media_engine_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final connectionId:I

.field private final screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;


# direct methods
.method public constructor <init>(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)V
    .locals 1

    .line 1
    const-string v0, "screenCapturer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    .line 10
    .line 11
    iput p2, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
.end method

.method public static synthetic copy$default(Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;IILjava/lang/Object;)Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->copy(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    return v0
.end method

.method public final copy(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;
    .locals 1

    const-string v0, "screenCapturer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;

    invoke-direct {v0, p1, p2}, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;-><init>(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;

    iget-object v1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    iget-object v3, p1, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    iget p1, p1, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getConnectionId()I
    .locals 1

    iget v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    return v0
.end method

.method public final getScreenCapturer()Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final release()V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    invoke-virtual {v0}, Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;->release()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->screenCapturer:Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;

    iget v1, p0, Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;->connectionId:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ScreenCapturerForConnection(screenCapturer="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connectionId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
