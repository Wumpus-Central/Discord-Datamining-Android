.class public final synthetic Lcom/discord/chat/presentation/root/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic k:Landroid/view/View;

.field public final synthetic l:Lcom/discord/chat/presentation/root/ChatView;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/discord/chat/presentation/root/ChatView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/root/a;->k:Landroid/view/View;

    iput-object p2, p0, Lcom/discord/chat/presentation/root/a;->l:Lcom/discord/chat/presentation/root/ChatView;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lcom/discord/chat/presentation/root/a;->k:Landroid/view/View;

    iget-object v2, v0, Lcom/discord/chat/presentation/root/a;->l:Lcom/discord/chat/presentation/root/ChatView;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, Lcom/discord/chat/presentation/root/ChatView;->a(Landroid/view/View;Lcom/discord/chat/presentation/root/ChatView;Landroid/view/View;IIIIIIII)V

    return-void
.end method
