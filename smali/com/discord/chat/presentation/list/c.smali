.class public final synthetic Lcom/discord/chat/presentation/list/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/discord/chat/presentation/list/SwipeHelper;

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/chat/presentation/list/SwipeHelper;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/c;->a:Lcom/discord/chat/presentation/list/SwipeHelper;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/c;->b:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/c;->a:Lcom/discord/chat/presentation/list/SwipeHelper;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/c;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1, p1}, Lcom/discord/chat/presentation/list/SwipeHelper;->d(Lcom/discord/chat/presentation/list/SwipeHelper;Landroidx/recyclerview/widget/RecyclerView;Landroid/animation/ValueAnimator;)V

    return-void
.end method
