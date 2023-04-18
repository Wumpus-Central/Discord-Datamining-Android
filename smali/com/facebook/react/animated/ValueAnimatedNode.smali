.class Lcom/facebook/react/animated/ValueAnimatedNode;
.super Lcom/facebook/react/animated/AnimatedNode;
.source "SourceFile"


# instance fields
.field mAnimatedObject:Ljava/lang/Object;

.field mOffset:D

.field mValue:D

.field private mValueListener:Lcom/facebook/react/animated/AnimatedNodeValueListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimatedNode;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mAnimatedObject:Ljava/lang/Object;

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 3
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimatedNode;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mAnimatedObject:Ljava/lang/Object;

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 7
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    const-string v0, "value"

    .line 9
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    const-string v0, "offset"

    .line 10
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    return-void
.end method


# virtual methods
.method public extractOffset()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 4
    .line 5
    add-double/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 11
    .line 12
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

.method public flattenOffset()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 4
    .line 5
    add-double/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 11
    .line 12
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

.method public getAnimatedObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mAnimatedObject:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()D
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 4
    .line 5
    add-double/2addr v0, v2

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/animated/AnimatedNode;->update()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 18
    .line 19
    add-double/2addr v0, v2

    .line 20
    return-wide v0
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

.method public onValueUpdate()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValueListener:Lcom/facebook/react/animated/AnimatedNodeValueListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/animated/ValueAnimatedNode;->getValue()D

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/animated/AnimatedNodeValueListener;->onValueUpdate(D)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public prettyPrint()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ValueAnimatedNode["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/facebook/react/animated/AnimatedNode;->mTag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]: value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mOffset:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setValueListener(Lcom/facebook/react/animated/AnimatedNodeValueListener;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValueListener:Lcom/facebook/react/animated/AnimatedNodeValueListener;

    return-void
.end method
