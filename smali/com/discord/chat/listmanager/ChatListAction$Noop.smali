.class public final Lcom/discord/chat/listmanager/ChatListAction$Noop;
.super Lcom/discord/chat/listmanager/ChatListAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/listmanager/ChatListAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Noop"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/discord/chat/listmanager/ChatListAction$Noop;",
        "Lcom/discord/chat/listmanager/ChatListAction;",
        "()V",
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


# static fields
.field public static final INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$Noop;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/listmanager/ChatListAction$Noop;

    invoke-direct {v0}, Lcom/discord/chat/listmanager/ChatListAction$Noop;-><init>()V

    sput-object v0, Lcom/discord/chat/listmanager/ChatListAction$Noop;->INSTANCE:Lcom/discord/chat/listmanager/ChatListAction$Noop;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/discord/chat/listmanager/ChatListAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method