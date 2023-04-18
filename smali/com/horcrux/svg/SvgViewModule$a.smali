.class Lcom/horcrux/svg/SvgViewModule$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgViewModule;->toDataURL(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:I

.field final synthetic l:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic m:Lcom/facebook/react/bridge/Callback;

.field final synthetic n:I


# direct methods
.method constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;I)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/SvgViewModule$a;->k:I

    iput-object p2, p0, Lcom/horcrux/svg/SvgViewModule$a;->l:Lcom/facebook/react/bridge/ReadableMap;

    iput-object p3, p0, Lcom/horcrux/svg/SvgViewModule$a;->m:Lcom/facebook/react/bridge/Callback;

    iput p4, p0, Lcom/horcrux/svg/SvgViewModule$a;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/horcrux/svg/SvgViewModule$a;->k:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/SvgViewManager;->getSvgViewByTag(I)Lcom/horcrux/svg/SvgView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/horcrux/svg/SvgViewModule$a;->k:I

    .line 10
    .line 11
    new-instance v1, Lcom/horcrux/svg/SvgViewModule$a$a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/horcrux/svg/SvgViewModule$a$a;-><init>(Lcom/horcrux/svg/SvgViewModule$a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/horcrux/svg/SvgViewManager;->runWhenViewIsAvailable(ILjava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->notRendered()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Lcom/horcrux/svg/SvgViewModule$a$b;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lcom/horcrux/svg/SvgViewModule$a$b;-><init>(Lcom/horcrux/svg/SvgViewModule$a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->setToDataUrlTask(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/horcrux/svg/SvgViewModule$a;->l:Lcom/facebook/react/bridge/ReadableMap;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v4, p0, Lcom/horcrux/svg/SvgViewModule$a;->m:Lcom/facebook/react/bridge/Callback;

    .line 42
    .line 43
    new-array v3, v3, [Ljava/lang/Object;

    .line 44
    .line 45
    const-string v5, "width"

    .line 46
    .line 47
    invoke-interface {v1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v5, p0, Lcom/horcrux/svg/SvgViewModule$a;->l:Lcom/facebook/react/bridge/ReadableMap;

    .line 52
    .line 53
    const-string v6, "height"

    .line 54
    .line 55
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v0, v1, v5}, Lcom/horcrux/svg/SvgView;->toDataURL(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    aput-object v0, v3, v2

    .line 64
    .line 65
    invoke-interface {v4, v3}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget-object v1, p0, Lcom/horcrux/svg/SvgViewModule$a;->m:Lcom/facebook/react/bridge/Callback;

    .line 70
    .line 71
    new-array v3, v3, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->toDataURL()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    aput-object v0, v3, v2

    .line 78
    .line 79
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    return-void
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
