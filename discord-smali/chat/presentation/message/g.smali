.class public final synthetic Lcom/discord/chat/presentation/message/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/g;->k:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/g;->k:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->g(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method
