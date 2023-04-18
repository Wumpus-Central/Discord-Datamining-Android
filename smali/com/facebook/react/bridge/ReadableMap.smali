.class public interface abstract Lcom/facebook/react/bridge/ReadableMap;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;
.end method

.method public abstract getBoolean(Ljava/lang/String;)Z
.end method

.method public abstract getDouble(Ljava/lang/String;)D
.end method

.method public abstract getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;
.end method

.method public abstract getEntryIterator()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getInt(Ljava/lang/String;)I
.end method

.method public abstract getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
.end method

.method public abstract getString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
.end method

.method public abstract hasKey(Ljava/lang/String;)Z
.end method

.method public abstract isNull(Ljava/lang/String;)Z
.end method

.method public abstract keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
.end method

.method public abstract toHashMap()Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
