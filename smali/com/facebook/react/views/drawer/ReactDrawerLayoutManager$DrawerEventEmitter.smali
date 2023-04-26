.class public Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DrawerEventEmitter"
.end annotation


# instance fields
.field private final mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

.field private final mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method


# virtual methods
.method public onDrawerClosed(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    new-instance v0, Lcom/facebook/react/views/drawer/events/DrawerClosedEvent;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/drawer/events/DrawerClosedEvent;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    new-instance v0, Lcom/facebook/react/views/drawer/events/DrawerOpenedEvent;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/drawer/events/DrawerOpenedEvent;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public onDrawerSlide(Landroid/view/View;F)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    new-instance v0, Lcom/facebook/react/views/drawer/events/DrawerSlideEvent;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v0, v1, v2, p2}, Lcom/facebook/react/views/drawer/events/DrawerSlideEvent;-><init>(IIF)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
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
.end method

.method public onDrawerStateChanged(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mEventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/views/drawer/events/DrawerStateChangedEvent;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$DrawerEventEmitter;->mDrawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v1, v2, v3, p1}, Lcom/facebook/react/views/drawer/events/DrawerStateChangedEvent;-><init>(III)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
