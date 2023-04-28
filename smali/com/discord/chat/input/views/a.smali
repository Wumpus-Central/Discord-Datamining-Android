.class public final synthetic Lcom/discord/chat/input/views/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/h;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/input/views/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/input/views/a;->a:Landroid/content/Context;

    check-cast p1, Landroid/content/ClipData$Item;

    invoke-static {v0, p1}, Lcom/discord/chat/input/views/ChatInputRootView;->a(Landroid/content/Context;Landroid/content/ClipData$Item;)Z

    move-result p1

    return p1
.end method
