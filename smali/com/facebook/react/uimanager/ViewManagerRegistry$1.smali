.class Lcom/facebook/react/uimanager/ViewManagerRegistry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/ViewManagerRegistry;->onSurfaceStopped(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/ViewManagerRegistry;

.field final synthetic val$surfaceId:I


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/ViewManagerRegistry;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/ViewManagerRegistry$1;->this$0:Lcom/facebook/react/uimanager/ViewManagerRegistry;

    iput p2, p0, Lcom/facebook/react/uimanager/ViewManagerRegistry$1;->val$surfaceId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ViewManagerRegistry$1;->this$0:Lcom/facebook/react/uimanager/ViewManagerRegistry;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/ViewManagerRegistry;->access$000(Lcom/facebook/react/uimanager/ViewManagerRegistry;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/facebook/react/uimanager/ViewManager;

    .line 32
    .line 33
    iget v2, p0, Lcom/facebook/react/uimanager/ViewManagerRegistry$1;->val$surfaceId:I

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lcom/facebook/react/uimanager/ViewManager;->onSurfaceStopped(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
