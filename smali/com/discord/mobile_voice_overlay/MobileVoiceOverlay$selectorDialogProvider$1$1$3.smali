.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1$1$3;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1;->invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/primitives/ChannelId;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "invoke-R7gqayM",
        "(J)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_apply:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1$1$3;->$this_apply:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/discord/primitives/ChannelId;

    invoke-virtual {p1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1$1$3;->invoke-R7gqayM(J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-R7gqayM(J)V
    .locals 4

    .line 1
    sget-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1$1$3;->$this_apply:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "context"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [Lkotlin/Pair;

    .line 16
    .line 17
    const-string v3, "channelId"

    .line 18
    .line 19
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v3, p1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x0

    .line 28
    aput-object p1, v2, p2

    .line 29
    .line 30
    const-string p1, "connectToVoice"

    .line 31
    .line 32
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {p1, p2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x1

    .line 39
    aput-object p1, v2, p2

    .line 40
    .line 41
    invoke-static {v2}, Landroidx/core/os/d;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "SelectChannel"

    .line 46
    .line 47
    invoke-virtual {v0, v1, p2, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;->startHeadlessTask(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    return-void
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
.end method
