.class public abstract Lcom/discord/chat/bridge/structurabletext/StructurableText;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/structurabletext/StructurableText$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "",
        "()V",
        "hasContent",
        "",
        "getHasContent",
        "()Z",
        "Companion",
        "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;",
        "Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwi/f;
    with = Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/structurabletext/StructurableText$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/structurabletext/StructurableText$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/structurabletext/StructurableText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/structurabletext/StructurableText;->Companion:Lcom/discord/chat/bridge/structurabletext/StructurableText$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/structurabletext/StructurableText;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getHasContent()Z
.end method
