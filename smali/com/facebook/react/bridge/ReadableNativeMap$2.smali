.class Lcom/facebook/react/bridge/ReadableNativeMap$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReadableMapKeySetIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/ReadableNativeMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field currentIndex:I

.field final synthetic this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

.field final synthetic val$iteratorKeys:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableNativeMap;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->val$iteratorKeys:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->currentIndex:I

    .line 10
    .line 11
    return-void
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
.method public hasNextKey()Z
    .locals 2

    iget v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->currentIndex:I

    iget-object v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->val$iteratorKeys:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public nextKey()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->val$iteratorKeys:[Ljava/lang/String;

    iget v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->currentIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/react/bridge/ReadableNativeMap$2;->currentIndex:I

    aget-object v0, v0, v1

    return-object v0
.end method
