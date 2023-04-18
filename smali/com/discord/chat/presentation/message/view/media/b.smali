.class public final synthetic Lcom/discord/chat/presentation/message/view/media/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/media/b;->k:Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/media/b;->k:Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;->a(Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;)V

    return-void
.end method
