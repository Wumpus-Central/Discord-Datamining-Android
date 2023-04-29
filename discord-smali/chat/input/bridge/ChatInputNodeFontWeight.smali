.class public final enum Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;",
        "",
        "(Ljava/lang/String;I)V",
        "Bold",
        "Companion",
        "chat_input_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum Bold:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

.field public static final Companion:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->Bold:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    .line 2
    .line 3
    const-string v1, "Bold"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->Bold:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    .line 10
    .line 11
    invoke-static {}, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->$values()[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->$VALUES:[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    .line 16
    .line 17
    new-instance v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, v1}, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->Companion:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;

    .line 24
    .line 25
    sget-object v0, Lnf/p;->l:Lnf/p;

    .line 26
    .line 27
    sget-object v1, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lnf/m;->b(Lnf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 34
    .line 35
    return-void
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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;
    .locals 1

    const-class v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;
    .locals 1

    sget-object v0, Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;->$VALUES:[Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;

    return-object v0
.end method
