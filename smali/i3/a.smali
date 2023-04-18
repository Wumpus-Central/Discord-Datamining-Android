.class public final synthetic Li3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/modules/websocket/WebSocketModule$OnOpenHandler;


# instance fields
.field public final synthetic a:Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a;->a:Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;

    return-void
.end method


# virtual methods
.method public final onOpen(Lokhttp3/WebSocket;I)V
    .locals 1

    iget-object v0, p0, Li3/a;->a:Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;

    invoke-static {v0, p1, p2}, Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;->a(Lcom/discord/modules/fastconnectmanager/FastConnectManagerModule;Lokhttp3/WebSocket;I)V

    return-void
.end method
