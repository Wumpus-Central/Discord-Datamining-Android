.class public final enum Lcom/discord/intents/packages/InstalledPackage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/intents/packages/InstalledPackage$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/intents/packages/InstalledPackage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0080\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/discord/intents/packages/InstalledPackage;",
        "",
        "appName",
        "",
        "appPackage",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getAppPackage",
        "()Ljava/lang/String;",
        "TWITTER",
        "WHATSAPP",
        "GMAIL",
        "LINE",
        "MESSENGER",
        "TELEGRAM",
        "Companion",
        "intents_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/intents/packages/InstalledPackage;

.field public static final Companion:Lcom/discord/intents/packages/InstalledPackage$Companion;

.field public static final enum GMAIL:Lcom/discord/intents/packages/InstalledPackage;

.field public static final enum LINE:Lcom/discord/intents/packages/InstalledPackage;

.field public static final enum MESSENGER:Lcom/discord/intents/packages/InstalledPackage;

.field public static final enum TELEGRAM:Lcom/discord/intents/packages/InstalledPackage;

.field public static final enum TWITTER:Lcom/discord/intents/packages/InstalledPackage;

.field public static final enum WHATSAPP:Lcom/discord/intents/packages/InstalledPackage;


# instance fields
.field private final appName:Ljava/lang/String;

.field private final appPackage:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/intents/packages/InstalledPackage;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/discord/intents/packages/InstalledPackage;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->TWITTER:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->WHATSAPP:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->GMAIL:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->LINE:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->MESSENGER:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/discord/intents/packages/InstalledPackage;->TELEGRAM:Lcom/discord/intents/packages/InstalledPackage;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 2
    .line 3
    const-string v1, "twitter"

    .line 4
    .line 5
    const-string v2, "com.twitter.android"

    .line 6
    .line 7
    const-string v3, "TWITTER"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->TWITTER:Lcom/discord/intents/packages/InstalledPackage;

    .line 14
    .line 15
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 16
    .line 17
    const-string v1, "whatsapp"

    .line 18
    .line 19
    const-string v2, "com.whatsapp"

    .line 20
    .line 21
    const-string v3, "WHATSAPP"

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->WHATSAPP:Lcom/discord/intents/packages/InstalledPackage;

    .line 28
    .line 29
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 30
    .line 31
    const-string v1, "GMAIL"

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const-string v3, "googlegmail"

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->GMAIL:Lcom/discord/intents/packages/InstalledPackage;

    .line 41
    .line 42
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 43
    .line 44
    const-string v1, "line"

    .line 45
    .line 46
    const-string v2, "jp.naver.line.android"

    .line 47
    .line 48
    const-string v3, "LINE"

    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    invoke-direct {v0, v3, v5, v1, v2}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->LINE:Lcom/discord/intents/packages/InstalledPackage;

    .line 55
    .line 56
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 57
    .line 58
    const-string v1, "fb-messenger"

    .line 59
    .line 60
    const-string v2, "com.facebook.orca"

    .line 61
    .line 62
    const-string v3, "MESSENGER"

    .line 63
    .line 64
    const/4 v5, 0x4

    .line 65
    invoke-direct {v0, v3, v5, v1, v2}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->MESSENGER:Lcom/discord/intents/packages/InstalledPackage;

    .line 69
    .line 70
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage;

    .line 71
    .line 72
    const-string v1, "tg"

    .line 73
    .line 74
    const-string v2, "org.telegram.messenger"

    .line 75
    .line 76
    const-string v3, "TELEGRAM"

    .line 77
    .line 78
    const/4 v5, 0x5

    .line 79
    invoke-direct {v0, v3, v5, v1, v2}, Lcom/discord/intents/packages/InstalledPackage;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->TELEGRAM:Lcom/discord/intents/packages/InstalledPackage;

    .line 83
    .line 84
    invoke-static {}, Lcom/discord/intents/packages/InstalledPackage;->$values()[Lcom/discord/intents/packages/InstalledPackage;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->$VALUES:[Lcom/discord/intents/packages/InstalledPackage;

    .line 89
    .line 90
    new-instance v0, Lcom/discord/intents/packages/InstalledPackage$Companion;

    .line 91
    .line 92
    invoke-direct {v0, v4}, Lcom/discord/intents/packages/InstalledPackage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/discord/intents/packages/InstalledPackage;->Companion:Lcom/discord/intents/packages/InstalledPackage$Companion;

    .line 96
    .line 97
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/discord/intents/packages/InstalledPackage;->appName:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/intents/packages/InstalledPackage;->appPackage:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getAppName$p(Lcom/discord/intents/packages/InstalledPackage;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/discord/intents/packages/InstalledPackage;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/intents/packages/InstalledPackage;
    .locals 1

    const-class v0, Lcom/discord/intents/packages/InstalledPackage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/intents/packages/InstalledPackage;

    return-object p0
.end method

.method public static values()[Lcom/discord/intents/packages/InstalledPackage;
    .locals 1

    sget-object v0, Lcom/discord/intents/packages/InstalledPackage;->$VALUES:[Lcom/discord/intents/packages/InstalledPackage;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/intents/packages/InstalledPackage;

    return-object v0
.end method


# virtual methods
.method public final getAppPackage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/intents/packages/InstalledPackage;->appPackage:Ljava/lang/String;

    return-object v0
.end method
