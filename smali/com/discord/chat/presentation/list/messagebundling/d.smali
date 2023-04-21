.class public final synthetic Lcom/discord/chat/presentation/list/messagebundling/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Landroid/view/View$OnLongClickListener;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/messagebundling/d;->k:Landroid/view/View$OnLongClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/messagebundling/d;->k:Landroid/view/View$OnLongClickListener;

    invoke-static {v0, p1}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;->a(Landroid/view/View$OnLongClickListener;Landroid/view/View;)V

    return-void
.end method
