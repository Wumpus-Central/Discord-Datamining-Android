.class public Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/views/textinput/ReactTextChangedEvent;",
        ">;"
    }
.end annotation


# static fields
.field public static final EVENT_NAME:Ljava/lang/String; = "topContentSizeChange"


# instance fields
.field private mContentHeight:F

.field private mContentWidth:F


# direct methods
.method public constructor <init>(IFF)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;-><init>(IIFF)V

    return-void
.end method

.method public constructor <init>(IIFF)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 3
    iput p3, p0, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;->mContentWidth:F

    .line 4
    iput p4, p0, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;->mContentHeight:F

    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;->mContentWidth:F

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    const-string v4, "width"

    .line 13
    .line 14
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 15
    .line 16
    .line 17
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;->mContentHeight:F

    .line 18
    .line 19
    float-to-double v2, v2

    .line 20
    const-string v4, "height"

    .line 21
    .line 22
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 23
    .line 24
    .line 25
    const-string v2, "contentSize"

    .line 26
    .line 27
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 28
    .line 29
    .line 30
    const-string v1, "target"

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    return-object v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topContentSizeChange"

    return-object v0
.end method
