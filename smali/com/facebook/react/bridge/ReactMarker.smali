.class public Lcom/facebook/react/bridge/ReactMarker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;,
        Lcom/facebook/react/bridge/ReactMarker$MarkerListener;
    }
.end annotation


# static fields
.field private static final sFabricMarkerListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;",
            ">;"
        }
    .end annotation
.end field

.field private static final sListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/bridge/ReactMarker;->sListeners:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/bridge/ReactMarker;->sFabricMarkerListeners:Ljava/util/List;

    .line 14
    .line 15
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addFabricListener(Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sFabricMarkerListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public static addListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method public static clearFabricMarkerListeners()V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sFabricMarkerListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static clearMarkerListeners()V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {p0, p1, p2, v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    return-void
.end method

.method public static logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V
    .locals 8
    .annotation build Ld6/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sFabricMarkerListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-wide v6, p3

    .line 2
    invoke-interface/range {v2 .. v7}, Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    return-void
.end method

.method public static logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;I)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0, p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    return-void
.end method

.method public static logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, p1, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    return-void
.end method

.method public static logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 9
    invoke-static {p0, p1, p2}, Lcom/facebook/react/bridge/ReactMarker;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 10
    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 11
    invoke-interface {v1, p0, p1, p2}, Lcom/facebook/react/bridge/ReactMarker$MarkerListener;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static logMarker(Ljava/lang/String;)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static logMarker(Ljava/lang/String;I)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static logMarker(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-static {p0, p1, v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static logMarker(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation build Ld6/a;
    .end annotation

    .line 4
    invoke-static {p0}, Lcom/facebook/react/bridge/ReactMarkerConstants;->valueOf(Ljava/lang/String;)Lcom/facebook/react/bridge/ReactMarkerConstants;

    move-result-object p0

    .line 5
    invoke-static {p0, p1, p2}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    return-void
.end method

.method public static removeFabricListener(Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sFabricMarkerListeners:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static removeListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    sget-object v0, Lcom/facebook/react/bridge/ReactMarker;->sListeners:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
