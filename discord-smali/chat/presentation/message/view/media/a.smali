.class public final synthetic Lcom/discord/chat/presentation/message/view/media/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/media/a;->k:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/media/a;->k:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    invoke-static {v0}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;->a(Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;)V

    return-void
.end method
