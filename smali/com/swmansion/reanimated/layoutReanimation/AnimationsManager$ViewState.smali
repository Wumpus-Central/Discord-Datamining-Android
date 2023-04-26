.class public final enum Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ViewState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

.field public static final enum Appearing:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

.field public static final enum Disappearing:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

.field public static final enum Inactive:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

.field public static final enum Layout:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

.field public static final enum ToRemove:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 2
    .line 3
    const-string v1, "Inactive"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->Inactive:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 10
    .line 11
    new-instance v1, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 12
    .line 13
    const-string v3, "Appearing"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->Appearing:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 20
    .line 21
    new-instance v3, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 22
    .line 23
    const-string v5, "Disappearing"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->Disappearing:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 30
    .line 31
    new-instance v5, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 32
    .line 33
    const-string v7, "Layout"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->Layout:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 40
    .line 41
    new-instance v7, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 42
    .line 43
    const-string v9, "ToRemove"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->ToRemove:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->$VALUES:[Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    .line 65
    .line 66
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;
    .locals 1

    const-class v0, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    return-object p0
.end method

.method public static values()[Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;
    .locals 1

    sget-object v0, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->$VALUES:[Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    invoke-virtual {v0}, [Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager$ViewState;

    return-object v0
.end method
