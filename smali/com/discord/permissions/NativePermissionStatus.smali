.class public final enum Lcom/discord/permissions/NativePermissionStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/permissions/NativePermissionStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/permissions/NativePermissionStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/permissions/NativePermissionStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "AUTHORIZED",
        "DENIED",
        "RESTRICTED",
        "UNDETERMINED",
        "Companion",
        "permissions_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/permissions/NativePermissionStatus;

.field private static final ANDROID_PERMISSION_DENIED:Ljava/lang/String; = "denied"

.field private static final ANDROID_PERMISSION_GRANTED:Ljava/lang/String; = "granted"

.field private static final ANDROID_PERMISSION_NEVER_ASK_AGAIN:Ljava/lang/String; = "never_ask_again"

.field public static final enum AUTHORIZED:Lcom/discord/permissions/NativePermissionStatus;

.field public static final Companion:Lcom/discord/permissions/NativePermissionStatus$Companion;

.field public static final enum DENIED:Lcom/discord/permissions/NativePermissionStatus;

.field public static final enum RESTRICTED:Lcom/discord/permissions/NativePermissionStatus;

.field public static final enum UNDETERMINED:Lcom/discord/permissions/NativePermissionStatus;


# direct methods
.method private static final synthetic $values()[Lcom/discord/permissions/NativePermissionStatus;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/discord/permissions/NativePermissionStatus;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/permissions/NativePermissionStatus;->AUTHORIZED:Lcom/discord/permissions/NativePermissionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/permissions/NativePermissionStatus;->DENIED:Lcom/discord/permissions/NativePermissionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/permissions/NativePermissionStatus;->RESTRICTED:Lcom/discord/permissions/NativePermissionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/permissions/NativePermissionStatus;->UNDETERMINED:Lcom/discord/permissions/NativePermissionStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/permissions/NativePermissionStatus;

    .line 2
    .line 3
    const-string v1, "AUTHORIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/discord/permissions/NativePermissionStatus;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->AUTHORIZED:Lcom/discord/permissions/NativePermissionStatus;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/permissions/NativePermissionStatus;

    .line 12
    .line 13
    const-string v1, "DENIED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/discord/permissions/NativePermissionStatus;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->DENIED:Lcom/discord/permissions/NativePermissionStatus;

    .line 20
    .line 21
    new-instance v0, Lcom/discord/permissions/NativePermissionStatus;

    .line 22
    .line 23
    const-string v1, "RESTRICTED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/discord/permissions/NativePermissionStatus;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->RESTRICTED:Lcom/discord/permissions/NativePermissionStatus;

    .line 30
    .line 31
    new-instance v0, Lcom/discord/permissions/NativePermissionStatus;

    .line 32
    .line 33
    const-string v1, "UNDETERMINED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/discord/permissions/NativePermissionStatus;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->UNDETERMINED:Lcom/discord/permissions/NativePermissionStatus;

    .line 40
    .line 41
    invoke-static {}, Lcom/discord/permissions/NativePermissionStatus;->$values()[Lcom/discord/permissions/NativePermissionStatus;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->$VALUES:[Lcom/discord/permissions/NativePermissionStatus;

    .line 46
    .line 47
    new-instance v0, Lcom/discord/permissions/NativePermissionStatus$Companion;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Lcom/discord/permissions/NativePermissionStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/discord/permissions/NativePermissionStatus;->Companion:Lcom/discord/permissions/NativePermissionStatus$Companion;

    .line 54
    .line 55
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/permissions/NativePermissionStatus;
    .locals 1

    const-class v0, Lcom/discord/permissions/NativePermissionStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/permissions/NativePermissionStatus;

    return-object p0
.end method

.method public static values()[Lcom/discord/permissions/NativePermissionStatus;
    .locals 1

    sget-object v0, Lcom/discord/permissions/NativePermissionStatus;->$VALUES:[Lcom/discord/permissions/NativePermissionStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/permissions/NativePermissionStatus;

    return-object v0
.end method
