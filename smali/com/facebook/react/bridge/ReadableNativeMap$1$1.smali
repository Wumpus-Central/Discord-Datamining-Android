.class Lcom/facebook/react/bridge/ReadableNativeMap$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/ReadableNativeMap$1;->next()Ljava/util/Map$Entry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/bridge/ReadableNativeMap$1;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableNativeMap$1;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->this$1:Lcom/facebook/react/bridge/ReadableNativeMap$1;

    iput p2, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->getKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->this$1:Lcom/facebook/react/bridge/ReadableNativeMap$1;

    iget-object v0, v0, Lcom/facebook/react/bridge/ReadableNativeMap$1;->val$iteratorKeys:[Ljava/lang/String;

    iget v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->val$index:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->this$1:Lcom/facebook/react/bridge/ReadableNativeMap$1;

    iget-object v0, v0, Lcom/facebook/react/bridge/ReadableNativeMap$1;->val$iteratorValues:[Ljava/lang/Object;

    iget v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$1$1;->val$index:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Can\'t set a value while iterating over a ReadableNativeMap"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
