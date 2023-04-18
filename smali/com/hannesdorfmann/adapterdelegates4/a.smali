.class public abstract Lcom/hannesdorfmann/adapterdelegates4/a;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;"
    }
.end annotation


# instance fields
.field protected delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected items:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-direct {v0}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;-><init>()V

    invoke-direct {p0, v0}, Lcom/hannesdorfmann/adapterdelegates4/a;-><init>(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;)V

    return-void
.end method

.method public constructor <init>(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "AdapterDelegatesManager is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs constructor <init>([Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate<",
            "TT;>;)V"
        }
    .end annotation

    .line 5
    new-instance v0, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-direct {v0, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;-><init>([Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;)V

    invoke-direct {p0, v0}, Lcom/hannesdorfmann/adapterdelegates4/a;-><init>(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;)V

    return-void
.end method


# virtual methods
.method public getItemViewType(I)I
    .locals 2

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    iget-object v1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->e(Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public getItems()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    return-object v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    iget-object v1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, p1, v2}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->g(Ljava/lang/Object;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    iget-object v1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2, p1, p3}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->g(Ljava/lang/Object;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-virtual {v0, p1, p2}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->h(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-virtual {v0, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->i(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z

    move-result p1

    return p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-virtual {v0, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->j(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-virtual {v0, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->k(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->delegatesManager:Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;

    invoke-virtual {v0, p1}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;->l(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public setItems(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    return-void
.end method
