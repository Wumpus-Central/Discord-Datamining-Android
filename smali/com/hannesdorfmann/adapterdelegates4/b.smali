.class public Lcom/hannesdorfmann/adapterdelegates4/b;
.super Lcom/hannesdorfmann/adapterdelegates4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/util/List<",
        "*>;>",
        "Lcom/hannesdorfmann/adapterdelegates4/a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/hannesdorfmann/adapterdelegates4/a;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/hannesdorfmann/adapterdelegates4/a;-><init>(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;)V

    return-void
.end method

.method public varargs constructor <init>([Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate<",
            "TT;>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lcom/hannesdorfmann/adapterdelegates4/a;-><init>([Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/hannesdorfmann/adapterdelegates4/a;->items:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method
