.class public Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;",
        ">;"
    }
.end annotation


# static fields
.field public static final EVENT_NAME:Ljava/lang/String; = "topSlidingComplete"


# instance fields
.field private final mValue:D


# direct methods
.method public constructor <init>(ID)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;-><init>(IID)V

    return-void
.end method

.method public constructor <init>(IID)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 3
    iput-wide p3, p0, Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;->mValue:D

    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "target"

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    const-string v1, "value"

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;->getValue()D

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 21
    .line 22
    .line 23
    return-object v0
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
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topSlidingComplete"

    return-object v0
.end method

.method public getValue()D
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/views/slider/ReactSlidingCompleteEvent;->mValue:D

    return-wide v0
.end method
