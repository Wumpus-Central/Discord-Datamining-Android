.class public abstract Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# instance fields
.field private mNumRetries:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;->mNumRetries:I

    .line 6
    .line 7
    return-void
    .line 8
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
.end method


# virtual methods
.method public getRetries()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;->mNumRetries:I

    return v0
.end method

.method public incrementRetries()V
    .locals 1

    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;->mNumRetries:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;->mNumRetries:I

    return-void
.end method
