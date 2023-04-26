.class public Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;",
        ">;"
    }
.end annotation


# static fields
.field public static final EVENT_NAME:Ljava/lang/String; = "topContentSizeChange"


# instance fields
.field private final mHeight:I

.field private final mWidth:I


# direct methods
.method public constructor <init>(III)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 3
    iput p3, p0, Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;->mWidth:I

    .line 4
    iput p4, p0, Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;->mHeight:I

    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;->mWidth:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    float-to-double v1, v1

    .line 13
    const-string v3, "width"

    .line 14
    .line 15
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;->mHeight:I

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    float-to-double v1, v1

    .line 26
    const-string v3, "height"

    .line 27
    .line 28
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 29
    .line 30
    .line 31
    return-object v0
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

    const-string v0, "topContentSizeChange"

    return-object v0
.end method
